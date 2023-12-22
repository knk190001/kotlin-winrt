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

@ABIMarker(PhoneCallStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneCallStatus;i4)")
@WinRTByReference(brClass = PhoneCallStatus.ByReference::class)
public enum class PhoneCallStatus(
  public val value: Int
) : NativeMapped {
  Lost(0),
  Incoming(1),
  Dialing(2),
  Talking(3),
  Held(4),
  Ended(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Lost
      1 -> Incoming
      2 -> Dialing
      3 -> Talking
      4 -> Held
      5 -> Ended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallStatus> {
    public fun setValue(newValue: PhoneCallStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallStatus =
        PhoneCallStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallStatus =
        PhoneCallStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallStatus): Int = obj.value
  }
}
