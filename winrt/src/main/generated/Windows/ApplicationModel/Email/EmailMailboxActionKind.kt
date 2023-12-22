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

@ABIMarker(EmailMailboxActionKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailMailboxActionKind;i4)")
@WinRTByReference(brClass = EmailMailboxActionKind.ByReference::class)
public enum class EmailMailboxActionKind(
  public val value: Int
) : NativeMapped {
  MarkMessageAsSeen(0),
  MarkMessageRead(1),
  ChangeMessageFlagState(2),
  MoveMessage(3),
  SaveDraft(4),
  SendMessage(5),
  CreateResponseReplyMessage(6),
  CreateResponseReplyAllMessage(7),
  CreateResponseForwardMessage(8),
  MoveFolder(9),
  MarkFolderForSyncEnabled(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailMailboxActionKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> MarkMessageAsSeen
      1 -> MarkMessageRead
      2 -> ChangeMessageFlagState
      3 -> MoveMessage
      4 -> SaveDraft
      5 -> SendMessage
      6 -> CreateResponseReplyMessage
      7 -> CreateResponseReplyAllMessage
      8 -> CreateResponseForwardMessage
      9 -> MoveFolder
      10 -> MarkFolderForSyncEnabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailMailboxActionKind> {
    public fun setValue(newValue: EmailMailboxActionKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailMailboxActionKind =
        EmailMailboxActionKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailMailboxActionKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailMailboxActionKind =
        EmailMailboxActionKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailMailboxActionKind): Int = obj.value
  }
}
