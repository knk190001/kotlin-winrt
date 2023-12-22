package Windows.UI.Xaml.Controls

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

@ABIMarker(RefreshVisualizerState.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.RefreshVisualizerState;i4)")
@WinRTByReference(brClass = RefreshVisualizerState.ByReference::class)
public enum class RefreshVisualizerState(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Peeking(1),
  Interacting(2),
  Pending(3),
  Refreshing(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RefreshVisualizerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Peeking
      2 -> Interacting
      3 -> Pending
      4 -> Refreshing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RefreshVisualizerState> {
    public fun setValue(newValue: RefreshVisualizerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RefreshVisualizerState =
        RefreshVisualizerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RefreshVisualizerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RefreshVisualizerState =
        RefreshVisualizerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: RefreshVisualizerState): Int = obj.value
  }
}
