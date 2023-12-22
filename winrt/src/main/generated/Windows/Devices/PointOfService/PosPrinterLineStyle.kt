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

@ABIMarker(PosPrinterLineStyle.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterLineStyle;i4)")
@WinRTByReference(brClass = PosPrinterLineStyle.ByReference::class)
public enum class PosPrinterLineStyle(
  public val value: Int
) : NativeMapped {
  SingleSolid(0),
  DoubleSolid(1),
  Broken(2),
  Chain(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterLineStyle {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> SingleSolid
      1 -> DoubleSolid
      2 -> Broken
      3 -> Chain
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosPrinterLineStyle> {
    public fun setValue(newValue: PosPrinterLineStyle): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterLineStyle =
        PosPrinterLineStyle.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterLineStyle, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterLineStyle =
        PosPrinterLineStyle.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterLineStyle): Int = obj.value
  }
}
