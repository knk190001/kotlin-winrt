package Windows.UI.Xaml.Media

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

@ABIMarker(FastPlayFallbackBehaviour.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.FastPlayFallbackBehaviour;i4)")
@WinRTByReference(brClass = FastPlayFallbackBehaviour.ByReference::class)
public enum class FastPlayFallbackBehaviour(
  public val value: Int
) : NativeMapped {
  Skip(0),
  Hide(1),
  Disable(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FastPlayFallbackBehaviour {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Skip
      1 -> Hide
      2 -> Disable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FastPlayFallbackBehaviour>
      {
    public fun setValue(newValue: FastPlayFallbackBehaviour): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FastPlayFallbackBehaviour =
        FastPlayFallbackBehaviour.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FastPlayFallbackBehaviour, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FastPlayFallbackBehaviour =
        FastPlayFallbackBehaviour.values()[0].fromNative(value, null)

    public override fun toNative(obj: FastPlayFallbackBehaviour): Int = obj.value
  }
}
