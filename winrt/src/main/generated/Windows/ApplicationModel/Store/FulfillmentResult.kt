package Windows.ApplicationModel.Store

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

@ABIMarker(FulfillmentResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.FulfillmentResult;i4)")
@WinRTByReference(brClass = FulfillmentResult.ByReference::class)
public enum class FulfillmentResult(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  NothingToFulfill(1),
  PurchasePending(2),
  PurchaseReverted(3),
  ServerError(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FulfillmentResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> NothingToFulfill
      2 -> PurchasePending
      3 -> PurchaseReverted
      4 -> ServerError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FulfillmentResult> {
    public fun setValue(newValue: FulfillmentResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FulfillmentResult =
        FulfillmentResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FulfillmentResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FulfillmentResult =
        FulfillmentResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: FulfillmentResult): Int = obj.value
  }
}
