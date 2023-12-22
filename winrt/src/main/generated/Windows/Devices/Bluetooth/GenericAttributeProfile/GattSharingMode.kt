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

@ABIMarker(GattSharingMode.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattSharingMode;i4)")
@WinRTByReference(brClass = GattSharingMode.ByReference::class)
public enum class GattSharingMode(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  Exclusive(1),
  SharedReadOnly(2),
  SharedReadAndWrite(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattSharingMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> Exclusive
      2 -> SharedReadOnly
      3 -> SharedReadAndWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattSharingMode> {
    public fun setValue(newValue: GattSharingMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattSharingMode =
        GattSharingMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattSharingMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattSharingMode =
        GattSharingMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattSharingMode): Int = obj.value
  }
}
