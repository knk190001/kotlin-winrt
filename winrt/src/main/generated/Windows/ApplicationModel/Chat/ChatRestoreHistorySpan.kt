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

@ABIMarker(ChatRestoreHistorySpan.ABI::class)
@Signature("enum(Windows.ApplicationModel.Chat.ChatRestoreHistorySpan;i4)")
@WinRTByReference(brClass = ChatRestoreHistorySpan.ByReference::class)
public enum class ChatRestoreHistorySpan(
  public val value: Int
) : NativeMapped {
  LastMonth(0),
  LastYear(1),
  AnyTime(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChatRestoreHistorySpan {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LastMonth
      1 -> LastYear
      2 -> AnyTime
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChatRestoreHistorySpan> {
    public fun setValue(newValue: ChatRestoreHistorySpan): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChatRestoreHistorySpan =
        ChatRestoreHistorySpan.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChatRestoreHistorySpan, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChatRestoreHistorySpan =
        ChatRestoreHistorySpan.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChatRestoreHistorySpan): Int = obj.value
  }
}
