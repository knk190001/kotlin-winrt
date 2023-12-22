package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneAudioRoutingEndpoint.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneAudioRoutingEndpoint;i4)")
@WinRTByReference(brClass = PhoneAudioRoutingEndpoint.ByReference::class)
public enum class PhoneAudioRoutingEndpoint(
  public val value: Int
) : NativeMapped {
  Default(0),
  Bluetooth(1),
  Speakerphone(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneAudioRoutingEndpoint {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Bluetooth
      2 -> Speakerphone
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneAudioRoutingEndpoint>
      {
    public fun setValue(newValue: PhoneAudioRoutingEndpoint): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneAudioRoutingEndpoint =
        PhoneAudioRoutingEndpoint.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneAudioRoutingEndpoint, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneAudioRoutingEndpoint =
        PhoneAudioRoutingEndpoint.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneAudioRoutingEndpoint): Int = obj.value
  }
}
