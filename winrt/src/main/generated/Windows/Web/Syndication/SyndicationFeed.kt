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

@ABIMarker(SyndicationFeed.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationFeed;{7ffe3cd2-5b66-4d62-8403-1bc10d910d6b})")
@WinRTByReference(brClass = SyndicationFeed.ByReference::class)
public class SyndicationFeed(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationFeed.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __1576740530_Interface: ISyndicationFeed.WithDefault by lazy {
    as_1576740530()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1576740530_Ptr: JNAPointer? by lazy {
    __1576740530_Interface.__1576740530_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576740530_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    title: String,
    subtitle: String,
    uri: Uri
  ) : this(ABI.activate(title, subtitle, uri))

  private fun as_1576740530(): ISyndicationFeed.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationFeed.ABI.makeISyndicationFeed(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationFeed>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationFeed.ABI.makeISyndicationFeed(ref.value))
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
      IByReference<SyndicationFeed> {
    public override fun getValue() = SyndicationFeed(pointer.getPointer(0))

    public fun setValue(value: SyndicationFeed): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationFeed, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationFeedFactory_Instance: ISyndicationFeedFactory by lazy {
      createISyndicationFeedFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationFeed".toHandle(),
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

    public fun createISyndicationFeedFactory(): ISyndicationFeedFactory {
      val refiid = Guid.REFIID(ISyndicationFeedFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationFeed".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationFeedFactory.ABI.makeISyndicationFeedFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      title: String,
      subtitle: String,
      uri: Uri
    ): JNAPointer? = ISyndicationFeedFactory_Instance.CreateSyndicationFeed(title, subtitle,
        uri)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationFeed {
      val address = segment.toRawLongValue()
      return SyndicationFeed(Pointer(address))
    }

    public override fun toNative(obj: SyndicationFeed): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
