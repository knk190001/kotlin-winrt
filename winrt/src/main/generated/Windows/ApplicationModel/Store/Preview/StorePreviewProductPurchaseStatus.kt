package Windows.ApplicationModel.Store.Preview

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

@ABIMarker(StorePreviewProductPurchaseStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.StorePreviewProductPurchaseStatus;i4)")
@WinRTByReference(brClass = StorePreviewProductPurchaseStatus.ByReference::class)
public enum class StorePreviewProductPurchaseStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  AlreadyPurchased(1),
  NotFulfilled(2),
  NotPurchased(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorePreviewProductPurchaseStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> AlreadyPurchased
      2 -> NotFulfilled
      3 -> NotPurchased
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StorePreviewProductPurchaseStatus> {
    public fun setValue(newValue: StorePreviewProductPurchaseStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorePreviewProductPurchaseStatus =
        StorePreviewProductPurchaseStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorePreviewProductPurchaseStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorePreviewProductPurchaseStatus =
        StorePreviewProductPurchaseStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorePreviewProductPurchaseStatus): Int = obj.value
  }
}
