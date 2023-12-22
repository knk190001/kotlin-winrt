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

@ABIMarker(XboxLiveEndpointPairState.ABI::class)
@Signature("enum(Windows.Networking.XboxLive.XboxLiveEndpointPairState;i4)")
@WinRTByReference(brClass = XboxLiveEndpointPairState.ByReference::class)
public enum class XboxLiveEndpointPairState(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  CreatingOutbound(1),
  CreatingInbound(2),
  Ready(3),
  DeletingLocally(4),
  RemoteEndpointTerminating(5),
  Deleted(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XboxLiveEndpointPairState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> CreatingOutbound
      2 -> CreatingInbound
      3 -> Ready
      4 -> DeletingLocally
      5 -> RemoteEndpointTerminating
      6 -> Deleted
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XboxLiveEndpointPairState>
      {
    public fun setValue(newValue: XboxLiveEndpointPairState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XboxLiveEndpointPairState =
        XboxLiveEndpointPairState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XboxLiveEndpointPairState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XboxLiveEndpointPairState =
        XboxLiveEndpointPairState.values()[0].fromNative(value, null)

    public override fun toNative(obj: XboxLiveEndpointPairState): Int = obj.value
  }
}
