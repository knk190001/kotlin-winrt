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

@ABIMarker(PhoneCallOperationStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneCallOperationStatus;i4)")
@WinRTByReference(brClass = PhoneCallOperationStatus.ByReference::class)
public enum class PhoneCallOperationStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  OtherFailure(1),
  TimedOut(2),
  ConnectionLost(3),
  InvalidCallState(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneCallOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> OtherFailure
      2 -> TimedOut
      3 -> ConnectionLost
      4 -> InvalidCallState
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneCallOperationStatus>
      {
    public fun setValue(newValue: PhoneCallOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneCallOperationStatus =
        PhoneCallOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneCallOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneCallOperationStatus =
        PhoneCallOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneCallOperationStatus): Int = obj.value
  }
}
