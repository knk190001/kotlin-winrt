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

@ABIMarker(SecondaryAuthenticationFactorRegistrationStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorRegistrationStatus;i4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorRegistrationStatus.ByReference::class)
public enum class SecondaryAuthenticationFactorRegistrationStatus(
  public val value: Int
) : NativeMapped {
  Failed(0),
  Started(1),
  CanceledByUser(2),
  PinSetupRequired(3),
  DisabledByPolicy(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorRegistrationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Failed
      1 -> Started
      2 -> CanceledByUser
      3 -> PinSetupRequired
      4 -> DisabledByPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorRegistrationStatus> {
    public fun setValue(newValue: SecondaryAuthenticationFactorRegistrationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorRegistrationStatus =
        SecondaryAuthenticationFactorRegistrationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorRegistrationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorRegistrationStatus =
        SecondaryAuthenticationFactorRegistrationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorRegistrationStatus): Int =
        obj.value
  }
}
