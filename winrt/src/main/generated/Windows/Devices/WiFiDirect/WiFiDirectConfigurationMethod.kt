package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectConfigurationMethod.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod;i4)")
@WinRTByReference(brClass = WiFiDirectConfigurationMethod.ByReference::class)
public enum class WiFiDirectConfigurationMethod(
  public val value: Int
) : NativeMapped {
  ProvidePin(0),
  DisplayPin(1),
  PushButton(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectConfigurationMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ProvidePin
      1 -> DisplayPin
      2 -> PushButton
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectConfigurationMethod> {
    public fun setValue(newValue: WiFiDirectConfigurationMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectConfigurationMethod =
        WiFiDirectConfigurationMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectConfigurationMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectConfigurationMethod =
        WiFiDirectConfigurationMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectConfigurationMethod): Int = obj.value
  }
}
