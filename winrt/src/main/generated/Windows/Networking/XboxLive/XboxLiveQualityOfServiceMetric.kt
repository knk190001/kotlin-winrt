package Windows.Networking.XboxLive

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

@ABIMarker(XboxLiveQualityOfServiceMetric.ABI::class)
@Signature("enum(Windows.Networking.XboxLive.XboxLiveQualityOfServiceMetric;i4)")
@WinRTByReference(brClass = XboxLiveQualityOfServiceMetric.ByReference::class)
public enum class XboxLiveQualityOfServiceMetric(
  public val value: Int
) : NativeMapped {
  AverageLatencyInMilliseconds(0),
  MinLatencyInMilliseconds(1),
  MaxLatencyInMilliseconds(2),
  AverageOutboundBitsPerSecond(3),
  MinOutboundBitsPerSecond(4),
  MaxOutboundBitsPerSecond(5),
  AverageInboundBitsPerSecond(6),
  MinInboundBitsPerSecond(7),
  MaxInboundBitsPerSecond(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XboxLiveQualityOfServiceMetric {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> AverageLatencyInMilliseconds
      1 -> MinLatencyInMilliseconds
      2 -> MaxLatencyInMilliseconds
      3 -> AverageOutboundBitsPerSecond
      4 -> MinOutboundBitsPerSecond
      5 -> MaxOutboundBitsPerSecond
      6 -> AverageInboundBitsPerSecond
      7 -> MinInboundBitsPerSecond
      8 -> MaxInboundBitsPerSecond
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XboxLiveQualityOfServiceMetric> {
    public fun setValue(newValue: XboxLiveQualityOfServiceMetric): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XboxLiveQualityOfServiceMetric =
        XboxLiveQualityOfServiceMetric.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<XboxLiveQualityOfServiceMetric, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XboxLiveQualityOfServiceMetric =
        XboxLiveQualityOfServiceMetric.values()[0].fromNative(value, null)

    public override fun toNative(obj: XboxLiveQualityOfServiceMetric): Int = obj.value
  }
}
