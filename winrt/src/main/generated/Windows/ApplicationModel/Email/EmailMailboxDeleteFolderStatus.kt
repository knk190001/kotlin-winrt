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

@ABIMarker(EmailMailboxDeleteFolderStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus;i4)")
@WinRTByReference(brClass = EmailMailboxDeleteFolderStatus.ByReference::class)
public enum class EmailMailboxDeleteFolderStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  NetworkError(1),
  PermissionsError(2),
  ServerError(3),
  UnknownFailure(4),
  CouldNotDeleteEverything(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxDeleteFolderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NetworkError
      2 -> PermissionsError
      3 -> ServerError
      4 -> UnknownFailure
      5 -> CouldNotDeleteEverything
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EmailMailboxDeleteFolderStatus> {
    public fun setValue(newValue: EmailMailboxDeleteFolderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxDeleteFolderStatus =
        EmailMailboxDeleteFolderStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxDeleteFolderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxDeleteFolderStatus =
        EmailMailboxDeleteFolderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxDeleteFolderStatus): Int = obj.value
  }
}
