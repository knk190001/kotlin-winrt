package Windows.Networking.Connectivity

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

@ABIMarker(WwanNetworkRegistrationState.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.WwanNetworkRegistrationState;i4)")
@WinRTByReference(brClass = WwanNetworkRegistrationState.ByReference::class)
public enum class WwanNetworkRegistrationState(
  public val value: Int
) : NativeMapped {
  None(0),
  Deregistered(1),
  Searching(2),
  Home(3),
  Roaming(4),
  Partner(5),
  Denied(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WwanNetworkRegistrationState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Deregistered
      2 -> Searching
      3 -> Home
      4 -> Roaming
      5 -> Partner
      6 -> Denied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WwanNetworkRegistrationState> {
    public fun setValue(newValue: WwanNetworkRegistrationState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WwanNetworkRegistrationState =
        WwanNetworkRegistrationState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WwanNetworkRegistrationState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WwanNetworkRegistrationState =
        WwanNetworkRegistrationState.values()[0].fromNative(value, null)

    public override fun toNative(obj: WwanNetworkRegistrationState): Int = obj.value
  }
}
