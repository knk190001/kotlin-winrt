package Microsoft.UI.Xaml.Media

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

@ABIMarker(PenLineCap.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.PenLineCap;i4)")
@WinRTByReference(brClass = PenLineCap.ByReference::class)
public enum class PenLineCap(
  public val value: Int
) : NativeMapped {
  Flat(0),
  Square(1),
  Round(2),
  Triangle(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PenLineCap {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Flat
      1 -> Square
      2 -> Round
      3 -> Triangle
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PenLineCap> {
    public fun setValue(newValue: PenLineCap): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PenLineCap =
        PenLineCap.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PenLineCap, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PenLineCap =
        PenLineCap.values()[0].fromNative(value, null)

    public override fun toNative(obj: PenLineCap): Int = obj.value
  }
}
