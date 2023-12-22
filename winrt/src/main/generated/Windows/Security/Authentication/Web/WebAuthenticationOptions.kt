package Windows.Security.Authentication.Web

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

@ABIMarker(WebAuthenticationOptions.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.WebAuthenticationOptions;u4)")
@WinRTByReference(brClass = WebAuthenticationOptions.ByReference::class)
public enum class WebAuthenticationOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  SilentMode(1),
  UseTitle(2),
  UseHttpPost(4),
  UseCorporateNetwork(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAuthenticationOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SilentMode
      2 -> UseTitle
      4 -> UseHttpPost
      8 -> UseCorporateNetwork
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebAuthenticationOptions>
      {
    public fun setValue(newValue: WebAuthenticationOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAuthenticationOptions =
        WebAuthenticationOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAuthenticationOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAuthenticationOptions =
        WebAuthenticationOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAuthenticationOptions): Int = obj.value
  }
}
