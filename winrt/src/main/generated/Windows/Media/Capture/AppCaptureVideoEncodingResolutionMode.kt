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

@ABIMarker(AppCaptureVideoEncodingResolutionMode.ABI::class)
@Signature("enum(Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode;i4)")
@WinRTByReference(brClass = AppCaptureVideoEncodingResolutionMode.ByReference::class)
public enum class AppCaptureVideoEncodingResolutionMode(
  public val value: Int
) : NativeMapped {
  Custom(0),
  High(1),
  Standard(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppCaptureVideoEncodingResolutionMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Custom
      1 -> High
      2 -> Standard
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppCaptureVideoEncodingResolutionMode> {
    public fun setValue(newValue: AppCaptureVideoEncodingResolutionMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppCaptureVideoEncodingResolutionMode =
        AppCaptureVideoEncodingResolutionMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppCaptureVideoEncodingResolutionMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppCaptureVideoEncodingResolutionMode =
        AppCaptureVideoEncodingResolutionMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppCaptureVideoEncodingResolutionMode): Int = obj.value
  }
}
