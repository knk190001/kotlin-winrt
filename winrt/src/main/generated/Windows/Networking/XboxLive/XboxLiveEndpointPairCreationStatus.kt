package Windows.Networking.XboxLive

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

@ABIMarker(XboxLiveEndpointPairCreationStatus.ABI::class)
@Signature("enum(Windows.Networking.XboxLive.XboxLiveEndpointPairCreationStatus;i4)")
@WinRTByReference(brClass = XboxLiveEndpointPairCreationStatus.ByReference::class)
public enum class XboxLiveEndpointPairCreationStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  NoLocalNetworks(1),
  NoCompatibleNetworkPaths(2),
  LocalSystemNotAuthorized(3),
  Canceled(4),
  TimedOut(5),
  RemoteSystemNotAuthorized(6),
  RefusedDueToConfiguration(7),
  UnexpectedInternalError(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XboxLiveEndpointPairCreationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> NoLocalNetworks
      2 -> NoCompatibleNetworkPaths
      3 -> LocalSystemNotAuthorized
      4 -> Canceled
      5 -> TimedOut
      6 -> RemoteSystemNotAuthorized
      7 -> RefusedDueToConfiguration
      8 -> UnexpectedInternalError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XboxLiveEndpointPairCreationStatus> {
    public fun setValue(newValue: XboxLiveEndpointPairCreationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XboxLiveEndpointPairCreationStatus =
        XboxLiveEndpointPairCreationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XboxLiveEndpointPairCreationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XboxLiveEndpointPairCreationStatus =
        XboxLiveEndpointPairCreationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: XboxLiveEndpointPairCreationStatus): Int = obj.value
  }
}
