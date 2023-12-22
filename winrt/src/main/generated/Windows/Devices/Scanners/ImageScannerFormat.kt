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

@ABIMarker(ImageScannerFormat.ABI::class)
@Signature("enum(Windows.Devices.Scanners.ImageScannerFormat;i4)")
@WinRTByReference(brClass = ImageScannerFormat.ByReference::class)
public enum class ImageScannerFormat(
  public val value: Int
) : NativeMapped {
  Jpeg(0),
  Png(1),
  DeviceIndependentBitmap(2),
  Tiff(3),
  Xps(4),
  OpenXps(5),
  Pdf(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ImageScannerFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Jpeg
      1 -> Png
      2 -> DeviceIndependentBitmap
      3 -> Tiff
      4 -> Xps
      5 -> OpenXps
      6 -> Pdf
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ImageScannerFormat> {
    public fun setValue(newValue: ImageScannerFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ImageScannerFormat =
        ImageScannerFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ImageScannerFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ImageScannerFormat =
        ImageScannerFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: ImageScannerFormat): Int = obj.value
  }
}
