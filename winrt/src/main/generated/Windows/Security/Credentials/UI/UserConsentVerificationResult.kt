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

@ABIMarker(UserConsentVerificationResult.ABI::class)
@Signature("enum(Windows.Security.Credentials.UI.UserConsentVerificationResult;i4)")
@WinRTByReference(brClass = UserConsentVerificationResult.ByReference::class)
public enum class UserConsentVerificationResult(
  public val value: Int
) : NativeMapped {
  Verified(0),
  DeviceNotPresent(1),
  NotConfiguredForUser(2),
  DisabledByPolicy(3),
  DeviceBusy(4),
  RetriesExhausted(5),
  Canceled(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UserConsentVerificationResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Verified
      1 -> DeviceNotPresent
      2 -> NotConfiguredForUser
      3 -> DisabledByPolicy
      4 -> DeviceBusy
      5 -> RetriesExhausted
      6 -> Canceled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<UserConsentVerificationResult> {
    public fun setValue(newValue: UserConsentVerificationResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UserConsentVerificationResult =
        UserConsentVerificationResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UserConsentVerificationResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UserConsentVerificationResult =
        UserConsentVerificationResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: UserConsentVerificationResult): Int = obj.value
  }
}
