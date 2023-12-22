package Windows.ApplicationModel.Wallet

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

@ABIMarker(WalletBarcodeSymbology.ABI::class)
@Signature("enum(Windows.ApplicationModel.Wallet.WalletBarcodeSymbology;i4)")
@WinRTByReference(brClass = WalletBarcodeSymbology.ByReference::class)
public enum class WalletBarcodeSymbology(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  Upca(1),
  Upce(2),
  Ean13(3),
  Ean8(4),
  Itf(5),
  Code39(6),
  Code128(7),
  Qr(8),
  Pdf417(9),
  Aztec(10),
  Custom(100000),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WalletBarcodeSymbology {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> Upca
      2 -> Upce
      3 -> Ean13
      4 -> Ean8
      5 -> Itf
      6 -> Code39
      7 -> Code128
      8 -> Qr
      9 -> Pdf417
      10 -> Aztec
      100000 -> Custom
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WalletBarcodeSymbology> {
    public fun setValue(newValue: WalletBarcodeSymbology): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WalletBarcodeSymbology =
        WalletBarcodeSymbology.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WalletBarcodeSymbology, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WalletBarcodeSymbology =
        WalletBarcodeSymbology.values()[0].fromNative(value, null)

    public override fun toNative(obj: WalletBarcodeSymbology): Int = obj.value
  }
}
