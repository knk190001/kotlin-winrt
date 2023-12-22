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

@ABIMarker(PeerWatcherStatus.ABI::class)
@Signature("enum(Windows.Networking.Proximity.PeerWatcherStatus;i4)")
@WinRTByReference(brClass = PeerWatcherStatus.ByReference::class)
public enum class PeerWatcherStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Started(1),
  EnumerationCompleted(2),
  Stopping(3),
  Stopped(4),
  Aborted(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PeerWatcherStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Started
      2 -> EnumerationCompleted
      3 -> Stopping
      4 -> Stopped
      5 -> Aborted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PeerWatcherStatus> {
    public fun setValue(newValue: PeerWatcherStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PeerWatcherStatus =
        PeerWatcherStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PeerWatcherStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PeerWatcherStatus =
        PeerWatcherStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PeerWatcherStatus): Int = obj.value
  }
}
