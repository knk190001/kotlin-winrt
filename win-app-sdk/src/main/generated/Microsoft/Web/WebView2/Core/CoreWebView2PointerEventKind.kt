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

@ABIMarker(CoreWebView2PointerEventKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2PointerEventKind;i4)")
@WinRTByReference(brClass = CoreWebView2PointerEventKind.ByReference::class)
public enum class CoreWebView2PointerEventKind(
  public val value: Int
) : NativeMapped {
  Activate(587),
  Down(582),
  Enter(585),
  Leave(586),
  Up(583),
  Update(581),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2PointerEventKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      587 -> Activate
      582 -> Down
      585 -> Enter
      586 -> Leave
      583 -> Up
      581 -> Update
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2PointerEventKind> {
    public fun setValue(newValue: CoreWebView2PointerEventKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2PointerEventKind =
        CoreWebView2PointerEventKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2PointerEventKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2PointerEventKind =
        CoreWebView2PointerEventKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2PointerEventKind): Int = obj.value
  }
}
