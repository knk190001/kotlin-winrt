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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationScenario.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationScenario;i4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationScenario.ByReference::class)
public enum class SecondaryAuthenticationFactorAuthenticationScenario(
  public val value: Int
) : NativeMapped {
  SignIn(0),
  CredentialPrompt(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorAuthenticationScenario {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SignIn
      1 -> CredentialPrompt
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorAuthenticationScenario> {
    public fun setValue(newValue: SecondaryAuthenticationFactorAuthenticationScenario): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorAuthenticationScenario =
        SecondaryAuthenticationFactorAuthenticationScenario.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationScenario, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorAuthenticationScenario
        = SecondaryAuthenticationFactorAuthenticationScenario.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationScenario): Int =
        obj.value
  }
}
