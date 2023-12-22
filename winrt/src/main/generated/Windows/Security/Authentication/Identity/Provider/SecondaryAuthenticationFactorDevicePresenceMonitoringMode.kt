package Windows.Security.Authentication.Identity.Provider

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

@ABIMarker(SecondaryAuthenticationFactorDevicePresenceMonitoringMode.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorDevicePresenceMonitoringMode;i4)")
@WinRTByReference(brClass =
    SecondaryAuthenticationFactorDevicePresenceMonitoringMode.ByReference::class)
public enum class SecondaryAuthenticationFactorDevicePresenceMonitoringMode(
  public val value: Int
) : NativeMapped {
  Unsupported(0),
  AppManaged(1),
  SystemManaged(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorDevicePresenceMonitoringMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unsupported
      1 -> AppManaged
      2 -> SystemManaged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorDevicePresenceMonitoringMode> {
    public fun setValue(newValue: SecondaryAuthenticationFactorDevicePresenceMonitoringMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorDevicePresenceMonitoringMode =
        SecondaryAuthenticationFactorDevicePresenceMonitoringMode.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorDevicePresenceMonitoringMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        SecondaryAuthenticationFactorDevicePresenceMonitoringMode =
        SecondaryAuthenticationFactorDevicePresenceMonitoringMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorDevicePresenceMonitoringMode):
        Int = obj.value
  }
}
