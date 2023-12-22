package Windows.ApplicationModel.Payments

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

@ABIMarker(PaymentCanMakePaymentResultStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Payments.PaymentCanMakePaymentResultStatus;i4)")
@WinRTByReference(brClass = PaymentCanMakePaymentResultStatus.ByReference::class)
public enum class PaymentCanMakePaymentResultStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Yes(1),
  No(2),
  NotAllowed(3),
  UserNotSignedIn(4),
  SpecifiedPaymentMethodIdsNotSupported(5),
  NoQualifyingCardOnFile(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PaymentCanMakePaymentResultStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Yes
      2 -> No
      3 -> NotAllowed
      4 -> UserNotSignedIn
      5 -> SpecifiedPaymentMethodIdsNotSupported
      6 -> NoQualifyingCardOnFile
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PaymentCanMakePaymentResultStatus> {
    public fun setValue(newValue: PaymentCanMakePaymentResultStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PaymentCanMakePaymentResultStatus =
        PaymentCanMakePaymentResultStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PaymentCanMakePaymentResultStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PaymentCanMakePaymentResultStatus =
        PaymentCanMakePaymentResultStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PaymentCanMakePaymentResultStatus): Int = obj.value
  }
}
