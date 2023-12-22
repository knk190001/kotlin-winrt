package Microsoft.UI.Composition

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

@ABIMarker(CompositionEasingFunctionMode.ABI::class)
@Signature("enum(Microsoft.UI.Composition.CompositionEasingFunctionMode;i4)")
@WinRTByReference(brClass = CompositionEasingFunctionMode.ByReference::class)
public enum class CompositionEasingFunctionMode(
  public val value: Int
) : NativeMapped {
  In(0),
  Out(1),
  InOut(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionEasingFunctionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> In
      1 -> Out
      2 -> InOut
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionEasingFunctionMode> {
    public fun setValue(newValue: CompositionEasingFunctionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionEasingFunctionMode =
        CompositionEasingFunctionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionEasingFunctionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionEasingFunctionMode =
        CompositionEasingFunctionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionEasingFunctionMode): Int = obj.value
  }
}
