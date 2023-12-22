package Windows.Security.Cryptography.Core

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

@ABIMarker(CryptographicPublicKeyBlobType.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType;i4)")
@WinRTByReference(brClass = CryptographicPublicKeyBlobType.ByReference::class)
public enum class CryptographicPublicKeyBlobType(
  public val value: Int
) : NativeMapped {
  X509SubjectPublicKeyInfo(0),
  Pkcs1RsaPublicKey(1),
  BCryptPublicKey(2),
  Capi1PublicKey(3),
  BCryptEccFullPublicKey(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CryptographicPublicKeyBlobType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> X509SubjectPublicKeyInfo
      1 -> Pkcs1RsaPublicKey
      2 -> BCryptPublicKey
      3 -> Capi1PublicKey
      4 -> BCryptEccFullPublicKey
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CryptographicPublicKeyBlobType> {
    public fun setValue(newValue: CryptographicPublicKeyBlobType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CryptographicPublicKeyBlobType =
        CryptographicPublicKeyBlobType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CryptographicPublicKeyBlobType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CryptographicPublicKeyBlobType =
        CryptographicPublicKeyBlobType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CryptographicPublicKeyBlobType): Int = obj.value
  }
}
