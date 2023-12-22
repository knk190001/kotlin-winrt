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

@ABIMarker(WebAuthenticationStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.WebAuthenticationStatus;i4)")
@WinRTByReference(brClass = WebAuthenticationStatus.ByReference::class)
public enum class WebAuthenticationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UserCancel(1),
  ErrorHttp(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAuthenticationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UserCancel
      2 -> ErrorHttp
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebAuthenticationStatus> {
    public fun setValue(newValue: WebAuthenticationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAuthenticationStatus =
        WebAuthenticationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAuthenticationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAuthenticationStatus =
        WebAuthenticationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAuthenticationStatus): Int = obj.value
  }
}
