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

@ABIMarker(PaymentRequestCompletionStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Payments.PaymentRequestCompletionStatus;i4)")
@WinRTByReference(brClass = PaymentRequestCompletionStatus.ByReference::class)
public enum class PaymentRequestCompletionStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  Failed(1),
  Unknown(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PaymentRequestCompletionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> Failed
      2 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PaymentRequestCompletionStatus> {
    public fun setValue(newValue: PaymentRequestCompletionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PaymentRequestCompletionStatus =
        PaymentRequestCompletionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PaymentRequestCompletionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PaymentRequestCompletionStatus =
        PaymentRequestCompletionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: PaymentRequestCompletionStatus): Int = obj.value
  }
}
