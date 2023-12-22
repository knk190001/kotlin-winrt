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

@ABIMarker(BluetoothMajorClass.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothMajorClass;i4)")
@WinRTByReference(brClass = BluetoothMajorClass.ByReference::class)
public enum class BluetoothMajorClass(
  public val value: Int
) : NativeMapped {
  Miscellaneous(0),
  Computer(1),
  Phone(2),
  NetworkAccessPoint(3),
  AudioVideo(4),
  Peripheral(5),
  Imaging(6),
  Wearable(7),
  Toy(8),
  Health(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothMajorClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Miscellaneous
      1 -> Computer
      2 -> Phone
      3 -> NetworkAccessPoint
      4 -> AudioVideo
      5 -> Peripheral
      6 -> Imaging
      7 -> Wearable
      8 -> Toy
      9 -> Health
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BluetoothMajorClass> {
    public fun setValue(newValue: BluetoothMajorClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothMajorClass =
        BluetoothMajorClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothMajorClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothMajorClass =
        BluetoothMajorClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothMajorClass): Int = obj.value
  }
}
