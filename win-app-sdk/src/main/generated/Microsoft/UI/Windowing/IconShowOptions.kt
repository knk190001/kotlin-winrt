package Microsoft.UI.Windowing

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

@ABIMarker(IconShowOptions.ABI::class)
@Signature("enum(Microsoft.UI.Windowing.IconShowOptions;i4)")
@WinRTByReference(brClass = IconShowOptions.ByReference::class)
public enum class IconShowOptions(
  public val value: Int
) : NativeMapped {
  ShowIconAndSystemMenu(0),
  HideIconAndSystemMenu(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IconShowOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ShowIconAndSystemMenu
      1 -> HideIconAndSystemMenu
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IconShowOptions> {
    public fun setValue(newValue: IconShowOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IconShowOptions =
        IconShowOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IconShowOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IconShowOptions =
        IconShowOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: IconShowOptions): Int = obj.value
  }
}
