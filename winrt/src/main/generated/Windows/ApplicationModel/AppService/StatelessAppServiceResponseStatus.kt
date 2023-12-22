package Windows.ApplicationModel.AppService

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

@ABIMarker(StatelessAppServiceResponseStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.AppService.StatelessAppServiceResponseStatus;i4)")
@WinRTByReference(brClass = StatelessAppServiceResponseStatus.ByReference::class)
public enum class StatelessAppServiceResponseStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  AppNotInstalled(1),
  AppUnavailable(2),
  AppServiceUnavailable(3),
  RemoteSystemUnavailable(4),
  RemoteSystemNotSupportedByApp(5),
  NotAuthorized(6),
  ResourceLimitsExceeded(7),
  MessageSizeTooLarge(8),
  Failure(9),
  Unknown(10),
  AuthenticationError(11),
  NetworkNotAvailable(12),
  DisabledByPolicy(13),
  WebServiceUnavailable(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StatelessAppServiceResponseStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AppNotInstalled
      2 -> AppUnavailable
      3 -> AppServiceUnavailable
      4 -> RemoteSystemUnavailable
      5 -> RemoteSystemNotSupportedByApp
      6 -> NotAuthorized
      7 -> ResourceLimitsExceeded
      8 -> MessageSizeTooLarge
      9 -> Failure
      10 -> Unknown
      11 -> AuthenticationError
      12 -> NetworkNotAvailable
      13 -> DisabledByPolicy
      14 -> WebServiceUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StatelessAppServiceResponseStatus> {
    public fun setValue(newValue: StatelessAppServiceResponseStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StatelessAppServiceResponseStatus =
        StatelessAppServiceResponseStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StatelessAppServiceResponseStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StatelessAppServiceResponseStatus =
        StatelessAppServiceResponseStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: StatelessAppServiceResponseStatus): Int = obj.value
  }
}
