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

@ABIMarker(CompositionMappingMode.ABI::class)
@Signature("enum(Microsoft.UI.Composition.CompositionMappingMode;i4)")
@WinRTByReference(brClass = CompositionMappingMode.ByReference::class)
public enum class CompositionMappingMode(
  public val value: Int
) : NativeMapped {
  Absolute(0),
  Relative(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionMappingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Absolute
      1 -> Relative
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompositionMappingMode> {
    public fun setValue(newValue: CompositionMappingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionMappingMode =
        CompositionMappingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionMappingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionMappingMode =
        CompositionMappingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionMappingMode): Int = obj.value
  }
}
