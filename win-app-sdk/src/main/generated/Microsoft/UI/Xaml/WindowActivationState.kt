package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(WindowActivationState.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.WindowActivationState;i4)")
@WinRTByReference(brClass = WindowActivationState.ByReference::class)
public enum class WindowActivationState(
  public val value: Int
) : NativeMapped {
  CodeActivated(0),
  Deactivated(1),
  PointerActivated(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WindowActivationState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> CodeActivated
      1 -> Deactivated
      2 -> PointerActivated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WindowActivationState> {
    public fun setValue(newValue: WindowActivationState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WindowActivationState =
        WindowActivationState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WindowActivationState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WindowActivationState =
        WindowActivationState.values()[0].fromNative(value, null)

    public override fun toNative(obj: WindowActivationState): Int = obj.value
  }
}
