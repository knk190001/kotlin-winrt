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

@ABIMarker(VpnAuthenticationMethod.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnAuthenticationMethod;i4)")
@WinRTByReference(brClass = VpnAuthenticationMethod.ByReference::class)
public enum class VpnAuthenticationMethod(
  public val value: Int
) : NativeMapped {
  Mschapv2(0),
  Eap(1),
  Certificate(2),
  PresharedKey(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnAuthenticationMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Mschapv2
      1 -> Eap
      2 -> Certificate
      3 -> PresharedKey
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnAuthenticationMethod> {
    public fun setValue(newValue: VpnAuthenticationMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnAuthenticationMethod =
        VpnAuthenticationMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnAuthenticationMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnAuthenticationMethod =
        VpnAuthenticationMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnAuthenticationMethod): Int = obj.value
  }
}
