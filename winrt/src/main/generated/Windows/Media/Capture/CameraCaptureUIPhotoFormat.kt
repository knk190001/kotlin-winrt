package Windows.Media.Capture

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

@ABIMarker(CameraCaptureUIPhotoFormat.ABI::class)
@Signature("enum(Windows.Media.Capture.CameraCaptureUIPhotoFormat;i4)")
@WinRTByReference(brClass = CameraCaptureUIPhotoFormat.ByReference::class)
public enum class CameraCaptureUIPhotoFormat(
  public val value: Int
) : NativeMapped {
  Jpeg(0),
  Png(1),
  JpegXR(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CameraCaptureUIPhotoFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Jpeg
      1 -> Png
      2 -> JpegXR
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CameraCaptureUIPhotoFormat> {
    public fun setValue(newValue: CameraCaptureUIPhotoFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CameraCaptureUIPhotoFormat =
        CameraCaptureUIPhotoFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CameraCaptureUIPhotoFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CameraCaptureUIPhotoFormat =
        CameraCaptureUIPhotoFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: CameraCaptureUIPhotoFormat): Int = obj.value
  }
}
