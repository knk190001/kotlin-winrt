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

@ABIMarker(BluetoothLEAdvertisementPublisherStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisherStatus;i4)")
@WinRTByReference(brClass = BluetoothLEAdvertisementPublisherStatus.ByReference::class)
public enum class BluetoothLEAdvertisementPublisherStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Waiting(1),
  Started(2),
  Stopping(3),
  Stopped(4),
  Aborted(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothLEAdvertisementPublisherStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Waiting
      2 -> Started
      3 -> Stopping
      4 -> Stopped
      5 -> Aborted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothLEAdvertisementPublisherStatus> {
    public fun setValue(newValue: BluetoothLEAdvertisementPublisherStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothLEAdvertisementPublisherStatus =
        BluetoothLEAdvertisementPublisherStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothLEAdvertisementPublisherStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothLEAdvertisementPublisherStatus =
        BluetoothLEAdvertisementPublisherStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothLEAdvertisementPublisherStatus): Int = obj.value
  }
}
