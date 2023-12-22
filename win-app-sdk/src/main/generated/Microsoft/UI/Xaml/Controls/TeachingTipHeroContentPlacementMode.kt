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

@ABIMarker(TeachingTipHeroContentPlacementMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.TeachingTipHeroContentPlacementMode;i4)")
@WinRTByReference(brClass = TeachingTipHeroContentPlacementMode.ByReference::class)
public enum class TeachingTipHeroContentPlacementMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Top(1),
  Bottom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TeachingTipHeroContentPlacementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Top
      2 -> Bottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<TeachingTipHeroContentPlacementMode> {
    public fun setValue(newValue: TeachingTipHeroContentPlacementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TeachingTipHeroContentPlacementMode =
        TeachingTipHeroContentPlacementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TeachingTipHeroContentPlacementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TeachingTipHeroContentPlacementMode =
        TeachingTipHeroContentPlacementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TeachingTipHeroContentPlacementMode): Int = obj.value
  }
}
