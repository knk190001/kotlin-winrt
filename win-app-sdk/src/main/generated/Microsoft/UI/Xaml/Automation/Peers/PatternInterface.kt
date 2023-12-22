package Microsoft.UI.Xaml.Automation.Peers

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

@ABIMarker(PatternInterface.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.PatternInterface;i4)")
@WinRTByReference(brClass = PatternInterface.ByReference::class)
public enum class PatternInterface(
  public val value: Int
) : NativeMapped {
  Invoke(0),
  Selection(1),
  Value(2),
  RangeValue(3),
  Scroll(4),
  ScrollItem(5),
  ExpandCollapse(6),
  Grid(7),
  GridItem(8),
  MultipleView(9),
  Window(10),
  SelectionItem(11),
  Dock(12),
  Table(13),
  TableItem(14),
  Toggle(15),
  Transform(16),
  Text(17),
  ItemContainer(18),
  VirtualizedItem(19),
  Text2(20),
  TextChild(21),
  TextRange(22),
  Annotation(23),
  Drag(24),
  DropTarget(25),
  ObjectModel(26),
  Spreadsheet(27),
  SpreadsheetItem(28),
  Styles(29),
  Transform2(30),
  SynchronizedInput(31),
  TextEdit(32),
  CustomNavigation(33),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PatternInterface {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invoke
      1 -> Selection
      2 -> Value
      3 -> RangeValue
      4 -> Scroll
      5 -> ScrollItem
      6 -> ExpandCollapse
      7 -> Grid
      8 -> GridItem
      9 -> MultipleView
      10 -> Window
      11 -> SelectionItem
      12 -> Dock
      13 -> Table
      14 -> TableItem
      15 -> Toggle
      16 -> Transform
      17 -> Text
      18 -> ItemContainer
      19 -> VirtualizedItem
      20 -> Text2
      21 -> TextChild
      22 -> TextRange
      23 -> Annotation
      24 -> Drag
      25 -> DropTarget
      26 -> ObjectModel
      27 -> Spreadsheet
      28 -> SpreadsheetItem
      29 -> Styles
      30 -> Transform2
      31 -> SynchronizedInput
      32 -> TextEdit
      33 -> CustomNavigation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PatternInterface> {
    public fun setValue(newValue: PatternInterface): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PatternInterface =
        PatternInterface.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PatternInterface, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PatternInterface =
        PatternInterface.values()[0].fromNative(value, null)

    public override fun toNative(obj: PatternInterface): Int = obj.value
  }
}
