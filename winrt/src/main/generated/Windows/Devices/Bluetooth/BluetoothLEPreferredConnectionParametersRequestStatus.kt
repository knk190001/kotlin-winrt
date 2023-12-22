package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothLEPreferredConnectionParametersRequestStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothLEPreferredConnectionParametersRequestStatus;i4)")
@WinRTByReference(brClass =
    BluetoothLEPreferredConnectionParametersRequestStatus.ByReference::class)
public enum class BluetoothLEPreferredConnectionParametersRequestStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Success(1),
  DeviceNotAvailable(2),
  AccessDenied(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothLEPreferredConnectionParametersRequestStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Success
      2 -> DeviceNotAvailable
      3 -> AccessDenied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothLEPreferredConnectionParametersRequestStatus> {
    public fun setValue(newValue: BluetoothLEPreferredConnectionParametersRequestStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothLEPreferredConnectionParametersRequestStatus =
        BluetoothLEPreferredConnectionParametersRequestStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<BluetoothLEPreferredConnectionParametersRequestStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        BluetoothLEPreferredConnectionParametersRequestStatus =
        BluetoothLEPreferredConnectionParametersRequestStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothLEPreferredConnectionParametersRequestStatus): Int =
        obj.value
  }
}
