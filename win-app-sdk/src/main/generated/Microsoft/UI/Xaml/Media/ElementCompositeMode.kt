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

@ABIMarker(ElementCompositeMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Media.ElementCompositeMode;i4)")
@WinRTByReference(brClass = ElementCompositeMode.ByReference::class)
public enum class ElementCompositeMode(
  public val value: Int
) : NativeMapped {
  Inherit(0),
  SourceOver(1),
  MinBlend(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ElementCompositeMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Inherit
      1 -> SourceOver
      2 -> MinBlend
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ElementCompositeMode> {
    public fun setValue(newValue: ElementCompositeMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ElementCompositeMode =
        ElementCompositeMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ElementCompositeMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ElementCompositeMode =
        ElementCompositeMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ElementCompositeMode): Int = obj.value
  }
}
