package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(WorkflowPrintTicketValidationStatus.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintSupport.WorkflowPrintTicketValidationStatus;i4)")
@WinRTByReference(brClass = WorkflowPrintTicketValidationStatus.ByReference::class)
public enum class WorkflowPrintTicketValidationStatus(
  public val value: Int
) : NativeMapped {
  Resolved(0),
  Conflicting(1),
  Invalid(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WorkflowPrintTicketValidationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Resolved
      1 -> Conflicting
      2 -> Invalid
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WorkflowPrintTicketValidationStatus> {
    public fun setValue(newValue: WorkflowPrintTicketValidationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WorkflowPrintTicketValidationStatus =
        WorkflowPrintTicketValidationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WorkflowPrintTicketValidationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WorkflowPrintTicketValidationStatus =
        WorkflowPrintTicketValidationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WorkflowPrintTicketValidationStatus): Int = obj.value
  }
}
