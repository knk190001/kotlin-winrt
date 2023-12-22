package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattWriteOption.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattWriteOption;i4)")
@WinRTByReference(brClass = GattWriteOption.ByReference::class)
public enum class GattWriteOption(
  public val value: Int
) : NativeMapped {
  WriteWithResponse(0),
  WriteWithoutResponse(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattWriteOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> WriteWithResponse
      1 -> WriteWithoutResponse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattWriteOption> {
    public fun setValue(newValue: GattWriteOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattWriteOption =
        GattWriteOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattWriteOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattWriteOption =
        GattWriteOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattWriteOption): Int = obj.value
  }
}
