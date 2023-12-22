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

@ABIMarker(ControlChannelTriggerStatus.ABI::class)
@Signature("enum(Windows.Networking.Sockets.ControlChannelTriggerStatus;i4)")
@WinRTByReference(brClass = ControlChannelTriggerStatus.ByReference::class)
public enum class ControlChannelTriggerStatus(
  public val value: Int
) : NativeMapped {
  HardwareSlotRequested(0),
  SoftwareSlotAllocated(1),
  HardwareSlotAllocated(2),
  PolicyError(3),
  SystemError(4),
  TransportDisconnected(5),
  ServiceUnavailable(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ControlChannelTriggerStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HardwareSlotRequested
      1 -> SoftwareSlotAllocated
      2 -> HardwareSlotAllocated
      3 -> PolicyError
      4 -> SystemError
      5 -> TransportDisconnected
      6 -> ServiceUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ControlChannelTriggerStatus> {
    public fun setValue(newValue: ControlChannelTriggerStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ControlChannelTriggerStatus =
        ControlChannelTriggerStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ControlChannelTriggerStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ControlChannelTriggerStatus =
        ControlChannelTriggerStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ControlChannelTriggerStatus): Int = obj.value
  }
}
