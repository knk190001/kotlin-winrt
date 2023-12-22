package Windows.Security.EnterpriseData

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

@ABIMarker(ProtectionPolicyEvaluationResult.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult;i4)")
@WinRTByReference(brClass = ProtectionPolicyEvaluationResult.ByReference::class)
public enum class ProtectionPolicyEvaluationResult(
  public val value: Int
) : NativeMapped {
  Allowed(0),
  Blocked(1),
  ConsentRequired(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProtectionPolicyEvaluationResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allowed
      1 -> Blocked
      2 -> ConsentRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ProtectionPolicyEvaluationResult> {
    public fun setValue(newValue: ProtectionPolicyEvaluationResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProtectionPolicyEvaluationResult =
        ProtectionPolicyEvaluationResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProtectionPolicyEvaluationResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProtectionPolicyEvaluationResult =
        ProtectionPolicyEvaluationResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProtectionPolicyEvaluationResult): Int = obj.value
  }
}
