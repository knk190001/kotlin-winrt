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

@ABIMarker(PrintWorkflowPrinterJobStatus.ABI::class)
@Signature("enum(Windows.Graphics.Printing.Workflow.PrintWorkflowPrinterJobStatus;i4)")
@WinRTByReference(brClass = PrintWorkflowPrinterJobStatus.ByReference::class)
public enum class PrintWorkflowPrinterJobStatus(
  public val value: Int
) : NativeMapped {
  Error(0),
  Aborted(1),
  InProgress(2),
  Completed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintWorkflowPrinterJobStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Error
      1 -> Aborted
      2 -> InProgress
      3 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintWorkflowPrinterJobStatus> {
    public fun setValue(newValue: PrintWorkflowPrinterJobStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintWorkflowPrinterJobStatus =
        PrintWorkflowPrinterJobStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintWorkflowPrinterJobStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintWorkflowPrinterJobStatus =
        PrintWorkflowPrinterJobStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintWorkflowPrinterJobStatus): Int = obj.value
  }
}
