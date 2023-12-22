package Windows.Media.ClosedCaptioning

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

@ABIMarker(ClosedCaptionStyle.ABI::class)
@Signature("enum(Windows.Media.ClosedCaptioning.ClosedCaptionStyle;i4)")
@WinRTByReference(brClass = ClosedCaptionStyle.ByReference::class)
public enum class ClosedCaptionStyle(
  public val value: Int
) : NativeMapped {
  Default(0),
  MonospacedWithSerifs(1),
  ProportionalWithSerifs(2),
  MonospacedWithoutSerifs(3),
  ProportionalWithoutSerifs(4),
  Casual(5),
  Cursive(6),
  SmallCapitals(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ClosedCaptionStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> MonospacedWithSerifs
      2 -> ProportionalWithSerifs
      3 -> MonospacedWithoutSerifs
      4 -> ProportionalWithoutSerifs
      5 -> Casual
      6 -> Cursive
      7 -> SmallCapitals
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ClosedCaptionStyle> {
    public fun setValue(newValue: ClosedCaptionStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ClosedCaptionStyle =
        ClosedCaptionStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ClosedCaptionStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ClosedCaptionStyle =
        ClosedCaptionStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: ClosedCaptionStyle): Int = obj.value
  }
}
