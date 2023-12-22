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

@ABIMarker(DeliveryOptimizationDownloadMode.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.DeliveryOptimizationDownloadMode;i4)")
@WinRTByReference(brClass = DeliveryOptimizationDownloadMode.ByReference::class)
public enum class DeliveryOptimizationDownloadMode(
  public val value: Int
) : NativeMapped {
  Simple(0),
  HttpOnly(1),
  Lan(2),
  Group(3),
  Internet(4),
  Bypass(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeliveryOptimizationDownloadMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Simple
      1 -> HttpOnly
      2 -> Lan
      3 -> Group
      4 -> Internet
      5 -> Bypass
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DeliveryOptimizationDownloadMode> {
    public fun setValue(newValue: DeliveryOptimizationDownloadMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeliveryOptimizationDownloadMode =
        DeliveryOptimizationDownloadMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeliveryOptimizationDownloadMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeliveryOptimizationDownloadMode =
        DeliveryOptimizationDownloadMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeliveryOptimizationDownloadMode): Int = obj.value
  }
}
