package Windows.System.RemoteSystems

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

@ABIMarker(RemoteSystemStatus.ABI::class)
@Signature("enum(Windows.System.RemoteSystems.RemoteSystemStatus;i4)")
@WinRTByReference(brClass = RemoteSystemStatus.ByReference::class)
public enum class RemoteSystemStatus(
  public val value: Int
) : NativeMapped {
  Unavailable(0),
  DiscoveringAvailability(1),
  Available(2),
  Unknown(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteSystemStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unavailable
      1 -> DiscoveringAvailability
      2 -> Available
      3 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RemoteSystemStatus> {
    public fun setValue(newValue: RemoteSystemStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteSystemStatus =
        RemoteSystemStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteSystemStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteSystemStatus =
        RemoteSystemStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteSystemStatus): Int = obj.value
  }
}
