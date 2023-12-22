package Microsoft.UI.Xaml.Controls

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

@ABIMarker(LightDismissOverlayMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.LightDismissOverlayMode;i4)")
@WinRTByReference(brClass = LightDismissOverlayMode.ByReference::class)
public enum class LightDismissOverlayMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  On(1),
  Off(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LightDismissOverlayMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> On
      2 -> Off
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LightDismissOverlayMode> {
    public fun setValue(newValue: LightDismissOverlayMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LightDismissOverlayMode =
        LightDismissOverlayMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LightDismissOverlayMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LightDismissOverlayMode =
        LightDismissOverlayMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: LightDismissOverlayMode): Int = obj.value
  }
}
