package Microsoft.UI.Input

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

@ABIMarker(InputActivationState.ABI::class)
@Signature("enum(Microsoft.UI.Input.InputActivationState;i4)")
@WinRTByReference(brClass = InputActivationState.ByReference::class)
public enum class InputActivationState(
  public val value: Int
) : NativeMapped {
  None(0),
  Deactivated(1),
  Activated(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InputActivationState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Deactivated
      2 -> Activated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InputActivationState> {
    public fun setValue(newValue: InputActivationState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InputActivationState =
        InputActivationState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InputActivationState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InputActivationState =
        InputActivationState.values()[0].fromNative(value, null)

    public override fun toNative(obj: InputActivationState): Int = obj.value
  }
}
