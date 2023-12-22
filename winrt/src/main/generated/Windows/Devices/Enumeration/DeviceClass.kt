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

@ABIMarker(DeviceClass.ABI::class)
@Signature("enum(Windows.Devices.Enumeration.DeviceClass;i4)")
@WinRTByReference(brClass = DeviceClass.ByReference::class)
public enum class DeviceClass(
  public val value: Int
) : NativeMapped {
  All(0),
  AudioCapture(1),
  AudioRender(2),
  PortableStorageDevice(3),
  VideoCapture(4),
  ImageScanner(5),
  Location(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeviceClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> All
      1 -> AudioCapture
      2 -> AudioRender
      3 -> PortableStorageDevice
      4 -> VideoCapture
      5 -> ImageScanner
      6 -> Location
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeviceClass> {
    public fun setValue(newValue: DeviceClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeviceClass =
        DeviceClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeviceClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeviceClass =
        DeviceClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeviceClass): Int = obj.value
  }
}
