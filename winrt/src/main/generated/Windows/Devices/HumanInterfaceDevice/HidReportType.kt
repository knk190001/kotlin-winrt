package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidReportType.ABI::class)
@Signature("enum(Windows.Devices.HumanInterfaceDevice.HidReportType;i4)")
@WinRTByReference(brClass = HidReportType.ByReference::class)
public enum class HidReportType(
  public val value: Int
) : NativeMapped {
  Input(0),
  Output(1),
  Feature(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HidReportType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Input
      1 -> Output
      2 -> Feature
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HidReportType> {
    public fun setValue(newValue: HidReportType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HidReportType =
        HidReportType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HidReportType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HidReportType =
        HidReportType.values()[0].fromNative(value, null)

    public override fun toNative(obj: HidReportType): Int = obj.value
  }
}
