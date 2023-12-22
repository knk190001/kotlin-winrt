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

@ABIMarker(KeyProtectionLevel.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.KeyProtectionLevel;i4)")
@WinRTByReference(brClass = KeyProtectionLevel.ByReference::class)
public enum class KeyProtectionLevel(
  public val value: Int
) : NativeMapped {
  NoConsent(0),
  ConsentOnly(1),
  ConsentWithPassword(2),
  ConsentWithFingerprint(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KeyProtectionLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoConsent
      1 -> ConsentOnly
      2 -> ConsentWithPassword
      3 -> ConsentWithFingerprint
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KeyProtectionLevel> {
    public fun setValue(newValue: KeyProtectionLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KeyProtectionLevel =
        KeyProtectionLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KeyProtectionLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KeyProtectionLevel =
        KeyProtectionLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: KeyProtectionLevel): Int = obj.value
  }
}
