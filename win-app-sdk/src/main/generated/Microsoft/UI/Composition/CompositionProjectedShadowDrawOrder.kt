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

@ABIMarker(CompositionProjectedShadowDrawOrder.ABI::class)
@Signature("enum(Microsoft.UI.Composition.CompositionProjectedShadowDrawOrder;i4)")
@WinRTByReference(brClass = CompositionProjectedShadowDrawOrder.ByReference::class)
public enum class CompositionProjectedShadowDrawOrder(
  public val value: Int
) : NativeMapped {
  PostChildren(0),
  PreChildren(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionProjectedShadowDrawOrder {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PostChildren
      1 -> PreChildren
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionProjectedShadowDrawOrder> {
    public fun setValue(newValue: CompositionProjectedShadowDrawOrder): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionProjectedShadowDrawOrder =
        CompositionProjectedShadowDrawOrder.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionProjectedShadowDrawOrder, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionProjectedShadowDrawOrder =
        CompositionProjectedShadowDrawOrder.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionProjectedShadowDrawOrder): Int = obj.value
  }
}
