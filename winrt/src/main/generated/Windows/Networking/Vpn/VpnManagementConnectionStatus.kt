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

@ABIMarker(VpnManagementConnectionStatus.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnManagementConnectionStatus;i4)")
@WinRTByReference(brClass = VpnManagementConnectionStatus.ByReference::class)
public enum class VpnManagementConnectionStatus(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Disconnecting(1),
  Connected(2),
  Connecting(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnManagementConnectionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Disconnecting
      2 -> Connected
      3 -> Connecting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VpnManagementConnectionStatus> {
    public fun setValue(newValue: VpnManagementConnectionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnManagementConnectionStatus =
        VpnManagementConnectionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnManagementConnectionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnManagementConnectionStatus =
        VpnManagementConnectionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnManagementConnectionStatus): Int = obj.value
  }
}
