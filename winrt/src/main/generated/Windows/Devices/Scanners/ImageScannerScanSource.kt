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

@ABIMarker(ImageScannerScanSource.ABI::class)
@Signature("enum(Windows.Devices.Scanners.ImageScannerScanSource;i4)")
@WinRTByReference(brClass = ImageScannerScanSource.ByReference::class)
public enum class ImageScannerScanSource(
  public val value: Int
) : NativeMapped {
  Default(0),
  Flatbed(1),
  Feeder(2),
  AutoConfigured(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ImageScannerScanSource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Flatbed
      2 -> Feeder
      3 -> AutoConfigured
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ImageScannerScanSource> {
    public fun setValue(newValue: ImageScannerScanSource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ImageScannerScanSource =
        ImageScannerScanSource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ImageScannerScanSource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ImageScannerScanSource =
        ImageScannerScanSource.values()[0].fromNative(value, null)

    public override fun toNative(obj: ImageScannerScanSource): Int = obj.value
  }
}
