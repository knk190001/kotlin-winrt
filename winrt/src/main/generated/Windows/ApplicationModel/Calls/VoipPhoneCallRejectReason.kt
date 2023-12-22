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

@ABIMarker(VoipPhoneCallRejectReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.VoipPhoneCallRejectReason;i4)")
@WinRTByReference(brClass = VoipPhoneCallRejectReason.ByReference::class)
public enum class VoipPhoneCallRejectReason(
  public val value: Int
) : NativeMapped {
  UserIgnored(0),
  TimedOut(1),
  OtherIncomingCall(2),
  EmergencyCallExists(3),
  InvalidCallState(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VoipPhoneCallRejectReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UserIgnored
      1 -> TimedOut
      2 -> OtherIncomingCall
      3 -> EmergencyCallExists
      4 -> InvalidCallState
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VoipPhoneCallRejectReason>
      {
    public fun setValue(newValue: VoipPhoneCallRejectReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VoipPhoneCallRejectReason =
        VoipPhoneCallRejectReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VoipPhoneCallRejectReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VoipPhoneCallRejectReason =
        VoipPhoneCallRejectReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: VoipPhoneCallRejectReason): Int = obj.value
  }
}
