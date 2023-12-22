package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(MapLoadingStatus.ABI::class)
@Signature("enum(Windows.UI.Xaml.Controls.Maps.MapLoadingStatus;i4)")
@WinRTByReference(brClass = MapLoadingStatus.ByReference::class)
public enum class MapLoadingStatus(
  public val value: Int
) : NativeMapped {
  Loading(0),
  Loaded(1),
  DataUnavailable(2),
  DownloadedMapsManagerUnavailable(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapLoadingStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Loading
      1 -> Loaded
      2 -> DataUnavailable
      3 -> DownloadedMapsManagerUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapLoadingStatus> {
    public fun setValue(newValue: MapLoadingStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapLoadingStatus =
        MapLoadingStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapLoadingStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapLoadingStatus =
        MapLoadingStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapLoadingStatus): Int = obj.value
  }
}
