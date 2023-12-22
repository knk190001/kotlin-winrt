package Windows.Devices.PointOfService

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

@ABIMarker(PosPrinterCartridgeSensors.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterCartridgeSensors;u4)")
@WinRTByReference(brClass = PosPrinterCartridgeSensors.ByReference::class)
public enum class PosPrinterCartridgeSensors(
  public val value: Int
) : NativeMapped {
  None(0),
  Removed(1),
  Empty(2),
  HeadCleaning(4),
  NearEnd(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterCartridgeSensors {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Removed
      2 -> Empty
      4 -> HeadCleaning
      8 -> NearEnd
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PosPrinterCartridgeSensors> {
    public fun setValue(newValue: PosPrinterCartridgeSensors): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterCartridgeSensors =
        PosPrinterCartridgeSensors.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterCartridgeSensors, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterCartridgeSensors =
        PosPrinterCartridgeSensors.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterCartridgeSensors): Int = obj.value
  }
}
