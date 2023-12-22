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

@ABIMarker(I2cTransferStatus.ABI::class)
@Signature("enum(Windows.Devices.I2c.I2cTransferStatus;i4)")
@WinRTByReference(brClass = I2cTransferStatus.ByReference::class)
public enum class I2cTransferStatus(
  public val value: Int
) : NativeMapped {
  FullTransfer(0),
  PartialTransfer(1),
  SlaveAddressNotAcknowledged(2),
  ClockStretchTimeout(3),
  UnknownError(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      I2cTransferStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FullTransfer
      1 -> PartialTransfer
      2 -> SlaveAddressNotAcknowledged
      3 -> ClockStretchTimeout
      4 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<I2cTransferStatus> {
    public fun setValue(newValue: I2cTransferStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): I2cTransferStatus =
        I2cTransferStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<I2cTransferStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): I2cTransferStatus =
        I2cTransferStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: I2cTransferStatus): Int = obj.value
  }
}
