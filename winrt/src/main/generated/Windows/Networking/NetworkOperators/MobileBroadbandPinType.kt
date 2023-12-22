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

@ABIMarker(MobileBroadbandPinType.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.MobileBroadbandPinType;i4)")
@WinRTByReference(brClass = MobileBroadbandPinType.ByReference::class)
public enum class MobileBroadbandPinType(
  public val value: Int
) : NativeMapped {
  None(0),
  Custom(1),
  Pin1(2),
  Pin2(3),
  SimPin(4),
  FirstSimPin(5),
  NetworkPin(6),
  NetworkSubsetPin(7),
  ServiceProviderPin(8),
  CorporatePin(9),
  SubsidyLock(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MobileBroadbandPinType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Custom
      2 -> Pin1
      3 -> Pin2
      4 -> SimPin
      5 -> FirstSimPin
      6 -> NetworkPin
      7 -> NetworkSubsetPin
      8 -> ServiceProviderPin
      9 -> CorporatePin
      10 -> SubsidyLock
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MobileBroadbandPinType> {
    public fun setValue(newValue: MobileBroadbandPinType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MobileBroadbandPinType =
        MobileBroadbandPinType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MobileBroadbandPinType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MobileBroadbandPinType =
        MobileBroadbandPinType.values()[0].fromNative(value, null)

    public override fun toNative(obj: MobileBroadbandPinType): Int = obj.value
  }
}
