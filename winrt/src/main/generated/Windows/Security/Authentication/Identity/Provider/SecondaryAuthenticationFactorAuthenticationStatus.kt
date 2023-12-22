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

@ABIMarker(SecondaryAuthenticationFactorAuthenticationStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationStatus;i4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationStatus.ByReference::class)
public enum class SecondaryAuthenticationFactorAuthenticationStatus(
  public val value: Int
) : NativeMapped {
  Failed(0),
  Started(1),
  UnknownDevice(2),
  DisabledByPolicy(3),
  InvalidAuthenticationStage(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Failed
      1 -> Started
      2 -> UnknownDevice
      3 -> DisabledByPolicy
      4 -> InvalidAuthenticationStage
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorAuthenticationStatus> {
    public fun setValue(newValue: SecondaryAuthenticationFactorAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorAuthenticationStatus =
        SecondaryAuthenticationFactorAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorAuthenticationStatus =
        SecondaryAuthenticationFactorAuthenticationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationStatus): Int =
        obj.value
  }
}
