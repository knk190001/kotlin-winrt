package Windows.Networking.Proximity

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

@ABIMarker(TriggeredConnectState.ABI::class)
@Signature("enum(Windows.Networking.Proximity.TriggeredConnectState;i4)")
@WinRTByReference(brClass = TriggeredConnectState.ByReference::class)
public enum class TriggeredConnectState(
  public val value: Int
) : NativeMapped {
  PeerFound(0),
  Listening(1),
  Connecting(2),
  Completed(3),
  Canceled(4),
  Failed(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TriggeredConnectState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PeerFound
      1 -> Listening
      2 -> Connecting
      3 -> Completed
      4 -> Canceled
      5 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<TriggeredConnectState> {
    public fun setValue(newValue: TriggeredConnectState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TriggeredConnectState =
        TriggeredConnectState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TriggeredConnectState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TriggeredConnectState =
        TriggeredConnectState.values()[0].fromNative(value, null)

    public override fun toNative(obj: TriggeredConnectState): Int = obj.value
  }
}
