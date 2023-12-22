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

@ABIMarker(AvailableAudioRoutingEndpoints.ABI::class)
@Signature("enum(Windows.Phone.Media.Devices.AvailableAudioRoutingEndpoints;u4)")
@WinRTByReference(brClass = AvailableAudioRoutingEndpoints.ByReference::class)
public enum class AvailableAudioRoutingEndpoints(
  public val value: Int
) : NativeMapped {
  None(0),
  Earpiece(1),
  Speakerphone(2),
  Bluetooth(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AvailableAudioRoutingEndpoints {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Earpiece
      2 -> Speakerphone
      4 -> Bluetooth
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AvailableAudioRoutingEndpoints> {
    public fun setValue(newValue: AvailableAudioRoutingEndpoints): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AvailableAudioRoutingEndpoints =
        AvailableAudioRoutingEndpoints.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AvailableAudioRoutingEndpoints, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AvailableAudioRoutingEndpoints =
        AvailableAudioRoutingEndpoints.values()[0].fromNative(value, null)

    public override fun toNative(obj: AvailableAudioRoutingEndpoints): Int = obj.value
  }
}
