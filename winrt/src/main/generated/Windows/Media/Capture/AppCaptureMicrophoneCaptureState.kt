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

@ABIMarker(AppCaptureMicrophoneCaptureState.ABI::class)
@Signature("enum(Windows.Media.Capture.AppCaptureMicrophoneCaptureState;i4)")
@WinRTByReference(brClass = AppCaptureMicrophoneCaptureState.ByReference::class)
public enum class AppCaptureMicrophoneCaptureState(
  public val value: Int
) : NativeMapped {
  Stopped(0),
  Started(1),
  Failed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppCaptureMicrophoneCaptureState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Stopped
      1 -> Started
      2 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AppCaptureMicrophoneCaptureState> {
    public fun setValue(newValue: AppCaptureMicrophoneCaptureState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppCaptureMicrophoneCaptureState =
        AppCaptureMicrophoneCaptureState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppCaptureMicrophoneCaptureState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppCaptureMicrophoneCaptureState =
        AppCaptureMicrophoneCaptureState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppCaptureMicrophoneCaptureState): Int = obj.value
  }
}
