package Windows.ApplicationModel.Background

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

@ABIMarker(SystemTriggerType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.SystemTriggerType;i4)")
@WinRTByReference(brClass = SystemTriggerType.ByReference::class)
public enum class SystemTriggerType(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  SmsReceived(1),
  UserPresent(2),
  UserAway(3),
  NetworkStateChange(4),
  ControlChannelReset(5),
  InternetAvailable(6),
  SessionConnected(7),
  ServicingComplete(8),
  LockScreenApplicationAdded(9),
  LockScreenApplicationRemoved(10),
  TimeZoneChange(11),
  OnlineIdConnectedStateChange(12),
  BackgroundWorkCostChange(13),
  PowerStateChange(14),
  DefaultSignInAccountChange(15),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemTriggerType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> SmsReceived
      2 -> UserPresent
      3 -> UserAway
      4 -> NetworkStateChange
      5 -> ControlChannelReset
      6 -> InternetAvailable
      7 -> SessionConnected
      8 -> ServicingComplete
      9 -> LockScreenApplicationAdded
      10 -> LockScreenApplicationRemoved
      11 -> TimeZoneChange
      12 -> OnlineIdConnectedStateChange
      13 -> BackgroundWorkCostChange
      14 -> PowerStateChange
      15 -> DefaultSignInAccountChange
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SystemTriggerType> {
    public fun setValue(newValue: SystemTriggerType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemTriggerType =
        SystemTriggerType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemTriggerType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemTriggerType =
        SystemTriggerType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemTriggerType): Int = obj.value
  }
}
