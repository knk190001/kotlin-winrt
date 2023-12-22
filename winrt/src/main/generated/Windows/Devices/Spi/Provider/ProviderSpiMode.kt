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

@ABIMarker(ProviderSpiMode.ABI::class)
@Signature("enum(Windows.Devices.Spi.Provider.ProviderSpiMode;i4)")
@WinRTByReference(brClass = ProviderSpiMode.ByReference::class)
public enum class ProviderSpiMode(
  public val value: Int
) : NativeMapped {
  Mode0(0),
  Mode1(1),
  Mode2(2),
  Mode3(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProviderSpiMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Mode0
      1 -> Mode1
      2 -> Mode2
      3 -> Mode3
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProviderSpiMode> {
    public fun setValue(newValue: ProviderSpiMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProviderSpiMode =
        ProviderSpiMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProviderSpiMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProviderSpiMode =
        ProviderSpiMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProviderSpiMode): Int = obj.value
  }
}
