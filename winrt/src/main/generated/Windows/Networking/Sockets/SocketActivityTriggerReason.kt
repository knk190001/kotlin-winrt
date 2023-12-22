package Windows.Networking.Sockets

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

@ABIMarker(SocketActivityTriggerReason.ABI::class)
@Signature("enum(Windows.Networking.Sockets.SocketActivityTriggerReason;i4)")
@WinRTByReference(brClass = SocketActivityTriggerReason.ByReference::class)
public enum class SocketActivityTriggerReason(
  public val value: Int
) : NativeMapped {
  None(0),
  SocketActivity(1),
  ConnectionAccepted(2),
  KeepAliveTimerExpired(3),
  SocketClosed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocketActivityTriggerReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SocketActivity
      2 -> ConnectionAccepted
      3 -> KeepAliveTimerExpired
      4 -> SocketClosed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SocketActivityTriggerReason> {
    public fun setValue(newValue: SocketActivityTriggerReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocketActivityTriggerReason =
        SocketActivityTriggerReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocketActivityTriggerReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocketActivityTriggerReason =
        SocketActivityTriggerReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocketActivityTriggerReason): Int = obj.value
  }
}
