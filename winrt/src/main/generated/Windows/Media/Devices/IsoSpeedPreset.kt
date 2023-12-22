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

@ABIMarker(IsoSpeedPreset.ABI::class)
@Signature("enum(Windows.Media.Devices.IsoSpeedPreset;i4)")
@WinRTByReference(brClass = IsoSpeedPreset.ByReference::class)
public enum class IsoSpeedPreset(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Iso50(1),
  Iso80(2),
  Iso100(3),
  Iso200(4),
  Iso400(5),
  Iso800(6),
  Iso1600(7),
  Iso3200(8),
  Iso6400(9),
  Iso12800(10),
  Iso25600(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsoSpeedPreset {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Iso50
      2 -> Iso80
      3 -> Iso100
      4 -> Iso200
      5 -> Iso400
      6 -> Iso800
      7 -> Iso1600
      8 -> Iso3200
      9 -> Iso6400
      10 -> Iso12800
      11 -> Iso25600
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IsoSpeedPreset> {
    public fun setValue(newValue: IsoSpeedPreset): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsoSpeedPreset =
        IsoSpeedPreset.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IsoSpeedPreset, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsoSpeedPreset =
        IsoSpeedPreset.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsoSpeedPreset): Int = obj.value
  }
}
