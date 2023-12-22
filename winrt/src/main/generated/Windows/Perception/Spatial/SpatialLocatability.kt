package Windows.Perception.Spatial

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

@ABIMarker(SpatialLocatability.ABI::class)
@Signature("enum(Windows.Perception.Spatial.SpatialLocatability;i4)")
@WinRTByReference(brClass = SpatialLocatability.ByReference::class)
public enum class SpatialLocatability(
  public val value: Int
) : NativeMapped {
  Unavailable(0),
  OrientationOnly(1),
  PositionalTrackingActivating(2),
  PositionalTrackingActive(3),
  PositionalTrackingInhibited(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpatialLocatability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unavailable
      1 -> OrientationOnly
      2 -> PositionalTrackingActivating
      3 -> PositionalTrackingActive
      4 -> PositionalTrackingInhibited
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SpatialLocatability> {
    public fun setValue(newValue: SpatialLocatability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpatialLocatability =
        SpatialLocatability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpatialLocatability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpatialLocatability =
        SpatialLocatability.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpatialLocatability): Int = obj.value
  }
}
