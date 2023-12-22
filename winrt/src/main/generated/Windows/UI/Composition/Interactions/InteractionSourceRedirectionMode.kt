package Windows.UI.Composition.Interactions

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

@ABIMarker(InteractionSourceRedirectionMode.ABI::class)
@Signature("enum(Windows.UI.Composition.Interactions.InteractionSourceRedirectionMode;i4)")
@WinRTByReference(brClass = InteractionSourceRedirectionMode.ByReference::class)
public enum class InteractionSourceRedirectionMode(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  Enabled(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InteractionSourceRedirectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> Enabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InteractionSourceRedirectionMode> {
    public fun setValue(newValue: InteractionSourceRedirectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InteractionSourceRedirectionMode =
        InteractionSourceRedirectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InteractionSourceRedirectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InteractionSourceRedirectionMode =
        InteractionSourceRedirectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: InteractionSourceRedirectionMode): Int = obj.value
  }
}
