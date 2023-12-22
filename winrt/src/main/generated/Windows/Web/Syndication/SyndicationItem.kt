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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SyndicationItem.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationItem;{548db883-c384-45c1-8ae8-a378c4ec486c})")
@WinRTByReference(brClass = SyndicationItem.ByReference::class)
public class SyndicationItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationItem.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __1576636733_Interface: ISyndicationItem.WithDefault by lazy {
    as_1576636733()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1576636733_Ptr: JNAPointer? by lazy {
    __1576636733_Interface.__1576636733_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576636733_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    title: String,
    content: SyndicationContent,
    uri: Uri
  ) : this(ABI.activate(title, content, uri))

  private fun as_1576636733(): ISyndicationItem.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationItem.ABI.makeISyndicationItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationItem.ABI.makeISyndicationItem(ref.value))
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
      IByReference<SyndicationItem> {
    public override fun getValue() = SyndicationItem(pointer.getPointer(0))

    public fun setValue(value: SyndicationItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationItem, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationItemFactory_Instance: ISyndicationItemFactory by lazy {
      createISyndicationItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationItem".toHandle(),
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

    public fun createISyndicationItemFactory(): ISyndicationItemFactory {
      val refiid = Guid.REFIID(ISyndicationItemFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationItemFactory.ABI.makeISyndicationItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      title: String,
      content: SyndicationContent,
      uri: Uri
    ): JNAPointer? = ISyndicationItemFactory_Instance.CreateSyndicationItem(title, content,
        uri)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationItem {
      val address = segment.toRawLongValue()
      return SyndicationItem(Pointer(address))
    }

    public override fun toNative(obj: SyndicationItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
