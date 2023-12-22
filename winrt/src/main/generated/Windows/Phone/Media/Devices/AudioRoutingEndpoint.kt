package Windows.Phone.Media.Devices

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

@ABIMarker(AudioRoutingEndpoint.ABI::class)
@Signature("enum(Windows.Phone.Media.Devices.AudioRoutingEndpoint;i4)")
@WinRTByReference(brClass = AudioRoutingEndpoint.ByReference::class)
public enum class AudioRoutingEndpoint(
  public val value: Int
) : NativeMapped {
  Default(0),
  Earpiece(1),
  Speakerphone(2),
  Bluetooth(3),
  WiredHeadset(4),
  WiredHeadsetSpeakerOnly(5),
  BluetoothWithNoiseAndEchoCancellation(6),
  BluetoothPreferred(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AudioRoutingEndpoint {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Earpiece
      2 -> Speakerphone
      3 -> Bluetooth
      4 -> WiredHeadset
      5 -> WiredHeadsetSpeakerOnly
      6 -> BluetoothWithNoiseAndEchoCancellation
      7 -> BluetoothPreferred
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AudioRoutingEndpoint> {
    public fun setValue(newValue: AudioRoutingEndpoint): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AudioRoutingEndpoint =
        AudioRoutingEndpoint.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AudioRoutingEndpoint, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AudioRoutingEndpoint =
        AudioRoutingEndpoint.values()[0].fromNative(value, null)

    public override fun toNative(obj: AudioRoutingEndpoint): Int = obj.value
  }
}
