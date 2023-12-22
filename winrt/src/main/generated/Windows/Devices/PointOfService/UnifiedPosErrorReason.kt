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

@ABIMarker(UnifiedPosErrorReason.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.UnifiedPosErrorReason;i4)")
@WinRTByReference(brClass = UnifiedPosErrorReason.ByReference::class)
public enum class UnifiedPosErrorReason(
  public val value: Int
) : NativeMapped {
  UnknownErrorReason(0),
  NoService(1),
  Disabled(2),
  Illegal(3),
  NoHardware(4),
  Closed(5),
  Offline(6),
  Failure(7),
  Timeout(8),
  Busy(9),
  Extended(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnifiedPosErrorReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UnknownErrorReason
      1 -> NoService
      2 -> Disabled
      3 -> Illegal
      4 -> NoHardware
      5 -> Closed
      6 -> Offline
      7 -> Failure
      8 -> Timeout
      9 -> Busy
      10 -> Extended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UnifiedPosErrorReason> {
    public fun setValue(newValue: UnifiedPosErrorReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnifiedPosErrorReason =
        UnifiedPosErrorReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnifiedPosErrorReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnifiedPosErrorReason =
        UnifiedPosErrorReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnifiedPosErrorReason): Int = obj.value
  }
}
