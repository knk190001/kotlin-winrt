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

@ABIMarker(InkStrokeInput.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkStrokeInput;{cf2ffe7b-5e10-43c6-a080-88f26e1dc67d})")
@WinRTByReference(brClass = InkStrokeInput.ByReference::class)
public class InkStrokeInput(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkStrokeInput.WithDefault, IWinRTObject {
  private val __426177734_Interface: IInkStrokeInput.WithDefault by lazy {
    as_426177734()
  }


  public override val __426177734_Ptr: JNAPointer? by lazy {
    __426177734_Interface.__426177734_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__426177734_Interface)

  private fun as_426177734(): IInkStrokeInput.WithDefault {
    if(pointer == NULL) {
      return(IInkStrokeInput.ABI.makeIInkStrokeInput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkStrokeInput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkStrokeInput.ABI.makeIInkStrokeInput(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkStrokeInput>
      {
    public override fun getValue() = InkStrokeInput(pointer.getPointer(0))

    public fun setValue(value: InkStrokeInput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkStrokeInput, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkStrokeInput {
      val address = segment.toRawLongValue()
      return InkStrokeInput(Pointer(address))
    }

    public override fun toNative(obj: InkStrokeInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
