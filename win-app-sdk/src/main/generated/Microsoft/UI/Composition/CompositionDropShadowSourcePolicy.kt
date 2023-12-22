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

@ABIMarker(CompositionDropShadowSourcePolicy.ABI::class)
@Signature("enum(Microsoft.UI.Composition.CompositionDropShadowSourcePolicy;i4)")
@WinRTByReference(brClass = CompositionDropShadowSourcePolicy.ByReference::class)
public enum class CompositionDropShadowSourcePolicy(
  public val value: Int
) : NativeMapped {
  Default(0),
  InheritFromVisualContent(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionDropShadowSourcePolicy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> InheritFromVisualContent
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionDropShadowSourcePolicy> {
    public fun setValue(newValue: CompositionDropShadowSourcePolicy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionDropShadowSourcePolicy =
        CompositionDropShadowSourcePolicy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionDropShadowSourcePolicy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionDropShadowSourcePolicy =
        CompositionDropShadowSourcePolicy.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionDropShadowSourcePolicy): Int = obj.value
  }
}
