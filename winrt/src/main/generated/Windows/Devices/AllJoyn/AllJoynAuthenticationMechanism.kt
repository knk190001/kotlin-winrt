package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynAuthenticationMechanism.ABI::class)
@Signature("enum(Windows.Devices.AllJoyn.AllJoynAuthenticationMechanism;i4)")
@WinRTByReference(brClass = AllJoynAuthenticationMechanism.ByReference::class)
public enum class AllJoynAuthenticationMechanism(
  public val value: Int
) : NativeMapped {
  None(0),
  SrpAnonymous(1),
  SrpLogon(2),
  EcdheNull(3),
  EcdhePsk(4),
  EcdheEcdsa(5),
  EcdheSpeke(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AllJoynAuthenticationMechanism {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> SrpAnonymous
      2 -> SrpLogon
      3 -> EcdheNull
      4 -> EcdhePsk
      5 -> EcdheEcdsa
      6 -> EcdheSpeke
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AllJoynAuthenticationMechanism> {
    public fun setValue(newValue: AllJoynAuthenticationMechanism): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AllJoynAuthenticationMechanism =
        AllJoynAuthenticationMechanism.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AllJoynAuthenticationMechanism, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AllJoynAuthenticationMechanism =
        AllJoynAuthenticationMechanism.values()[0].fromNative(value, null)

    public override fun toNative(obj: AllJoynAuthenticationMechanism): Int = obj.value
  }
}
