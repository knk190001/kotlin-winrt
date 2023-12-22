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

@ABIMarker(VpnNativeProtocolType.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnNativeProtocolType;i4)")
@WinRTByReference(brClass = VpnNativeProtocolType.ByReference::class)
public enum class VpnNativeProtocolType(
  public val value: Int
) : NativeMapped {
  Pptp(0),
  L2tp(1),
  IpsecIkev2(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnNativeProtocolType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pptp
      1 -> L2tp
      2 -> IpsecIkev2
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnNativeProtocolType> {
    public fun setValue(newValue: VpnNativeProtocolType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnNativeProtocolType =
        VpnNativeProtocolType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnNativeProtocolType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnNativeProtocolType =
        VpnNativeProtocolType.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnNativeProtocolType): Int = obj.value
  }
}
