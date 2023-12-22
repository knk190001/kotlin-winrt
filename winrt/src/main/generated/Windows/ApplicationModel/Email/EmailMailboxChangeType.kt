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

@ABIMarker(EmailMailboxChangeType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxChangeType;i4)")
@WinRTByReference(brClass = EmailMailboxChangeType.ByReference::class)
public enum class EmailMailboxChangeType(
  public val value: Int
) : NativeMapped {
  MessageCreated(0),
  MessageModified(1),
  MessageDeleted(2),
  FolderCreated(3),
  FolderModified(4),
  FolderDeleted(5),
  ChangeTrackingLost(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxChangeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> MessageCreated
      1 -> MessageModified
      2 -> MessageDeleted
      3 -> FolderCreated
      4 -> FolderModified
      5 -> FolderDeleted
      6 -> ChangeTrackingLost
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMailboxChangeType> {
    public fun setValue(newValue: EmailMailboxChangeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxChangeType =
        EmailMailboxChangeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxChangeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxChangeType =
        EmailMailboxChangeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxChangeType): Int = obj.value
  }
}
