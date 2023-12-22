package Windows.System

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

@ABIMarker(RemoteLaunchUriStatus.ABI::class)
@Signature("enum(Windows.System.RemoteLaunchUriStatus;i4)")
@WinRTByReference(brClass = RemoteLaunchUriStatus.ByReference::class)
public enum class RemoteLaunchUriStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Success(1),
  AppUnavailable(2),
  ProtocolUnavailable(3),
  RemoteSystemUnavailable(4),
  ValueSetTooLarge(5),
  DeniedByLocalSystem(6),
  DeniedByRemoteSystem(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RemoteLaunchUriStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Success
      2 -> AppUnavailable
      3 -> ProtocolUnavailable
      4 -> RemoteSystemUnavailable
      5 -> ValueSetTooLarge
      6 -> DeniedByLocalSystem
      7 -> DeniedByRemoteSystem
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RemoteLaunchUriStatus> {
    public fun setValue(newValue: RemoteLaunchUriStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RemoteLaunchUriStatus =
        RemoteLaunchUriStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RemoteLaunchUriStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RemoteLaunchUriStatus =
        RemoteLaunchUriStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: RemoteLaunchUriStatus): Int = obj.value
  }
}
