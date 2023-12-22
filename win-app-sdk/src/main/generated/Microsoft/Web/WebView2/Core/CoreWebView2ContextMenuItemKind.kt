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

@ABIMarker(CoreWebView2ContextMenuItemKind.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2ContextMenuItemKind;i4)")
@WinRTByReference(brClass = CoreWebView2ContextMenuItemKind.ByReference::class)
public enum class CoreWebView2ContextMenuItemKind(
  public val value: Int
) : NativeMapped {
  Command(0),
  CheckBox(1),
  Radio(2),
  Separator(3),
  Submenu(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2ContextMenuItemKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Command
      1 -> CheckBox
      2 -> Radio
      3 -> Separator
      4 -> Submenu
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2ContextMenuItemKind> {
    public fun setValue(newValue: CoreWebView2ContextMenuItemKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2ContextMenuItemKind =
        CoreWebView2ContextMenuItemKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2ContextMenuItemKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2ContextMenuItemKind =
        CoreWebView2ContextMenuItemKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2ContextMenuItemKind): Int = obj.value
  }
}
