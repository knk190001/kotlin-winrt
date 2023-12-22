package Windows.Services.Maps.OfflineMaps

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

@ABIMarker(OfflineMapPackageStatus.ABI::class)
@Signature("enum(Windows.Services.Maps.OfflineMaps.OfflineMapPackageStatus;i4)")
@WinRTByReference(brClass = OfflineMapPackageStatus.ByReference::class)
public enum class OfflineMapPackageStatus(
  public val value: Int
) : NativeMapped {
  NotDownloaded(0),
  Downloading(1),
  Downloaded(2),
  Deleting(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      OfflineMapPackageStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotDownloaded
      1 -> Downloading
      2 -> Downloaded
      3 -> Deleting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<OfflineMapPackageStatus> {
    public fun setValue(newValue: OfflineMapPackageStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): OfflineMapPackageStatus =
        OfflineMapPackageStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<OfflineMapPackageStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): OfflineMapPackageStatus =
        OfflineMapPackageStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: OfflineMapPackageStatus): Int = obj.value
  }
}
