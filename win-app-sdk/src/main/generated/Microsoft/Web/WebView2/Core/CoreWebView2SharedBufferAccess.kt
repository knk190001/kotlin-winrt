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

@ABIMarker(CoreWebView2SharedBufferAccess.ABI::class)
@Signature("enum(Microsoft.Web.WebView2.Core.CoreWebView2SharedBufferAccess;i4)")
@WinRTByReference(brClass = CoreWebView2SharedBufferAccess.ByReference::class)
public enum class CoreWebView2SharedBufferAccess(
  public val value: Int
) : NativeMapped {
  ReadOnly(0),
  ReadWrite(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWebView2SharedBufferAccess {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ReadOnly
      1 -> ReadWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreWebView2SharedBufferAccess> {
    public fun setValue(newValue: CoreWebView2SharedBufferAccess): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWebView2SharedBufferAccess =
        CoreWebView2SharedBufferAccess.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWebView2SharedBufferAccess, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWebView2SharedBufferAccess =
        CoreWebView2SharedBufferAccess.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWebView2SharedBufferAccess): Int = obj.value
  }
}
