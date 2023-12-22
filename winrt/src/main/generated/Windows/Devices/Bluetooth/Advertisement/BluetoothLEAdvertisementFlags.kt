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

@ABIMarker(BluetoothLEAdvertisementFlags.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFlags;u4)")
@WinRTByReference(brClass = BluetoothLEAdvertisementFlags.ByReference::class)
public enum class BluetoothLEAdvertisementFlags(
  public val value: Int
) : NativeMapped {
  None(0),
  LimitedDiscoverableMode(1),
  GeneralDiscoverableMode(2),
  ClassicNotSupported(4),
  DualModeControllerCapable(8),
  DualModeHostCapable(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothLEAdvertisementFlags {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LimitedDiscoverableMode
      2 -> GeneralDiscoverableMode
      4 -> ClassicNotSupported
      8 -> DualModeControllerCapable
      16 -> DualModeHostCapable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothLEAdvertisementFlags> {
    public fun setValue(newValue: BluetoothLEAdvertisementFlags): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothLEAdvertisementFlags =
        BluetoothLEAdvertisementFlags.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothLEAdvertisementFlags, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothLEAdvertisementFlags =
        BluetoothLEAdvertisementFlags.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothLEAdvertisementFlags): Int = obj.value
  }
}
