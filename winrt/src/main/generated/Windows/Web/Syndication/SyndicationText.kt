package Windows.Web.Syndication

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

@ABIMarker(SyndicationText.ABI::class)
@Signature("rc(Windows.Web.Syndication.SyndicationText;{b9cc5e80-313a-4091-a2a6-243e0ee923f9})")
@WinRTByReference(brClass = SyndicationText.ByReference::class)
public class SyndicationText(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISyndicationText.WithDefault, ISyndicationNode.WithDefault, IWinRTObject {
  private val __1576322851_Interface: ISyndicationText.WithDefault by lazy {
    as_1576322851()
  }


  private val __1576492622_Interface: ISyndicationNode.WithDefault by lazy {
    as_1576492622()
  }


  public override val __1576322851_Ptr: JNAPointer? by lazy {
    __1576322851_Interface.__1576322851_Ptr
  }


  public override val __1576492622_Ptr: JNAPointer? by lazy {
    __1576492622_Interface.__1576492622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1576322851_Interface, __1576492622_Interface)

  public constructor() : this(ABI.activate())

  public constructor(text: String) : this(ABI.activate(text))

  public constructor(text: String, type: SyndicationTextType) : this(ABI.activate(text, type))

  private fun as_1576322851(): ISyndicationText.WithDefault {
    if(pointer == NULL) {
      return(ISyndicationText.ABI.makeISyndicationText(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISyndicationText>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISyndicationText.ABI.makeISyndicationText(ref.value))
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
      IByReference<SyndicationText> {
    public override fun getValue() = SyndicationText(pointer.getPointer(0))

    public fun setValue(value: SyndicationText): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SyndicationText, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISyndicationTextFactory_Instance: ISyndicationTextFactory by lazy {
      createISyndicationTextFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationText".toHandle(),
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

    public fun createISyndicationTextFactory(): ISyndicationTextFactory {
      val refiid = Guid.REFIID(ISyndicationTextFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Web.Syndication.SyndicationText".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISyndicationTextFactory.ABI.makeISyndicationTextFactory(factoryActivatorPtr.value))
    }

    public fun activate(text: String): JNAPointer? =
        ISyndicationTextFactory_Instance.CreateSyndicationText(text)?.pointer

    public fun activate(text: String, type: SyndicationTextType): JNAPointer? =
        ISyndicationTextFactory_Instance.CreateSyndicationTextEx(text, type)?.pointer

    public override fun fromNative(segment: MemoryAddress): SyndicationText {
      val address = segment.toRawLongValue()
      return SyndicationText(Pointer(address))
    }

    public override fun toNative(obj: SyndicationText): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
