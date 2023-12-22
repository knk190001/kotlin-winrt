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

@ABIMarker(WalletItemKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Wallet.WalletItemKind;i4)")
@WinRTByReference(brClass = WalletItemKind.ByReference::class)
public enum class WalletItemKind(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  Deal(1),
  General(2),
  PaymentInstrument(3),
  Ticket(4),
  BoardingPass(5),
  MembershipCard(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WalletItemKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> Deal
      2 -> General
      3 -> PaymentInstrument
      4 -> Ticket
      5 -> BoardingPass
      6 -> MembershipCard
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WalletItemKind> {
    public fun setValue(newValue: WalletItemKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WalletItemKind =
        WalletItemKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WalletItemKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WalletItemKind =
        WalletItemKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WalletItemKind): Int = obj.value
  }
}
