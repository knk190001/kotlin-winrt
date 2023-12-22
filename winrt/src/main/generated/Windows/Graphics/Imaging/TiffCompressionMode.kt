package Windows.Graphics.Imaging

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

@ABIMarker(TiffCompressionMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.TiffCompressionMode;i4)")
@WinRTByReference(brClass = TiffCompressionMode.ByReference::class)
public enum class TiffCompressionMode(
  public val value: Int
) : NativeMapped {
  Automatic(0),
  None(1),
  Ccitt3(2),
  Ccitt4(3),
  Lzw(4),
  Rle(5),
  Zip(6),
  LzwhDifferencing(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TiffCompressionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Automatic
      1 -> None
      2 -> Ccitt3
      3 -> Ccitt4
      4 -> Lzw
      5 -> Rle
      6 -> Zip
      7 -> LzwhDifferencing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TiffCompressionMode> {
    public fun setValue(newValue: TiffCompressionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TiffCompressionMode =
        TiffCompressionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TiffCompressionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TiffCompressionMode =
        TiffCompressionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: TiffCompressionMode): Int = obj.value
  }
}
