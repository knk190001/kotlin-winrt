package Windows.Security.Authentication.Web.Provider

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

@ABIMarker(WebAccountProviderOperationKind.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind;i4)")
@WinRTByReference(brClass = WebAccountProviderOperationKind.ByReference::class)
public enum class WebAccountProviderOperationKind(
  public val value: Int
) : NativeMapped {
  RequestToken(0),
  GetTokenSilently(1),
  AddAccount(2),
  ManageAccount(3),
  DeleteAccount(4),
  RetrieveCookies(5),
  SignOutAccount(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAccountProviderOperationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RequestToken
      1 -> GetTokenSilently
      2 -> AddAccount
      3 -> ManageAccount
      4 -> DeleteAccount
      5 -> RetrieveCookies
      6 -> SignOutAccount
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WebAccountProviderOperationKind> {
    public fun setValue(newValue: WebAccountProviderOperationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAccountProviderOperationKind =
        WebAccountProviderOperationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAccountProviderOperationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAccountProviderOperationKind =
        WebAccountProviderOperationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAccountProviderOperationKind): Int = obj.value
  }
}
