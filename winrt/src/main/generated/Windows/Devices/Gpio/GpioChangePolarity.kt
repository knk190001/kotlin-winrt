package Windows.Devices.Gpio

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

@ABIMarker(GpioChangePolarity.ABI::class)
@Signature("enum(Windows.Devices.Gpio.GpioChangePolarity;i4)")
@WinRTByReference(brClass = GpioChangePolarity.ByReference::class)
public enum class GpioChangePolarity(
  public val value: Int
) : NativeMapped {
  Falling(0),
  Rising(1),
  Both(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GpioChangePolarity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Falling
      1 -> Rising
      2 -> Both
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GpioChangePolarity> {
    public fun setValue(newValue: GpioChangePolarity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GpioChangePolarity =
        GpioChangePolarity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GpioChangePolarity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GpioChangePolarity =
        GpioChangePolarity.values()[0].fromNative(value, null)

    public override fun toNative(obj: GpioChangePolarity): Int = obj.value
  }
}
