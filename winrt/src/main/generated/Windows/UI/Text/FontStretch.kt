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

@ABIMarker(FontStretch.ABI::class)
@Signature("enum(Windows.UI.Text.FontStretch;i4)")
@WinRTByReference(brClass = FontStretch.ByReference::class)
public enum class FontStretch(
  public val value: Int
) : NativeMapped {
  Undefined(0),
  UltraCondensed(1),
  ExtraCondensed(2),
  Condensed(3),
  SemiCondensed(4),
  Normal(5),
  SemiExpanded(6),
  Expanded(7),
  ExtraExpanded(8),
  UltraExpanded(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FontStretch {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undefined
      1 -> UltraCondensed
      2 -> ExtraCondensed
      3 -> Condensed
      4 -> SemiCondensed
      5 -> Normal
      6 -> SemiExpanded
      7 -> Expanded
      8 -> ExtraExpanded
      9 -> UltraExpanded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FontStretch> {
    public fun setValue(newValue: FontStretch): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FontStretch =
        FontStretch.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FontStretch, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FontStretch =
        FontStretch.values()[0].fromNative(value, null)

    public override fun toNative(obj: FontStretch): Int = obj.value
  }
}
