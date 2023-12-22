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

@ABIMarker(CoreWebView2PrintStatus.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2PrintStatus;i4)")
@WinRTByReference(brClass = CoreWebView2PrintStatus.ByReference::class)
public enum class CoreWebView2PrintStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  PrinterUnavailable(1),
  OtherError(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2PrintStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> PrinterUnavailable
      2 -> OtherError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreWebView2PrintStatus> {
    public fun setValue(newValue: CoreWebView2PrintStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2PrintStatus =
        CoreWebView2PrintStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2PrintStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2PrintStatus =
        CoreWebView2PrintStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2PrintStatus): Int = obj.value
  }
}
