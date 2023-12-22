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

@ABIMarker(PenLineJoin.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.PenLineJoin;i4)")
@WinRTByReference(brClass = PenLineJoin.ByReference::class)
public enum class PenLineJoin(
  public val value: Int
) : NativeMapped {
  Miter(0),
  Bevel(1),
  Round(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PenLineJoin {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Miter
      1 -> Bevel
      2 -> Round
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PenLineJoin> {
    public fun setValue(newValue: PenLineJoin): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PenLineJoin =
        PenLineJoin.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PenLineJoin, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PenLineJoin =
        PenLineJoin.values()[0].fromNative(value, null)

    public override fun toNative(obj: PenLineJoin): Int = obj.value
  }
}
