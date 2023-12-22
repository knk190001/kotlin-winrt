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

@ABIMarker(ChatConversationThreadingKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatConversationThreadingKind;i4)")
@WinRTByReference(brClass = ChatConversationThreadingKind.ByReference::class)
public enum class ChatConversationThreadingKind(
  public val value: Int
) : NativeMapped {
  Participants(0),
  ContactId(1),
  ConversationId(2),
  Custom(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatConversationThreadingKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Participants
      1 -> ContactId
      2 -> ConversationId
      3 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ChatConversationThreadingKind> {
    public fun setValue(newValue: ChatConversationThreadingKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatConversationThreadingKind =
        ChatConversationThreadingKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatConversationThreadingKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatConversationThreadingKind =
        ChatConversationThreadingKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatConversationThreadingKind): Int = obj.value
  }
}
