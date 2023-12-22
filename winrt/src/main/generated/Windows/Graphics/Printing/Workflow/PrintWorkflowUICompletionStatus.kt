package Windows.Graphics.Printing.Workflow

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

@ABIMarker(PrintWorkflowUICompletionStatus.ABI::class)
@Signature("enum(Windows.Graphics.Printing.Workflow.PrintWorkflowUICompletionStatus;i4)")
@WinRTByReference(brClass = PrintWorkflowUICompletionStatus.ByReference::class)
public enum class PrintWorkflowUICompletionStatus(
  public val value: Int
) : NativeMapped {
  Completed(0),
  LaunchFailed(1),
  JobFailed(2),
  UserCanceled(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintWorkflowUICompletionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Completed
      1 -> LaunchFailed
      2 -> JobFailed
      3 -> UserCanceled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintWorkflowUICompletionStatus> {
    public fun setValue(newValue: PrintWorkflowUICompletionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintWorkflowUICompletionStatus =
        PrintWorkflowUICompletionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintWorkflowUICompletionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintWorkflowUICompletionStatus =
        PrintWorkflowUICompletionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintWorkflowUICompletionStatus): Int = obj.value
  }
}
