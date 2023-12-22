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

@ABIMarker(VpnPacketBufferStatus.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnPacketBufferStatus;i4)")
@WinRTByReference(brClass = VpnPacketBufferStatus.ByReference::class)
public enum class VpnPacketBufferStatus(
  public val value: Int
) : NativeMapped {
  Ok(0),
  InvalidBufferSize(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnPacketBufferStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ok
      1 -> InvalidBufferSize
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnPacketBufferStatus> {
    public fun setValue(newValue: VpnPacketBufferStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnPacketBufferStatus =
        VpnPacketBufferStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnPacketBufferStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnPacketBufferStatus =
        VpnPacketBufferStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnPacketBufferStatus): Int = obj.value
  }
}
