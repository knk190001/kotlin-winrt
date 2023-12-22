package Windows.Devices.I2c.Provider

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

@ABIMarker(ProviderI2cTransferStatus.ABI::class)
@Signature("enum(Windows.Devices.I2c.Provider.ProviderI2cTransferStatus;i4)")
@WinRTByReference(brClass = ProviderI2cTransferStatus.ByReference::class)
public enum class ProviderI2cTransferStatus(
  public val value: Int
) : NativeMapped {
  FullTransfer(0),
  PartialTransfer(1),
  SlaveAddressNotAcknowledged(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProviderI2cTransferStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FullTransfer
      1 -> PartialTransfer
      2 -> SlaveAddressNotAcknowledged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProviderI2cTransferStatus>
      {
    public fun setValue(newValue: ProviderI2cTransferStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProviderI2cTransferStatus =
        ProviderI2cTransferStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProviderI2cTransferStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProviderI2cTransferStatus =
        ProviderI2cTransferStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProviderI2cTransferStatus): Int = obj.value
  }
}
