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

@ABIMarker(BluetoothServiceCapabilities.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothServiceCapabilities;u4)")
@WinRTByReference(brClass = BluetoothServiceCapabilities.ByReference::class)
public enum class BluetoothServiceCapabilities(
  public val value: Int
) : NativeMapped {
  None(0),
  LimitedDiscoverableMode(1),
  PositioningService(8),
  NetworkingService(16),
  RenderingService(32),
  CapturingService(64),
  ObjectTransferService(128),
  AudioService(256),
  TelephoneService(512),
  InformationService(1024),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothServiceCapabilities {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> LimitedDiscoverableMode
      8 -> PositioningService
      16 -> NetworkingService
      32 -> RenderingService
      64 -> CapturingService
      128 -> ObjectTransferService
      256 -> AudioService
      512 -> TelephoneService
      1024 -> InformationService
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothServiceCapabilities> {
    public fun setValue(newValue: BluetoothServiceCapabilities): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothServiceCapabilities =
        BluetoothServiceCapabilities.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothServiceCapabilities, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothServiceCapabilities =
        BluetoothServiceCapabilities.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothServiceCapabilities): Int = obj.value
  }
}
