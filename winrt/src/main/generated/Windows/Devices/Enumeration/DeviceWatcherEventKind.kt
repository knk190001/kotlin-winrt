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

@ABIMarker(DeviceWatcherEventKind.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DeviceWatcherEventKind;i4)")
@WinRTByReference(brClass = DeviceWatcherEventKind.ByReference::class)
public enum class DeviceWatcherEventKind(
  public val value: Int
) : NativeMapped {
  Add(0),
  Update(1),
  Remove(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceWatcherEventKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Add
      1 -> Update
      2 -> Remove
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeviceWatcherEventKind> {
    public fun setValue(newValue: DeviceWatcherEventKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceWatcherEventKind =
        DeviceWatcherEventKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceWatcherEventKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceWatcherEventKind =
        DeviceWatcherEventKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceWatcherEventKind): Int = obj.value
  }
}
