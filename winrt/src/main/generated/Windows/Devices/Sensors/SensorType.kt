package Windows.Devices.Sensors

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

@ABIMarker(SensorType.ABI::class)
@Signature("enum(Windows.Devices.Sensors.SensorType;i4)")
@WinRTByReference(brClass = SensorType.ByReference::class)
public enum class SensorType(
  public val value: Int
) : NativeMapped {
  Accelerometer(0),
  ActivitySensor(1),
  Barometer(2),
  Compass(3),
  CustomSensor(4),
  Gyroscope(5),
  ProximitySensor(6),
  Inclinometer(7),
  LightSensor(8),
  OrientationSensor(9),
  Pedometer(10),
  RelativeInclinometer(11),
  RelativeOrientationSensor(12),
  SimpleOrientationSensor(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SensorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Accelerometer
      1 -> ActivitySensor
      2 -> Barometer
      3 -> Compass
      4 -> CustomSensor
      5 -> Gyroscope
      6 -> ProximitySensor
      7 -> Inclinometer
      8 -> LightSensor
      9 -> OrientationSensor
      10 -> Pedometer
      11 -> RelativeInclinometer
      12 -> RelativeOrientationSensor
      13 -> SimpleOrientationSensor
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SensorType> {
    public fun setValue(newValue: SensorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SensorType =
        SensorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SensorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SensorType =
        SensorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SensorType): Int = obj.value
  }
}
