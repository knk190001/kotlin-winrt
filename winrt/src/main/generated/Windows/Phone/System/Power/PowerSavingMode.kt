package Windows.Phone.System.Power

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

@ABIMarker(PowerSavingMode.ABI::class)
@Signature("enum(Windows.Phone.System.Power.PowerSavingMode;i4)")
@WinRTByReference(brClass = PowerSavingMode.ByReference::class)
public enum class PowerSavingMode(
  public val value: Int
) : NativeMapped {
  Off(0),
  On(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PowerSavingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> On
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PowerSavingMode> {
    public fun setValue(newValue: PowerSavingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PowerSavingMode =
        PowerSavingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PowerSavingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PowerSavingMode =
        PowerSavingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PowerSavingMode): Int = obj.value
  }
}
