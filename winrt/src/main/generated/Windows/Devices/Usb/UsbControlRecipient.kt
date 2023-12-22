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

@ABIMarker(UsbControlRecipient.ABI::class)
@Signature("enum(Windows.Devices.Usb.UsbControlRecipient;i4)")
@WinRTByReference(brClass = UsbControlRecipient.ByReference::class)
public enum class UsbControlRecipient(
  public val value: Int
) : NativeMapped {
  Device(0),
  SpecifiedInterface(1),
  Endpoint(2),
  Other(3),
  DefaultInterface(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UsbControlRecipient {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Device
      1 -> SpecifiedInterface
      2 -> Endpoint
      3 -> Other
      4 -> DefaultInterface
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UsbControlRecipient> {
    public fun setValue(newValue: UsbControlRecipient): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UsbControlRecipient =
        UsbControlRecipient.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UsbControlRecipient, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UsbControlRecipient =
        UsbControlRecipient.values()[0].fromNative(value, null)

    public override fun toNative(obj: UsbControlRecipient): Int = obj.value
  }
}
