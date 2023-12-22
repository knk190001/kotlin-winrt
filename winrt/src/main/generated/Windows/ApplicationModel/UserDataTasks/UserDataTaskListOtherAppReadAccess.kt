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

@ABIMarker(UserDataTaskListOtherAppReadAccess.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskListOtherAppReadAccess;i4)")
@WinRTByReference(brClass = UserDataTaskListOtherAppReadAccess.ByReference::class)
public enum class UserDataTaskListOtherAppReadAccess(
  public val value: Int
) : NativeMapped {
  Full(0),
  SystemOnly(1),
  None(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskListOtherAppReadAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Full
      1 -> SystemOnly
      2 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataTaskListOtherAppReadAccess> {
    public fun setValue(newValue: UserDataTaskListOtherAppReadAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskListOtherAppReadAccess =
        UserDataTaskListOtherAppReadAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskListOtherAppReadAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskListOtherAppReadAccess =
        UserDataTaskListOtherAppReadAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskListOtherAppReadAccess): Int = obj.value
  }
}
