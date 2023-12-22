package Windows.Storage.Compression

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

@ABIMarker(CompressAlgorithm.ABI::class)
@Signature("enum(Windows.Storage.Compression.CompressAlgorithm;i4)")
@WinRTByReference(brClass = CompressAlgorithm.ByReference::class)
public enum class CompressAlgorithm(
  public val value: Int
) : NativeMapped {
  InvalidAlgorithm(0),
  NullAlgorithm(1),
  Mszip(2),
  Xpress(3),
  XpressHuff(4),
  Lzms(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompressAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> InvalidAlgorithm
      1 -> NullAlgorithm
      2 -> Mszip
      3 -> Xpress
      4 -> XpressHuff
      5 -> Lzms
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompressAlgorithm> {
    public fun setValue(newValue: CompressAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompressAlgorithm =
        CompressAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompressAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompressAlgorithm =
        CompressAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompressAlgorithm): Int = obj.value
  }
}
