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

@ABIMarker(PeerRole.ABI::class)
@Signature("enum(Windows.Networking.Proximity.PeerRole;i4)")
@WinRTByReference(brClass = PeerRole.ByReference::class)
public enum class PeerRole(
  public val value: Int
) : NativeMapped {
  Peer(0),
  Host(1),
  Client(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): PeerRole {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Peer
      1 -> Host
      2 -> Client
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PeerRole> {
    public fun setValue(newValue: PeerRole): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PeerRole =
        PeerRole.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PeerRole, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PeerRole =
        PeerRole.values()[0].fromNative(value, null)

    public override fun toNative(obj: PeerRole): Int = obj.value
  }
}
