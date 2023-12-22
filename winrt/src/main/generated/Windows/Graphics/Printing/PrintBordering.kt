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

@ABIMarker(PrintBordering.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintBordering;i4)")
@WinRTByReference(brClass = PrintBordering.ByReference::class)
public enum class PrintBordering(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  Bordered(3),
  Borderless(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintBordering {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> Bordered
      4 -> Borderless
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintBordering> {
    public fun setValue(newValue: PrintBordering): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintBordering =
        PrintBordering.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintBordering, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintBordering =
        PrintBordering.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintBordering): Int = obj.value
  }
}
