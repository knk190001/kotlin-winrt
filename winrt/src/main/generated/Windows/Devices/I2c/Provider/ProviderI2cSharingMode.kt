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

@ABIMarker(ProviderI2cSharingMode.ABI::class)
@Signature("enum(Windows.Devices.I2c.Provider.ProviderI2cSharingMode;i4)")
@WinRTByReference(brClass = ProviderI2cSharingMode.ByReference::class)
public enum class ProviderI2cSharingMode(
  public val value: Int
) : NativeMapped {
  Exclusive(0),
  Shared(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProviderI2cSharingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Exclusive
      1 -> Shared
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProviderI2cSharingMode> {
    public fun setValue(newValue: ProviderI2cSharingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProviderI2cSharingMode =
        ProviderI2cSharingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProviderI2cSharingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProviderI2cSharingMode =
        ProviderI2cSharingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProviderI2cSharingMode): Int = obj.value
  }
}
