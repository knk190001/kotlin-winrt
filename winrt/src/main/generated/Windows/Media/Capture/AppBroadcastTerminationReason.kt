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

@ABIMarker(AppBroadcastTerminationReason.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastTerminationReason;i4)")
@WinRTByReference(brClass = AppBroadcastTerminationReason.ByReference::class)
public enum class AppBroadcastTerminationReason(
  public val value: Int
) : NativeMapped {
  NormalTermination(0),
  LostConnectionToService(1),
  NoNetworkConnectivity(2),
  ServiceAbort(3),
  ServiceError(4),
  ServiceUnavailable(5),
  InternalError(6),
  UnsupportedFormat(7),
  BackgroundTaskTerminated(8),
  BackgroundTaskUnresponsive(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastTerminationReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NormalTermination
      1 -> LostConnectionToService
      2 -> NoNetworkConnectivity
      3 -> ServiceAbort
      4 -> ServiceError
      5 -> ServiceUnavailable
      6 -> InternalError
      7 -> UnsupportedFormat
      8 -> BackgroundTaskTerminated
      9 -> BackgroundTaskUnresponsive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppBroadcastTerminationReason> {
    public fun setValue(newValue: AppBroadcastTerminationReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastTerminationReason =
        AppBroadcastTerminationReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastTerminationReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastTerminationReason =
        AppBroadcastTerminationReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastTerminationReason): Int = obj.value
  }
}
