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

@ABIMarker(ProtectionPolicyAuditAction.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.ProtectionPolicyAuditAction;i4)")
@WinRTByReference(brClass = ProtectionPolicyAuditAction.ByReference::class)
public enum class ProtectionPolicyAuditAction(
  public val value: Int
) : NativeMapped {
  Decrypt(0),
  CopyToLocation(1),
  SendToRecipient(2),
  Other(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProtectionPolicyAuditAction {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Decrypt
      1 -> CopyToLocation
      2 -> SendToRecipient
      3 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ProtectionPolicyAuditAction> {
    public fun setValue(newValue: ProtectionPolicyAuditAction): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProtectionPolicyAuditAction =
        ProtectionPolicyAuditAction.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProtectionPolicyAuditAction, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProtectionPolicyAuditAction =
        ProtectionPolicyAuditAction.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProtectionPolicyAuditAction): Int = obj.value
  }
}
