package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapInteractionMode.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapInteractionMode;i4)")
@WinRTByReference(brClass = MapInteractionMode.ByReference::class)
public enum class MapInteractionMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Disabled(1),
  GestureOnly(2),
  PointerAndKeyboard(2),
  ControlOnly(3),
  GestureAndControl(4),
  PointerKeyboardAndControl(4),
  PointerOnly(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapInteractionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Disabled
      2 -> GestureOnly
      2 -> PointerAndKeyboard
      3 -> ControlOnly
      4 -> GestureAndControl
      4 -> PointerKeyboardAndControl
      5 -> PointerOnly
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapInteractionMode> {
    public fun setValue(newValue: MapInteractionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapInteractionMode =
        MapInteractionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapInteractionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapInteractionMode =
        MapInteractionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapInteractionMode): Int = obj.value
  }
}
