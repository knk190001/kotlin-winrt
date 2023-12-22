package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothCacheMode.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.BluetoothCacheMode;i4)")
@WinRTByReference(brClass = BluetoothCacheMode.ByReference::class)
public enum class BluetoothCacheMode(
  public val value: Int
) : NativeMapped {
  Cached(0),
  Uncached(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BluetoothCacheMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Cached
      1 -> Uncached
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BluetoothCacheMode> {
    public fun setValue(newValue: BluetoothCacheMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BluetoothCacheMode =
        BluetoothCacheMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BluetoothCacheMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BluetoothCacheMode =
        BluetoothCacheMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: BluetoothCacheMode): Int = obj.value
  }
}
