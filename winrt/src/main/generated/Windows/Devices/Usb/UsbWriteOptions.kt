package Windows.Devices.Usb

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

@ABIMarker(UsbWriteOptions.ABI::class)
@Signature("enum(Windows.Devices.Usb.UsbWriteOptions;u4)")
@WinRTByReference(brClass = UsbWriteOptions.ByReference::class)
public enum class UsbWriteOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  AutoClearStall(1),
  ShortPacketTerminate(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UsbWriteOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AutoClearStall
      2 -> ShortPacketTerminate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UsbWriteOptions> {
    public fun setValue(newValue: UsbWriteOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UsbWriteOptions =
        UsbWriteOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UsbWriteOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UsbWriteOptions =
        UsbWriteOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: UsbWriteOptions): Int = obj.value
  }
}
