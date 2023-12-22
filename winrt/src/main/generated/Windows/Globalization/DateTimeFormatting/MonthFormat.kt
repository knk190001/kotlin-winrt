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

@ABIMarker(MonthFormat.ABI::class)
@Signature("enum(Windows.Globalization.DateTimeFormatting.MonthFormat;i4)")
@WinRTByReference(brClass = MonthFormat.ByReference::class)
public enum class MonthFormat(
  public val value: Int
) : NativeMapped {
  None(0),
  Default(1),
  Abbreviated(2),
  Full(3),
  Numeric(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MonthFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Default
      2 -> Abbreviated
      3 -> Full
      4 -> Numeric
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MonthFormat> {
    public fun setValue(newValue: MonthFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MonthFormat =
        MonthFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MonthFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MonthFormat =
        MonthFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: MonthFormat): Int = obj.value
  }
}
