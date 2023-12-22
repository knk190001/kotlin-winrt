package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorSessionApprovalStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorSessionApprovalStatus;i4)")
@WinRTByReference(brClass = MicrosoftAccountMultiFactorSessionApprovalStatus.ByReference::class)
public enum class MicrosoftAccountMultiFactorSessionApprovalStatus(
  public val value: Int
) : NativeMapped {
  Pending(0),
  Approved(1),
  Denied(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MicrosoftAccountMultiFactorSessionApprovalStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pending
      1 -> Approved
      2 -> Denied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MicrosoftAccountMultiFactorSessionApprovalStatus> {
    public fun setValue(newValue: MicrosoftAccountMultiFactorSessionApprovalStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MicrosoftAccountMultiFactorSessionApprovalStatus =
        MicrosoftAccountMultiFactorSessionApprovalStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorSessionApprovalStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MicrosoftAccountMultiFactorSessionApprovalStatus =
        MicrosoftAccountMultiFactorSessionApprovalStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MicrosoftAccountMultiFactorSessionApprovalStatus): Int =
        obj.value
  }
}
