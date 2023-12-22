package Windows.Networking.Connectivity

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

@ABIMarker(DataUsageGranularity.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.DataUsageGranularity;i4)")
@WinRTByReference(brClass = DataUsageGranularity.ByReference::class)
public enum class DataUsageGranularity(
  public val value: Int
) : NativeMapped {
  PerMinute(0),
  PerHour(1),
  PerDay(2),
  Total(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DataUsageGranularity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PerMinute
      1 -> PerHour
      2 -> PerDay
      3 -> Total
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DataUsageGranularity> {
    public fun setValue(newValue: DataUsageGranularity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DataUsageGranularity =
        DataUsageGranularity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DataUsageGranularity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DataUsageGranularity =
        DataUsageGranularity.values()[0].fromNative(value, null)

    public override fun toNative(obj: DataUsageGranularity): Int = obj.value
  }
}
