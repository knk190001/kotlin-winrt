package Windows.ApplicationModel.Email

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

@ABIMarker(EmailMailboxSyncStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxSyncStatus;i4)")
@WinRTByReference(brClass = EmailMailboxSyncStatus.ByReference::class)
public enum class EmailMailboxSyncStatus(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Syncing(1),
  UpToDate(2),
  AuthenticationError(3),
  PolicyError(4),
  UnknownError(5),
  ManualAccountRemovalRequired(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxSyncStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Syncing
      2 -> UpToDate
      3 -> AuthenticationError
      4 -> PolicyError
      5 -> UnknownError
      6 -> ManualAccountRemovalRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMailboxSyncStatus> {
    public fun setValue(newValue: EmailMailboxSyncStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxSyncStatus =
        EmailMailboxSyncStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxSyncStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxSyncStatus =
        EmailMailboxSyncStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxSyncStatus): Int = obj.value
  }
}
