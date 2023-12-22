package Windows.Security.ExchangeActiveSyncProvisioning

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

@ABIMarker(EasPasswordExpirationResult.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasPasswordExpirationResult;i4)")
@WinRTByReference(brClass = EasPasswordExpirationResult.ByReference::class)
public enum class EasPasswordExpirationResult(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  Compliant(1),
  CanBeCompliant(2),
  RequestedPolicyIsStricter(3),
  RequestedExpirationIncompatible(4),
  InvalidParameter(5),
  UserCannotChangePassword(6),
  AdminsCannotChangePassword(7),
  LocalControlledUsersCannotChangePassword(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasPasswordExpirationResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> Compliant
      2 -> CanBeCompliant
      3 -> RequestedPolicyIsStricter
      4 -> RequestedExpirationIncompatible
      5 -> InvalidParameter
      6 -> UserCannotChangePassword
      7 -> AdminsCannotChangePassword
      8 -> LocalControlledUsersCannotChangePassword
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EasPasswordExpirationResult> {
    public fun setValue(newValue: EasPasswordExpirationResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasPasswordExpirationResult =
        EasPasswordExpirationResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasPasswordExpirationResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasPasswordExpirationResult =
        EasPasswordExpirationResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasPasswordExpirationResult): Int = obj.value
  }
}
