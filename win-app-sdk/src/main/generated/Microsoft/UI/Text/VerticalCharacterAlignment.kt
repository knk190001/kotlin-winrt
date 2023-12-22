package Microsoft.UI.Text

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

@ABIMarker(VerticalCharacterAlignment.ABI::class)
@Signature("enum(Microsoft.UI.Text.VerticalCharacterAlignment;i4)")
@WinRTByReference(brClass = VerticalCharacterAlignment.ByReference::class)
public enum class VerticalCharacterAlignment(
  public val value: Int
) : NativeMapped {
  Top(0),
  Baseline(1),
  Bottom(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VerticalCharacterAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Top
      1 -> Baseline
      2 -> Bottom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VerticalCharacterAlignment> {
    public fun setValue(newValue: VerticalCharacterAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VerticalCharacterAlignment =
        VerticalCharacterAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VerticalCharacterAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VerticalCharacterAlignment =
        VerticalCharacterAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: VerticalCharacterAlignment): Int = obj.value
  }
}
