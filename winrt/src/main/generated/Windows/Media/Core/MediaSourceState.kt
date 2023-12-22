package Windows.Media.Core

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

@ABIMarker(MediaSourceState.ABI::class)
@Signature("enum(Windows.Media.Core.MediaSourceState;i4)")
@WinRTByReference(brClass = MediaSourceState.ByReference::class)
public enum class MediaSourceState(
  public val value: Int
) : NativeMapped {
  Initial(0),
  Opening(1),
  Opened(2),
  Failed(3),
  Closed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaSourceState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Initial
      1 -> Opening
      2 -> Opened
      3 -> Failed
      4 -> Closed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaSourceState> {
    public fun setValue(newValue: MediaSourceState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaSourceState =
        MediaSourceState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaSourceState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaSourceState =
        MediaSourceState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaSourceState): Int = obj.value
  }
}
