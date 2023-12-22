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

@ABIMarker(EasMaxPasswordFailedAttemptsResult.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasMaxPasswordFailedAttemptsResult;i4)")
@WinRTByReference(brClass = EasMaxPasswordFailedAttemptsResult.ByReference::class)
public enum class EasMaxPasswordFailedAttemptsResult(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  Compliant(1),
  CanBeCompliant(2),
  RequestedPolicyIsStricter(3),
  InvalidParameter(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasMaxPasswordFailedAttemptsResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> Compliant
      2 -> CanBeCompliant
      3 -> RequestedPolicyIsStricter
      4 -> InvalidParameter
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EasMaxPasswordFailedAttemptsResult> {
    public fun setValue(newValue: EasMaxPasswordFailedAttemptsResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasMaxPasswordFailedAttemptsResult =
        EasMaxPasswordFailedAttemptsResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasMaxPasswordFailedAttemptsResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasMaxPasswordFailedAttemptsResult =
        EasMaxPasswordFailedAttemptsResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasMaxPasswordFailedAttemptsResult): Int = obj.value
  }
}
