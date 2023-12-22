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

@ABIMarker(TextLineBounds.ABI::class)
@Signature("enum(Windows.UI.Xaml.TextLineBounds;i4)")
@WinRTByReference(brClass = TextLineBounds.ByReference::class)
public enum class TextLineBounds(
  public val value: Int
) : NativeMapped {
  Full(0),
  TrimToCapHeight(1),
  TrimToBaseline(2),
  Tight(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextLineBounds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Full
      1 -> TrimToCapHeight
      2 -> TrimToBaseline
      3 -> Tight
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextLineBounds> {
    public fun setValue(newValue: TextLineBounds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextLineBounds =
        TextLineBounds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextLineBounds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextLineBounds =
        TextLineBounds.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextLineBounds): Int = obj.value
  }
}
