package Windows.Devices.Portable

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

@ABIMarker(ServiceDeviceType.ABI::class)
@Signature("enum(Windows.Devices.Portable.ServiceDeviceType;i4)")
@WinRTByReference(brClass = ServiceDeviceType.ByReference::class)
public enum class ServiceDeviceType(
  public val value: Int
) : NativeMapped {
  CalendarService(0),
  ContactsService(1),
  DeviceStatusService(2),
  NotesService(3),
  RingtonesService(4),
  SmsService(5),
  TasksService(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ServiceDeviceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> CalendarService
      1 -> ContactsService
      2 -> DeviceStatusService
      3 -> NotesService
      4 -> RingtonesService
      5 -> SmsService
      6 -> TasksService
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ServiceDeviceType> {
    public fun setValue(newValue: ServiceDeviceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ServiceDeviceType =
        ServiceDeviceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ServiceDeviceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ServiceDeviceType =
        ServiceDeviceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: ServiceDeviceType): Int = obj.value
  }
}
