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

@ABIMarker(PhoneCallDirection.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneCallDirection;i4)")
@WinRTByReference(brClass = PhoneCallDirection.ByReference::class)
public enum class PhoneCallDirection(
  public val value: Int
) : NativeMapped {
  Incoming(0),
  Outgoing(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Incoming
      1 -> Outgoing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallDirection> {
    public fun setValue(newValue: PhoneCallDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallDirection =
        PhoneCallDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallDirection =
        PhoneCallDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallDirection): Int = obj.value
  }
}
