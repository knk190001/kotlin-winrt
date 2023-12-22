package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ScrollingInteractionState.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ScrollingInteractionState;i4)")
@WinRTByReference(brClass = ScrollingInteractionState.ByReference::class)
public enum class ScrollingInteractionState(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Interaction(1),
  Inertia(2),
  Animation(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ScrollingInteractionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Interaction
      2 -> Inertia
      3 -> Animation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ScrollingInteractionState>
      {
    public fun setValue(newValue: ScrollingInteractionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ScrollingInteractionState =
        ScrollingInteractionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ScrollingInteractionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ScrollingInteractionState =
        ScrollingInteractionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ScrollingInteractionState): Int = obj.value
  }
}
