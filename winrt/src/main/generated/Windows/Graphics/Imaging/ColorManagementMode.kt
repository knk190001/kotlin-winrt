package Windows.Graphics.Imaging

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

@ABIMarker(ColorManagementMode.ABI::class)
@Signature("enum(Windows.Graphics.Imaging.ColorManagementMode;i4)")
@WinRTByReference(brClass = ColorManagementMode.ByReference::class)
public enum class ColorManagementMode(
  public val value: Int
) : NativeMapped {
  DoNotColorManage(0),
  ColorManageToSRgb(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ColorManagementMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DoNotColorManage
      1 -> ColorManageToSRgb
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ColorManagementMode> {
    public fun setValue(newValue: ColorManagementMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ColorManagementMode =
        ColorManagementMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ColorManagementMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ColorManagementMode =
        ColorManagementMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ColorManagementMode): Int = obj.value
  }
}
