package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneNetworkState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Calls.PhoneNetworkState;i4)")
@WinRTByReference(brClass = PhoneNetworkState.ByReference::class)
public enum class PhoneNetworkState(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  NoSignal(1),
  Deregistered(2),
  Denied(3),
  Searching(4),
  Home(5),
  RoamingInternational(6),
  RoamingDomestic(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PhoneNetworkState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> NoSignal
      2 -> Deregistered
      3 -> Denied
      4 -> Searching
      5 -> Home
      6 -> RoamingInternational
      7 -> RoamingDomestic
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PhoneNetworkState> {
    public fun setValue(newValue: PhoneNetworkState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PhoneNetworkState =
        PhoneNetworkState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PhoneNetworkState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PhoneNetworkState =
        PhoneNetworkState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PhoneNetworkState): Int = obj.value
  }
}
