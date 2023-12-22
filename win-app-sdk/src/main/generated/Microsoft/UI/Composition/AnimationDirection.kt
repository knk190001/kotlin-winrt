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

@ABIMarker(AnimationDirection.ABI::class)
@Signature("enum(Microsoft.UI.Composition.AnimationDirection;i4)")
@WinRTByReference(brClass = AnimationDirection.ByReference::class)
public enum class AnimationDirection(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Reverse(1),
  Alternate(2),
  AlternateReverse(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> Reverse
      2 -> Alternate
      3 -> AlternateReverse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnimationDirection> {
    public fun setValue(newValue: AnimationDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationDirection =
        AnimationDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationDirection =
        AnimationDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationDirection): Int = obj.value
  }
}
