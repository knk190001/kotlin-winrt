package Windows.UI.Composition

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

@ABIMarker(CompositionStrokeLineJoin.ABI::class)
@Signature("enum(Windows.UI.Composition.CompositionStrokeLineJoin;i4)")
@WinRTByReference(brClass = CompositionStrokeLineJoin.ByReference::class)
public enum class CompositionStrokeLineJoin(
  public val value: Int
) : NativeMapped {
  Miter(0),
  Bevel(1),
  Round(2),
  MiterOrBevel(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionStrokeLineJoin {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Miter
      1 -> Bevel
      2 -> Round
      3 -> MiterOrBevel
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompositionStrokeLineJoin>
      {
    public fun setValue(newValue: CompositionStrokeLineJoin): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionStrokeLineJoin =
        CompositionStrokeLineJoin.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionStrokeLineJoin, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionStrokeLineJoin =
        CompositionStrokeLineJoin.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionStrokeLineJoin): Int = obj.value
  }
}
