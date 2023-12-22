package Windows.UI.Xaml.Media

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

@ABIMarker(MediaElementState.ABI::class)
@Signature("enum(Windows.UI.Xaml.Media.MediaElementState;i4)")
@WinRTByReference(brClass = MediaElementState.ByReference::class)
public enum class MediaElementState(
  public val value: Int
) : NativeMapped {
  Closed(0),
  Opening(1),
  Buffering(2),
  Playing(3),
  Paused(4),
  Stopped(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MediaElementState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Closed
      1 -> Opening
      2 -> Buffering
      3 -> Playing
      4 -> Paused
      5 -> Stopped
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MediaElementState> {
    public fun setValue(newValue: MediaElementState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MediaElementState =
        MediaElementState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MediaElementState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MediaElementState =
        MediaElementState.values()[0].fromNative(value, null)

    public override fun toNative(obj: MediaElementState): Int = obj.value
  }
}
