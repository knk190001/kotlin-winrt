package Windows.UI.Core.AnimationMetrics

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

@ABIMarker(PropertyAnimationType.ABI::class)
@Signature("enum(Windows.UI.Core.AnimationMetrics.PropertyAnimationType;i4)")
@WinRTByReference(brClass = PropertyAnimationType.ByReference::class)
public enum class PropertyAnimationType(
  public val value: Int
) : NativeMapped {
  Scale(0),
  Translation(1),
  Opacity(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PropertyAnimationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Scale
      1 -> Translation
      2 -> Opacity
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PropertyAnimationType> {
    public fun setValue(newValue: PropertyAnimationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PropertyAnimationType =
        PropertyAnimationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PropertyAnimationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PropertyAnimationType =
        PropertyAnimationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PropertyAnimationType): Int = obj.value
  }
}
