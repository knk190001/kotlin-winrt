package Windows.UI.Core.AnimationMetrics

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

@ABIMarker(AnimationEffectTarget.ABI::class)
@Signature("enum(Windows.UI.Core.AnimationMetrics.AnimationEffectTarget;i4)")
@WinRTByReference(brClass = AnimationEffectTarget.ByReference::class)
public enum class AnimationEffectTarget(
  public val value: Int
) : NativeMapped {
  Primary(0),
  Added(1),
  Affected(2),
  Background(3),
  Content(4),
  Deleted(5),
  Deselected(6),
  DragSource(7),
  Hidden(8),
  Incoming(9),
  Outgoing(10),
  Outline(11),
  Remaining(12),
  Revealed(13),
  RowIn(14),
  RowOut(15),
  Selected(16),
  Selection(17),
  Shown(18),
  Tapped(19),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationEffectTarget {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Primary
      1 -> Added
      2 -> Affected
      3 -> Background
      4 -> Content
      5 -> Deleted
      6 -> Deselected
      7 -> DragSource
      8 -> Hidden
      9 -> Incoming
      10 -> Outgoing
      11 -> Outline
      12 -> Remaining
      13 -> Revealed
      14 -> RowIn
      15 -> RowOut
      16 -> Selected
      17 -> Selection
      18 -> Shown
      19 -> Tapped
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnimationEffectTarget> {
    public fun setValue(newValue: AnimationEffectTarget): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationEffectTarget =
        AnimationEffectTarget.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationEffectTarget, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationEffectTarget =
        AnimationEffectTarget.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationEffectTarget): Int = obj.value
  }
}
