package Windows.Devices.Enumeration.Pnp

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

@ABIMarker(PnpObjectType.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.Pnp.PnpObjectType;i4)")
@WinRTByReference(brClass = PnpObjectType.ByReference::class)
public enum class PnpObjectType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  DeviceInterface(1),
  DeviceContainer(2),
  Device(3),
  DeviceInterfaceClass(4),
  AssociationEndpoint(5),
  AssociationEndpointContainer(6),
  AssociationEndpointService(7),
  DevicePanel(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PnpObjectType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> DeviceInterface
      2 -> DeviceContainer
      3 -> Device
      4 -> DeviceInterfaceClass
      5 -> AssociationEndpoint
      6 -> AssociationEndpointContainer
      7 -> AssociationEndpointService
      8 -> DevicePanel
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PnpObjectType> {
    public fun setValue(newValue: PnpObjectType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PnpObjectType =
        PnpObjectType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PnpObjectType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PnpObjectType =
        PnpObjectType.values()[0].fromNative(value, null)

    public override fun toNative(obj: PnpObjectType): Int = obj.value
  }
}
