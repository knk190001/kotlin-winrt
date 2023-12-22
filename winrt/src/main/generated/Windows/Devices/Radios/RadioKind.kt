package Windows.Devices.Radios

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

@ABIMarker(RadioKind.ABI::class)
@Signature("enum(Windows.Devices.Radios.RadioKind;i4)")
@WinRTByReference(brClass = RadioKind.ByReference::class)
public enum class RadioKind(
  public val value: Int
) : NativeMapped {
  Other(0),
  WiFi(1),
  MobileBroadband(2),
  Bluetooth(3),
  FM(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?): RadioKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Other
      1 -> WiFi
      2 -> MobileBroadband
      3 -> Bluetooth
      4 -> FM
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RadioKind> {
    public fun setValue(newValue: RadioKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RadioKind =
        RadioKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RadioKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RadioKind =
        RadioKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: RadioKind): Int = obj.value
  }
}
