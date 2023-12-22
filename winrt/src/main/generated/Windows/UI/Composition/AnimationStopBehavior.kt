package Windows.UI.Composition

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

@ABIMarker(AnimationStopBehavior.ABI::class)
@Signature("enum(Windows.UI.Composition.AnimationStopBehavior;i4)")
@WinRTByReference(brClass = AnimationStopBehavior.ByReference::class)
public enum class AnimationStopBehavior(
  public val value: Int
) : NativeMapped {
  LeaveCurrentValue(0),
  SetToInitialValue(1),
  SetToFinalValue(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationStopBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LeaveCurrentValue
      1 -> SetToInitialValue
      2 -> SetToFinalValue
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnimationStopBehavior> {
    public fun setValue(newValue: AnimationStopBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationStopBehavior =
        AnimationStopBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationStopBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationStopBehavior =
        AnimationStopBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationStopBehavior): Int = obj.value
  }
}
