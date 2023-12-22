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

@ABIMarker(AnimationEffect.ABI::class)
@Signature("enum(Windows.UI.Core.AnimationMetrics.AnimationEffect;i4)")
@WinRTByReference(brClass = AnimationEffect.ByReference::class)
public enum class AnimationEffect(
  public val value: Int
) : NativeMapped {
  Expand(0),
  Collapse(1),
  Reposition(2),
  FadeIn(3),
  FadeOut(4),
  AddToList(5),
  DeleteFromList(6),
  AddToGrid(7),
  DeleteFromGrid(8),
  AddToSearchGrid(9),
  DeleteFromSearchGrid(10),
  AddToSearchList(11),
  DeleteFromSearchList(12),
  ShowEdgeUI(13),
  ShowPanel(14),
  HideEdgeUI(15),
  HidePanel(16),
  ShowPopup(17),
  HidePopup(18),
  PointerDown(19),
  PointerUp(20),
  DragSourceStart(21),
  DragSourceEnd(22),
  TransitionContent(23),
  Reveal(24),
  Hide(25),
  DragBetweenEnter(26),
  DragBetweenLeave(27),
  SwipeSelect(28),
  SwipeDeselect(29),
  SwipeReveal(30),
  EnterPage(31),
  TransitionPage(32),
  CrossFade(33),
  Peek(34),
  UpdateBadge(35),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AnimationEffect {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Expand
      1 -> Collapse
      2 -> Reposition
      3 -> FadeIn
      4 -> FadeOut
      5 -> AddToList
      6 -> DeleteFromList
      7 -> AddToGrid
      8 -> DeleteFromGrid
      9 -> AddToSearchGrid
      10 -> DeleteFromSearchGrid
      11 -> AddToSearchList
      12 -> DeleteFromSearchList
      13 -> ShowEdgeUI
      14 -> ShowPanel
      15 -> HideEdgeUI
      16 -> HidePanel
      17 -> ShowPopup
      18 -> HidePopup
      19 -> PointerDown
      20 -> PointerUp
      21 -> DragSourceStart
      22 -> DragSourceEnd
      23 -> TransitionContent
      24 -> Reveal
      25 -> Hide
      26 -> DragBetweenEnter
      27 -> DragBetweenLeave
      28 -> SwipeSelect
      29 -> SwipeDeselect
      30 -> SwipeReveal
      31 -> EnterPage
      32 -> TransitionPage
      33 -> CrossFade
      34 -> Peek
      35 -> UpdateBadge
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AnimationEffect> {
    public fun setValue(newValue: AnimationEffect): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AnimationEffect =
        AnimationEffect.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AnimationEffect, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AnimationEffect =
        AnimationEffect.values()[0].fromNative(value, null)

    public override fun toNative(obj: AnimationEffect): Int = obj.value
  }
}
