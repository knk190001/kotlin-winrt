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

@ABIMarker(CaptureSceneMode.ABI::class)
@Signature("enum(Windows.Media.Devices.CaptureSceneMode;i4)")
@WinRTByReference(brClass = CaptureSceneMode.ByReference::class)
public enum class CaptureSceneMode(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Manual(1),
  Macro(2),
  Portrait(3),
  Sport(4),
  Snow(5),
  Night(6),
  Beach(7),
  Sunset(8),
  Candlelight(9),
  Landscape(10),
  NightPortrait(11),
  Backlit(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CaptureSceneMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Manual
      2 -> Macro
      3 -> Portrait
      4 -> Sport
      5 -> Snow
      6 -> Night
      7 -> Beach
      8 -> Sunset
      9 -> Candlelight
      10 -> Landscape
      11 -> NightPortrait
      12 -> Backlit
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CaptureSceneMode> {
    public fun setValue(newValue: CaptureSceneMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CaptureSceneMode =
        CaptureSceneMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CaptureSceneMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CaptureSceneMode =
        CaptureSceneMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CaptureSceneMode): Int = obj.value
  }
}
