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

@ABIMarker(PhoneCallTransport.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneCallTransport;i4)")
@WinRTByReference(brClass = PhoneCallTransport.ByReference::class)
public enum class PhoneCallTransport(
  public val value: Int
) : NativeMapped {
  Cellular(0),
  Voip(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallTransport {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Cellular
      1 -> Voip
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallTransport> {
    public fun setValue(newValue: PhoneCallTransport): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallTransport =
        PhoneCallTransport.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallTransport, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallTransport =
        PhoneCallTransport.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallTransport): Int = obj.value
  }
}
