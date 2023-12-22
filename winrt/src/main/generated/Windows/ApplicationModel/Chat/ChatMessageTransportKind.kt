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

@ABIMarker(ChatMessageTransportKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatMessageTransportKind;i4)")
@WinRTByReference(brClass = ChatMessageTransportKind.ByReference::class)
public enum class ChatMessageTransportKind(
  public val value: Int
) : NativeMapped {
  Text(0),
  Untriaged(1),
  Blocked(2),
  Custom(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatMessageTransportKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Text
      1 -> Untriaged
      2 -> Blocked
      3 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatMessageTransportKind>
      {
    public fun setValue(newValue: ChatMessageTransportKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatMessageTransportKind =
        ChatMessageTransportKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatMessageTransportKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatMessageTransportKind =
        ChatMessageTransportKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatMessageTransportKind): Int = obj.value
  }
}
