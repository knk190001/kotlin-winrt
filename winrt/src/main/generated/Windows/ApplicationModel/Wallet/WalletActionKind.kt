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

@ABIMarker(WalletActionKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Wallet.WalletActionKind;i4)")
@WinRTByReference(brClass = WalletActionKind.ByReference::class)
public enum class WalletActionKind(
  public val value: Int
) : NativeMapped {
  OpenItem(0),
  Transaction(1),
  MoreTransactions(2),
  Message(3),
  Verb(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WalletActionKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> OpenItem
      1 -> Transaction
      2 -> MoreTransactions
      3 -> Message
      4 -> Verb
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WalletActionKind> {
    public fun setValue(newValue: WalletActionKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WalletActionKind =
        WalletActionKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WalletActionKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WalletActionKind =
        WalletActionKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WalletActionKind): Int = obj.value
  }
}
