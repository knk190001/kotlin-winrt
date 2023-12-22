package Windows.UI.Text

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

@ABIMarker(UnderlineType.ABI::class)
@Signature("enum(Windows.UI.Text.UnderlineType;i4)")
@WinRTByReference(brClass = UnderlineType.ByReference::class)
public enum class UnderlineType(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  None(1),
  Single(2),
  Words(3),
  Double(4),
  Dotted(5),
  Dash(6),
  DashDot(7),
  DashDotDot(8),
  Wave(9),
  Thick(10),
  Thin(11),
  DoubleWave(12),
  HeavyWave(13),
  LongDash(14),
  ThickDash(15),
  ThickDashDot(16),
  ThickDashDotDot(17),
  ThickDotted(18),
  ThickLongDash(19),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnderlineType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> None
      2 -> Single
      3 -> Words
      4 -> Double
      5 -> Dotted
      6 -> Dash
      7 -> DashDot
      8 -> DashDotDot
      9 -> Wave
      10 -> Thick
      11 -> Thin
      12 -> DoubleWave
      13 -> HeavyWave
      14 -> LongDash
      15 -> ThickDash
      16 -> ThickDashDot
      17 -> ThickDashDotDot
      18 -> ThickDotted
      19 -> ThickLongDash
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UnderlineType> {
    public fun setValue(newValue: UnderlineType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnderlineType =
        UnderlineType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnderlineType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnderlineType =
        UnderlineType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnderlineType): Int = obj.value
  }
}
