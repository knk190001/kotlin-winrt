package Windows.Security.Credentials.UI

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

@ABIMarker(UserConsentVerifierAvailability.ABI::class)
@Signature("enum(Windows.Security.Credentials.UI.UserConsentVerifierAvailability;i4)")
@WinRTByReference(brClass = UserConsentVerifierAvailability.ByReference::class)
public enum class UserConsentVerifierAvailability(
  public val value: Int
) : NativeMapped {
  Available(0),
  DeviceNotPresent(1),
  NotConfiguredForUser(2),
  DisabledByPolicy(3),
  DeviceBusy(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserConsentVerifierAvailability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Available
      1 -> DeviceNotPresent
      2 -> NotConfiguredForUser
      3 -> DisabledByPolicy
      4 -> DeviceBusy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserConsentVerifierAvailability> {
    public fun setValue(newValue: UserConsentVerifierAvailability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserConsentVerifierAvailability =
        UserConsentVerifierAvailability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserConsentVerifierAvailability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserConsentVerifierAvailability =
        UserConsentVerifierAvailability.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserConsentVerifierAvailability): Int = obj.value
  }
}
