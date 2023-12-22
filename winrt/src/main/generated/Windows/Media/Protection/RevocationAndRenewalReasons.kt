package Windows.Media.Protection

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

@ABIMarker(RevocationAndRenewalReasons.ABI::class)
@Signature("enum(Windows.Media.Protection.RevocationAndRenewalReasons;u4)")
@WinRTByReference(brClass = RevocationAndRenewalReasons.ByReference::class)
public enum class RevocationAndRenewalReasons(
  public val value: Int
) : NativeMapped {
  UserModeComponentLoad(1),
  KernelModeComponentLoad(2),
  AppComponent(4),
  GlobalRevocationListLoadFailed(16),
  InvalidGlobalRevocationListSignature(32),
  GlobalRevocationListAbsent(4096),
  ComponentRevoked(8192),
  InvalidComponentCertificateExtendedKeyUse(16384),
  ComponentCertificateRevoked(32768),
  InvalidComponentCertificateRoot(65536),
  ComponentHighSecurityCertificateRevoked(131072),
  ComponentLowSecurityCertificateRevoked(262144),
  BootDriverVerificationFailed(1048576),
  ComponentSignedWithTestCertificate(16777216),
  EncryptionFailure(268435456),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RevocationAndRenewalReasons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> UserModeComponentLoad
      2 -> KernelModeComponentLoad
      4 -> AppComponent
      16 -> GlobalRevocationListLoadFailed
      32 -> InvalidGlobalRevocationListSignature
      4096 -> GlobalRevocationListAbsent
      8192 -> ComponentRevoked
      16384 -> InvalidComponentCertificateExtendedKeyUse
      32768 -> ComponentCertificateRevoked
      65536 -> InvalidComponentCertificateRoot
      131072 -> ComponentHighSecurityCertificateRevoked
      262144 -> ComponentLowSecurityCertificateRevoked
      1048576 -> BootDriverVerificationFailed
      16777216 -> ComponentSignedWithTestCertificate
      268435456 -> EncryptionFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RevocationAndRenewalReasons> {
    public fun setValue(newValue: RevocationAndRenewalReasons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RevocationAndRenewalReasons =
        RevocationAndRenewalReasons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RevocationAndRenewalReasons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RevocationAndRenewalReasons =
        RevocationAndRenewalReasons.values()[0].fromNative(value, null)

    public override fun toNative(obj: RevocationAndRenewalReasons): Int = obj.value
  }
}
