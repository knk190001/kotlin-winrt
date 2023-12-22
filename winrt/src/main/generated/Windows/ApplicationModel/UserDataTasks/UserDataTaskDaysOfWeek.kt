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

@ABIMarker(UserDataTaskDaysOfWeek.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskDaysOfWeek;u4)")
@WinRTByReference(brClass = UserDataTaskDaysOfWeek.ByReference::class)
public enum class UserDataTaskDaysOfWeek(
  public val value: Int
) : NativeMapped {
  None(0),
  Sunday(1),
  Monday(2),
  Tuesday(4),
  Wednesday(8),
  Thursday(16),
  Friday(32),
  Saturday(64),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskDaysOfWeek {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Sunday
      2 -> Monday
      4 -> Tuesday
      8 -> Wednesday
      16 -> Thursday
      32 -> Friday
      64 -> Saturday
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserDataTaskDaysOfWeek> {
    public fun setValue(newValue: UserDataTaskDaysOfWeek): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskDaysOfWeek =
        UserDataTaskDaysOfWeek.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskDaysOfWeek, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskDaysOfWeek =
        UserDataTaskDaysOfWeek.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskDaysOfWeek): Int = obj.value
  }
}
