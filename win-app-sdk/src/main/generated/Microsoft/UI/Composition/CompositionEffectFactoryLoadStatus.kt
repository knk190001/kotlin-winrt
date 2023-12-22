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

@ABIMarker(CompositionEffectFactoryLoadStatus.ABI::class)
@Signature("enum(Microsoft.UI.Composition.CompositionEffectFactoryLoadStatus;i4)")
@WinRTByReference(brClass = CompositionEffectFactoryLoadStatus.ByReference::class)
public enum class CompositionEffectFactoryLoadStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  EffectTooComplex(1),
  Pending(2),
  Other(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionEffectFactoryLoadStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> EffectTooComplex
      2 -> Pending
      -1 -> Other
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CompositionEffectFactoryLoadStatus> {
    public fun setValue(newValue: CompositionEffectFactoryLoadStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionEffectFactoryLoadStatus =
        CompositionEffectFactoryLoadStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionEffectFactoryLoadStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionEffectFactoryLoadStatus =
        CompositionEffectFactoryLoadStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionEffectFactoryLoadStatus): Int = obj.value
  }
}
