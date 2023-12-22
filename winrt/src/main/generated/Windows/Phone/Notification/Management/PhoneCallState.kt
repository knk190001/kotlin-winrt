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

@ABIMarker(PhoneCallState.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneCallState;i4)")
@WinRTByReference(brClass = PhoneCallState.ByReference::class)
public enum class PhoneCallState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Ringing(1),
  Talking(2),
  Held(3),
  Ended(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Ringing
      2 -> Talking
      3 -> Held
      4 -> Ended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallState> {
    public fun setValue(newValue: PhoneCallState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallState =
        PhoneCallState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallState =
        PhoneCallState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallState): Int = obj.value
  }
}
