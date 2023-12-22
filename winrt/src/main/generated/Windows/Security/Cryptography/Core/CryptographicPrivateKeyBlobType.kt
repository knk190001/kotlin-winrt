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

@ABIMarker(CryptographicPrivateKeyBlobType.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Core.CryptographicPrivateKeyBlobType;i4)")
@WinRTByReference(brClass = CryptographicPrivateKeyBlobType.ByReference::class)
public enum class CryptographicPrivateKeyBlobType(
  public val value: Int
) : NativeMapped {
  Pkcs8RawPrivateKeyInfo(0),
  Pkcs1RsaPrivateKey(1),
  BCryptPrivateKey(2),
  Capi1PrivateKey(3),
  BCryptEccFullPrivateKey(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CryptographicPrivateKeyBlobType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pkcs8RawPrivateKeyInfo
      1 -> Pkcs1RsaPrivateKey
      2 -> BCryptPrivateKey
      3 -> Capi1PrivateKey
      4 -> BCryptEccFullPrivateKey
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CryptographicPrivateKeyBlobType> {
    public fun setValue(newValue: CryptographicPrivateKeyBlobType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CryptographicPrivateKeyBlobType =
        CryptographicPrivateKeyBlobType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CryptographicPrivateKeyBlobType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CryptographicPrivateKeyBlobType =
        CryptographicPrivateKeyBlobType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CryptographicPrivateKeyBlobType): Int = obj.value
  }
}
