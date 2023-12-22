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

@ABIMarker(PosPrinterColorCapabilities.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.PosPrinterColorCapabilities;u4)")
@WinRTByReference(brClass = PosPrinterColorCapabilities.ByReference::class)
public enum class PosPrinterColorCapabilities(
  public val value: Int
) : NativeMapped {
  None(0),
  Primary(1),
  Custom1(2),
  Custom2(4),
  Custom3(8),
  Custom4(16),
  Custom5(32),
  Custom6(64),
  Cyan(128),
  Magenta(256),
  Yellow(512),
  Full(1024),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PosPrinterColorCapabilities {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Primary
      2 -> Custom1
      4 -> Custom2
      8 -> Custom3
      16 -> Custom4
      32 -> Custom5
      64 -> Custom6
      128 -> Cyan
      256 -> Magenta
      512 -> Yellow
      1024 -> Full
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PosPrinterColorCapabilities> {
    public fun setValue(newValue: PosPrinterColorCapabilities): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PosPrinterColorCapabilities =
        PosPrinterColorCapabilities.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PosPrinterColorCapabilities, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PosPrinterColorCapabilities =
        PosPrinterColorCapabilities.values()[0].fromNative(value, null)

    public override fun toNative(obj: PosPrinterColorCapabilities): Int = obj.value
  }
}
