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

@ABIMarker(VpnDomainNameType.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnDomainNameType;i4)")
@WinRTByReference(brClass = VpnDomainNameType.ByReference::class)
public enum class VpnDomainNameType(
  public val value: Int
) : NativeMapped {
  Suffix(0),
  FullyQualified(1),
  Reserved(65535),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnDomainNameType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Suffix
      1 -> FullyQualified
      65535 -> Reserved
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnDomainNameType> {
    public fun setValue(newValue: VpnDomainNameType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnDomainNameType =
        VpnDomainNameType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnDomainNameType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnDomainNameType =
        VpnDomainNameType.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnDomainNameType): Int = obj.value
  }
}
