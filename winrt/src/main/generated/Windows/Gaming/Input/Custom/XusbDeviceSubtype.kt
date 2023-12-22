package Windows.Gaming.Input.Custom

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

@ABIMarker(XusbDeviceSubtype.ABI::class)
@Signature("enum(Windows.Gaming.Input.Custom.XusbDeviceSubtype;i4)")
@WinRTByReference(brClass = XusbDeviceSubtype.ByReference::class)
public enum class XusbDeviceSubtype(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Gamepad(1),
  ArcadePad(2),
  ArcadeStick(3),
  FlightStick(4),
  Wheel(5),
  Guitar(6),
  GuitarAlternate(7),
  GuitarBass(8),
  DrumKit(9),
  DancePad(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XusbDeviceSubtype {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Gamepad
      2 -> ArcadePad
      3 -> ArcadeStick
      4 -> FlightStick
      5 -> Wheel
      6 -> Guitar
      7 -> GuitarAlternate
      8 -> GuitarBass
      9 -> DrumKit
      10 -> DancePad
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<XusbDeviceSubtype> {
    public fun setValue(newValue: XusbDeviceSubtype): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XusbDeviceSubtype =
        XusbDeviceSubtype.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XusbDeviceSubtype, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XusbDeviceSubtype =
        XusbDeviceSubtype.values()[0].fromNative(value, null)

    public override fun toNative(obj: XusbDeviceSubtype): Int = obj.value
  }
}
