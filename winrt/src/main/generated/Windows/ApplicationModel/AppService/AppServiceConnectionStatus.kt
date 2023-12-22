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

@ABIMarker(AppServiceConnectionStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.AppService.AppServiceConnectionStatus;i4)")
@WinRTByReference(brClass = AppServiceConnectionStatus.ByReference::class)
public enum class AppServiceConnectionStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  AppNotInstalled(1),
  AppUnavailable(2),
  AppServiceUnavailable(3),
  Unknown(4),
  RemoteSystemUnavailable(5),
  RemoteSystemNotSupportedByApp(6),
  NotAuthorized(7),
  AuthenticationError(8),
  NetworkNotAvailable(9),
  DisabledByPolicy(10),
  WebServiceUnavailable(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppServiceConnectionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AppNotInstalled
      2 -> AppUnavailable
      3 -> AppServiceUnavailable
      4 -> Unknown
      5 -> RemoteSystemUnavailable
      6 -> RemoteSystemNotSupportedByApp
      7 -> NotAuthorized
      8 -> AuthenticationError
      9 -> NetworkNotAvailable
      10 -> DisabledByPolicy
      11 -> WebServiceUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppServiceConnectionStatus> {
    public fun setValue(newValue: AppServiceConnectionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppServiceConnectionStatus =
        AppServiceConnectionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppServiceConnectionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppServiceConnectionStatus =
        AppServiceConnectionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppServiceConnectionStatus): Int = obj.value
  }
}
