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

@ABIMarker(ControlChannelTriggerResetReason.ABI::class)
@Signature("enum(Windows.Networking.Sockets.ControlChannelTriggerResetReason;i4)")
@WinRTByReference(brClass = ControlChannelTriggerResetReason.ByReference::class)
public enum class ControlChannelTriggerResetReason(
  public val value: Int
) : NativeMapped {
  FastUserSwitched(0),
  LowPowerExit(1),
  QuietHoursExit(2),
  ApplicationRestart(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ControlChannelTriggerResetReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FastUserSwitched
      1 -> LowPowerExit
      2 -> QuietHoursExit
      3 -> ApplicationRestart
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ControlChannelTriggerResetReason> {
    public fun setValue(newValue: ControlChannelTriggerResetReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ControlChannelTriggerResetReason =
        ControlChannelTriggerResetReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ControlChannelTriggerResetReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ControlChannelTriggerResetReason =
        ControlChannelTriggerResetReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: ControlChannelTriggerResetReason): Int = obj.value
  }
}
