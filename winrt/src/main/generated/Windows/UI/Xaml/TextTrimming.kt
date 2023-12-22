package Windows.UI.Xaml

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

@ABIMarker(TextTrimming.ABI::class)
@Signature("enum(Windows.UI.Xaml.TextTrimming;i4)")
@WinRTByReference(brClass = TextTrimming.ByReference::class)
public enum class TextTrimming(
  public val value: Int
) : NativeMapped {
  None(0),
  CharacterEllipsis(1),
  WordEllipsis(2),
  Clip(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextTrimming {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> CharacterEllipsis
      2 -> WordEllipsis
      3 -> Clip
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextTrimming> {
    public fun setValue(newValue: TextTrimming): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextTrimming =
        TextTrimming.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextTrimming, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextTrimming =
        TextTrimming.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextTrimming): Int = obj.value
  }
}
