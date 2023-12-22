package Microsoft.Graphics.Display

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

@ABIMarker(DisplayOrientation.ABI::class)
@Signature("enum(Microsoft.Graphics.Display.DisplayOrientation;i4)")
@WinRTByReference(brClass = DisplayOrientation.ByReference::class)
public enum class DisplayOrientation(
  public val value: Int
) : NativeMapped {
  RotateNone(0),
  Rotate90Degrees(90),
  Rotate180Degrees(180),
  Rotate270Degrees(270),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayOrientation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RotateNone
      90 -> Rotate90Degrees
      180 -> Rotate180Degrees
      270 -> Rotate270Degrees
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DisplayOrientation> {
    public fun setValue(newValue: DisplayOrientation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayOrientation =
        DisplayOrientation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayOrientation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayOrientation =
        DisplayOrientation.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayOrientation): Int = obj.value
  }
}
