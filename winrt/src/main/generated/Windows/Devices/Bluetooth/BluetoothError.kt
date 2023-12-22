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

@ABIMarker(BluetoothError.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothError;i4)")
@WinRTByReference(brClass = BluetoothError.ByReference::class)
public enum class BluetoothError(
  public val value: Int
) : NativeMapped {
  Success(0),
  RadioNotAvailable(1),
  ResourceInUse(2),
  DeviceNotConnected(3),
  OtherError(4),
  DisabledByPolicy(5),
  NotSupported(6),
  DisabledByUser(7),
  ConsentRequired(8),
  TransportNotSupported(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> RadioNotAvailable
      2 -> ResourceInUse
      3 -> DeviceNotConnected
      4 -> OtherError
      5 -> DisabledByPolicy
      6 -> NotSupported
      7 -> DisabledByUser
      8 -> ConsentRequired
      9 -> TransportNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BluetoothError> {
    public fun setValue(newValue: BluetoothError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothError =
        BluetoothError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothError =
        BluetoothError.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothError): Int = obj.value
  }
}
