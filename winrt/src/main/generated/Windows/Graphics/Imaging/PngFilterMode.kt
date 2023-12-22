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

@ABIMarker(PngFilterMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.PngFilterMode;i4)")
@WinRTByReference(brClass = PngFilterMode.ByReference::class)
public enum class PngFilterMode(
  public val value: Int
) : NativeMapped {
  Automatic(0),
  None(1),
  Sub(2),
  Up(3),
  Average(4),
  Paeth(5),
  Adaptive(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PngFilterMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Automatic
      1 -> None
      2 -> Sub
      3 -> Up
      4 -> Average
      5 -> Paeth
      6 -> Adaptive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PngFilterMode> {
    public fun setValue(newValue: PngFilterMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PngFilterMode =
        PngFilterMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PngFilterMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PngFilterMode =
        PngFilterMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PngFilterMode): Int = obj.value
  }
}
