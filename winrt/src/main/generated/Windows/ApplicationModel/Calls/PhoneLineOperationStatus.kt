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

@ABIMarker(PhoneLineOperationStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneLineOperationStatus;i4)")
@WinRTByReference(brClass = PhoneLineOperationStatus.ByReference::class)
public enum class PhoneLineOperationStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  OtherFailure(1),
  TimedOut(2),
  ConnectionLost(3),
  InvalidCallState(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneLineOperationStatus {
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

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneLineOperationStatus>
      {
    public fun setValue(newValue: PhoneLineOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneLineOperationStatus =
        PhoneLineOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneLineOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneLineOperationStatus =
        PhoneLineOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneLineOperationStatus): Int = obj.value
  }
}
