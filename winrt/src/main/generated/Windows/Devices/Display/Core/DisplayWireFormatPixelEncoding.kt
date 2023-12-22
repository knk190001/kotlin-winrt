package Windows.Devices.Display.Core

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

@ABIMarker(DisplayWireFormatPixelEncoding.ABI::class)
@Signature("enum(Windows.Devices.Display.Core.DisplayWireFormatPixelEncoding;i4)")
@WinRTByReference(brClass = DisplayWireFormatPixelEncoding.ByReference::class)
public enum class DisplayWireFormatPixelEncoding(
  public val value: Int
) : NativeMapped {
  Rgb444(0),
  Ycc444(1),
  Ycc422(2),
  Ycc420(3),
  Intensity(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayWireFormatPixelEncoding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Rgb444
      1 -> Ycc444
      2 -> Ycc422
      3 -> Ycc420
      4 -> Intensity
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayWireFormatPixelEncoding> {
    public fun setValue(newValue: DisplayWireFormatPixelEncoding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayWireFormatPixelEncoding =
        DisplayWireFormatPixelEncoding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayWireFormatPixelEncoding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayWireFormatPixelEncoding =
        DisplayWireFormatPixelEncoding.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayWireFormatPixelEncoding): Int = obj.value
  }
}
