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

@ABIMarker(GattCommunicationStatus.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus;i4)")
@WinRTByReference(brClass = GattCommunicationStatus.ByReference::class)
public enum class GattCommunicationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  Unreachable(1),
  ProtocolError(2),
  AccessDenied(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattCommunicationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> Unreachable
      2 -> ProtocolError
      3 -> AccessDenied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattCommunicationStatus> {
    public fun setValue(newValue: GattCommunicationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattCommunicationStatus =
        GattCommunicationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattCommunicationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattCommunicationStatus =
        GattCommunicationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattCommunicationStatus): Int = obj.value
  }
}
