package Windows.Devices.Enumeration

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

@ABIMarker(DeviceUnpairingResultStatus.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DeviceUnpairingResultStatus;i4)")
@WinRTByReference(brClass = DeviceUnpairingResultStatus.ByReference::class)
public enum class DeviceUnpairingResultStatus(
  public val value: Int
) : NativeMapped {
  Unpaired(0),
  AlreadyUnpaired(1),
  OperationAlreadyInProgress(2),
  AccessDenied(3),
  Failed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceUnpairingResultStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unpaired
      1 -> AlreadyUnpaired
      2 -> OperationAlreadyInProgress
      3 -> AccessDenied
      4 -> Failed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DeviceUnpairingResultStatus> {
    public fun setValue(newValue: DeviceUnpairingResultStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceUnpairingResultStatus =
        DeviceUnpairingResultStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceUnpairingResultStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceUnpairingResultStatus =
        DeviceUnpairingResultStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceUnpairingResultStatus): Int = obj.value
  }
}
