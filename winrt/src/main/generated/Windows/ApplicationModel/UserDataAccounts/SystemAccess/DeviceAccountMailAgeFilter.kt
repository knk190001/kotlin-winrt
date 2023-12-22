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

@ABIMarker(DeviceAccountMailAgeFilter.ABI::class)
@Signature("enum(Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountMailAgeFilter;i4)")
@WinRTByReference(brClass = DeviceAccountMailAgeFilter.ByReference::class)
public enum class DeviceAccountMailAgeFilter(
  public val value: Int
) : NativeMapped {
  All(0),
  Last1Day(1),
  Last3Days(2),
  Last7Days(3),
  Last14Days(4),
  Last30Days(5),
  Last90Days(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceAccountMailAgeFilter {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> Last1Day
      2 -> Last3Days
      3 -> Last7Days
      4 -> Last14Days
      5 -> Last30Days
      6 -> Last90Days
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DeviceAccountMailAgeFilter> {
    public fun setValue(newValue: DeviceAccountMailAgeFilter): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceAccountMailAgeFilter =
        DeviceAccountMailAgeFilter.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceAccountMailAgeFilter, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceAccountMailAgeFilter =
        DeviceAccountMailAgeFilter.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceAccountMailAgeFilter): Int = obj.value
  }
}
