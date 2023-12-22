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

@ABIMarker(CameraCaptureUIVideoFormat.ABI::class)
@Signature("enum(Windows.Media.Capture.CameraCaptureUIVideoFormat;i4)")
@WinRTByReference(brClass = CameraCaptureUIVideoFormat.ByReference::class)
public enum class CameraCaptureUIVideoFormat(
  public val value: Int
) : NativeMapped {
  Mp4(0),
  Wmv(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CameraCaptureUIVideoFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Mp4
      1 -> Wmv
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CameraCaptureUIVideoFormat> {
    public fun setValue(newValue: CameraCaptureUIVideoFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CameraCaptureUIVideoFormat =
        CameraCaptureUIVideoFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CameraCaptureUIVideoFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CameraCaptureUIVideoFormat =
        CameraCaptureUIVideoFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: CameraCaptureUIVideoFormat): Int = obj.value
  }
}
