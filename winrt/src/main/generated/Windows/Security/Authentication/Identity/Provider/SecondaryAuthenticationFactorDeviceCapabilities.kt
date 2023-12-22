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

@ABIMarker(SecondaryAuthenticationFactorDeviceCapabilities.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorDeviceCapabilities;u4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorDeviceCapabilities.ByReference::class)
public enum class SecondaryAuthenticationFactorDeviceCapabilities(
  public val value: Int
) : NativeMapped {
  None(0),
  SecureStorage(1),
  StoreKeys(2),
  ConfirmUserIntentToAuthenticate(4),
  SupportSecureUserPresenceCheck(8),
  TransmittedDataIsEncrypted(16),
  HMacSha256(32),
  CloseRangeDataTransmission(64),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorDeviceCapabilities {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SecureStorage
      2 -> StoreKeys
      4 -> ConfirmUserIntentToAuthenticate
      8 -> SupportSecureUserPresenceCheck
      16 -> TransmittedDataIsEncrypted
      32 -> HMacSha256
      64 -> CloseRangeDataTransmission
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorDeviceCapabilities> {
    public fun setValue(newValue: SecondaryAuthenticationFactorDeviceCapabilities): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorDeviceCapabilities =
        SecondaryAuthenticationFactorDeviceCapabilities.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorDeviceCapabilities, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorDeviceCapabilities =
        SecondaryAuthenticationFactorDeviceCapabilities.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorDeviceCapabilities): Int =
        obj.value
  }
}
