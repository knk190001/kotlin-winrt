package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(EasingMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.Animation.EasingMode;i4)")
@WinRTByReference(brClass = EasingMode.ByReference::class)
public enum class EasingMode(
  public val value: Int
) : NativeMapped {
  EaseOut(0),
  EaseIn(1),
  EaseInOut(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> EaseOut
      1 -> EaseIn
      2 -> EaseInOut
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EasingMode> {
    public fun setValue(newValue: EasingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasingMode =
        EasingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasingMode =
        EasingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasingMode): Int = obj.value
  }
}
