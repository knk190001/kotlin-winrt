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

@ABIMarker(EasDisallowConvenienceLogonResult.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasDisallowConvenienceLogonResult;i4)")
@WinRTByReference(brClass = EasDisallowConvenienceLogonResult.ByReference::class)
public enum class EasDisallowConvenienceLogonResult(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  Compliant(1),
  CanBeCompliant(2),
  RequestedPolicyIsStricter(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasDisallowConvenienceLogonResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> Compliant
      2 -> CanBeCompliant
      3 -> RequestedPolicyIsStricter
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EasDisallowConvenienceLogonResult> {
    public fun setValue(newValue: EasDisallowConvenienceLogonResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasDisallowConvenienceLogonResult =
        EasDisallowConvenienceLogonResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasDisallowConvenienceLogonResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasDisallowConvenienceLogonResult =
        EasDisallowConvenienceLogonResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasDisallowConvenienceLogonResult): Int = obj.value
  }
}
