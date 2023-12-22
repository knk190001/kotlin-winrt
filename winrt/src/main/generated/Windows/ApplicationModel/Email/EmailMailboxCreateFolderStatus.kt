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

@ABIMarker(EmailMailboxCreateFolderStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus;i4)")
@WinRTByReference(brClass = EmailMailboxCreateFolderStatus.ByReference::class)
public enum class EmailMailboxCreateFolderStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NetworkError(1),
  PermissionsError(2),
  ServerError(3),
  UnknownFailure(4),
  NameCollision(5),
  ServerRejected(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxCreateFolderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NetworkError
      2 -> PermissionsError
      3 -> ServerError
      4 -> UnknownFailure
      5 -> NameCollision
      6 -> ServerRejected
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailMailboxCreateFolderStatus> {
    public fun setValue(newValue: EmailMailboxCreateFolderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxCreateFolderStatus =
        EmailMailboxCreateFolderStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxCreateFolderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxCreateFolderStatus =
        EmailMailboxCreateFolderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxCreateFolderStatus): Int = obj.value
  }
}
