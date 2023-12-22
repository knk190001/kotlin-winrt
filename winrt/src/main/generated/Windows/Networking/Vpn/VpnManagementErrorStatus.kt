package Windows.Networking.Vpn

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

@ABIMarker(VpnManagementErrorStatus.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnManagementErrorStatus;i4)")
@WinRTByReference(brClass = VpnManagementErrorStatus.ByReference::class)
public enum class VpnManagementErrorStatus(
  public val value: Int
) : NativeMapped {
  Ok(0),
  Other(1),
  InvalidXmlSyntax(2),
  ProfileNameTooLong(3),
  ProfileInvalidAppId(4),
  AccessDenied(5),
  CannotFindProfile(6),
  AlreadyDisconnecting(7),
  AlreadyConnected(8),
  GeneralAuthenticationFailure(9),
  EapFailure(10),
  SmartCardFailure(11),
  CertificateFailure(12),
  ServerConfiguration(13),
  NoConnection(14),
  ServerConnection(15),
  UserNamePassword(16),
  DnsNotResolvable(17),
  InvalidIP(18),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnManagementErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ok
      1 -> Other
      2 -> InvalidXmlSyntax
      3 -> ProfileNameTooLong
      4 -> ProfileInvalidAppId
      5 -> AccessDenied
      6 -> CannotFindProfile
      7 -> AlreadyDisconnecting
      8 -> AlreadyConnected
      9 -> GeneralAuthenticationFailure
      10 -> EapFailure
      11 -> SmartCardFailure
      12 -> CertificateFailure
      13 -> ServerConfiguration
      14 -> NoConnection
      15 -> ServerConnection
      16 -> UserNamePassword
      17 -> DnsNotResolvable
      18 -> InvalidIP
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnManagementErrorStatus>
      {
    public fun setValue(newValue: VpnManagementErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnManagementErrorStatus =
        VpnManagementErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnManagementErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnManagementErrorStatus =
        VpnManagementErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnManagementErrorStatus): Int = obj.value
  }
}
