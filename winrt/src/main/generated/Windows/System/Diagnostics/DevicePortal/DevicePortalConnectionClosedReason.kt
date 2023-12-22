package Windows.System.Diagnostics.DevicePortal

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

@ABIMarker(DevicePortalConnectionClosedReason.ABI::class)
@Signature("enum(Windows.System.Diagnostics.DevicePortal.DevicePortalConnectionClosedReason;i4)")
@WinRTByReference(brClass = DevicePortalConnectionClosedReason.ByReference::class)
public enum class DevicePortalConnectionClosedReason(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  ResourceLimitsExceeded(1),
  ProtocolError(2),
  NotAuthorized(3),
  UserNotPresent(4),
  ServiceTerminated(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DevicePortalConnectionClosedReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> ResourceLimitsExceeded
      2 -> ProtocolError
      3 -> NotAuthorized
      4 -> UserNotPresent
      5 -> ServiceTerminated
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DevicePortalConnectionClosedReason> {
    public fun setValue(newValue: DevicePortalConnectionClosedReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DevicePortalConnectionClosedReason =
        DevicePortalConnectionClosedReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DevicePortalConnectionClosedReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DevicePortalConnectionClosedReason =
        DevicePortalConnectionClosedReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: DevicePortalConnectionClosedReason): Int = obj.value
  }
}
