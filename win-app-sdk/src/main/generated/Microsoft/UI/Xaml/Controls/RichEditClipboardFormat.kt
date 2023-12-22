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

@ABIMarker(RichEditClipboardFormat.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.RichEditClipboardFormat;i4)")
@WinRTByReference(brClass = RichEditClipboardFormat.ByReference::class)
public enum class RichEditClipboardFormat(
  public val value: Int
) : NativeMapped {
  AllFormats(0),
  PlainText(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RichEditClipboardFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AllFormats
      1 -> PlainText
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RichEditClipboardFormat> {
    public fun setValue(newValue: RichEditClipboardFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RichEditClipboardFormat =
        RichEditClipboardFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RichEditClipboardFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RichEditClipboardFormat =
        RichEditClipboardFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: RichEditClipboardFormat): Int = obj.value
  }
}
