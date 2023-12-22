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

@ABIMarker(ChatMessageOperatorKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatMessageOperatorKind;i4)")
@WinRTByReference(brClass = ChatMessageOperatorKind.ByReference::class)
public enum class ChatMessageOperatorKind(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Sms(1),
  Mms(2),
  Rcs(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatMessageOperatorKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Sms
      2 -> Mms
      3 -> Rcs
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatMessageOperatorKind> {
    public fun setValue(newValue: ChatMessageOperatorKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatMessageOperatorKind =
        ChatMessageOperatorKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatMessageOperatorKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatMessageOperatorKind =
        ChatMessageOperatorKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatMessageOperatorKind): Int = obj.value
  }
}
