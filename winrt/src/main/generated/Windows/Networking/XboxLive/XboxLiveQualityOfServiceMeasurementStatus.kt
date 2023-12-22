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

@ABIMarker(XboxLiveQualityOfServiceMeasurementStatus.ABI::class)
@Signature("enum(Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurementStatus;i4)")
@WinRTByReference(brClass = XboxLiveQualityOfServiceMeasurementStatus.ByReference::class)
public enum class XboxLiveQualityOfServiceMeasurementStatus(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  InProgress(1),
  InProgressWithProvisionalResults(2),
  Succeeded(3),
  NoLocalNetworks(4),
  NoCompatibleNetworkPaths(5),
  LocalSystemNotAuthorized(6),
  Canceled(7),
  TimedOut(8),
  RemoteSystemNotAuthorized(9),
  RefusedDueToConfiguration(10),
  UnexpectedInternalError(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      XboxLiveQualityOfServiceMeasurementStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> InProgress
      2 -> InProgressWithProvisionalResults
      3 -> Succeeded
      4 -> NoLocalNetworks
      5 -> NoCompatibleNetworkPaths
      6 -> LocalSystemNotAuthorized
      7 -> Canceled
      8 -> TimedOut
      9 -> RemoteSystemNotAuthorized
      10 -> RefusedDueToConfiguration
      11 -> UnexpectedInternalError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<XboxLiveQualityOfServiceMeasurementStatus> {
    public fun setValue(newValue: XboxLiveQualityOfServiceMeasurementStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): XboxLiveQualityOfServiceMeasurementStatus =
        XboxLiveQualityOfServiceMeasurementStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<XboxLiveQualityOfServiceMeasurementStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): XboxLiveQualityOfServiceMeasurementStatus =
        XboxLiveQualityOfServiceMeasurementStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: XboxLiveQualityOfServiceMeasurementStatus): Int = obj.value
  }
}
