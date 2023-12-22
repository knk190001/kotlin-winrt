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

@ABIMarker(RecurrenceType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Appointments.RecurrenceType;i4)")
@WinRTByReference(brClass = RecurrenceType.ByReference::class)
public enum class RecurrenceType(
  public val value: Int
) : NativeMapped {
  Master(0),
  Instance(1),
  ExceptionInstance(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RecurrenceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Master
      1 -> Instance
      2 -> ExceptionInstance
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RecurrenceType> {
    public fun setValue(newValue: RecurrenceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RecurrenceType =
        RecurrenceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RecurrenceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RecurrenceType =
        RecurrenceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: RecurrenceType): Int = obj.value
  }
}
