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

@ABIMarker(AppBroadcastStreamState.ABI::class)
@Signature("enum(Windows.Media.Capture.AppBroadcastStreamState;i4)")
@WinRTByReference(brClass = AppBroadcastStreamState.ByReference::class)
public enum class AppBroadcastStreamState(
  public val value: Int
) : NativeMapped {
  Initializing(0),
  StreamReady(1),
  Started(2),
  Paused(3),
  Terminated(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppBroadcastStreamState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Initializing
      1 -> StreamReady
      2 -> Started
      3 -> Paused
      4 -> Terminated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppBroadcastStreamState> {
    public fun setValue(newValue: AppBroadcastStreamState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppBroadcastStreamState =
        AppBroadcastStreamState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppBroadcastStreamState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppBroadcastStreamState =
        AppBroadcastStreamState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppBroadcastStreamState): Int = obj.value
  }
}
