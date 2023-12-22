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

@ABIMarker(AnimationIterationBehavior.ABI::class)
@Signature("enum(Windows.UI.Composition.AnimationIterationBehavior;i4)")
@WinRTByReference(brClass = AnimationIterationBehavior.ByReference::class)
public enum class AnimationIterationBehavior(
  public val value: Int
) : NativeMapped {
  Count(0),
  Forever(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationIterationBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Count
      1 -> Forever
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AnimationIterationBehavior> {
    public fun setValue(newValue: AnimationIterationBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationIterationBehavior =
        AnimationIterationBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationIterationBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationIterationBehavior =
        AnimationIterationBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationIterationBehavior): Int = obj.value
  }
}
