package Windows.Gaming.Input.ForceFeedback

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

@ABIMarker(ForceFeedbackEffectAxes.ABI::class)
@Signature("enum(Windows.Gaming.Input.ForceFeedback.ForceFeedbackEffectAxes;u4)")
@WinRTByReference(brClass = ForceFeedbackEffectAxes.ByReference::class)
public enum class ForceFeedbackEffectAxes(
  public val value: Int
) : NativeMapped {
  None(0),
  X(1),
  Y(2),
  Z(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ForceFeedbackEffectAxes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> X
      2 -> Y
      4 -> Z
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ForceFeedbackEffectAxes> {
    public fun setValue(newValue: ForceFeedbackEffectAxes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ForceFeedbackEffectAxes =
        ForceFeedbackEffectAxes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ForceFeedbackEffectAxes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ForceFeedbackEffectAxes =
        ForceFeedbackEffectAxes.values()[0].fromNative(value, null)

    public override fun toNative(obj: ForceFeedbackEffectAxes): Int = obj.value
  }
}
