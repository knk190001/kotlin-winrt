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

@ABIMarker(StoreQueueItemExtendedState.ABI::class)
@Signature("enum(Windows.Services.Store.StoreQueueItemExtendedState;i4)")
@WinRTByReference(brClass = StoreQueueItemExtendedState.ByReference::class)
public enum class StoreQueueItemExtendedState(
  public val value: Int
) : NativeMapped {
  ActivePending(0),
  ActiveStarting(1),
  ActiveAcquiringLicense(2),
  ActiveDownloading(3),
  ActiveRestoringData(4),
  ActiveInstalling(5),
  Completed(6),
  Canceled(7),
  Paused(8),
  Error(9),
  PausedPackagesInUse(10),
  PausedLowBattery(11),
  PausedWiFiRecommended(12),
  PausedWiFiRequired(13),
  PausedReadyToInstall(14),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StoreQueueItemExtendedState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ActivePending
      1 -> ActiveStarting
      2 -> ActiveAcquiringLicense
      3 -> ActiveDownloading
      4 -> ActiveRestoringData
      5 -> ActiveInstalling
      6 -> Completed
      7 -> Canceled
      8 -> Paused
      9 -> Error
      10 -> PausedPackagesInUse
      11 -> PausedLowBattery
      12 -> PausedWiFiRecommended
      13 -> PausedWiFiRequired
      14 -> PausedReadyToInstall
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<StoreQueueItemExtendedState> {
    public fun setValue(newValue: StoreQueueItemExtendedState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StoreQueueItemExtendedState =
        StoreQueueItemExtendedState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StoreQueueItemExtendedState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StoreQueueItemExtendedState =
        StoreQueueItemExtendedState.values()[0].fromNative(value, null)

    public override fun toNative(obj: StoreQueueItemExtendedState): Int = obj.value
  }
}
