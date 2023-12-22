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

@ABIMarker(GpioOpenStatus.ABI::class)
@Signature("enum(Windows.Devices.Gpio.GpioOpenStatus;i4)")
@WinRTByReference(brClass = GpioOpenStatus.ByReference::class)
public enum class GpioOpenStatus(
  public val value: Int
) : NativeMapped {
  PinOpened(0),
  PinUnavailable(1),
  SharingViolation(2),
  MuxingConflict(3),
  UnknownError(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GpioOpenStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PinOpened
      1 -> PinUnavailable
      2 -> SharingViolation
      3 -> MuxingConflict
      4 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GpioOpenStatus> {
    public fun setValue(newValue: GpioOpenStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GpioOpenStatus =
        GpioOpenStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GpioOpenStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GpioOpenStatus =
        GpioOpenStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GpioOpenStatus): Int = obj.value
  }
}
