package Windows.Devices.Enumeration

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

@ABIMarker(DevicePairingResultStatus.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DevicePairingResultStatus;i4)")
@WinRTByReference(brClass = DevicePairingResultStatus.ByReference::class)
public enum class DevicePairingResultStatus(
  public val value: Int
) : NativeMapped {
  Paired(0),
  NotReadyToPair(1),
  NotPaired(2),
  AlreadyPaired(3),
  ConnectionRejected(4),
  TooManyConnections(5),
  HardwareFailure(6),
  AuthenticationTimeout(7),
  AuthenticationNotAllowed(8),
  AuthenticationFailure(9),
  NoSupportedProfiles(10),
  ProtectionLevelCouldNotBeMet(11),
  AccessDenied(12),
  InvalidCeremonyData(13),
  PairingCanceled(14),
  OperationAlreadyInProgress(15),
  RequiredHandlerNotRegistered(16),
  RejectedByHandler(17),
  RemoteDeviceHasAssociation(18),
  Failed(19),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DevicePairingResultStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Paired
      1 -> NotReadyToPair
      2 -> NotPaired
      3 -> AlreadyPaired
      4 -> ConnectionRejected
      5 -> TooManyConnections
      6 -> HardwareFailure
      7 -> AuthenticationTimeout
      8 -> AuthenticationNotAllowed
      9 -> AuthenticationFailure
      10 -> NoSupportedProfiles
      11 -> ProtectionLevelCouldNotBeMet
      12 -> AccessDenied
      13 -> InvalidCeremonyData
      14 -> PairingCanceled
      15 -> OperationAlreadyInProgress
      16 -> RequiredHandlerNotRegistered
      17 -> RejectedByHandler
      18 -> RemoteDeviceHasAssociation
      19 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DevicePairingResultStatus>
      {
    public fun setValue(newValue: DevicePairingResultStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DevicePairingResultStatus =
        DevicePairingResultStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DevicePairingResultStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DevicePairingResultStatus =
        DevicePairingResultStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DevicePairingResultStatus): Int = obj.value
  }
}
