package Windows.Devices.Display

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

@ABIMarker(DisplayMonitorPhysicalConnectorKind.ABI::class)
@Signature("enum(Windows.Devices.Display.DisplayMonitorPhysicalConnectorKind;i4)")
@WinRTByReference(brClass = DisplayMonitorPhysicalConnectorKind.ByReference::class)
public enum class DisplayMonitorPhysicalConnectorKind(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  HD15(1),
  AnalogTV(2),
  Dvi(3),
  Hdmi(4),
  Lvds(5),
  Sdi(6),
  DisplayPort(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisplayMonitorPhysicalConnectorKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> HD15
      2 -> AnalogTV
      3 -> Dvi
      4 -> Hdmi
      5 -> Lvds
      6 -> Sdi
      7 -> DisplayPort
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisplayMonitorPhysicalConnectorKind> {
    public fun setValue(newValue: DisplayMonitorPhysicalConnectorKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisplayMonitorPhysicalConnectorKind =
        DisplayMonitorPhysicalConnectorKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisplayMonitorPhysicalConnectorKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisplayMonitorPhysicalConnectorKind =
        DisplayMonitorPhysicalConnectorKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisplayMonitorPhysicalConnectorKind): Int = obj.value
  }
}
