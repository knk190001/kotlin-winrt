package Windows.Networking.NetworkOperators

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

@ABIMarker(NetworkDeviceStatus.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.NetworkDeviceStatus;i4)")
@WinRTByReference(brClass = NetworkDeviceStatus.ByReference::class)
public enum class NetworkDeviceStatus(
  public val value: Int
) : NativeMapped {
  DeviceNotReady(0),
  DeviceReady(1),
  SimNotInserted(2),
  BadSim(3),
  DeviceHardwareFailure(4),
  AccountNotActivated(5),
  DeviceLocked(6),
  DeviceBlocked(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkDeviceStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DeviceNotReady
      1 -> DeviceReady
      2 -> SimNotInserted
      3 -> BadSim
      4 -> DeviceHardwareFailure
      5 -> AccountNotActivated
      6 -> DeviceLocked
      7 -> DeviceBlocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NetworkDeviceStatus> {
    public fun setValue(newValue: NetworkDeviceStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkDeviceStatus =
        NetworkDeviceStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkDeviceStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkDeviceStatus =
        NetworkDeviceStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkDeviceStatus): Int = obj.value
  }
}
