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

@ABIMarker(MagneticStripeReaderTrackErrorType.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType;i4)")
@WinRTByReference(brClass = MagneticStripeReaderTrackErrorType.ByReference::class)
public enum class MagneticStripeReaderTrackErrorType(
  public val value: Int
) : NativeMapped {
  None(0),
  StartSentinelError(1),
  EndSentinelError(2),
  ParityError(3),
  LrcError(4),
  Unknown(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MagneticStripeReaderTrackErrorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> StartSentinelError
      2 -> EndSentinelError
      3 -> ParityError
      4 -> LrcError
      -1 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MagneticStripeReaderTrackErrorType> {
    public fun setValue(newValue: MagneticStripeReaderTrackErrorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MagneticStripeReaderTrackErrorType =
        MagneticStripeReaderTrackErrorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MagneticStripeReaderTrackErrorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MagneticStripeReaderTrackErrorType =
        MagneticStripeReaderTrackErrorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MagneticStripeReaderTrackErrorType): Int = obj.value
  }
}
