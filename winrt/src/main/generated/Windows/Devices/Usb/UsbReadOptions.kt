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

@ABIMarker(UsbReadOptions.ABI::class)
@Signature("enum(Windows.Devices.Usb.UsbReadOptions;u4)")
@WinRTByReference(brClass = UsbReadOptions.ByReference::class)
public enum class UsbReadOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  AutoClearStall(1),
  OverrideAutomaticBufferManagement(2),
  IgnoreShortPacket(4),
  AllowPartialReads(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UsbReadOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AutoClearStall
      2 -> OverrideAutomaticBufferManagement
      4 -> IgnoreShortPacket
      8 -> AllowPartialReads
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UsbReadOptions> {
    public fun setValue(newValue: UsbReadOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UsbReadOptions =
        UsbReadOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UsbReadOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UsbReadOptions =
        UsbReadOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: UsbReadOptions): Int = obj.value
  }
}
