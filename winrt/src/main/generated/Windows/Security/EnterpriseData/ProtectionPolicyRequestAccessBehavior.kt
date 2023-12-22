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

@ABIMarker(ProtectionPolicyRequestAccessBehavior.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.ProtectionPolicyRequestAccessBehavior;i4)")
@WinRTByReference(brClass = ProtectionPolicyRequestAccessBehavior.ByReference::class)
public enum class ProtectionPolicyRequestAccessBehavior(
  public val value: Int
) : NativeMapped {
  Decrypt(0),
  TreatOverridePolicyAsBlock(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProtectionPolicyRequestAccessBehavior {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Decrypt
      1 -> TreatOverridePolicyAsBlock
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ProtectionPolicyRequestAccessBehavior> {
    public fun setValue(newValue: ProtectionPolicyRequestAccessBehavior): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProtectionPolicyRequestAccessBehavior =
        ProtectionPolicyRequestAccessBehavior.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProtectionPolicyRequestAccessBehavior, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProtectionPolicyRequestAccessBehavior =
        ProtectionPolicyRequestAccessBehavior.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProtectionPolicyRequestAccessBehavior): Int = obj.value
  }
}
