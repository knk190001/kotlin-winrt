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

@ABIMarker(PhoneLineRegistrationState.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.PhoneLineRegistrationState;i4)")
@WinRTByReference(brClass = PhoneLineRegistrationState.ByReference::class)
public enum class PhoneLineRegistrationState(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Home(1),
  Roaming(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineRegistrationState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Home
      2 -> Roaming
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PhoneLineRegistrationState> {
    public fun setValue(newValue: PhoneLineRegistrationState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineRegistrationState =
        PhoneLineRegistrationState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneLineRegistrationState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineRegistrationState =
        PhoneLineRegistrationState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineRegistrationState): Int = obj.value
  }
}
