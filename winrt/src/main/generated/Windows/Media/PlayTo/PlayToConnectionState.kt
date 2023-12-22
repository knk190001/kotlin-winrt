package Windows.Media.PlayTo

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

@ABIMarker(PlayToConnectionState.ABI::class)
@Signature("enum(Windows.Media.PlayTo.PlayToConnectionState;i4)")
@WinRTByReference(brClass = PlayToConnectionState.ByReference::class)
public enum class PlayToConnectionState(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Connected(1),
  Rendering(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PlayToConnectionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Connected
      2 -> Rendering
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PlayToConnectionState> {
    public fun setValue(newValue: PlayToConnectionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PlayToConnectionState =
        PlayToConnectionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PlayToConnectionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PlayToConnectionState =
        PlayToConnectionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PlayToConnectionState): Int = obj.value
  }
}
