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

@ABIMarker(DayFormat.ABI::class)
@Signature("enum(Windows.Globalization.DateTimeFormatting.DayFormat;i4)")
@WinRTByReference(brClass = DayFormat.ByReference::class)
public enum class DayFormat(
  public val value: Int
) : NativeMapped {
  None(0),
  Default(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): DayFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Default
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DayFormat> {
    public fun setValue(newValue: DayFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DayFormat =
        DayFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DayFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DayFormat =
        DayFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: DayFormat): Int = obj.value
  }
}
