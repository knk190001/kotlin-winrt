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

@ABIMarker(GattCharacteristicProperties.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicProperties;u4)")
@WinRTByReference(brClass = GattCharacteristicProperties.ByReference::class)
public enum class GattCharacteristicProperties(
  public val value: Int
) : NativeMapped {
  None(0),
  Broadcast(1),
  Read(2),
  WriteWithoutResponse(4),
  Write(8),
  Notify(16),
  Indicate(32),
  AuthenticatedSignedWrites(64),
  ExtendedProperties(128),
  ReliableWrites(256),
  WritableAuxiliaries(512),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattCharacteristicProperties {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Broadcast
      2 -> Read
      4 -> WriteWithoutResponse
      8 -> Write
      16 -> Notify
      32 -> Indicate
      64 -> AuthenticatedSignedWrites
      128 -> ExtendedProperties
      256 -> ReliableWrites
      512 -> WritableAuxiliaries
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GattCharacteristicProperties> {
    public fun setValue(newValue: GattCharacteristicProperties): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattCharacteristicProperties =
        GattCharacteristicProperties.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattCharacteristicProperties, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattCharacteristicProperties =
        GattCharacteristicProperties.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattCharacteristicProperties): Int = obj.value
  }
}
