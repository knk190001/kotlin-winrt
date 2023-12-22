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

@ABIMarker(RemoteSystemSessionJoinStatus.ABI::class)
@Signature("enum(Windows.System.RemoteSystems.RemoteSystemSessionJoinStatus;i4)")
@WinRTByReference(brClass = RemoteSystemSessionJoinStatus.ByReference::class)
public enum class RemoteSystemSessionJoinStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  SessionLimitsExceeded(1),
  OperationAborted(2),
  SessionUnavailable(3),
  RejectedByController(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteSystemSessionJoinStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> SessionLimitsExceeded
      2 -> OperationAborted
      3 -> SessionUnavailable
      4 -> RejectedByController
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<RemoteSystemSessionJoinStatus> {
    public fun setValue(newValue: RemoteSystemSessionJoinStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteSystemSessionJoinStatus =
        RemoteSystemSessionJoinStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteSystemSessionJoinStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteSystemSessionJoinStatus =
        RemoteSystemSessionJoinStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteSystemSessionJoinStatus): Int = obj.value
  }
}
