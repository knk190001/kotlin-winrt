package Windows.Networking.Vpn

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

@ABIMarker(VpnRoutingPolicyType.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnRoutingPolicyType;i4)")
@WinRTByReference(brClass = VpnRoutingPolicyType.ByReference::class)
public enum class VpnRoutingPolicyType(
  public val value: Int
) : NativeMapped {
  SplitRouting(0),
  ForceAllTrafficOverVpn(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnRoutingPolicyType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SplitRouting
      1 -> ForceAllTrafficOverVpn
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnRoutingPolicyType> {
    public fun setValue(newValue: VpnRoutingPolicyType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnRoutingPolicyType =
        VpnRoutingPolicyType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnRoutingPolicyType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnRoutingPolicyType =
        VpnRoutingPolicyType.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnRoutingPolicyType): Int = obj.value
  }
}
