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

@ABIMarker(VisualInteractionSourceRedirectionMode.ABI::class)
@Signature("enum(Windows.UI.Composition.Interactions.VisualInteractionSourceRedirectionMode;i4)")
@WinRTByReference(brClass = VisualInteractionSourceRedirectionMode.ByReference::class)
public enum class VisualInteractionSourceRedirectionMode(
  public val value: Int
) : NativeMapped {
  Off(0),
  CapableTouchpadOnly(1),
  PointerWheelOnly(2),
  CapableTouchpadAndPointerWheel(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VisualInteractionSourceRedirectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> CapableTouchpadOnly
      2 -> PointerWheelOnly
      3 -> CapableTouchpadAndPointerWheel
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VisualInteractionSourceRedirectionMode> {
    public fun setValue(newValue: VisualInteractionSourceRedirectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VisualInteractionSourceRedirectionMode =
        VisualInteractionSourceRedirectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VisualInteractionSourceRedirectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VisualInteractionSourceRedirectionMode =
        VisualInteractionSourceRedirectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: VisualInteractionSourceRedirectionMode): Int = obj.value
  }
}
