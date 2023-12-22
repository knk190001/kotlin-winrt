package Windows.UI.Text

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

@ABIMarker(ParagraphAlignment.ABI::class)
@Signature("enum(Windows.UI.Text.ParagraphAlignment;i4)")
@WinRTByReference(brClass = ParagraphAlignment.ByReference::class)
public enum class ParagraphAlignment(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  Left(1),
  Center(2),
  Right(3),
  Justify(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ParagraphAlignment {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> Left
      2 -> Center
      3 -> Right
      4 -> Justify
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ParagraphAlignment> {
    public fun setValue(newValue: ParagraphAlignment): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ParagraphAlignment =
        ParagraphAlignment.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ParagraphAlignment, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ParagraphAlignment =
        ParagraphAlignment.values()[0].fromNative(value, null)

    public override fun toNative(obj: ParagraphAlignment): Int = obj.value
  }
}
