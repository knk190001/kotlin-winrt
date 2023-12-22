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

@ABIMarker(PrintColorMode.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintColorMode;i4)")
@WinRTByReference(brClass = PrintColorMode.ByReference::class)
public enum class PrintColorMode(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  Color(3),
  Grayscale(4),
  Monochrome(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintColorMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> Color
      4 -> Grayscale
      5 -> Monochrome
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintColorMode> {
    public fun setValue(newValue: PrintColorMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintColorMode =
        PrintColorMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintColorMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintColorMode =
        PrintColorMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintColorMode): Int = obj.value
  }
}
