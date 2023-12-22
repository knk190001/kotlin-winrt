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

@ABIMarker(UserDataTaskListSyncStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataTasks.UserDataTaskListSyncStatus;i4)")
@WinRTByReference(brClass = UserDataTaskListSyncStatus.ByReference::class)
public enum class UserDataTaskListSyncStatus(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Syncing(1),
  UpToDate(2),
  AuthenticationError(3),
  PolicyError(4),
  UnknownError(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserDataTaskListSyncStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Syncing
      2 -> UpToDate
      3 -> AuthenticationError
      4 -> PolicyError
      5 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserDataTaskListSyncStatus> {
    public fun setValue(newValue: UserDataTaskListSyncStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserDataTaskListSyncStatus =
        UserDataTaskListSyncStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserDataTaskListSyncStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserDataTaskListSyncStatus =
        UserDataTaskListSyncStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserDataTaskListSyncStatus): Int = obj.value
  }
}
