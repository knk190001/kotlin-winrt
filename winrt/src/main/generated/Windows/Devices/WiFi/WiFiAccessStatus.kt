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

@ABIMarker(WiFiAccessStatus.ABI::class)
@Signature("enum(Windows.Devices.WiFi.WiFiAccessStatus;i4)")
@WinRTByReference(brClass = WiFiAccessStatus.ByReference::class)
public enum class WiFiAccessStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Allowed(1),
  DeniedByUser(2),
  DeniedBySystem(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Allowed
      2 -> DeniedByUser
      3 -> DeniedBySystem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WiFiAccessStatus> {
    public fun setValue(newValue: WiFiAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiAccessStatus =
        WiFiAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiAccessStatus =
        WiFiAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiAccessStatus): Int = obj.value
  }
}
