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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationStage.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationStage;i4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationStage.ByReference::class)
public enum class SecondaryAuthenticationFactorAuthenticationStage(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  WaitingForUserConfirmation(1),
  CollectingCredential(2),
  SuspendingAuthentication(3),
  CredentialCollected(4),
  CredentialAuthenticated(5),
  StoppingAuthentication(6),
  ReadyForLock(7),
  CheckingDevicePresence(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorAuthenticationStage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> WaitingForUserConfirmation
      2 -> CollectingCredential
      3 -> SuspendingAuthentication
      4 -> CredentialCollected
      5 -> CredentialAuthenticated
      6 -> StoppingAuthentication
      7 -> ReadyForLock
      8 -> CheckingDevicePresence
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorAuthenticationStage> {
    public fun setValue(newValue: SecondaryAuthenticationFactorAuthenticationStage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorAuthenticationStage =
        SecondaryAuthenticationFactorAuthenticationStage.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationStage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorAuthenticationStage =
        SecondaryAuthenticationFactorAuthenticationStage.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationStage): Int =
        obj.value
  }
}
