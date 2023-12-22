package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandModemStatus.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandModemStatus;i4)")
@WinRTByReference(brClass = MobileBroadbandModemStatus.ByReference::class)
public enum class MobileBroadbandModemStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  OtherFailure(1),
  Busy(2),
  NoDeviceSupport(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandModemStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> OtherFailure
      2 -> Busy
      3 -> NoDeviceSupport
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MobileBroadbandModemStatus> {
    public fun setValue(newValue: MobileBroadbandModemStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandModemStatus =
        MobileBroadbandModemStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandModemStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandModemStatus =
        MobileBroadbandModemStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandModemStatus): Int = obj.value
  }
}
