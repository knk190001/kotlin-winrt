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

@ABIMarker(NetworkOperatorEventMessageType.ABI::class)
@Signature("enum(Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType;i4)")
@WinRTByReference(brClass = NetworkOperatorEventMessageType.ByReference::class)
public enum class NetworkOperatorEventMessageType(
  public val value: Int
) : NativeMapped {
  Gsm(0),
  Cdma(1),
  Ussd(2),
  DataPlanThresholdReached(3),
  DataPlanReset(4),
  DataPlanDeleted(5),
  ProfileConnected(6),
  ProfileDisconnected(7),
  RegisteredRoaming(8),
  RegisteredHome(9),
  TetheringEntitlementCheck(10),
  TetheringOperationalStateChanged(11),
  TetheringNumberOfClientsChanged(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NetworkOperatorEventMessageType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Gsm
      1 -> Cdma
      2 -> Ussd
      3 -> DataPlanThresholdReached
      4 -> DataPlanReset
      5 -> DataPlanDeleted
      6 -> ProfileConnected
      7 -> ProfileDisconnected
      8 -> RegisteredRoaming
      9 -> RegisteredHome
      10 -> TetheringEntitlementCheck
      11 -> TetheringOperationalStateChanged
      12 -> TetheringNumberOfClientsChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<NetworkOperatorEventMessageType> {
    public fun setValue(newValue: NetworkOperatorEventMessageType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NetworkOperatorEventMessageType =
        NetworkOperatorEventMessageType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NetworkOperatorEventMessageType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NetworkOperatorEventMessageType =
        NetworkOperatorEventMessageType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NetworkOperatorEventMessageType): Int = obj.value
  }
}
