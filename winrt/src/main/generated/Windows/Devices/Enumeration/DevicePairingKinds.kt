package Windows.Devices.Enumeration

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

@ABIMarker(DevicePairingKinds.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DevicePairingKinds;u4)")
@WinRTByReference(brClass = DevicePairingKinds.ByReference::class)
public enum class DevicePairingKinds(
  public val value: Int
) : NativeMapped {
  None(0),
  ConfirmOnly(1),
  DisplayPin(2),
  ProvidePin(4),
  ConfirmPinMatch(8),
  ProvidePasswordCredential(16),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DevicePairingKinds {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ConfirmOnly
      2 -> DisplayPin
      4 -> ProvidePin
      8 -> ConfirmPinMatch
      16 -> ProvidePasswordCredential
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DevicePairingKinds> {
    public fun setValue(newValue: DevicePairingKinds): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DevicePairingKinds =
        DevicePairingKinds.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DevicePairingKinds, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DevicePairingKinds =
        DevicePairingKinds.values()[0].fromNative(value, null)

    public override fun toNative(obj: DevicePairingKinds): Int = obj.value
  }
}
