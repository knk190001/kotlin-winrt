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

@ABIMarker(PosPrinterColorCartridge.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterColorCartridge;i4)")
@WinRTByReference(brClass = PosPrinterColorCartridge.ByReference::class)
public enum class PosPrinterColorCartridge(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Primary(1),
  Custom1(2),
  Custom2(3),
  Custom3(4),
  Custom4(5),
  Custom5(6),
  Custom6(7),
  Cyan(8),
  Magenta(9),
  Yellow(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterColorCartridge {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Primary
      2 -> Custom1
      3 -> Custom2
      4 -> Custom3
      5 -> Custom4
      6 -> Custom5
      7 -> Custom6
      8 -> Cyan
      9 -> Magenta
      10 -> Yellow
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PosPrinterColorCartridge>
      {
    public fun setValue(newValue: PosPrinterColorCartridge): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterColorCartridge =
        PosPrinterColorCartridge.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterColorCartridge, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterColorCartridge =
        PosPrinterColorCartridge.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterColorCartridge): Int = obj.value
  }
}
