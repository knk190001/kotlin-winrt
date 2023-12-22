package Microsoft.UI.Composition.Interactions

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

@ABIMarker(InteractionBindingAxisModes.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Interactions.InteractionBindingAxisModes;u4)")
@WinRTByReference(brClass = InteractionBindingAxisModes.ByReference::class)
public enum class InteractionBindingAxisModes(
  public val value: Int
) : NativeMapped {
  None(0),
  PositionX(1),
  PositionY(2),
  Scale(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InteractionBindingAxisModes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> PositionX
      2 -> PositionY
      4 -> Scale
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InteractionBindingAxisModes> {
    public fun setValue(newValue: InteractionBindingAxisModes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InteractionBindingAxisModes =
        InteractionBindingAxisModes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InteractionBindingAxisModes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InteractionBindingAxisModes =
        InteractionBindingAxisModes.values()[0].fromNative(value, null)

    public override fun toNative(obj: InteractionBindingAxisModes): Int = obj.value
  }
}
