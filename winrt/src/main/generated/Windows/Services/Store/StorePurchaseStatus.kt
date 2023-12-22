package Windows.Services.Store

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

@ABIMarker(StorePurchaseStatus.ABI::class)
@Signature("enum(Windows.Services.Store.StorePurchaseStatus;i4)")
@WinRTByReference(brClass = StorePurchaseStatus.ByReference::class)
public enum class StorePurchaseStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  AlreadyPurchased(1),
  NotPurchased(2),
  NetworkError(3),
  ServerError(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorePurchaseStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> AlreadyPurchased
      2 -> NotPurchased
      3 -> NetworkError
      4 -> ServerError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StorePurchaseStatus> {
    public fun setValue(newValue: StorePurchaseStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorePurchaseStatus =
        StorePurchaseStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorePurchaseStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorePurchaseStatus =
        StorePurchaseStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorePurchaseStatus): Int = obj.value
  }
}
