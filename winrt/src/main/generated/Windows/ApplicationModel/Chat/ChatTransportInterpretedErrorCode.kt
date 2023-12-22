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

@ABIMarker(ChatTransportInterpretedErrorCode.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatTransportInterpretedErrorCode;i4)")
@WinRTByReference(brClass = ChatTransportInterpretedErrorCode.ByReference::class)
public enum class ChatTransportInterpretedErrorCode(
  public val value: Int
) : NativeMapped {
  None(0),
  Unknown(1),
  InvalidRecipientAddress(2),
  NetworkConnectivity(3),
  ServiceDenied(4),
  Timeout(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatTransportInterpretedErrorCode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Unknown
      2 -> InvalidRecipientAddress
      3 -> NetworkConnectivity
      4 -> ServiceDenied
      5 -> Timeout
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ChatTransportInterpretedErrorCode> {
    public fun setValue(newValue: ChatTransportInterpretedErrorCode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatTransportInterpretedErrorCode =
        ChatTransportInterpretedErrorCode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatTransportInterpretedErrorCode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatTransportInterpretedErrorCode =
        ChatTransportInterpretedErrorCode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatTransportInterpretedErrorCode): Int = obj.value
  }
}
