package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ConversationalAgentState.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentState;i4)")
@WinRTByReference(brClass = ConversationalAgentState.ByReference::class)
public enum class ConversationalAgentState(
  public val value: Int
) : NativeMapped {
  Inactive(0),
  Detecting(1),
  Listening(2),
  Working(3),
  Speaking(4),
  ListeningAndSpeaking(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ConversationalAgentState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Inactive
      1 -> Detecting
      2 -> Listening
      3 -> Working
      4 -> Speaking
      5 -> ListeningAndSpeaking
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ConversationalAgentState>
      {
    public fun setValue(newValue: ConversationalAgentState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ConversationalAgentState =
        ConversationalAgentState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ConversationalAgentState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ConversationalAgentState =
        ConversationalAgentState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ConversationalAgentState): Int = obj.value
  }
}
