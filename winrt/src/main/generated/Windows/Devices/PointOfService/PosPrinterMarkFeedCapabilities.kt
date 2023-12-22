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

@ABIMarker(PosPrinterMarkFeedCapabilities.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterMarkFeedCapabilities;u4)")
@WinRTByReference(brClass = PosPrinterMarkFeedCapabilities.ByReference::class)
public enum class PosPrinterMarkFeedCapabilities(
  public val value: Int
) : NativeMapped {
  None(0),
  ToTakeUp(1),
  ToCutter(2),
  ToCurrentTopOfForm(4),
  ToNextTopOfForm(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterMarkFeedCapabilities {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ToTakeUp
      2 -> ToCutter
      4 -> ToCurrentTopOfForm
      8 -> ToNextTopOfForm
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PosPrinterMarkFeedCapabilities> {
    public fun setValue(newValue: PosPrinterMarkFeedCapabilities): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterMarkFeedCapabilities =
        PosPrinterMarkFeedCapabilities.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterMarkFeedCapabilities, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterMarkFeedCapabilities =
        PosPrinterMarkFeedCapabilities.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterMarkFeedCapabilities): Int = obj.value
  }
}
