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

@ABIMarker(DevicePickerDisplayStatusOptions.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions;u4)")
@WinRTByReference(brClass = DevicePickerDisplayStatusOptions.ByReference::class)
public enum class DevicePickerDisplayStatusOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ShowProgress(1),
  ShowDisconnectButton(2),
  ShowRetryButton(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DevicePickerDisplayStatusOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ShowProgress
      2 -> ShowDisconnectButton
      4 -> ShowRetryButton
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DevicePickerDisplayStatusOptions> {
    public fun setValue(newValue: DevicePickerDisplayStatusOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DevicePickerDisplayStatusOptions =
        DevicePickerDisplayStatusOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DevicePickerDisplayStatusOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DevicePickerDisplayStatusOptions =
        DevicePickerDisplayStatusOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DevicePickerDisplayStatusOptions): Int = obj.value
  }
}
