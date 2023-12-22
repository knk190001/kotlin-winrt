package Windows.Media

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

@ABIMarker(SystemMediaTransportControlsButton.ABI::class)
@Signature("enum(Windows.Media.SystemMediaTransportControlsButton;i4)")
@WinRTByReference(brClass = SystemMediaTransportControlsButton.ByReference::class)
public enum class SystemMediaTransportControlsButton(
  public val value: Int
) : NativeMapped {
  Play(0),
  Pause(1),
  Stop(2),
  Record(3),
  FastForward(4),
  Rewind(5),
  Next(6),
  Previous(7),
  ChannelUp(8),
  ChannelDown(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemMediaTransportControlsButton {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Play
      1 -> Pause
      2 -> Stop
      3 -> Record
      4 -> FastForward
      5 -> Rewind
      6 -> Next
      7 -> Previous
      8 -> ChannelUp
      9 -> ChannelDown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SystemMediaTransportControlsButton> {
    public fun setValue(newValue: SystemMediaTransportControlsButton): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemMediaTransportControlsButton =
        SystemMediaTransportControlsButton.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemMediaTransportControlsButton, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemMediaTransportControlsButton =
        SystemMediaTransportControlsButton.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemMediaTransportControlsButton): Int = obj.value
  }
}
