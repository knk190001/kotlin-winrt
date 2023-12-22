package Windows.Networking.Sockets

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

@ABIMarker(SocketErrorStatus.ABI::class)
@Signature("enum(Windows.Networking.Sockets.SocketErrorStatus;i4)")
@WinRTByReference(brClass = SocketErrorStatus.ByReference::class)
public enum class SocketErrorStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  OperationAborted(1),
  HttpInvalidServerResponse(2),
  ConnectionTimedOut(3),
  AddressFamilyNotSupported(4),
  SocketTypeNotSupported(5),
  HostNotFound(6),
  NoDataRecordOfRequestedType(7),
  NonAuthoritativeHostNotFound(8),
  ClassTypeNotFound(9),
  AddressAlreadyInUse(10),
  CannotAssignRequestedAddress(11),
  ConnectionRefused(12),
  NetworkIsUnreachable(13),
  UnreachableHost(14),
  NetworkIsDown(15),
  NetworkDroppedConnectionOnReset(16),
  SoftwareCausedConnectionAbort(17),
  ConnectionResetByPeer(18),
  HostIsDown(19),
  NoAddressesFound(20),
  TooManyOpenFiles(21),
  MessageTooLong(22),
  CertificateExpired(23),
  CertificateUntrustedRoot(24),
  CertificateCommonNameIsIncorrect(25),
  CertificateWrongUsage(26),
  CertificateRevoked(27),
  CertificateNoRevocationCheck(28),
  CertificateRevocationServerOffline(29),
  CertificateIsInvalid(30),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocketErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> OperationAborted
      2 -> HttpInvalidServerResponse
      3 -> ConnectionTimedOut
      4 -> AddressFamilyNotSupported
      5 -> SocketTypeNotSupported
      6 -> HostNotFound
      7 -> NoDataRecordOfRequestedType
      8 -> NonAuthoritativeHostNotFound
      9 -> ClassTypeNotFound
      10 -> AddressAlreadyInUse
      11 -> CannotAssignRequestedAddress
      12 -> ConnectionRefused
      13 -> NetworkIsUnreachable
      14 -> UnreachableHost
      15 -> NetworkIsDown
      16 -> NetworkDroppedConnectionOnReset
      17 -> SoftwareCausedConnectionAbort
      18 -> ConnectionResetByPeer
      19 -> HostIsDown
      20 -> NoAddressesFound
      21 -> TooManyOpenFiles
      22 -> MessageTooLong
      23 -> CertificateExpired
      24 -> CertificateUntrustedRoot
      25 -> CertificateCommonNameIsIncorrect
      26 -> CertificateWrongUsage
      27 -> CertificateRevoked
      28 -> CertificateNoRevocationCheck
      29 -> CertificateRevocationServerOffline
      30 -> CertificateIsInvalid
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocketErrorStatus> {
    public fun setValue(newValue: SocketErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocketErrorStatus =
        SocketErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocketErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocketErrorStatus =
        SocketErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocketErrorStatus): Int = obj.value
  }
}
