package Windows.Devices.Scanners

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

@ABIMarker(ImageScannerAutoCroppingMode.ABI::class)
@Signature("enum(Windows.Devices.Scanners.ImageScannerAutoCroppingMode;i4)")
@WinRTByReference(brClass = ImageScannerAutoCroppingMode.ByReference::class)
public enum class ImageScannerAutoCroppingMode(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  SingleRegion(1),
  MultipleRegion(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ImageScannerAutoCroppingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> SingleRegion
      2 -> MultipleRegion
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ImageScannerAutoCroppingMode> {
    public fun setValue(newValue: ImageScannerAutoCroppingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ImageScannerAutoCroppingMode =
        ImageScannerAutoCroppingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ImageScannerAutoCroppingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ImageScannerAutoCroppingMode =
        ImageScannerAutoCroppingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: ImageScannerAutoCroppingMode): Int = obj.value
  }
}
