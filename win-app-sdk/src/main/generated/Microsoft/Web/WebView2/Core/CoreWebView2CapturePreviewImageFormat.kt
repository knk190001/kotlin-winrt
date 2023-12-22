package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2CapturePreviewImageFormat.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2CapturePreviewImageFormat;i4)")
@WinRTByReference(brClass = CoreWebView2CapturePreviewImageFormat.ByReference::class)
public enum class CoreWebView2CapturePreviewImageFormat(
  public val value: Int
) : NativeMapped {
  Png(0),
  Jpeg(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2CapturePreviewImageFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Png
      1 -> Jpeg
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2CapturePreviewImageFormat> {
    public fun setValue(newValue: CoreWebView2CapturePreviewImageFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2CapturePreviewImageFormat =
        CoreWebView2CapturePreviewImageFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2CapturePreviewImageFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2CapturePreviewImageFormat =
        CoreWebView2CapturePreviewImageFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2CapturePreviewImageFormat): Int = obj.value
  }
}
