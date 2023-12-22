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

@ABIMarker(ClickMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.ClickMode;i4)")
@WinRTByReference(brClass = ClickMode.ByReference::class)
public enum class ClickMode(
  public val value: Int
) : NativeMapped {
  Release(0),
  Press(1),
  Hover(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): ClickMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Release
      1 -> Press
      2 -> Hover
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ClickMode> {
    public fun setValue(newValue: ClickMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ClickMode =
        ClickMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ClickMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ClickMode =
        ClickMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ClickMode): Int = obj.value
  }
}
