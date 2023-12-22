package Windows.Services.Maps

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

@ABIMarker(MapLocationDesiredAccuracy.ABI::class)
@Signature("enum(Windows.Services.Maps.MapLocationDesiredAccuracy;i4)")
@WinRTByReference(brClass = MapLocationDesiredAccuracy.ByReference::class)
public enum class MapLocationDesiredAccuracy(
  public val value: Int
) : NativeMapped {
  High(0),
  Low(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapLocationDesiredAccuracy {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> High
      1 -> Low
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MapLocationDesiredAccuracy> {
    public fun setValue(newValue: MapLocationDesiredAccuracy): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapLocationDesiredAccuracy =
        MapLocationDesiredAccuracy.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapLocationDesiredAccuracy, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapLocationDesiredAccuracy =
        MapLocationDesiredAccuracy.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapLocationDesiredAccuracy): Int = obj.value
  }
}
