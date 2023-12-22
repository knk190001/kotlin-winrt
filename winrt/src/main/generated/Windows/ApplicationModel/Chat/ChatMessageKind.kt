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

@ABIMarker(ChatMessageKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatMessageKind;i4)")
@WinRTByReference(brClass = ChatMessageKind.ByReference::class)
public enum class ChatMessageKind(
  public val value: Int
) : NativeMapped {
  Standard(0),
  FileTransferRequest(1),
  TransportCustom(2),
  JoinedConversation(3),
  LeftConversation(4),
  OtherParticipantJoinedConversation(5),
  OtherParticipantLeftConversation(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatMessageKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Standard
      1 -> FileTransferRequest
      2 -> TransportCustom
      3 -> JoinedConversation
      4 -> LeftConversation
      5 -> OtherParticipantJoinedConversation
      6 -> OtherParticipantLeftConversation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatMessageKind> {
    public fun setValue(newValue: ChatMessageKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatMessageKind =
        ChatMessageKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatMessageKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatMessageKind =
        ChatMessageKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatMessageKind): Int = obj.value
  }
}
