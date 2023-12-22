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

@ABIMarker(TextWrapping.ABI::class)
@Signature("enum(Windows.UI.Xaml.TextWrapping;i4)")
@WinRTByReference(brClass = TextWrapping.ByReference::class)
public enum class TextWrapping(
  public val value: Int
) : NativeMapped {
  NoWrap(1),
  Wrap(2),
  WrapWholeWords(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TextWrapping {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> NoWrap
      2 -> Wrap
      3 -> WrapWholeWords
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TextWrapping> {
    public fun setValue(newValue: TextWrapping): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TextWrapping =
        TextWrapping.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TextWrapping, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TextWrapping =
        TextWrapping.values()[0].fromNative(value, null)

    public override fun toNative(obj: TextWrapping): Int = obj.value
  }
}
