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

@ABIMarker(ControlChannelTriggerResourceType.ABI::class)
@Signature("enum(Windows.Networking.Sockets.ControlChannelTriggerResourceType;i4)")
@WinRTByReference(brClass = ControlChannelTriggerResourceType.ByReference::class)
public enum class ControlChannelTriggerResourceType(
  public val value: Int
) : NativeMapped {
  RequestSoftwareSlot(0),
  RequestHardwareSlot(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ControlChannelTriggerResourceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> RequestSoftwareSlot
      1 -> RequestHardwareSlot
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ControlChannelTriggerResourceType> {
    public fun setValue(newValue: ControlChannelTriggerResourceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ControlChannelTriggerResourceType =
        ControlChannelTriggerResourceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ControlChannelTriggerResourceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ControlChannelTriggerResourceType =
        ControlChannelTriggerResourceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ControlChannelTriggerResourceType): Int = obj.value
  }
}
