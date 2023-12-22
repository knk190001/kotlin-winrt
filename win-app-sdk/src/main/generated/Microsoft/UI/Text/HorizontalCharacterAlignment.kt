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

@ABIMarker(HorizontalCharacterAlignment.ABI::class)
@Signature("enum(Microsoft.UI.Text.HorizontalCharacterAlignment;i4)")
@WinRTByReference(brClass = HorizontalCharacterAlignment.ByReference::class)
public enum class HorizontalCharacterAlignment(
  public val value: Int
) : NativeMapped {
  Left(0),
  Right(1),
  Center(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HorizontalCharacterAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Left
      1 -> Right
      2 -> Center
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HorizontalCharacterAlignment> {
    public fun setValue(newValue: HorizontalCharacterAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HorizontalCharacterAlignment =
        HorizontalCharacterAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HorizontalCharacterAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HorizontalCharacterAlignment =
        HorizontalCharacterAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: HorizontalCharacterAlignment): Int = obj.value
  }
}
