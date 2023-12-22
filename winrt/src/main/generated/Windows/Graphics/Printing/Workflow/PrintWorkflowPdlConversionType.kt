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

@ABIMarker(PrintWorkflowPdlConversionType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.Workflow.PrintWorkflowPdlConversionType;i4)")
@WinRTByReference(brClass = PrintWorkflowPdlConversionType.ByReference::class)
public enum class PrintWorkflowPdlConversionType(
  public val value: Int
) : NativeMapped {
  XpsToPdf(0),
  XpsToPwgr(1),
  XpsToPclm(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintWorkflowPdlConversionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> XpsToPdf
      1 -> XpsToPwgr
      2 -> XpsToPclm
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PrintWorkflowPdlConversionType> {
    public fun setValue(newValue: PrintWorkflowPdlConversionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintWorkflowPdlConversionType =
        PrintWorkflowPdlConversionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintWorkflowPdlConversionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintWorkflowPdlConversionType =
        PrintWorkflowPdlConversionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintWorkflowPdlConversionType): Int = obj.value
  }
}
