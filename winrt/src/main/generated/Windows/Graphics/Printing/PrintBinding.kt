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

@ABIMarker(PrintBinding.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintBinding;i4)")
@WinRTByReference(brClass = PrintBinding.ByReference::class)
public enum class PrintBinding(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  None(3),
  Bale(4),
  BindBottom(5),
  BindLeft(6),
  BindRight(7),
  BindTop(8),
  Booklet(9),
  EdgeStitchBottom(10),
  EdgeStitchLeft(11),
  EdgeStitchRight(12),
  EdgeStitchTop(13),
  Fold(14),
  JogOffset(15),
  Trim(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintBinding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> None
      4 -> Bale
      5 -> BindBottom
      6 -> BindLeft
      7 -> BindRight
      8 -> BindTop
      9 -> Booklet
      10 -> EdgeStitchBottom
      11 -> EdgeStitchLeft
      12 -> EdgeStitchRight
      13 -> EdgeStitchTop
      14 -> Fold
      15 -> JogOffset
      16 -> Trim
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintBinding> {
    public fun setValue(newValue: PrintBinding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintBinding =
        PrintBinding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintBinding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintBinding =
        PrintBinding.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintBinding): Int = obj.value
  }
}
