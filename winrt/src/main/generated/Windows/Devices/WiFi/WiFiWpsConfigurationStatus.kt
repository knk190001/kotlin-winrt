package Windows.Devices.WiFi

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

@ABIMarker(WiFiWpsConfigurationStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFi.WiFiWpsConfigurationStatus;i4)")
@WinRTByReference(brClass = WiFiWpsConfigurationStatus.ByReference::class)
public enum class WiFiWpsConfigurationStatus(
  public val value: Int
) : NativeMapped {
  UnspecifiedFailure(0),
  Success(1),
  Timeout(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiWpsConfigurationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UnspecifiedFailure
      1 -> Success
      2 -> Timeout
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiWpsConfigurationStatus> {
    public fun setValue(newValue: WiFiWpsConfigurationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiWpsConfigurationStatus =
        WiFiWpsConfigurationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiWpsConfigurationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiWpsConfigurationStatus =
        WiFiWpsConfigurationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiWpsConfigurationStatus): Int = obj.value
  }
}
