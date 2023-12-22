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

@ABIMarker(PhoneSimState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneSimState;i4)")
@WinRTByReference(brClass = PhoneSimState.ByReference::class)
public enum class PhoneSimState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  PinNotRequired(1),
  PinUnlocked(2),
  PinLocked(3),
  PukLocked(4),
  NotInserted(5),
  Invalid(6),
  Disabled(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneSimState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> PinNotRequired
      2 -> PinUnlocked
      3 -> PinLocked
      4 -> PukLocked
      5 -> NotInserted
      6 -> Invalid
      7 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneSimState> {
    public fun setValue(newValue: PhoneSimState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneSimState =
        PhoneSimState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneSimState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneSimState =
        PhoneSimState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneSimState): Int = obj.value
  }
}
