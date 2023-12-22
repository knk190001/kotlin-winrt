package Windows.Media.Capture

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

@ABIMarker(AppBroadcastSignInResult.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastSignInResult;i4)")
@WinRTByReference(brClass = AppBroadcastSignInResult.ByReference::class)
public enum class AppBroadcastSignInResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  AuthenticationFailed(1),
  Unauthorized(2),
  ServiceUnavailable(3),
  Unknown(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastSignInResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AuthenticationFailed
      2 -> Unauthorized
      3 -> ServiceUnavailable
      4 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppBroadcastSignInResult>
      {
    public fun setValue(newValue: AppBroadcastSignInResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastSignInResult =
        AppBroadcastSignInResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastSignInResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastSignInResult =
        AppBroadcastSignInResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastSignInResult): Int = obj.value
  }
}
