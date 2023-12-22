package Windows.Media.Devices

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

@ABIMarker(CameraStreamState.ABI::class)
@Signature("enum(Windows.Media.Devices.CameraStreamState;i4)")
@WinRTByReference(brClass = CameraStreamState.ByReference::class)
public enum class CameraStreamState(
  public val value: Int
) : NativeMapped {
  NotStreaming(0),
  Streaming(1),
  BlockedForPrivacy(2),
  Shutdown(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CameraStreamState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStreaming
      1 -> Streaming
      2 -> BlockedForPrivacy
      3 -> Shutdown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CameraStreamState> {
    public fun setValue(newValue: CameraStreamState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CameraStreamState =
        CameraStreamState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CameraStreamState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CameraStreamState =
        CameraStreamState.values()[0].fromNative(value, null)

    public override fun toNative(obj: CameraStreamState): Int = obj.value
  }
}
