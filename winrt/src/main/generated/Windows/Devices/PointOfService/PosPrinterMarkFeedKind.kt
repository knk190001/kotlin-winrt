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

@ABIMarker(PosPrinterMarkFeedKind.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterMarkFeedKind;i4)")
@WinRTByReference(brClass = PosPrinterMarkFeedKind.ByReference::class)
public enum class PosPrinterMarkFeedKind(
  public val value: Int
) : NativeMapped {
  ToTakeUp(0),
  ToCutter(1),
  ToCurrentTopOfForm(2),
  ToNextTopOfForm(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterMarkFeedKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ToTakeUp
      1 -> ToCutter
      2 -> ToCurrentTopOfForm
      3 -> ToNextTopOfForm
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosPrinterMarkFeedKind> {
    public fun setValue(newValue: PosPrinterMarkFeedKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterMarkFeedKind =
        PosPrinterMarkFeedKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterMarkFeedKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterMarkFeedKind =
        PosPrinterMarkFeedKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterMarkFeedKind): Int = obj.value
  }
}
