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

@ABIMarker(BluetoothLEAdvertisementType.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementType;i4)")
@WinRTByReference(brClass = BluetoothLEAdvertisementType.ByReference::class)
public enum class BluetoothLEAdvertisementType(
  public val value: Int
) : NativeMapped {
  ConnectableUndirected(0),
  ConnectableDirected(1),
  ScannableUndirected(2),
  NonConnectableUndirected(3),
  ScanResponse(4),
  Extended(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothLEAdvertisementType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ConnectableUndirected
      1 -> ConnectableDirected
      2 -> ScannableUndirected
      3 -> NonConnectableUndirected
      4 -> ScanResponse
      5 -> Extended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothLEAdvertisementType> {
    public fun setValue(newValue: BluetoothLEAdvertisementType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothLEAdvertisementType =
        BluetoothLEAdvertisementType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothLEAdvertisementType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothLEAdvertisementType =
        BluetoothLEAdvertisementType.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothLEAdvertisementType): Int = obj.value
  }
}
