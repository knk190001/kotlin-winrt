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

@ABIMarker(ChatTransportErrorCodeCategory.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatTransportErrorCodeCategory;i4)")
@WinRTByReference(brClass = ChatTransportErrorCodeCategory.ByReference::class)
public enum class ChatTransportErrorCodeCategory(
  public val value: Int
) : NativeMapped {
  None(0),
  Http(1),
  Network(2),
  MmsServer(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatTransportErrorCodeCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Http
      2 -> Network
      3 -> MmsServer
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ChatTransportErrorCodeCategory> {
    public fun setValue(newValue: ChatTransportErrorCodeCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatTransportErrorCodeCategory =
        ChatTransportErrorCodeCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatTransportErrorCodeCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatTransportErrorCodeCategory =
        ChatTransportErrorCodeCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatTransportErrorCodeCategory): Int = obj.value
  }
}
