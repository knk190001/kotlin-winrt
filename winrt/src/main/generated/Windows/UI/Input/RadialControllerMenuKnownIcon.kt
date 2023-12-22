package Windows.UI.Input

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

@ABIMarker(RadialControllerMenuKnownIcon.ABI::class)
@Signature("enum(Windows.UI.Input.RadialControllerMenuKnownIcon;i4)")
@WinRTByReference(brClass = RadialControllerMenuKnownIcon.ByReference::class)
public enum class RadialControllerMenuKnownIcon(
  public val value: Int
) : NativeMapped {
  Scroll(0),
  Zoom(1),
  UndoRedo(2),
  Volume(3),
  NextPreviousTrack(4),
  Ruler(5),
  InkColor(6),
  InkThickness(7),
  PenType(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RadialControllerMenuKnownIcon {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Scroll
      1 -> Zoom
      2 -> UndoRedo
      3 -> Volume
      4 -> NextPreviousTrack
      5 -> Ruler
      6 -> InkColor
      7 -> InkThickness
      8 -> PenType
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RadialControllerMenuKnownIcon> {
    public fun setValue(newValue: RadialControllerMenuKnownIcon): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RadialControllerMenuKnownIcon =
        RadialControllerMenuKnownIcon.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RadialControllerMenuKnownIcon, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RadialControllerMenuKnownIcon =
        RadialControllerMenuKnownIcon.values()[0].fromNative(value, null)

    public override fun toNative(obj: RadialControllerMenuKnownIcon): Int = obj.value
  }
}
