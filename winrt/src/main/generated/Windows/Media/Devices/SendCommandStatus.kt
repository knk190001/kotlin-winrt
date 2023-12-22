package Windows.Media.Devices

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

@ABIMarker(SendCommandStatus.ABI::class)
@Signature("enum(Windows.Media.Devices.SendCommandStatus;i4)")
@WinRTByReference(brClass = SendCommandStatus.ByReference::class)
public enum class SendCommandStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  DeviceNotAvailable(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SendCommandStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> DeviceNotAvailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SendCommandStatus> {
    public fun setValue(newValue: SendCommandStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SendCommandStatus =
        SendCommandStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SendCommandStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SendCommandStatus =
        SendCommandStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SendCommandStatus): Int = obj.value
  }
}
