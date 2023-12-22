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

@ABIMarker(PrintStaple.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintStaple;i4)")
@WinRTByReference(brClass = PrintStaple.ByReference::class)
public enum class PrintStaple(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  None(3),
  StapleTopLeft(4),
  StapleTopRight(5),
  StapleBottomLeft(6),
  StapleBottomRight(7),
  StapleDualLeft(8),
  StapleDualRight(9),
  StapleDualTop(10),
  StapleDualBottom(11),
  SaddleStitch(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintStaple {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> None
      4 -> StapleTopLeft
      5 -> StapleTopRight
      6 -> StapleBottomLeft
      7 -> StapleBottomRight
      8 -> StapleDualLeft
      9 -> StapleDualRight
      10 -> StapleDualTop
      11 -> StapleDualBottom
      12 -> SaddleStitch
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintStaple> {
    public fun setValue(newValue: PrintStaple): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintStaple =
        PrintStaple.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintStaple, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintStaple =
        PrintStaple.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintStaple): Int = obj.value
  }
}
