package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(WiFiDirectServiceConfigurationMethod.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceConfigurationMethod;i4)")
@WinRTByReference(brClass = WiFiDirectServiceConfigurationMethod.ByReference::class)
public enum class WiFiDirectServiceConfigurationMethod(
  public val value: Int
) : NativeMapped {
  Default(0),
  PinDisplay(1),
  PinEntry(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectServiceConfigurationMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> PinDisplay
      2 -> PinEntry
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectServiceConfigurationMethod> {
    public fun setValue(newValue: WiFiDirectServiceConfigurationMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectServiceConfigurationMethod =
        WiFiDirectServiceConfigurationMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectServiceConfigurationMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectServiceConfigurationMethod =
        WiFiDirectServiceConfigurationMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectServiceConfigurationMethod): Int = obj.value
  }
}
