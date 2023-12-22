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

@ABIMarker(UsbEndpointType.ABI::class)
@Signature("enum(Windows.Devices.Usb.UsbEndpointType;i4)")
@WinRTByReference(brClass = UsbEndpointType.ByReference::class)
public enum class UsbEndpointType(
  public val value: Int
) : NativeMapped {
  Control(0),
  Isochronous(1),
  Bulk(2),
  Interrupt(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UsbEndpointType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Control
      1 -> Isochronous
      2 -> Bulk
      3 -> Interrupt
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UsbEndpointType> {
    public fun setValue(newValue: UsbEndpointType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UsbEndpointType =
        UsbEndpointType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UsbEndpointType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UsbEndpointType =
        UsbEndpointType.values()[0].fromNative(value, null)

    public override fun toNative(obj: UsbEndpointType): Int = obj.value
  }
}
