package Windows.Globalization.DateTimeFormatting

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

@ABIMarker(DayOfWeekFormat.ABI::class)
@Signature("enum(Windows.Globalization.DateTimeFormatting.DayOfWeekFormat;i4)")
@WinRTByReference(brClass = DayOfWeekFormat.ByReference::class)
public enum class DayOfWeekFormat(
  public val value: Int
) : NativeMapped {
  None(0),
  Default(1),
  Abbreviated(2),
  Full(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DayOfWeekFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Default
      2 -> Abbreviated
      3 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DayOfWeekFormat> {
    public fun setValue(newValue: DayOfWeekFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DayOfWeekFormat =
        DayOfWeekFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DayOfWeekFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DayOfWeekFormat =
        DayOfWeekFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: DayOfWeekFormat): Int = obj.value
  }
}
