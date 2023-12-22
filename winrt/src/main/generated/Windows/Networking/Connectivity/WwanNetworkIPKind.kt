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

@ABIMarker(WwanNetworkIPKind.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.WwanNetworkIPKind;i4)")
@WinRTByReference(brClass = WwanNetworkIPKind.ByReference::class)
public enum class WwanNetworkIPKind(
  public val value: Int
) : NativeMapped {
  None(0),
  Ipv4(1),
  Ipv6(2),
  Ipv4v6(3),
  Ipv4v6v4Xlat(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WwanNetworkIPKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Ipv4
      2 -> Ipv6
      3 -> Ipv4v6
      4 -> Ipv4v6v4Xlat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WwanNetworkIPKind> {
    public fun setValue(newValue: WwanNetworkIPKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WwanNetworkIPKind =
        WwanNetworkIPKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WwanNetworkIPKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WwanNetworkIPKind =
        WwanNetworkIPKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WwanNetworkIPKind): Int = obj.value
  }
}
