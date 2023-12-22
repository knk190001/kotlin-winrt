package Microsoft.UI.Composition.Diagnostics

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

@ABIMarker(CompositionDebugOverdrawContentKinds.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Diagnostics.CompositionDebugOverdrawContentKinds;u4)")
@WinRTByReference(brClass = CompositionDebugOverdrawContentKinds.ByReference::class)
public enum class CompositionDebugOverdrawContentKinds(
  public val value: Int
) : NativeMapped {
  None(0),
  OffscreenRendered(1),
  Colors(2),
  Effects(4),
  Shadows(8),
  Lights(16),
  Surfaces(32),
  SwapChains(64),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionDebugOverdrawContentKinds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> OffscreenRendered
      2 -> Colors
      4 -> Effects
      8 -> Shadows
      16 -> Lights
      32 -> Surfaces
      64 -> SwapChains
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionDebugOverdrawContentKinds> {
    public fun setValue(newValue: CompositionDebugOverdrawContentKinds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionDebugOverdrawContentKinds =
        CompositionDebugOverdrawContentKinds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionDebugOverdrawContentKinds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionDebugOverdrawContentKinds =
        CompositionDebugOverdrawContentKinds.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionDebugOverdrawContentKinds): Int = obj.value
  }
}
