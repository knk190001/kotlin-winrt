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

@ABIMarker(WiFiDirectServiceError.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError;i4)")
@WinRTByReference(brClass = WiFiDirectServiceError.ByReference::class)
public enum class WiFiDirectServiceError(
  public val value: Int
) : NativeMapped {
  Success(0),
  RadioNotAvailable(1),
  ResourceInUse(2),
  UnsupportedHardware(3),
  NoHardware(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectServiceError {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> RadioNotAvailable
      2 -> ResourceInUse
      3 -> UnsupportedHardware
      4 -> NoHardware
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiDirectServiceError> {
    public fun setValue(newValue: WiFiDirectServiceError): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectServiceError =
        WiFiDirectServiceError.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectServiceError, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectServiceError =
        WiFiDirectServiceError.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectServiceError): Int = obj.value
  }
}
