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

@ABIMarker(ChatStoreChangedEventKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatStoreChangedEventKind;i4)")
@WinRTByReference(brClass = ChatStoreChangedEventKind.ByReference::class)
public enum class ChatStoreChangedEventKind(
  public val value: Int
) : NativeMapped {
  NotificationsMissed(0),
  StoreModified(1),
  MessageCreated(2),
  MessageModified(3),
  MessageDeleted(4),
  ConversationModified(5),
  ConversationDeleted(6),
  ConversationTransportDeleted(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatStoreChangedEventKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotificationsMissed
      1 -> StoreModified
      2 -> MessageCreated
      3 -> MessageModified
      4 -> MessageDeleted
      5 -> ConversationModified
      6 -> ConversationDeleted
      7 -> ConversationTransportDeleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatStoreChangedEventKind>
      {
    public fun setValue(newValue: ChatStoreChangedEventKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatStoreChangedEventKind =
        ChatStoreChangedEventKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatStoreChangedEventKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatStoreChangedEventKind =
        ChatStoreChangedEventKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatStoreChangedEventKind): Int = obj.value
  }
}
