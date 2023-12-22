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

@ABIMarker(ChatItemKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatItemKind;i4)")
@WinRTByReference(brClass = ChatItemKind.ByReference::class)
public enum class ChatItemKind(
  public val value: Int
) : NativeMapped {
  Message(0),
  Conversation(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatItemKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Message
      1 -> Conversation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatItemKind> {
    public fun setValue(newValue: ChatItemKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatItemKind =
        ChatItemKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatItemKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatItemKind =
        ChatItemKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatItemKind): Int = obj.value
  }
}
