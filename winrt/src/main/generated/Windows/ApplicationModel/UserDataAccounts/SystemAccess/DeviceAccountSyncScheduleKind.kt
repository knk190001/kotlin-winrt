package Windows.ApplicationModel.UserDataAccounts.SystemAccess

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

@ABIMarker(DeviceAccountSyncScheduleKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountSyncScheduleKind;i4)")
@WinRTByReference(brClass = DeviceAccountSyncScheduleKind.ByReference::class)
public enum class DeviceAccountSyncScheduleKind(
  public val value: Int
) : NativeMapped {
  Manual(0),
  Every15Minutes(1),
  Every30Minutes(2),
  Every60Minutes(3),
  Every2Hours(4),
  Daily(5),
  AsItemsArrive(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceAccountSyncScheduleKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Manual
      1 -> Every15Minutes
      2 -> Every30Minutes
      3 -> Every60Minutes
      4 -> Every2Hours
      5 -> Daily
      6 -> AsItemsArrive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DeviceAccountSyncScheduleKind> {
    public fun setValue(newValue: DeviceAccountSyncScheduleKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceAccountSyncScheduleKind =
        DeviceAccountSyncScheduleKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceAccountSyncScheduleKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceAccountSyncScheduleKind =
        DeviceAccountSyncScheduleKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceAccountSyncScheduleKind): Int = obj.value
  }
}
