package Windows.Devices.Spi.Provider

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

@ABIMarker(ProviderSpiSharingMode.ABI::class)
@Signature("enum(Windows.Devices.Spi.Provider.ProviderSpiSharingMode;i4)")
@WinRTByReference(brClass = ProviderSpiSharingMode.ByReference::class)
public enum class ProviderSpiSharingMode(
  public val value: Int
) : NativeMapped {
  Exclusive(0),
  Shared(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProviderSpiSharingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Exclusive
      1 -> Shared
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProviderSpiSharingMode> {
    public fun setValue(newValue: ProviderSpiSharingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProviderSpiSharingMode =
        ProviderSpiSharingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProviderSpiSharingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProviderSpiSharingMode =
        ProviderSpiSharingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProviderSpiSharingMode): Int = obj.value
  }
}
