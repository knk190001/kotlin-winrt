package Windows.Graphics.Holographic

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

@ABIMarker(HolographicReprojectionMode.ABI::class)
@Signature("enum(Windows.Graphics.Holographic.HolographicReprojectionMode;i4)")
@WinRTByReference(brClass = HolographicReprojectionMode.ByReference::class)
public enum class HolographicReprojectionMode(
  public val value: Int
) : NativeMapped {
  PositionAndOrientation(0),
  OrientationOnly(1),
  Disabled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HolographicReprojectionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PositionAndOrientation
      1 -> OrientationOnly
      2 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HolographicReprojectionMode> {
    public fun setValue(newValue: HolographicReprojectionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HolographicReprojectionMode =
        HolographicReprojectionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HolographicReprojectionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HolographicReprojectionMode =
        HolographicReprojectionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: HolographicReprojectionMode): Int = obj.value
  }
}
