package Windows.Devices.PointOfService

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

@ABIMarker(LineDisplayPowerStatus.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.LineDisplayPowerStatus;i4)")
@WinRTByReference(brClass = LineDisplayPowerStatus.ByReference::class)
public enum class LineDisplayPowerStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Online(1),
  Off(2),
  Offline(3),
  OffOrOffline(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LineDisplayPowerStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Online
      2 -> Off
      3 -> Offline
      4 -> OffOrOffline
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LineDisplayPowerStatus> {
    public fun setValue(newValue: LineDisplayPowerStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LineDisplayPowerStatus =
        LineDisplayPowerStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LineDisplayPowerStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LineDisplayPowerStatus =
        LineDisplayPowerStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LineDisplayPowerStatus): Int = obj.value
  }
}
