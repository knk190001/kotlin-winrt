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

@ABIMarker(PrintCollation.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintCollation;i4)")
@WinRTByReference(brClass = PrintCollation.ByReference::class)
public enum class PrintCollation(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  Collated(3),
  Uncollated(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintCollation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> Collated
      4 -> Uncollated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintCollation> {
    public fun setValue(newValue: PrintCollation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintCollation =
        PrintCollation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintCollation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintCollation =
        PrintCollation.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintCollation): Int = obj.value
  }
}
