package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(PhoneTriggerType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.Background.PhoneTriggerType;i4)")
@WinRTByReference(brClass = PhoneTriggerType.ByReference::class)
public enum class PhoneTriggerType(
  public val value: Int
) : NativeMapped {
  NewVoicemailMessage(0),
  CallHistoryChanged(1),
  LineChanged(2),
  AirplaneModeDisabledForEmergencyCall(3),
  CallOriginDataRequest(4),
  CallBlocked(5),
  IncomingCallDismissed(6),
  IncomingCallNotification(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneTriggerType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NewVoicemailMessage
      1 -> CallHistoryChanged
      2 -> LineChanged
      3 -> AirplaneModeDisabledForEmergencyCall
      4 -> CallOriginDataRequest
      5 -> CallBlocked
      6 -> IncomingCallDismissed
      7 -> IncomingCallNotification
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneTriggerType> {
    public fun setValue(newValue: PhoneTriggerType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneTriggerType =
        PhoneTriggerType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneTriggerType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneTriggerType =
        PhoneTriggerType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneTriggerType): Int = obj.value
  }
}
