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

@ABIMarker(GattServiceProviderAdvertisementStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderAdvertisementStatus;i4)")
@WinRTByReference(brClass = GattServiceProviderAdvertisementStatus.ByReference::class)
public enum class GattServiceProviderAdvertisementStatus(
  public val value: Int
) : NativeMapped {
  Created(0),
  Stopped(1),
  Started(2),
  Aborted(3),
  StartedWithoutAllAdvertisementData(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattServiceProviderAdvertisementStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Created
      1 -> Stopped
      2 -> Started
      3 -> Aborted
      4 -> StartedWithoutAllAdvertisementData
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<GattServiceProviderAdvertisementStatus> {
    public fun setValue(newValue: GattServiceProviderAdvertisementStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattServiceProviderAdvertisementStatus =
        GattServiceProviderAdvertisementStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattServiceProviderAdvertisementStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattServiceProviderAdvertisementStatus =
        GattServiceProviderAdvertisementStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattServiceProviderAdvertisementStatus): Int = obj.value
  }
}
