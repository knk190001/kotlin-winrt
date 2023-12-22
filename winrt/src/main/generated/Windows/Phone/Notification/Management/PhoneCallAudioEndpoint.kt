package Windows.Phone.Notification.Management

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

@ABIMarker(PhoneCallAudioEndpoint.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneCallAudioEndpoint;i4)")
@WinRTByReference(brClass = PhoneCallAudioEndpoint.ByReference::class)
public enum class PhoneCallAudioEndpoint(
  public val value: Int
) : NativeMapped {
  Default(0),
  Speaker(1),
  Handsfree(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallAudioEndpoint {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> Speaker
      2 -> Handsfree
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallAudioEndpoint> {
    public fun setValue(newValue: PhoneCallAudioEndpoint): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallAudioEndpoint =
        PhoneCallAudioEndpoint.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallAudioEndpoint, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallAudioEndpoint =
        PhoneCallAudioEndpoint.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallAudioEndpoint): Int = obj.value
  }
}
