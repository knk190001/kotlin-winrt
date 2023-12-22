package Windows.Graphics.Display.Core

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

@ABIMarker(HdmiDisplayPixelEncoding.ABI::class)
@Signature("enum(Windows.Graphics.Display.Core.HdmiDisplayPixelEncoding;i4)")
@WinRTByReference(brClass = HdmiDisplayPixelEncoding.ByReference::class)
public enum class HdmiDisplayPixelEncoding(
  public val value: Int
) : NativeMapped {
  Rgb444(0),
  Ycc444(1),
  Ycc422(2),
  Ycc420(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HdmiDisplayPixelEncoding {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Rgb444
      1 -> Ycc444
      2 -> Ycc422
      3 -> Ycc420
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HdmiDisplayPixelEncoding>
      {
    public fun setValue(newValue: HdmiDisplayPixelEncoding): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HdmiDisplayPixelEncoding =
        HdmiDisplayPixelEncoding.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HdmiDisplayPixelEncoding, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HdmiDisplayPixelEncoding =
        HdmiDisplayPixelEncoding.values()[0].fromNative(value, null)

    public override fun toNative(obj: HdmiDisplayPixelEncoding): Int = obj.value
  }
}
