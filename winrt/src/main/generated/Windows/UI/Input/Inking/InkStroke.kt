package Windows.UI.Input.Inking

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(InkStroke.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkStroke;{15144d60-cce3-4fcf-9d52-11518ab6afd4})")
@WinRTByReference(brClass = InkStroke.ByReference::class)
public class InkStroke(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkStroke.WithDefault, IInkStroke2.WithDefault, IInkStroke3.WithDefault,
    IInkStroke4.WithDefault, IWinRTObject {
  private val __884781412_Interface: IInkStroke.WithDefault by lazy {
    as_884781412()
  }


  private val __1658420046_Interface: IInkStroke2.WithDefault by lazy {
    as_1658420046()
  }


  private val __1658420047_Interface: IInkStroke3.WithDefault by lazy {
    as_1658420047()
  }


  private val __1658420048_Interface: IInkStroke4.WithDefault by lazy {
    as_1658420048()
  }


  public override val __884781412_Ptr: JNAPointer? by lazy {
    __884781412_Interface.__884781412_Ptr
  }


  public override val __1658420046_Ptr: JNAPointer? by lazy {
    __1658420046_Interface.__1658420046_Ptr
  }


  public override val __1658420047_Ptr: JNAPointer? by lazy {
    __1658420047_Interface.__1658420047_Ptr
  }


  public override val __1658420048_Ptr: JNAPointer? by lazy {
    __1658420048_Interface.__1658420048_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__884781412_Interface, __1658420046_Interface, __1658420047_Interface,
        __1658420048_Interface)

  private fun as_884781412(): IInkStroke.WithDefault {
    if(pointer == NULL) {
      return(IInkStroke.ABI.makeIInkStroke(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStroke>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStroke.ABI.makeIInkStroke(ref.value))
  }

  private fun as_1658420046(): IInkStroke2.WithDefault {
    if(pointer == NULL) {
      return(IInkStroke2.ABI.makeIInkStroke2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStroke2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStroke2.ABI.makeIInkStroke2(ref.value))
  }

  private fun as_1658420047(): IInkStroke3.WithDefault {
    if(pointer == NULL) {
      return(IInkStroke3.ABI.makeIInkStroke3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStroke3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStroke3.ABI.makeIInkStroke3(ref.value))
  }

  private fun as_1658420048(): IInkStroke4.WithDefault {
    if(pointer == NULL) {
      return(IInkStroke4.ABI.makeIInkStroke4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStroke4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStroke4.ABI.makeIInkStroke4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkStroke> {
    public override fun getValue() = InkStroke(pointer.getPointer(0))

    public fun setValue(value: InkStroke): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkStroke, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkStroke {
      val address = segment.toRawLongValue()
      return InkStroke(Pointer(address))
    }

    public override fun toNative(obj: InkStroke): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
