package Microsoft.UI.Xaml

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

@ABIMarker(FocusVisualKind.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.FocusVisualKind;i4)")
@WinRTByReference(brClass = FocusVisualKind.ByReference::class)
public enum class FocusVisualKind(
  public val value: Int
) : NativeMapped {
  DottedLine(0),
  HighVisibility(1),
  Reveal(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FocusVisualKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DottedLine
      1 -> HighVisibility
      2 -> Reveal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FocusVisualKind> {
    public fun setValue(newValue: FocusVisualKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FocusVisualKind =
        FocusVisualKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FocusVisualKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FocusVisualKind =
        FocusVisualKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: FocusVisualKind): Int = obj.value
  }
}
