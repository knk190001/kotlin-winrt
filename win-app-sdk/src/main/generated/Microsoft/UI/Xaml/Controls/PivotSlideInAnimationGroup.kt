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

@ABIMarker(PivotSlideInAnimationGroup.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.PivotSlideInAnimationGroup;i4)")
@WinRTByReference(brClass = PivotSlideInAnimationGroup.ByReference::class)
public enum class PivotSlideInAnimationGroup(
  public val value: Int
) : NativeMapped {
  Default(0),
  GroupOne(1),
  GroupTwo(2),
  GroupThree(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PivotSlideInAnimationGroup {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> GroupOne
      2 -> GroupTwo
      3 -> GroupThree
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PivotSlideInAnimationGroup> {
    public fun setValue(newValue: PivotSlideInAnimationGroup): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PivotSlideInAnimationGroup =
        PivotSlideInAnimationGroup.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PivotSlideInAnimationGroup, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PivotSlideInAnimationGroup =
        PivotSlideInAnimationGroup.values()[0].fromNative(value, null)

    public override fun toNative(obj: PivotSlideInAnimationGroup): Int = obj.value
  }
}
