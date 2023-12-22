package Windows.Security.Cryptography.Certificates

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

@ABIMarker(CertificateChainPolicy.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.CertificateChainPolicy;i4)")
@WinRTByReference(brClass = CertificateChainPolicy.ByReference::class)
public enum class CertificateChainPolicy(
  public val value: Int
) : NativeMapped {
  Base(0),
  Ssl(1),
  NTAuthentication(2),
  MicrosoftRoot(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CertificateChainPolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Base
      1 -> Ssl
      2 -> NTAuthentication
      3 -> MicrosoftRoot
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CertificateChainPolicy> {
    public fun setValue(newValue: CertificateChainPolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CertificateChainPolicy =
        CertificateChainPolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CertificateChainPolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CertificateChainPolicy =
        CertificateChainPolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: CertificateChainPolicy): Int = obj.value
  }
}
