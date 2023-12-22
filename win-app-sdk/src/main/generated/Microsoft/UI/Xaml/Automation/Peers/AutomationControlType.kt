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

@ABIMarker(AutomationControlType.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Automation.Peers.AutomationControlType;i4)")
@WinRTByReference(brClass = AutomationControlType.ByReference::class)
public enum class AutomationControlType(
  public val value: Int
) : NativeMapped {
  Button(0),
  Calendar(1),
  CheckBox(2),
  ComboBox(3),
  Edit(4),
  Hyperlink(5),
  Image(6),
  ListItem(7),
  List(8),
  Menu(9),
  MenuBar(10),
  MenuItem(11),
  ProgressBar(12),
  RadioButton(13),
  ScrollBar(14),
  Slider(15),
  Spinner(16),
  StatusBar(17),
  Tab(18),
  TabItem(19),
  Text(20),
  ToolBar(21),
  ToolTip(22),
  Tree(23),
  TreeItem(24),
  Custom(25),
  Group(26),
  Thumb(27),
  DataGrid(28),
  DataItem(29),
  Document(30),
  SplitButton(31),
  Window(32),
  Pane(33),
  Header(34),
  HeaderItem(35),
  Table(36),
  TitleBar(37),
  Separator(38),
  SemanticZoom(39),
  AppBar(40),
  FlipView(41),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationControlType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Button
      1 -> Calendar
      2 -> CheckBox
      3 -> ComboBox
      4 -> Edit
      5 -> Hyperlink
      6 -> Image
      7 -> ListItem
      8 -> List
      9 -> Menu
      10 -> MenuBar
      11 -> MenuItem
      12 -> ProgressBar
      13 -> RadioButton
      14 -> ScrollBar
      15 -> Slider
      16 -> Spinner
      17 -> StatusBar
      18 -> Tab
      19 -> TabItem
      20 -> Text
      21 -> ToolBar
      22 -> ToolTip
      23 -> Tree
      24 -> TreeItem
      25 -> Custom
      26 -> Group
      27 -> Thumb
      28 -> DataGrid
      29 -> DataItem
      30 -> Document
      31 -> SplitButton
      32 -> Window
      33 -> Pane
      34 -> Header
      35 -> HeaderItem
      36 -> Table
      37 -> TitleBar
      38 -> Separator
      39 -> SemanticZoom
      40 -> AppBar
      41 -> FlipView
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationControlType> {
    public fun setValue(newValue: AutomationControlType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationControlType =
        AutomationControlType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationControlType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationControlType =
        AutomationControlType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationControlType): Int = obj.value
  }
}
