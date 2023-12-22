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

@ABIMarker(AppServiceResponseStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.AppService.AppServiceResponseStatus;i4)")
@WinRTByReference(brClass = AppServiceResponseStatus.ByReference::class)
public enum class AppServiceResponseStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  Failure(1),
  ResourceLimitsExceeded(2),
  Unknown(3),
  RemoteSystemUnavailable(4),
  MessageSizeTooLarge(5),
  AppUnavailable(6),
  AuthenticationError(7),
  NetworkNotAvailable(8),
  DisabledByPolicy(9),
  WebServiceUnavailable(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppServiceResponseStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Failure
      2 -> ResourceLimitsExceeded
      3 -> Unknown
      4 -> RemoteSystemUnavailable
      5 -> MessageSizeTooLarge
      6 -> AppUnavailable
      7 -> AuthenticationError
      8 -> NetworkNotAvailable
      9 -> DisabledByPolicy
      10 -> WebServiceUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppServiceResponseStatus>
      {
    public fun setValue(newValue: AppServiceResponseStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppServiceResponseStatus =
        AppServiceResponseStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppServiceResponseStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppServiceResponseStatus =
        AppServiceResponseStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppServiceResponseStatus): Int = obj.value
  }
}
