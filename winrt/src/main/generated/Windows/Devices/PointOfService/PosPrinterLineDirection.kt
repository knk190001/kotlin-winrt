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

@ABIMarker(PosPrinterLineDirection.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterLineDirection;i4)")
@WinRTByReference(brClass = PosPrinterLineDirection.ByReference::class)
public enum class PosPrinterLineDirection(
  public val value: Int
) : NativeMapped {
  Horizontal(0),
  Vertical(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterLineDirection {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Horizontal
      1 -> Vertical
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosPrinterLineDirection> {
    public fun setValue(newValue: PosPrinterLineDirection): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterLineDirection =
        PosPrinterLineDirection.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterLineDirection, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterLineDirection =
        PosPrinterLineDirection.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterLineDirection): Int = obj.value
  }
}
