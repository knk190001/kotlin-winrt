package Windows.UI.Notifications

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

@ABIMarker(PeriodicUpdateRecurrence.ABI::class)
@Signature("enum(Windows.UI.Notifications.PeriodicUpdateRecurrence;i4)")
@WinRTByReference(brClass = PeriodicUpdateRecurrence.ByReference::class)
public enum class PeriodicUpdateRecurrence(
  public val value: Int
) : NativeMapped {
  HalfHour(0),
  Hour(1),
  SixHours(2),
  TwelveHours(3),
  Daily(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PeriodicUpdateRecurrence {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> HalfHour
      1 -> Hour
      2 -> SixHours
      3 -> TwelveHours
      4 -> Daily
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PeriodicUpdateRecurrence>
      {
    public fun setValue(newValue: PeriodicUpdateRecurrence): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PeriodicUpdateRecurrence =
        PeriodicUpdateRecurrence.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PeriodicUpdateRecurrence, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PeriodicUpdateRecurrence =
        PeriodicUpdateRecurrence.values()[0].fromNative(value, null)

    public override fun toNative(obj: PeriodicUpdateRecurrence): Int = obj.value
  }
}
