package Windows.Devices.Geolocation

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

@ABIMarker(GeoshapeType.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.GeoshapeType;i4)")
@WinRTByReference(brClass = GeoshapeType.ByReference::class)
public enum class GeoshapeType(
  public val value: Int
) : NativeMapped {
  Geopoint(0),
  Geocircle(1),
  Geopath(2),
  GeoboundingBox(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GeoshapeType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Geopoint
      1 -> Geocircle
      2 -> Geopath
      3 -> GeoboundingBox
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GeoshapeType> {
    public fun setValue(newValue: GeoshapeType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GeoshapeType =
        GeoshapeType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GeoshapeType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GeoshapeType =
        GeoshapeType.values()[0].fromNative(value, null)

    public override fun toNative(obj: GeoshapeType): Int = obj.value
  }
}
