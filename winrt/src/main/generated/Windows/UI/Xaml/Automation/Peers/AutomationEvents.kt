package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(AutomationEvents.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.Peers.AutomationEvents;i4)")
@WinRTByReference(brClass = AutomationEvents.ByReference::class)
public enum class AutomationEvents(
  public val value: Int
) : NativeMapped {
  ToolTipOpened(0),
  ToolTipClosed(1),
  MenuOpened(2),
  MenuClosed(3),
  AutomationFocusChanged(4),
  InvokePatternOnInvoked(5),
  SelectionItemPatternOnElementAddedToSelection(6),
  SelectionItemPatternOnElementRemovedFromSelection(7),
  SelectionItemPatternOnElementSelected(8),
  SelectionPatternOnInvalidated(9),
  TextPatternOnTextSelectionChanged(10),
  TextPatternOnTextChanged(11),
  AsyncContentLoaded(12),
  PropertyChanged(13),
  StructureChanged(14),
  DragStart(15),
  DragCancel(16),
  DragComplete(17),
  DragEnter(18),
  DragLeave(19),
  Dropped(20),
  LiveRegionChanged(21),
  InputReachedTarget(22),
  InputReachedOtherElement(23),
  InputDiscarded(24),
  WindowClosed(25),
  WindowOpened(26),
  ConversionTargetChanged(27),
  TextEditTextChanged(28),
  LayoutInvalidated(29),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationEvents {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ToolTipOpened
      1 -> ToolTipClosed
      2 -> MenuOpened
      3 -> MenuClosed
      4 -> AutomationFocusChanged
      5 -> InvokePatternOnInvoked
      6 -> SelectionItemPatternOnElementAddedToSelection
      7 -> SelectionItemPatternOnElementRemovedFromSelection
      8 -> SelectionItemPatternOnElementSelected
      9 -> SelectionPatternOnInvalidated
      10 -> TextPatternOnTextSelectionChanged
      11 -> TextPatternOnTextChanged
      12 -> AsyncContentLoaded
      13 -> PropertyChanged
      14 -> StructureChanged
      15 -> DragStart
      16 -> DragCancel
      17 -> DragComplete
      18 -> DragEnter
      19 -> DragLeave
      20 -> Dropped
      21 -> LiveRegionChanged
      22 -> InputReachedTarget
      23 -> InputReachedOtherElement
      24 -> InputDiscarded
      25 -> WindowClosed
      26 -> WindowOpened
      27 -> ConversionTargetChanged
      28 -> TextEditTextChanged
      29 -> LayoutInvalidated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutomationEvents> {
    public fun setValue(newValue: AutomationEvents): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationEvents =
        AutomationEvents.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationEvents, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationEvents =
        AutomationEvents.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationEvents): Int = obj.value
  }
}
