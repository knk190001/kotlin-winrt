package Windows.Devices.Bluetooth.Background

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

@ABIMarker(BluetoothEventTriggeringMode.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.Background.BluetoothEventTriggeringMode;i4)")
@WinRTByReference(brClass = BluetoothEventTriggeringMode.ByReference::class)
public enum class BluetoothEventTriggeringMode(
  public val value: Int
) : NativeMapped {
  Serial(0),
  Batch(1),
  KeepLatest(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothEventTriggeringMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Serial
      1 -> Batch
      2 -> KeepLatest
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BluetoothEventTriggeringMode> {
    public fun setValue(newValue: BluetoothEventTriggeringMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothEventTriggeringMode =
        BluetoothEventTriggeringMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothEventTriggeringMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothEventTriggeringMode =
        BluetoothEventTriggeringMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothEventTriggeringMode): Int = obj.value
  }
}
