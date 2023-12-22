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

@ABIMarker(StorePackageUpdateState.ABI::class)
@Signature("enum(Windows.Services.Store.StorePackageUpdateState;i4)")
@WinRTByReference(brClass = StorePackageUpdateState.ByReference::class)
public enum class StorePackageUpdateState(
  public val value: Int
) : NativeMapped {
  Pending(0),
  Downloading(1),
  Deploying(2),
  Completed(3),
  Canceled(4),
  OtherError(5),
  ErrorLowBattery(6),
  ErrorWiFiRecommended(7),
  ErrorWiFiRequired(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StorePackageUpdateState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Pending
      1 -> Downloading
      2 -> Deploying
      3 -> Completed
      4 -> Canceled
      5 -> OtherError
      6 -> ErrorLowBattery
      7 -> ErrorWiFiRecommended
      8 -> ErrorWiFiRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StorePackageUpdateState> {
    public fun setValue(newValue: StorePackageUpdateState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StorePackageUpdateState =
        StorePackageUpdateState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StorePackageUpdateState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StorePackageUpdateState =
        StorePackageUpdateState.values()[0].fromNative(value, null)

    public override fun toNative(obj: StorePackageUpdateState): Int = obj.value
  }
}
