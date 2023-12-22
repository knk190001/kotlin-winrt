package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadyEncryptionAlgorithm.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.PlayReadyEncryptionAlgorithm;i4)")
@WinRTByReference(brClass = PlayReadyEncryptionAlgorithm.ByReference::class)
public enum class PlayReadyEncryptionAlgorithm(
  public val value: Int
) : NativeMapped {
  Unprotected(0),
  Aes128Ctr(1),
  Cocktail(4),
  Aes128Cbc(5),
  Unspecified(65535),
  Uninitialized(2147483647),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlayReadyEncryptionAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unprotected
      1 -> Aes128Ctr
      4 -> Cocktail
      5 -> Aes128Cbc
      65535 -> Unspecified
      2147483647 -> Uninitialized
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PlayReadyEncryptionAlgorithm> {
    public fun setValue(newValue: PlayReadyEncryptionAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlayReadyEncryptionAlgorithm =
        PlayReadyEncryptionAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlayReadyEncryptionAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlayReadyEncryptionAlgorithm =
        PlayReadyEncryptionAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlayReadyEncryptionAlgorithm): Int = obj.value
  }
}
