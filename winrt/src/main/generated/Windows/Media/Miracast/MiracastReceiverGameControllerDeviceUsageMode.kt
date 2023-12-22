package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverGameControllerDeviceUsageMode.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverGameControllerDeviceUsageMode;i4)")
@WinRTByReference(brClass = MiracastReceiverGameControllerDeviceUsageMode.ByReference::class)
public enum class MiracastReceiverGameControllerDeviceUsageMode(
  public val value: Int
) : NativeMapped {
  AsGameController(0),
  AsMouseAndKeyboard(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverGameControllerDeviceUsageMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AsGameController
      1 -> AsMouseAndKeyboard
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverGameControllerDeviceUsageMode> {
    public fun setValue(newValue: MiracastReceiverGameControllerDeviceUsageMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverGameControllerDeviceUsageMode =
        MiracastReceiverGameControllerDeviceUsageMode.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<MiracastReceiverGameControllerDeviceUsageMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverGameControllerDeviceUsageMode =
        MiracastReceiverGameControllerDeviceUsageMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverGameControllerDeviceUsageMode): Int =
        obj.value
  }
}
