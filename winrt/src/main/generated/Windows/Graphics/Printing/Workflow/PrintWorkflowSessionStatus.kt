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

@ABIMarker(PrintWorkflowSessionStatus.ABI::class)
@Signature("enum(Windows.Graphics.Printing.Workflow.PrintWorkflowSessionStatus;i4)")
@WinRTByReference(brClass = PrintWorkflowSessionStatus.ByReference::class)
public enum class PrintWorkflowSessionStatus(
  public val value: Int
) : NativeMapped {
  Started(0),
  Completed(1),
  Aborted(2),
  Closed(3),
  PdlDataAvailableForModification(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintWorkflowSessionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Started
      1 -> Completed
      2 -> Aborted
      3 -> Closed
      4 -> PdlDataAvailableForModification
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintWorkflowSessionStatus> {
    public fun setValue(newValue: PrintWorkflowSessionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintWorkflowSessionStatus =
        PrintWorkflowSessionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintWorkflowSessionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintWorkflowSessionStatus =
        PrintWorkflowSessionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintWorkflowSessionStatus): Int = obj.value
  }
}
