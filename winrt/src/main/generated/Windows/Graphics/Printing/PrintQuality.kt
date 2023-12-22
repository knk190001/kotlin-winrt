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

@ABIMarker(PrintQuality.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintQuality;i4)")
@WinRTByReference(brClass = PrintQuality.ByReference::class)
public enum class PrintQuality(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  Automatic(3),
  Draft(4),
  Fax(5),
  High(6),
  Normal(7),
  Photographic(8),
  Text(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintQuality {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> Automatic
      4 -> Draft
      5 -> Fax
      6 -> High
      7 -> Normal
      8 -> Photographic
      9 -> Text
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintQuality> {
    public fun setValue(newValue: PrintQuality): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintQuality =
        PrintQuality.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintQuality, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintQuality =
        PrintQuality.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintQuality): Int = obj.value
  }
}
