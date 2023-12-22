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

@ABIMarker(MediaCaptureFocusState.ABI::class)
@Signature("enum(Windows.Media.Devices.MediaCaptureFocusState;i4)")
@WinRTByReference(brClass = MediaCaptureFocusState.ByReference::class)
public enum class MediaCaptureFocusState(
  public val value: Int
) : NativeMapped {
  Uninitialized(0),
  Lost(1),
  Searching(2),
  Focused(3),
  Failed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaCaptureFocusState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Uninitialized
      1 -> Lost
      2 -> Searching
      3 -> Focused
      4 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaCaptureFocusState> {
    public fun setValue(newValue: MediaCaptureFocusState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaCaptureFocusState =
        MediaCaptureFocusState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaCaptureFocusState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaCaptureFocusState =
        MediaCaptureFocusState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaCaptureFocusState): Int = obj.value
  }
}
