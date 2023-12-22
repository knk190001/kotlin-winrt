package Windows.ApplicationModel.Chat

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

@ABIMarker(ChatMessageValidationStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatMessageValidationStatus;i4)")
@WinRTByReference(brClass = ChatMessageValidationStatus.ByReference::class)
public enum class ChatMessageValidationStatus(
  public val value: Int
) : NativeMapped {
  Valid(0),
  NoRecipients(1),
  InvalidData(2),
  MessageTooLarge(3),
  TooManyRecipients(4),
  TransportInactive(5),
  TransportNotFound(6),
  TooManyAttachments(7),
  InvalidRecipients(8),
  InvalidBody(9),
  InvalidOther(10),
  ValidWithLargeMessage(11),
  VoiceRoamingRestriction(12),
  DataRoamingRestriction(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatMessageValidationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Valid
      1 -> NoRecipients
      2 -> InvalidData
      3 -> MessageTooLarge
      4 -> TooManyRecipients
      5 -> TransportInactive
      6 -> TransportNotFound
      7 -> TooManyAttachments
      8 -> InvalidRecipients
      9 -> InvalidBody
      10 -> InvalidOther
      11 -> ValidWithLargeMessage
      12 -> VoiceRoamingRestriction
      13 -> DataRoamingRestriction
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ChatMessageValidationStatus> {
    public fun setValue(newValue: ChatMessageValidationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatMessageValidationStatus =
        ChatMessageValidationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatMessageValidationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatMessageValidationStatus =
        ChatMessageValidationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatMessageValidationStatus): Int = obj.value
  }
}
