package Windows.System.Power

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

@ABIMarker(BatteryStatus.ABI::class)
@Signature("enum(Windows.System.Power.BatteryStatus;i4)")
@WinRTByReference(brClass = BatteryStatus.ByReference::class)
public enum class BatteryStatus(
  public val value: Int
) : NativeMapped {
  NotPresent(0),
  Discharging(1),
  Idle(2),
  Charging(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BatteryStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotPresent
      1 -> Discharging
      2 -> Idle
      3 -> Charging
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BatteryStatus> {
    public fun setValue(newValue: BatteryStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BatteryStatus =
        BatteryStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BatteryStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BatteryStatus =
        BatteryStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BatteryStatus): Int = obj.value
  }
}
