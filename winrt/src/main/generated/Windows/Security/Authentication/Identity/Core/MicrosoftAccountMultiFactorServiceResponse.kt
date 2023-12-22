package Windows.Security.Authentication.Identity.Core

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

@ABIMarker(MicrosoftAccountMultiFactorServiceResponse.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Core.MicrosoftAccountMultiFactorServiceResponse;i4)")
@WinRTByReference(brClass = MicrosoftAccountMultiFactorServiceResponse.ByReference::class)
public enum class MicrosoftAccountMultiFactorServiceResponse(
  public val value: Int
) : NativeMapped {
  Success(0),
  Error(1),
  NoNetworkConnection(2),
  ServiceUnavailable(3),
  TotpSetupDenied(4),
  NgcNotSetup(5),
  SessionAlreadyDenied(6),
  SessionAlreadyApproved(7),
  SessionExpired(8),
  NgcNonceExpired(9),
  InvalidSessionId(10),
  InvalidSessionType(11),
  InvalidOperation(12),
  InvalidStateTransition(13),
  DeviceNotFound(14),
  FlowDisabled(15),
  SessionNotApproved(16),
  OperationCanceledByUser(17),
  NgcDisabledByServer(18),
  NgcKeyNotFoundOnServer(19),
  UIRequired(20),
  DeviceIdChanged(21),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MicrosoftAccountMultiFactorServiceResponse {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Error
      2 -> NoNetworkConnection
      3 -> ServiceUnavailable
      4 -> TotpSetupDenied
      5 -> NgcNotSetup
      6 -> SessionAlreadyDenied
      7 -> SessionAlreadyApproved
      8 -> SessionExpired
      9 -> NgcNonceExpired
      10 -> InvalidSessionId
      11 -> InvalidSessionType
      12 -> InvalidOperation
      13 -> InvalidStateTransition
      14 -> DeviceNotFound
      15 -> FlowDisabled
      16 -> SessionNotApproved
      17 -> OperationCanceledByUser
      18 -> NgcDisabledByServer
      19 -> NgcKeyNotFoundOnServer
      20 -> UIRequired
      21 -> DeviceIdChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MicrosoftAccountMultiFactorServiceResponse> {
    public fun setValue(newValue: MicrosoftAccountMultiFactorServiceResponse): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MicrosoftAccountMultiFactorServiceResponse =
        MicrosoftAccountMultiFactorServiceResponse.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<MicrosoftAccountMultiFactorServiceResponse, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MicrosoftAccountMultiFactorServiceResponse =
        MicrosoftAccountMultiFactorServiceResponse.values()[0].fromNative(value, null)

    public override fun toNative(obj: MicrosoftAccountMultiFactorServiceResponse): Int = obj.value
  }
}
