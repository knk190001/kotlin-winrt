package Windows.ApplicationModel.Wallet.System

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

@ABIMarker(WalletItemAppAssociation.ABI::class)
@Signature("enum(Windows.ApplicationModel.Wallet.System.WalletItemAppAssociation;i4)")
@WinRTByReference(brClass = WalletItemAppAssociation.ByReference::class)
public enum class WalletItemAppAssociation(
  public val value: Int
) : NativeMapped {
  None(0),
  AppInstalled(1),
  AppNotInstalled(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WalletItemAppAssociation {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> AppInstalled
      2 -> AppNotInstalled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WalletItemAppAssociation>
      {
    public fun setValue(newValue: WalletItemAppAssociation): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WalletItemAppAssociation =
        WalletItemAppAssociation.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WalletItemAppAssociation, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WalletItemAppAssociation =
        WalletItemAppAssociation.values()[0].fromNative(value, null)

    public override fun toNative(obj: WalletItemAppAssociation): Int = obj.value
  }
}
