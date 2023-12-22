package Windows.UI.Input

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

@ABIMarker(CrossSlidingState.ABI::class)
@Signature("enum(Windows.UI.Input.CrossSlidingState;i4)")
@WinRTByReference(brClass = CrossSlidingState.ByReference::class)
public enum class CrossSlidingState(
  public val value: Int
) : NativeMapped {
  Started(0),
  Dragging(1),
  Selecting(2),
  SelectSpeedBumping(3),
  SpeedBumping(4),
  Rearranging(5),
  Completed(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CrossSlidingState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Started
      1 -> Dragging
      2 -> Selecting
      3 -> SelectSpeedBumping
      4 -> SpeedBumping
      5 -> Rearranging
      6 -> Completed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CrossSlidingState> {
    public fun setValue(newValue: CrossSlidingState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CrossSlidingState =
        CrossSlidingState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CrossSlidingState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CrossSlidingState =
        CrossSlidingState.values()[0].fromNative(value, null)

    public override fun toNative(obj: CrossSlidingState): Int = obj.value
  }
}
