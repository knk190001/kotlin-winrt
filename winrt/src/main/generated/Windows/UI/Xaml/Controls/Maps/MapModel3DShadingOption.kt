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

@ABIMarker(MapModel3DShadingOption.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapModel3DShadingOption;i4)")
@WinRTByReference(brClass = MapModel3DShadingOption.ByReference::class)
public enum class MapModel3DShadingOption(
  public val value: Int
) : NativeMapped {
  Default(0),
  Flat(1),
  Smooth(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapModel3DShadingOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Flat
      2 -> Smooth
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapModel3DShadingOption> {
    public fun setValue(newValue: MapModel3DShadingOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapModel3DShadingOption =
        MapModel3DShadingOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapModel3DShadingOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapModel3DShadingOption =
        MapModel3DShadingOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapModel3DShadingOption): Int = obj.value
  }
}
