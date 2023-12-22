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

@ABIMarker(EasMinPasswordComplexCharactersResult.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasMinPasswordComplexCharactersResult;i4)")
@WinRTByReference(brClass = EasMinPasswordComplexCharactersResult.ByReference::class)
public enum class EasMinPasswordComplexCharactersResult(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  Compliant(1),
  CanBeCompliant(2),
  RequestedPolicyIsStricter(3),
  RequestedPolicyNotEnforceable(4),
  InvalidParameter(5),
  CurrentUserHasBlankPassword(6),
  AdminsHaveBlankPassword(7),
  UserCannotChangePassword(8),
  AdminsCannotChangePassword(9),
  LocalControlledUsersCannotChangePassword(10),
  ConnectedAdminsProviderPolicyIsWeak(11),
  ConnectedUserProviderPolicyIsWeak(12),
  ChangeConnectedAdminsPassword(13),
  ChangeConnectedUserPassword(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasMinPasswordComplexCharactersResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> Compliant
      2 -> CanBeCompliant
      3 -> RequestedPolicyIsStricter
      4 -> RequestedPolicyNotEnforceable
      5 -> InvalidParameter
      6 -> CurrentUserHasBlankPassword
      7 -> AdminsHaveBlankPassword
      8 -> UserCannotChangePassword
      9 -> AdminsCannotChangePassword
      10 -> LocalControlledUsersCannotChangePassword
      11 -> ConnectedAdminsProviderPolicyIsWeak
      12 -> ConnectedUserProviderPolicyIsWeak
      13 -> ChangeConnectedAdminsPassword
      14 -> ChangeConnectedUserPassword
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EasMinPasswordComplexCharactersResult> {
    public fun setValue(newValue: EasMinPasswordComplexCharactersResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasMinPasswordComplexCharactersResult =
        EasMinPasswordComplexCharactersResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasMinPasswordComplexCharactersResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasMinPasswordComplexCharactersResult =
        EasMinPasswordComplexCharactersResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasMinPasswordComplexCharactersResult): Int = obj.value
  }
}
