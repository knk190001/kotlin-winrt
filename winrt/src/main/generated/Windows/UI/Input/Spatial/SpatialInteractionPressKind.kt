package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionPressKind.ABI::class)
@Signature("enum(Windows.UI.Input.Spatial.SpatialInteractionPressKind;i4)")
@WinRTByReference(brClass = SpatialInteractionPressKind.ByReference::class)
public enum class SpatialInteractionPressKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Select(1),
  Menu(2),
  Grasp(3),
  Touchpad(4),
  Thumbstick(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SpatialInteractionPressKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Select
      2 -> Menu
      3 -> Grasp
      4 -> Touchpad
      5 -> Thumbstick
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SpatialInteractionPressKind> {
    public fun setValue(newValue: SpatialInteractionPressKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SpatialInteractionPressKind =
        SpatialInteractionPressKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SpatialInteractionPressKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SpatialInteractionPressKind =
        SpatialInteractionPressKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: SpatialInteractionPressKind): Int = obj.value
  }
}
