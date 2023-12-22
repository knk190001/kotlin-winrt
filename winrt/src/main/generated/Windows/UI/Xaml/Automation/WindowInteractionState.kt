package Windows.UI.Xaml.Automation

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

@ABIMarker(WindowInteractionState.ABI::class)
@Signature("enum(Windows.UI.Xaml.Automation.WindowInteractionState;i4)")
@WinRTByReference(brClass = WindowInteractionState.ByReference::class)
public enum class WindowInteractionState(
  public val value: Int
) : NativeMapped {
  Running(0),
  Closing(1),
  ReadyForUserInteraction(2),
  BlockedByModalWindow(3),
  NotResponding(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WindowInteractionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Running
      1 -> Closing
      2 -> ReadyForUserInteraction
      3 -> BlockedByModalWindow
      4 -> NotResponding
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WindowInteractionState> {
    public fun setValue(newValue: WindowInteractionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WindowInteractionState =
        WindowInteractionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WindowInteractionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WindowInteractionState =
        WindowInteractionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: WindowInteractionState): Int = obj.value
  }
}
