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

@ABIMarker(MagneticStripeReaderTrackIds.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.MagneticStripeReaderTrackIds;i4)")
@WinRTByReference(brClass = MagneticStripeReaderTrackIds.ByReference::class)
public enum class MagneticStripeReaderTrackIds(
  public val value: Int
) : NativeMapped {
  None(0),
  Track1(1),
  Track2(2),
  Track3(4),
  Track4(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MagneticStripeReaderTrackIds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Track1
      2 -> Track2
      4 -> Track3
      8 -> Track4
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MagneticStripeReaderTrackIds> {
    public fun setValue(newValue: MagneticStripeReaderTrackIds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MagneticStripeReaderTrackIds =
        MagneticStripeReaderTrackIds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MagneticStripeReaderTrackIds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MagneticStripeReaderTrackIds =
        MagneticStripeReaderTrackIds.values()[0].fromNative(value, null)

    public override fun toNative(obj: MagneticStripeReaderTrackIds): Int = obj.value
  }
}
