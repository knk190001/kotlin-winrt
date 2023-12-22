package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(AppInstallState.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallState;i4)")
@WinRTByReference(brClass = AppInstallState.ByReference::class)
public enum class AppInstallState(
  public val value: Int
) : NativeMapped {
  Pending(0),
  Starting(1),
  AcquiringLicense(2),
  Downloading(3),
  RestoringData(4),
  Installing(5),
  Completed(6),
  Canceled(7),
  Paused(8),
  Error(9),
  PausedLowBattery(10),
  PausedWiFiRecommended(11),
  PausedWiFiRequired(12),
  ReadyToDownload(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppInstallState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pending
      1 -> Starting
      2 -> AcquiringLicense
      3 -> Downloading
      4 -> RestoringData
      5 -> Installing
      6 -> Completed
      7 -> Canceled
      8 -> Paused
      9 -> Error
      10 -> PausedLowBattery
      11 -> PausedWiFiRecommended
      12 -> PausedWiFiRequired
      13 -> ReadyToDownload
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppInstallState> {
    public fun setValue(newValue: AppInstallState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppInstallState =
        AppInstallState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppInstallState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppInstallState =
        AppInstallState.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppInstallState): Int = obj.value
  }
}
