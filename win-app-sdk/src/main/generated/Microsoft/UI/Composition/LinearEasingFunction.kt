package Microsoft.UI.Composition

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

@ABIMarker(LinearEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.LinearEasingFunction;{79bfeef6-70c7-50a6-bb3a-0e9636148695})")
@WinRTByReference(brClass = LinearEasingFunction.ByReference::class)
public class LinearEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), ILinearEasingFunction.WithDefault, IWinRTObject {
  private val __514330047_Interface: ILinearEasingFunction.WithDefault by lazy {
    as_514330047()
  }


  public override val __514330047_Ptr: JNAPointer? by lazy {
    __514330047_Interface.__514330047_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__514330047_Interface)

  private fun as_514330047(): ILinearEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(ILinearEasingFunction.ABI.makeILinearEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinearEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinearEasingFunction.ABI.makeILinearEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinearEasingFunction> {
    public override fun getValue() = LinearEasingFunction(pointer.getPointer(0))

    public fun setValue(value: LinearEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinearEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LinearEasingFunction {
      val address = segment.toRawLongValue()
      return LinearEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: LinearEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
