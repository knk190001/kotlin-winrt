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

@ABIMarker(AppBroadcastSignInState.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastSignInState;i4)")
@WinRTByReference(brClass = AppBroadcastSignInState.ByReference::class)
public enum class AppBroadcastSignInState(
  public val value: Int
) : NativeMapped {
  NotSignedIn(0),
  MicrosoftSignInInProgress(1),
  MicrosoftSignInComplete(2),
  OAuthSignInInProgress(3),
  OAuthSignInComplete(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastSignInState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotSignedIn
      1 -> MicrosoftSignInInProgress
      2 -> MicrosoftSignInComplete
      3 -> OAuthSignInInProgress
      4 -> OAuthSignInComplete
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppBroadcastSignInState> {
    public fun setValue(newValue: AppBroadcastSignInState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastSignInState =
        AppBroadcastSignInState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastSignInState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastSignInState =
        AppBroadcastSignInState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastSignInState): Int = obj.value
  }
}
