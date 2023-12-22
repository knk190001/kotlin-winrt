package Windows.UI.Input.Inking

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InkDrawingAttributes.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkDrawingAttributes;{97a2176c-6774-48ad-84f0-48f5a9be74f9})")
@WinRTByReference(brClass = InkDrawingAttributes.ByReference::class)
public class InkDrawingAttributes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkDrawingAttributes.WithDefault, IInkDrawingAttributes2.WithDefault,
    IInkDrawingAttributes3.WithDefault, IInkDrawingAttributes4.WithDefault,
    IInkDrawingAttributes5.WithDefault, IWinRTObject {
  private val __201325929_Interface: IInkDrawingAttributes.WithDefault by lazy {
    as_201325929()
  }


  private val __1946136553_Interface: IInkDrawingAttributes2.WithDefault by lazy {
    as_1946136553()
  }


  private val __1946136554_Interface: IInkDrawingAttributes3.WithDefault by lazy {
    as_1946136554()
  }


  private val __1946136555_Interface: IInkDrawingAttributes4.WithDefault by lazy {
    as_1946136555()
  }


  private val __1946136556_Interface: IInkDrawingAttributes5.WithDefault by lazy {
    as_1946136556()
  }


  public override val __201325929_Ptr: JNAPointer? by lazy {
    __201325929_Interface.__201325929_Ptr
  }


  public override val __1946136553_Ptr: JNAPointer? by lazy {
    __1946136553_Interface.__1946136553_Ptr
  }


  public override val __1946136554_Ptr: JNAPointer? by lazy {
    __1946136554_Interface.__1946136554_Ptr
  }


  public override val __1946136555_Ptr: JNAPointer? by lazy {
    __1946136555_Interface.__1946136555_Ptr
  }


  public override val __1946136556_Ptr: JNAPointer? by lazy {
    __1946136556_Interface.__1946136556_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__201325929_Interface, __1946136553_Interface, __1946136554_Interface,
        __1946136555_Interface, __1946136556_Interface)

  public constructor() : this(ABI.activate())

  private fun as_201325929(): IInkDrawingAttributes.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributes.ABI.makeIInkDrawingAttributes(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributes>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributes.ABI.makeIInkDrawingAttributes(ref.value))
  }

  private fun as_1946136553(): IInkDrawingAttributes2.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributes2.ABI.makeIInkDrawingAttributes2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributes2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributes2.ABI.makeIInkDrawingAttributes2(ref.value))
  }

  private fun as_1946136554(): IInkDrawingAttributes3.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributes3.ABI.makeIInkDrawingAttributes3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributes3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributes3.ABI.makeIInkDrawingAttributes3(ref.value))
  }

  private fun as_1946136555(): IInkDrawingAttributes4.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributes4.ABI.makeIInkDrawingAttributes4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributes4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributes4.ABI.makeIInkDrawingAttributes4(ref.value))
  }

  private fun as_1946136556(): IInkDrawingAttributes5.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributes5.ABI.makeIInkDrawingAttributes5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributes5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributes5.ABI.makeIInkDrawingAttributes5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkDrawingAttributes> {
    public override fun getValue() = InkDrawingAttributes(pointer.getPointer(0))

    public fun setValue(value: InkDrawingAttributes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkDrawingAttributes, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IInkDrawingAttributesStatics_Instance: IInkDrawingAttributesStatics by lazy {
      createIInkDrawingAttributesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkDrawingAttributes".toHandle(),
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

    public fun createIInkDrawingAttributesStatics(): IInkDrawingAttributesStatics {
      val refiid = Guid.REFIID(IInkDrawingAttributesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkDrawingAttributes".toHandle(),refiid,interfacePtr)
      val result =
          IInkDrawingAttributesStatics.ABI.makeIInkDrawingAttributesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InkDrawingAttributes {
      val address = segment.toRawLongValue()
      return InkDrawingAttributes(Pointer(address))
    }

    public override fun toNative(obj: InkDrawingAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForPencil() = ABI.IInkDrawingAttributesStatics_Instance.CreateForPencil()
  }
}
