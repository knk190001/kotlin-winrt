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

@ABIMarker(ChainValidationResult.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.ChainValidationResult;i4)")
@WinRTByReference(brClass = ChainValidationResult.ByReference::class)
public enum class ChainValidationResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  Untrusted(1),
  Revoked(2),
  Expired(3),
  IncompleteChain(4),
  InvalidSignature(5),
  WrongUsage(6),
  InvalidName(7),
  InvalidCertificateAuthorityPolicy(8),
  BasicConstraintsError(9),
  UnknownCriticalExtension(10),
  RevocationInformationMissing(11),
  RevocationFailure(12),
  OtherErrors(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ChainValidationResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Untrusted
      2 -> Revoked
      3 -> Expired
      4 -> IncompleteChain
      5 -> InvalidSignature
      6 -> WrongUsage
      7 -> InvalidName
      8 -> InvalidCertificateAuthorityPolicy
      9 -> BasicConstraintsError
      10 -> UnknownCriticalExtension
      11 -> RevocationInformationMissing
      12 -> RevocationFailure
      13 -> OtherErrors
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ChainValidationResult> {
    public fun setValue(newValue: ChainValidationResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ChainValidationResult =
        ChainValidationResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ChainValidationResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ChainValidationResult =
        ChainValidationResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ChainValidationResult): Int = obj.value
  }
}
