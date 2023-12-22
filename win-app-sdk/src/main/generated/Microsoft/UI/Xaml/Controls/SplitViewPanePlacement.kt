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

@ABIMarker(SplitViewPanePlacement.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.SplitViewPanePlacement;i4)")
@WinRTByReference(brClass = SplitViewPanePlacement.ByReference::class)
public enum class SplitViewPanePlacement(
  public val value: Int
) : NativeMapped {
  Left(0),
  Right(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SplitViewPanePlacement {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Right
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SplitViewPanePlacement> {
    public fun setValue(newValue: SplitViewPanePlacement): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SplitViewPanePlacement =
        SplitViewPanePlacement.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SplitViewPanePlacement, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SplitViewPanePlacement =
        SplitViewPanePlacement.values()[0].fromNative(value, null)

    public override fun toNative(obj: SplitViewPanePlacement): Int = obj.value
  }
}
