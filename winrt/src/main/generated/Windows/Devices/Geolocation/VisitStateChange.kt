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

@ABIMarker(VisitStateChange.ABI::class)
@Signature("enum(Windows.Devices.Geolocation.VisitStateChange;i4)")
@WinRTByReference(brClass = VisitStateChange.ByReference::class)
public enum class VisitStateChange(
  public val value: Int
) : NativeMapped {
  TrackingLost(0),
  Arrived(1),
  Departed(2),
  OtherMovement(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VisitStateChange {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> TrackingLost
      1 -> Arrived
      2 -> Departed
      3 -> OtherMovement
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VisitStateChange> {
    public fun setValue(newValue: VisitStateChange): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VisitStateChange =
        VisitStateChange.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VisitStateChange, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VisitStateChange =
        VisitStateChange.values()[0].fromNative(value, null)

    public override fun toNative(obj: VisitStateChange): Int = obj.value
  }
}
