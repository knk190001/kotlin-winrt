package Windows.Networking.ServiceDiscovery.Dnssd

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

@ABIMarker(DnssdRegistrationStatus.ABI::class)
@Signature("enum(Windows.Networking.ServiceDiscovery.Dnssd.DnssdRegistrationStatus;i4)")
@WinRTByReference(brClass = DnssdRegistrationStatus.ByReference::class)
public enum class DnssdRegistrationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  InvalidServiceName(1),
  ServerError(2),
  SecurityError(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DnssdRegistrationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> InvalidServiceName
      2 -> ServerError
      3 -> SecurityError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DnssdRegistrationStatus> {
    public fun setValue(newValue: DnssdRegistrationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DnssdRegistrationStatus =
        DnssdRegistrationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DnssdRegistrationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DnssdRegistrationStatus =
        DnssdRegistrationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DnssdRegistrationStatus): Int = obj.value
  }
}
