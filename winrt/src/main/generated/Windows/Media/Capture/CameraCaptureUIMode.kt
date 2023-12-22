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

@ABIMarker(CameraCaptureUIMode.ABI::class)
@Signature("enum(Windows.Media.Capture.CameraCaptureUIMode;i4)")
@WinRTByReference(brClass = CameraCaptureUIMode.ByReference::class)
public enum class CameraCaptureUIMode(
  public val value: Int
) : NativeMapped {
  PhotoOrVideo(0),
  Photo(1),
  Video(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CameraCaptureUIMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PhotoOrVideo
      1 -> Photo
      2 -> Video
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CameraCaptureUIMode> {
    public fun setValue(newValue: CameraCaptureUIMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CameraCaptureUIMode =
        CameraCaptureUIMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CameraCaptureUIMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CameraCaptureUIMode =
        CameraCaptureUIMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CameraCaptureUIMode): Int = obj.value
  }
}
