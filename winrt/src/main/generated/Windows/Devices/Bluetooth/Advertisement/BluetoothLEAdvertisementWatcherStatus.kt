package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(BluetoothLEAdvertisementWatcherStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcherStatus;i4)")
@WinRTByReference(brClass = BluetoothLEAdvertisementWatcherStatus.ByReference::class)
public enum class BluetoothLEAdvertisementWatcherStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Started(1),
  Stopping(2),
  Stopped(3),
  Aborted(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothLEAdvertisementWatcherStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Started
      2 -> Stopping
      3 -> Stopped
      4 -> Aborted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothLEAdvertisementWatcherStatus> {
    public fun setValue(newValue: BluetoothLEAdvertisementWatcherStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothLEAdvertisementWatcherStatus =
        BluetoothLEAdvertisementWatcherStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothLEAdvertisementWatcherStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothLEAdvertisementWatcherStatus =
        BluetoothLEAdvertisementWatcherStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothLEAdvertisementWatcherStatus): Int = obj.value
  }
}
