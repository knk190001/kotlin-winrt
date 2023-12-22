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

@ABIMarker(CompositionCompositeMode.ABI::class)
@Signature("enum(Windows.UI.Composition.CompositionCompositeMode;i4)")
@WinRTByReference(brClass = CompositionCompositeMode.ByReference::class)
public enum class CompositionCompositeMode(
  public val value: Int
) : NativeMapped {
  Inherit(0),
  SourceOver(1),
  DestinationInvert(2),
  MinBlend(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionCompositeMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Inherit
      1 -> SourceOver
      2 -> DestinationInvert
      3 -> MinBlend
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompositionCompositeMode>
      {
    public fun setValue(newValue: CompositionCompositeMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionCompositeMode =
        CompositionCompositeMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionCompositeMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionCompositeMode =
        CompositionCompositeMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionCompositeMode): Int = obj.value
  }
}
