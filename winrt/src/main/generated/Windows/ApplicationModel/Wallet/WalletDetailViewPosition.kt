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

@ABIMarker(WalletDetailViewPosition.ABI::class)
@Signature("enum(Windows.ApplicationModel.Wallet.WalletDetailViewPosition;i4)")
@WinRTByReference(brClass = WalletDetailViewPosition.ByReference::class)
public enum class WalletDetailViewPosition(
  public val value: Int
) : NativeMapped {
  Hidden(0),
  HeaderField1(1),
  HeaderField2(2),
  PrimaryField1(3),
  PrimaryField2(4),
  SecondaryField1(5),
  SecondaryField2(6),
  SecondaryField3(7),
  SecondaryField4(8),
  SecondaryField5(9),
  CenterField1(10),
  FooterField1(11),
  FooterField2(12),
  FooterField3(13),
  FooterField4(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WalletDetailViewPosition {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Hidden
      1 -> HeaderField1
      2 -> HeaderField2
      3 -> PrimaryField1
      4 -> PrimaryField2
      5 -> SecondaryField1
      6 -> SecondaryField2
      7 -> SecondaryField3
      8 -> SecondaryField4
      9 -> SecondaryField5
      10 -> CenterField1
      11 -> FooterField1
      12 -> FooterField2
      13 -> FooterField3
      14 -> FooterField4
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WalletDetailViewPosition>
      {
    public fun setValue(newValue: WalletDetailViewPosition): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WalletDetailViewPosition =
        WalletDetailViewPosition.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WalletDetailViewPosition, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WalletDetailViewPosition =
        WalletDetailViewPosition.values()[0].fromNative(value, null)

    public override fun toNative(obj: WalletDetailViewPosition): Int = obj.value
  }
}
