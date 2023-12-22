package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectDeviceSelectorType.ABI::class)
@Signature("enum(Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType;i4)")
@WinRTByReference(brClass = WiFiDirectDeviceSelectorType.ByReference::class)
public enum class WiFiDirectDeviceSelectorType(
  public val value: Int
) : NativeMapped {
  DeviceInterface(0),
  AssociationEndpoint(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WiFiDirectDeviceSelectorType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DeviceInterface
      1 -> AssociationEndpoint
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<WiFiDirectDeviceSelectorType> {
    public fun setValue(newValue: WiFiDirectDeviceSelectorType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WiFiDirectDeviceSelectorType =
        WiFiDirectDeviceSelectorType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WiFiDirectDeviceSelectorType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WiFiDirectDeviceSelectorType =
        WiFiDirectDeviceSelectorType.values()[0].fromNative(value, null)

    public override fun toNative(obj: WiFiDirectDeviceSelectorType): Int = obj.value
  }
}
