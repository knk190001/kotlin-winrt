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

@ABIMarker(AppBroadcastPlugInState.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastPlugInState;i4)")
@WinRTByReference(brClass = AppBroadcastPlugInState.ByReference::class)
public enum class AppBroadcastPlugInState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Initialized(1),
  MicrosoftSignInRequired(2),
  OAuthSignInRequired(3),
  ProviderSignInRequired(4),
  InBandwidthTest(5),
  ReadyToBroadcast(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastPlugInState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Initialized
      2 -> MicrosoftSignInRequired
      3 -> OAuthSignInRequired
      4 -> ProviderSignInRequired
      5 -> InBandwidthTest
      6 -> ReadyToBroadcast
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppBroadcastPlugInState> {
    public fun setValue(newValue: AppBroadcastPlugInState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastPlugInState =
        AppBroadcastPlugInState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastPlugInState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastPlugInState =
        AppBroadcastPlugInState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastPlugInState): Int = obj.value
  }
}
