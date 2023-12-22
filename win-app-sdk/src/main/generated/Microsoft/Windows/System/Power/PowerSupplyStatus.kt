package Microsoft.Windows.System.Power

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

@ABIMarker(PowerSupplyStatus.ABI::class)
@Signature("enum(Microsoft.Windows.System.Power.PowerSupplyStatus;i4)")
@WinRTByReference(brClass = PowerSupplyStatus.ByReference::class)
public enum class PowerSupplyStatus(
  public val value: Int
) : NativeMapped {
  NotPresent(0),
  Inadequate(1),
  Adequate(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PowerSupplyStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotPresent
      1 -> Inadequate
      2 -> Adequate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PowerSupplyStatus> {
    public fun setValue(newValue: PowerSupplyStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PowerSupplyStatus =
        PowerSupplyStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PowerSupplyStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PowerSupplyStatus =
        PowerSupplyStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PowerSupplyStatus): Int = obj.value
  }
}
