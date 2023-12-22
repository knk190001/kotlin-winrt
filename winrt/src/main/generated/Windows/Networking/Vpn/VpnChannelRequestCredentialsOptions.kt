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

@ABIMarker(VpnChannelRequestCredentialsOptions.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions;u4)")
@WinRTByReference(brClass = VpnChannelRequestCredentialsOptions.ByReference::class)
public enum class VpnChannelRequestCredentialsOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  Retrying(1),
  UseForSingleSignIn(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnChannelRequestCredentialsOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Retrying
      2 -> UseForSingleSignIn
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<VpnChannelRequestCredentialsOptions> {
    public fun setValue(newValue: VpnChannelRequestCredentialsOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnChannelRequestCredentialsOptions =
        VpnChannelRequestCredentialsOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnChannelRequestCredentialsOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnChannelRequestCredentialsOptions =
        VpnChannelRequestCredentialsOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnChannelRequestCredentialsOptions): Int = obj.value
  }
}
