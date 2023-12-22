package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynBusAttachmentState.ABI::class)
@Signature("enum(Windows.Devices.AllJoyn.AllJoynBusAttachmentState;i4)")
@WinRTByReference(brClass = AllJoynBusAttachmentState.ByReference::class)
public enum class AllJoynBusAttachmentState(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Connecting(1),
  Connected(2),
  Disconnecting(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AllJoynBusAttachmentState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Connecting
      2 -> Connected
      3 -> Disconnecting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AllJoynBusAttachmentState>
      {
    public fun setValue(newValue: AllJoynBusAttachmentState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AllJoynBusAttachmentState =
        AllJoynBusAttachmentState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AllJoynBusAttachmentState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AllJoynBusAttachmentState =
        AllJoynBusAttachmentState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AllJoynBusAttachmentState): Int = obj.value
  }
}
