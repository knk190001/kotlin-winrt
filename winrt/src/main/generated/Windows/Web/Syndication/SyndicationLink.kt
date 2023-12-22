package Windows.Web.Syndication

import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SyndicationLink.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationLink;{27553abd-a10e-41b5-86bd-9759086eb0c5})")
@WinRTByReference(brClass = SyndicationLink.ByReference::class)
public class SyndicationLink(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationLink.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __1576557654_Interface: ISyndicationLink.WithDefault by lazy {
    as_1576557654()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1576557654_Ptr: JNAPointer? by lazy {
    __1576557654_Interface.__1576557654_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576557654_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(uri: Uri) : this(ABI.activate(uri))

  public constructor(
    uri: Uri,
    relationship: String,
    title: String,
    mediaType: String,
    length: WinDef.UINT
  ) : this(ABI.activate(uri, relationship, title, mediaType, length))

  private fun as_1576557654(): ISyndicationLink.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationLink.ABI.makeISyndicationLink(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationLink>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationLink.ABI.makeISyndicationLink(ref.value))
  }

  private fun as_1576492622(): ISyndicationNode.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationNode.ABI.makeISyndicationNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationNode.ABI.makeISyndicationNode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SyndicationLink> {
    public override fun getValue() = SyndicationLink(pointer.getPointer(0))

    public fun setValue(value: SyndicationLink): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationLink, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationLinkFactory_Instance: ISyndicationLinkFactory by lazy {
      createISyndicationLinkFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationLink".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createISyndicationLinkFactory(): ISyndicationLinkFactory {
      val refiid = Guid.REFIID(ISyndicationLinkFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationLink".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationLinkFactory.ABI.makeISyndicationLinkFactory(factoryActivatorPtr.value))
    }

    public fun activate(uri: Uri): JNAPointer? =
        ISyndicationLinkFactory_Instance.CreateSyndicationLink(uri)?.pointer

    public fun activate(
      uri: Uri,
      relationship: String,
      title: String,
      mediaType: String,
      length: WinDef.UINT
    ): JNAPointer? = ISyndicationLinkFactory_Instance.CreateSyndicationLinkEx(uri, relationship,
        title, mediaType, length)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationLink {
      val address = segment.toRawLongValue()
      return SyndicationLink(Pointer(address))
    }

    public override fun toNative(obj: SyndicationLink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
