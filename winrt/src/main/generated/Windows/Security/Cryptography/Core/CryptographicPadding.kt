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

@ABIMarker(CryptographicPadding.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Core.CryptographicPadding;i4)")
@WinRTByReference(brClass = CryptographicPadding.ByReference::class)
public enum class CryptographicPadding(
  public val value: Int
) : NativeMapped {
  None(0),
  RsaOaep(1),
  RsaPkcs1V15(2),
  RsaPss(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CryptographicPadding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> RsaOaep
      2 -> RsaPkcs1V15
      3 -> RsaPss
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CryptographicPadding> {
    public fun setValue(newValue: CryptographicPadding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CryptographicPadding =
        CryptographicPadding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CryptographicPadding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CryptographicPadding =
        CryptographicPadding.values()[0].fromNative(value, null)

    public override fun toNative(obj: CryptographicPadding): Int = obj.value
  }
}
