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

@ABIMarker(ReminderState.ABI::class)
@Signature("enum(Windows.Phone.Notification.Management.ReminderState;i4)")
@WinRTByReference(brClass = ReminderState.ByReference::class)
public enum class ReminderState(
  public val value: Int
) : NativeMapped {
  Active(0),
  Snoozed(1),
  Dismissed(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ReminderState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Active
      1 -> Snoozed
      2 -> Dismissed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ReminderState> {
    public fun setValue(newValue: ReminderState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ReminderState =
        ReminderState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ReminderState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ReminderState =
        ReminderState.values()[0].fromNative(value, null)

    public override fun toNative(obj: ReminderState): Int = obj.value
  }
}
