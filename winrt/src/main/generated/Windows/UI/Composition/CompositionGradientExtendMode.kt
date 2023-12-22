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

@ABIMarker(CompositionGradientExtendMode.ABI::class)
@Signature("enum(Windows.UI.Composition.CompositionGradientExtendMode;i4)")
@WinRTByReference(brClass = CompositionGradientExtendMode.ByReference::class)
public enum class CompositionGradientExtendMode(
  public val value: Int
) : NativeMapped {
  Clamp(0),
  Wrap(1),
  Mirror(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionGradientExtendMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Clamp
      1 -> Wrap
      2 -> Mirror
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionGradientExtendMode> {
    public fun setValue(newValue: CompositionGradientExtendMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionGradientExtendMode =
        CompositionGradientExtendMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionGradientExtendMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionGradientExtendMode =
        CompositionGradientExtendMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionGradientExtendMode): Int = obj.value
  }
}
