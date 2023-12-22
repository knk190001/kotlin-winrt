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

@ABIMarker(PrintMediaType.ABI::class)
@Signature("enum(Windows.Graphics.Printing.PrintMediaType;i4)")
@WinRTByReference(brClass = PrintMediaType.ByReference::class)
public enum class PrintMediaType(
  public val value: Int
) : NativeMapped {
  Default(0),
  NotAvailable(1),
  PrinterCustom(2),
  AutoSelect(3),
  Archival(4),
  BackPrintFilm(5),
  Bond(6),
  CardStock(7),
  Continuous(8),
  EnvelopePlain(9),
  EnvelopeWindow(10),
  Fabric(11),
  HighResolution(12),
  Label(13),
  MultiLayerForm(14),
  MultiPartForm(15),
  Photographic(16),
  PhotographicFilm(17),
  PhotographicGlossy(18),
  PhotographicHighGloss(19),
  PhotographicMatte(20),
  PhotographicSatin(21),
  PhotographicSemiGloss(22),
  Plain(23),
  Screen(24),
  ScreenPaged(25),
  Stationery(26),
  TabStockFull(27),
  TabStockPreCut(28),
  Transparency(29),
  TShirtTransfer(30),
  None(31),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PrintMediaType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> NotAvailable
      2 -> PrinterCustom
      3 -> AutoSelect
      4 -> Archival
      5 -> BackPrintFilm
      6 -> Bond
      7 -> CardStock
      8 -> Continuous
      9 -> EnvelopePlain
      10 -> EnvelopeWindow
      11 -> Fabric
      12 -> HighResolution
      13 -> Label
      14 -> MultiLayerForm
      15 -> MultiPartForm
      16 -> Photographic
      17 -> PhotographicFilm
      18 -> PhotographicGlossy
      19 -> PhotographicHighGloss
      20 -> PhotographicMatte
      21 -> PhotographicSatin
      22 -> PhotographicSemiGloss
      23 -> Plain
      24 -> Screen
      25 -> ScreenPaged
      26 -> Stationery
      27 -> TabStockFull
      28 -> TabStockPreCut
      29 -> Transparency
      30 -> TShirtTransfer
      31 -> None
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PrintMediaType> {
    public fun setValue(newValue: PrintMediaType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PrintMediaType =
        PrintMediaType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PrintMediaType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PrintMediaType =
        PrintMediaType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PrintMediaType): Int = obj.value
  }
}
