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

@ABIMarker(Capi1KdfTargetAlgorithm.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm;i4)")
@WinRTByReference(brClass = Capi1KdfTargetAlgorithm.ByReference::class)
public enum class Capi1KdfTargetAlgorithm(
  public val value: Int
) : NativeMapped {
  NotAes(0),
  Aes(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      Capi1KdfTargetAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotAes
      1 -> Aes
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<Capi1KdfTargetAlgorithm> {
    public fun setValue(newValue: Capi1KdfTargetAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): Capi1KdfTargetAlgorithm =
        Capi1KdfTargetAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<Capi1KdfTargetAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): Capi1KdfTargetAlgorithm =
        Capi1KdfTargetAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: Capi1KdfTargetAlgorithm): Int = obj.value
  }
}
