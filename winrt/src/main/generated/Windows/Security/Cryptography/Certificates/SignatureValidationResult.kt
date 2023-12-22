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

@ABIMarker(SignatureValidationResult.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.SignatureValidationResult;i4)")
@WinRTByReference(brClass = SignatureValidationResult.ByReference::class)
public enum class SignatureValidationResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  InvalidParameter(1),
  BadMessage(2),
  InvalidSignature(3),
  OtherErrors(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SignatureValidationResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> InvalidParameter
      2 -> BadMessage
      3 -> InvalidSignature
      4 -> OtherErrors
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SignatureValidationResult>
      {
    public fun setValue(newValue: SignatureValidationResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SignatureValidationResult =
        SignatureValidationResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SignatureValidationResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SignatureValidationResult =
        SignatureValidationResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: SignatureValidationResult): Int = obj.value
  }
}
