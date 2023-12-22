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

@ABIMarker(UserDataTaskPriority.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskPriority;i4)")
@WinRTByReference(brClass = UserDataTaskPriority.ByReference::class)
public enum class UserDataTaskPriority(
  public val value: Int
) : NativeMapped {
  Normal(0),
  Low(-1),
  High(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskPriority {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      -1 -> Low
      1 -> High
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UserDataTaskPriority> {
    public fun setValue(newValue: UserDataTaskPriority): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskPriority =
        UserDataTaskPriority.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskPriority, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskPriority =
        UserDataTaskPriority.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskPriority): Int = obj.value
  }
}
