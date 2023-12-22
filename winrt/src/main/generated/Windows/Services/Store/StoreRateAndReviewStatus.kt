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

@ABIMarker(StoreRateAndReviewStatus.ABI::class)
@Signature("enum(Windows.Services.Store.StoreRateAndReviewStatus;i4)")
@WinRTByReference(brClass = StoreRateAndReviewStatus.ByReference::class)
public enum class StoreRateAndReviewStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  CanceledByUser(1),
  NetworkError(2),
  Error(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StoreRateAndReviewStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> CanceledByUser
      2 -> NetworkError
      3 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StoreRateAndReviewStatus>
      {
    public fun setValue(newValue: StoreRateAndReviewStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StoreRateAndReviewStatus =
        StoreRateAndReviewStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StoreRateAndReviewStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StoreRateAndReviewStatus =
        StoreRateAndReviewStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: StoreRateAndReviewStatus): Int = obj.value
  }
}
