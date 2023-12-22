package Windows.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StepEasingFunction.ABI::class)
@Signature("rc(Windows.UI.Composition.StepEasingFunction;{d0caa74b-560c-4a0b-a5f6-206ca8c3ecd6})")
@WinRTByReference(brClass = StepEasingFunction.ByReference::class)
public class StepEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), IStepEasingFunction.WithDefault, IWinRTObject {
  private val __127160381_Interface: IStepEasingFunction.WithDefault by lazy {
    as_127160381()
  }


  public override val __127160381_Ptr: JNAPointer? by lazy {
    __127160381_Interface.__127160381_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__127160381_Interface)

  private fun as_127160381(): IStepEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(IStepEasingFunction.ABI.makeIStepEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStepEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStepEasingFunction.ABI.makeIStepEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StepEasingFunction> {
    public override fun getValue() = StepEasingFunction(pointer.getPointer(0))

    public fun setValue(value: StepEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StepEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StepEasingFunction {
      val address = segment.toRawLongValue()
      return StepEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: StepEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
