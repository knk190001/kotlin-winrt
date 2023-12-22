package Windows.Devices.Geolocation

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

@ABIMarker(PositionStatus.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.PositionStatus;i4)")
@WinRTByReference(brClass = PositionStatus.ByReference::class)
public enum class PositionStatus(
  public val value: Int
) : NativeMapped {
  Ready(0),
  Initializing(1),
  NoData(2),
  Disabled(3),
  NotInitialized(4),
  NotAvailable(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PositionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ready
      1 -> Initializing
      2 -> NoData
      3 -> Disabled
      4 -> NotInitialized
      5 -> NotAvailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PositionStatus> {
    public fun setValue(newValue: PositionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PositionStatus =
        PositionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PositionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PositionStatus =
        PositionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PositionStatus): Int = obj.value
  }
}
