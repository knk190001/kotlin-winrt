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

@ABIMarker(AltitudeReferenceSystem.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.AltitudeReferenceSystem;i4)")
@WinRTByReference(brClass = AltitudeReferenceSystem.ByReference::class)
public enum class AltitudeReferenceSystem(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Terrain(1),
  Ellipsoid(2),
  Geoid(3),
  Surface(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AltitudeReferenceSystem {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Terrain
      2 -> Ellipsoid
      3 -> Geoid
      4 -> Surface
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AltitudeReferenceSystem> {
    public fun setValue(newValue: AltitudeReferenceSystem): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AltitudeReferenceSystem =
        AltitudeReferenceSystem.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AltitudeReferenceSystem, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AltitudeReferenceSystem =
        AltitudeReferenceSystem.values()[0].fromNative(value, null)

    public override fun toNative(obj: AltitudeReferenceSystem): Int = obj.value
  }
}
