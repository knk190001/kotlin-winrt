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

@ABIMarker(AppBroadcastExitBroadcastModeReason.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastExitBroadcastModeReason;i4)")
@WinRTByReference(brClass = AppBroadcastExitBroadcastModeReason.ByReference::class)
public enum class AppBroadcastExitBroadcastModeReason(
  public val value: Int
) : NativeMapped {
  NormalExit(0),
  UserCanceled(1),
  AuthorizationFail(2),
  ForegroundAppActivated(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastExitBroadcastModeReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NormalExit
      1 -> UserCanceled
      2 -> AuthorizationFail
      3 -> ForegroundAppActivated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppBroadcastExitBroadcastModeReason> {
    public fun setValue(newValue: AppBroadcastExitBroadcastModeReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastExitBroadcastModeReason =
        AppBroadcastExitBroadcastModeReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastExitBroadcastModeReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastExitBroadcastModeReason =
        AppBroadcastExitBroadcastModeReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastExitBroadcastModeReason): Int = obj.value
  }
}
