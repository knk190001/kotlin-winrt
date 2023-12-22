package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(SlideNavigationTransitionEffect.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.Animation.SlideNavigationTransitionEffect;i4)")
@WinRTByReference(brClass = SlideNavigationTransitionEffect.ByReference::class)
public enum class SlideNavigationTransitionEffect(
  public val value: Int
) : NativeMapped {
  FromBottom(0),
  FromLeft(1),
  FromRight(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SlideNavigationTransitionEffect {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FromBottom
      1 -> FromLeft
      2 -> FromRight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SlideNavigationTransitionEffect> {
    public fun setValue(newValue: SlideNavigationTransitionEffect): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SlideNavigationTransitionEffect =
        SlideNavigationTransitionEffect.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SlideNavigationTransitionEffect, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SlideNavigationTransitionEffect =
        SlideNavigationTransitionEffect.values()[0].fromNative(value, null)

    public override fun toNative(obj: SlideNavigationTransitionEffect): Int = obj.value
  }
}
