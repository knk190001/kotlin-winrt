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

@ABIMarker(HolographicViewConfigurationKind.ABI::class)
@Signature("enum(Windows.Graphics.Holographic.HolographicViewConfigurationKind;i4)")
@WinRTByReference(brClass = HolographicViewConfigurationKind.ByReference::class)
public enum class HolographicViewConfigurationKind(
  public val value: Int
) : NativeMapped {
  Display(0),
  PhotoVideoCamera(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HolographicViewConfigurationKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Display
      1 -> PhotoVideoCamera
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HolographicViewConfigurationKind> {
    public fun setValue(newValue: HolographicViewConfigurationKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HolographicViewConfigurationKind =
        HolographicViewConfigurationKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HolographicViewConfigurationKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HolographicViewConfigurationKind =
        HolographicViewConfigurationKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: HolographicViewConfigurationKind): Int = obj.value
  }
}
