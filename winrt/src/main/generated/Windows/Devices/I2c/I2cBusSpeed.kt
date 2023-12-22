package Windows.Devices.I2c

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

@ABIMarker(I2cBusSpeed.ABI::class)
@Signature("enum(Windows.Devices.I2c.I2cBusSpeed;i4)")
@WinRTByReference(brClass = I2cBusSpeed.ByReference::class)
public enum class I2cBusSpeed(
  public val value: Int
) : NativeMapped {
  StandardMode(0),
  FastMode(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      I2cBusSpeed {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> StandardMode
      1 -> FastMode
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<I2cBusSpeed> {
    public fun setValue(newValue: I2cBusSpeed): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): I2cBusSpeed =
        I2cBusSpeed.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<I2cBusSpeed, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): I2cBusSpeed =
        I2cBusSpeed.values()[0].fromNative(value, null)

    public override fun toNative(obj: I2cBusSpeed): Int = obj.value
  }
}
