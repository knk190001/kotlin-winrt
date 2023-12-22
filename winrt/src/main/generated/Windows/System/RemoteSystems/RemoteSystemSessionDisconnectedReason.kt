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

@ABIMarker(RemoteSystemSessionDisconnectedReason.ABI::class)
@Signature("enum(Windows.System.RemoteSystems.RemoteSystemSessionDisconnectedReason;i4)")
@WinRTByReference(brClass = RemoteSystemSessionDisconnectedReason.ByReference::class)
public enum class RemoteSystemSessionDisconnectedReason(
  public val value: Int
) : NativeMapped {
  SessionUnavailable(0),
  RemovedByController(1),
  SessionClosed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteSystemSessionDisconnectedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SessionUnavailable
      1 -> RemovedByController
      2 -> SessionClosed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RemoteSystemSessionDisconnectedReason> {
    public fun setValue(newValue: RemoteSystemSessionDisconnectedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteSystemSessionDisconnectedReason =
        RemoteSystemSessionDisconnectedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteSystemSessionDisconnectedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteSystemSessionDisconnectedReason =
        RemoteSystemSessionDisconnectedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteSystemSessionDisconnectedReason): Int = obj.value
  }
}
