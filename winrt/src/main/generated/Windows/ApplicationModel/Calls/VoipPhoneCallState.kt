package Windows.ApplicationModel.Calls

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

@ABIMarker(VoipPhoneCallState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.VoipPhoneCallState;i4)")
@WinRTByReference(brClass = VoipPhoneCallState.ByReference::class)
public enum class VoipPhoneCallState(
  public val value: Int
) : NativeMapped {
  Ended(0),
  Held(1),
  Active(2),
  Incoming(3),
  Outgoing(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VoipPhoneCallState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ended
      1 -> Held
      2 -> Active
      3 -> Incoming
      4 -> Outgoing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VoipPhoneCallState> {
    public fun setValue(newValue: VoipPhoneCallState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VoipPhoneCallState =
        VoipPhoneCallState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VoipPhoneCallState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VoipPhoneCallState =
        VoipPhoneCallState.values()[0].fromNative(value, null)

    public override fun toNative(obj: VoipPhoneCallState): Int = obj.value
  }
}
