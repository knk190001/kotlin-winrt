package Microsoft.UI.Composition

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

@ABIMarker(AnimationDelayBehavior.ABI::class)
@Signature("enum(Microsoft.UI.Composition.AnimationDelayBehavior;i4)")
@WinRTByReference(brClass = AnimationDelayBehavior.ByReference::class)
public enum class AnimationDelayBehavior(
  public val value: Int
) : NativeMapped {
  SetInitialValueAfterDelay(0),
  SetInitialValueBeforeDelay(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationDelayBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SetInitialValueAfterDelay
      1 -> SetInitialValueBeforeDelay
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnimationDelayBehavior> {
    public fun setValue(newValue: AnimationDelayBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationDelayBehavior =
        AnimationDelayBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationDelayBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationDelayBehavior =
        AnimationDelayBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationDelayBehavior): Int = obj.value
  }
}
