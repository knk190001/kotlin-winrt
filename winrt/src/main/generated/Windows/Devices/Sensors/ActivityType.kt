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

@ABIMarker(ActivityType.ABI::class)
@Signature("enum(Windows.Devices.Sensors.ActivityType;i4)")
@WinRTByReference(brClass = ActivityType.ByReference::class)
public enum class ActivityType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Idle(1),
  Stationary(2),
  Fidgeting(3),
  Walking(4),
  Running(5),
  InVehicle(6),
  Biking(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivityType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Idle
      2 -> Stationary
      3 -> Fidgeting
      4 -> Walking
      5 -> Running
      6 -> InVehicle
      7 -> Biking
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ActivityType> {
    public fun setValue(newValue: ActivityType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivityType =
        ActivityType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ActivityType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ActivityType =
        ActivityType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivityType): Int = obj.value
  }
}
