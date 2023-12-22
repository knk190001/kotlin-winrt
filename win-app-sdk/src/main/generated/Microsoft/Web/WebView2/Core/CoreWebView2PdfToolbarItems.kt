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

@ABIMarker(CoreWebView2PdfToolbarItems.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2PdfToolbarItems;u4)")
@WinRTByReference(brClass = CoreWebView2PdfToolbarItems.ByReference::class)
public enum class CoreWebView2PdfToolbarItems(
  public val value: Int
) : NativeMapped {
  None(0),
  Save(1),
  Print(2),
  SaveAs(4),
  ZoomIn(8),
  ZoomOut(16),
  Rotate(32),
  FitPage(64),
  PageLayout(128),
  Bookmarks(256),
  PageSelector(512),
  Search(1024),
  FullScreen(2048),
  MoreSettings(4096),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2PdfToolbarItems {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Save
      2 -> Print
      4 -> SaveAs
      8 -> ZoomIn
      16 -> ZoomOut
      32 -> Rotate
      64 -> FitPage
      128 -> PageLayout
      256 -> Bookmarks
      512 -> PageSelector
      1024 -> Search
      2048 -> FullScreen
      4096 -> MoreSettings
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2PdfToolbarItems> {
    public fun setValue(newValue: CoreWebView2PdfToolbarItems): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2PdfToolbarItems =
        CoreWebView2PdfToolbarItems.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2PdfToolbarItems, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2PdfToolbarItems =
        CoreWebView2PdfToolbarItems.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2PdfToolbarItems): Int = obj.value
  }
}
