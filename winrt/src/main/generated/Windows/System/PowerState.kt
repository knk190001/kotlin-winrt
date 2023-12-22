package Windows.System

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

@ABIMarker(PowerState.ABI::class)
@Signature("enum(Windows.System.PowerState;i4)")
@WinRTByReference(brClass = PowerState.ByReference::class)
public enum class PowerState(
  public val value: Int
) : NativeMapped {
  ConnectedStandby(0),
  SleepS3(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PowerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ConnectedStandby
      1 -> SleepS3
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PowerState> {
    public fun setValue(newValue: PowerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PowerState =
        PowerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PowerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PowerState =
        PowerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PowerState): Int = obj.value
  }
}
