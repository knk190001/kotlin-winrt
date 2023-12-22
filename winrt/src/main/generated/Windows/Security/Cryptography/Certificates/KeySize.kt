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

@ABIMarker(KeySize.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.KeySize;i4)")
@WinRTByReference(brClass = KeySize.ByReference::class)
public enum class KeySize(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  Rsa2048(2048),
  Rsa4096(4096),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): KeySize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      2048 -> Rsa2048
      4096 -> Rsa4096
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KeySize> {
    public fun setValue(newValue: KeySize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KeySize = KeySize.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<KeySize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KeySize =
        KeySize.values()[0].fromNative(value, null)

    public override fun toNative(obj: KeySize): Int = obj.value
  }
}
