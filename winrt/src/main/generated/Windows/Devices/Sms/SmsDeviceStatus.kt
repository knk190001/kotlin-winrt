package Windows.Devices.Sms

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

@ABIMarker(SmsDeviceStatus.ABI::class)
@Signature("enum(Windows.Devices.Sms.SmsDeviceStatus;i4)")
@WinRTByReference(brClass = SmsDeviceStatus.ByReference::class)
public enum class SmsDeviceStatus(
  public val value: Int
) : NativeMapped {
  Off(0),
  Ready(1),
  SimNotInserted(2),
  BadSim(3),
  DeviceFailure(4),
  SubscriptionNotActivated(5),
  DeviceLocked(6),
  DeviceBlocked(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmsDeviceStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> Ready
      2 -> SimNotInserted
      3 -> BadSim
      4 -> DeviceFailure
      5 -> SubscriptionNotActivated
      6 -> DeviceLocked
      7 -> DeviceBlocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmsDeviceStatus> {
    public fun setValue(newValue: SmsDeviceStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmsDeviceStatus =
        SmsDeviceStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmsDeviceStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmsDeviceStatus =
        SmsDeviceStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmsDeviceStatus): Int = obj.value
  }
}
