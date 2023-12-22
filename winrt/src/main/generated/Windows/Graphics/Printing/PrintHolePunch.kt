package Windows.Graphics.Printing

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

@ABIMarker(PrintHolePunch.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintHolePunch;i4)")
@WinRTByReference(brClass = PrintHolePunch.ByReference::class)
public enum class PrintHolePunch(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  None(3),
  LeftEdge(4),
  RightEdge(5),
  TopEdge(6),
  BottomEdge(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintHolePunch {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> None
      4 -> LeftEdge
      5 -> RightEdge
      6 -> TopEdge
      7 -> BottomEdge
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintHolePunch> {
    public fun setValue(newValue: PrintHolePunch): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintHolePunch =
        PrintHolePunch.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintHolePunch, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintHolePunch =
        PrintHolePunch.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintHolePunch): Int = obj.value
  }
}
