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

@ABIMarker(SecondaryAuthenticationFactorFinishAuthenticationStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorFinishAuthenticationStatus;i4)")
@WinRTByReference(brClass =
    SecondaryAuthenticationFactorFinishAuthenticationStatus.ByReference::class)
public enum class SecondaryAuthenticationFactorFinishAuthenticationStatus(
  public val value: Int
) : NativeMapped {
  Failed(0),
  Completed(1),
  NonceExpired(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorFinishAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Failed
      1 -> Completed
      2 -> NonceExpired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorFinishAuthenticationStatus> {
    public fun setValue(newValue: SecondaryAuthenticationFactorFinishAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorFinishAuthenticationStatus =
        SecondaryAuthenticationFactorFinishAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorFinishAuthenticationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        SecondaryAuthenticationFactorFinishAuthenticationStatus =
        SecondaryAuthenticationFactorFinishAuthenticationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorFinishAuthenticationStatus): Int
        = obj.value
  }
}
