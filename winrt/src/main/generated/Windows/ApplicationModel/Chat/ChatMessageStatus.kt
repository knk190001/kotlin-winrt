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

@ABIMarker(ChatMessageStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatMessageStatus;i4)")
@WinRTByReference(brClass = ChatMessageStatus.ByReference::class)
public enum class ChatMessageStatus(
  public val value: Int
) : NativeMapped {
  Draft(0),
  Sending(1),
  Sent(2),
  SendRetryNeeded(3),
  SendFailed(4),
  Received(5),
  ReceiveDownloadNeeded(6),
  ReceiveDownloadFailed(7),
  ReceiveDownloading(8),
  Deleted(9),
  Declined(10),
  Cancelled(11),
  Recalled(12),
  ReceiveRetryNeeded(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatMessageStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Draft
      1 -> Sending
      2 -> Sent
      3 -> SendRetryNeeded
      4 -> SendFailed
      5 -> Received
      6 -> ReceiveDownloadNeeded
      7 -> ReceiveDownloadFailed
      8 -> ReceiveDownloading
      9 -> Deleted
      10 -> Declined
      11 -> Cancelled
      12 -> Recalled
      13 -> ReceiveRetryNeeded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatMessageStatus> {
    public fun setValue(newValue: ChatMessageStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatMessageStatus =
        ChatMessageStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatMessageStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatMessageStatus =
        ChatMessageStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatMessageStatus): Int = obj.value
  }
}
