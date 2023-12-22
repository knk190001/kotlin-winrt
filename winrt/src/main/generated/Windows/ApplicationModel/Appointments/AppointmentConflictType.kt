package Windows.ApplicationModel.Appointments

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

@ABIMarker(AppointmentConflictType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.AppointmentConflictType;i4)")
@WinRTByReference(brClass = AppointmentConflictType.ByReference::class)
public enum class AppointmentConflictType(
  public val value: Int
) : NativeMapped {
  None(0),
  Adjacent(1),
  Overlap(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppointmentConflictType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Adjacent
      2 -> Overlap
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppointmentConflictType> {
    public fun setValue(newValue: AppointmentConflictType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppointmentConflictType =
        AppointmentConflictType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppointmentConflictType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppointmentConflictType =
        AppointmentConflictType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppointmentConflictType): Int = obj.value
  }
}
