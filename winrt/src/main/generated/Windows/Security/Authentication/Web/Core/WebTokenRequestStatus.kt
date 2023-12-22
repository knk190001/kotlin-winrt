package Windows.Security.Authentication.Web.Core

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

@ABIMarker(WebTokenRequestStatus.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.Core.WebTokenRequestStatus;i4)")
@WinRTByReference(brClass = WebTokenRequestStatus.ByReference::class)
public enum class WebTokenRequestStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UserCancel(1),
  AccountSwitch(2),
  UserInteractionRequired(3),
  AccountProviderNotAvailable(4),
  ProviderError(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebTokenRequestStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UserCancel
      2 -> AccountSwitch
      3 -> UserInteractionRequired
      4 -> AccountProviderNotAvailable
      5 -> ProviderError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebTokenRequestStatus> {
    public fun setValue(newValue: WebTokenRequestStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebTokenRequestStatus =
        WebTokenRequestStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebTokenRequestStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebTokenRequestStatus =
        WebTokenRequestStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebTokenRequestStatus): Int = obj.value
  }
}
