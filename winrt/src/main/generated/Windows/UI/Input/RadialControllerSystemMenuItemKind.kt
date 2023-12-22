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

@ABIMarker(RadialControllerSystemMenuItemKind.ABI::class)
@Signature("enum(Windows.UI.Input.RadialControllerSystemMenuItemKind;i4)")
@WinRTByReference(brClass = RadialControllerSystemMenuItemKind.ByReference::class)
public enum class RadialControllerSystemMenuItemKind(
  public val value: Int
) : NativeMapped {
  Scroll(0),
  Zoom(1),
  UndoRedo(2),
  Volume(3),
  NextPreviousTrack(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RadialControllerSystemMenuItemKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Scroll
      1 -> Zoom
      2 -> UndoRedo
      3 -> Volume
      4 -> NextPreviousTrack
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RadialControllerSystemMenuItemKind> {
    public fun setValue(newValue: RadialControllerSystemMenuItemKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RadialControllerSystemMenuItemKind =
        RadialControllerSystemMenuItemKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RadialControllerSystemMenuItemKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RadialControllerSystemMenuItemKind =
        RadialControllerSystemMenuItemKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: RadialControllerSystemMenuItemKind): Int = obj.value
  }
}
