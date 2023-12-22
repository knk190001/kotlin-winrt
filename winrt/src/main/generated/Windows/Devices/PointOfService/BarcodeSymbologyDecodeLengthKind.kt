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

@ABIMarker(BarcodeSymbologyDecodeLengthKind.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.BarcodeSymbologyDecodeLengthKind;i4)")
@WinRTByReference(brClass = BarcodeSymbologyDecodeLengthKind.ByReference::class)
public enum class BarcodeSymbologyDecodeLengthKind(
  public val value: Int
) : NativeMapped {
  AnyLength(0),
  Discrete(1),
  Range(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BarcodeSymbologyDecodeLengthKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AnyLength
      1 -> Discrete
      2 -> Range
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BarcodeSymbologyDecodeLengthKind> {
    public fun setValue(newValue: BarcodeSymbologyDecodeLengthKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BarcodeSymbologyDecodeLengthKind =
        BarcodeSymbologyDecodeLengthKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BarcodeSymbologyDecodeLengthKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BarcodeSymbologyDecodeLengthKind =
        BarcodeSymbologyDecodeLengthKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: BarcodeSymbologyDecodeLengthKind): Int = obj.value
  }
}
