package Windows.Globalization

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

@ABIMarker(DayOfWeek.ABI::class)
@Signature("enum(Windows.Globalization.DayOfWeek;i4)")
@WinRTByReference(brClass = DayOfWeek.ByReference::class)
public enum class DayOfWeek(
  public val value: Int
) : NativeMapped {
  Sunday(0),
  Monday(1),
  Tuesday(2),
  Wednesday(3),
  Thursday(4),
  Friday(5),
  Saturday(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): DayOfWeek {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Sunday
      1 -> Monday
      2 -> Tuesday
      3 -> Wednesday
      4 -> Thursday
      5 -> Friday
      6 -> Saturday
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DayOfWeek> {
    public fun setValue(newValue: DayOfWeek): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DayOfWeek =
        DayOfWeek.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DayOfWeek, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DayOfWeek =
        DayOfWeek.values()[0].fromNative(value, null)

    public override fun toNative(obj: DayOfWeek): Int = obj.value
  }
}
