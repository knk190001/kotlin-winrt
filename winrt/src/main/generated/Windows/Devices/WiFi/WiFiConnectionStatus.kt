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

@ABIMarker(WiFiConnectionStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFi.WiFiConnectionStatus;i4)")
@WinRTByReference(brClass = WiFiConnectionStatus.ByReference::class)
public enum class WiFiConnectionStatus(
  public val value: Int
) : NativeMapped {
  UnspecifiedFailure(0),
  Success(1),
  AccessRevoked(2),
  InvalidCredential(3),
  NetworkNotAvailable(4),
  Timeout(5),
  UnsupportedAuthenticationProtocol(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiConnectionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UnspecifiedFailure
      1 -> Success
      2 -> AccessRevoked
      3 -> InvalidCredential
      4 -> NetworkNotAvailable
      5 -> Timeout
      6 -> UnsupportedAuthenticationProtocol
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiConnectionStatus> {
    public fun setValue(newValue: WiFiConnectionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiConnectionStatus =
        WiFiConnectionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiConnectionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiConnectionStatus =
        WiFiConnectionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiConnectionStatus): Int = obj.value
  }
}
