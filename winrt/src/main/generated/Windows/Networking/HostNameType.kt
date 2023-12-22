package Windows.Networking

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

@ABIMarker(HostNameType.ABI::class)
@Signature("enum(Windows.Networking.HostNameType;i4)")
@WinRTByReference(brClass = HostNameType.ByReference::class)
public enum class HostNameType(
  public val value: Int
) : NativeMapped {
  DomainName(0),
  Ipv4(1),
  Ipv6(2),
  Bluetooth(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HostNameType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DomainName
      1 -> Ipv4
      2 -> Ipv6
      3 -> Bluetooth
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HostNameType> {
    public fun setValue(newValue: HostNameType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HostNameType =
        HostNameType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HostNameType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HostNameType =
        HostNameType.values()[0].fromNative(value, null)

    public override fun toNative(obj: HostNameType): Int = obj.value
  }
}
