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

@ABIMarker(TetheringOperationStatus.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.TetheringOperationStatus;i4)")
@WinRTByReference(brClass = TetheringOperationStatus.ByReference::class)
public enum class TetheringOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  Unknown(1),
  MobileBroadbandDeviceOff(2),
  WiFiDeviceOff(3),
  EntitlementCheckTimeout(4),
  EntitlementCheckFailure(5),
  OperationInProgress(6),
  BluetoothDeviceOff(7),
  NetworkLimitedConnectivity(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TetheringOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Unknown
      2 -> MobileBroadbandDeviceOff
      3 -> WiFiDeviceOff
      4 -> EntitlementCheckTimeout
      5 -> EntitlementCheckFailure
      6 -> OperationInProgress
      7 -> BluetoothDeviceOff
      8 -> NetworkLimitedConnectivity
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TetheringOperationStatus>
      {
    public fun setValue(newValue: TetheringOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TetheringOperationStatus =
        TetheringOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TetheringOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TetheringOperationStatus =
        TetheringOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: TetheringOperationStatus): Int = obj.value
  }
}
