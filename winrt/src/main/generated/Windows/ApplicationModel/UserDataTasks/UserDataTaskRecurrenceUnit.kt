package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(UserDataTaskRecurrenceUnit.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskRecurrenceUnit;i4)")
@WinRTByReference(brClass = UserDataTaskRecurrenceUnit.ByReference::class)
public enum class UserDataTaskRecurrenceUnit(
  public val value: Int
) : NativeMapped {
  Daily(0),
  Weekly(1),
  Monthly(2),
  MonthlyOnDay(3),
  Yearly(4),
  YearlyOnDay(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskRecurrenceUnit {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Daily
      1 -> Weekly
      2 -> Monthly
      3 -> MonthlyOnDay
      4 -> Yearly
      5 -> YearlyOnDay
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataTaskRecurrenceUnit> {
    public fun setValue(newValue: UserDataTaskRecurrenceUnit): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskRecurrenceUnit =
        UserDataTaskRecurrenceUnit.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskRecurrenceUnit, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskRecurrenceUnit =
        UserDataTaskRecurrenceUnit.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskRecurrenceUnit): Int = obj.value
  }
}
