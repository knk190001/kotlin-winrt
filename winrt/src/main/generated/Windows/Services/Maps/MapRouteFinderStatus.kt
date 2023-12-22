package Windows.Services.Maps

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

@ABIMarker(MapRouteFinderStatus.ABI::class)
@Signature("enum(Windows.Services.Maps.MapRouteFinderStatus;i4)")
@WinRTByReference(brClass = MapRouteFinderStatus.ByReference::class)
public enum class MapRouteFinderStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownError(1),
  InvalidCredentials(2),
  NoRouteFound(3),
  NoRouteFoundWithGivenOptions(4),
  StartPointNotFound(5),
  EndPointNotFound(6),
  NoPedestrianRouteFound(7),
  NetworkFailure(8),
  NotSupported(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MapRouteFinderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownError
      2 -> InvalidCredentials
      3 -> NoRouteFound
      4 -> NoRouteFoundWithGivenOptions
      5 -> StartPointNotFound
      6 -> EndPointNotFound
      7 -> NoPedestrianRouteFound
      8 -> NetworkFailure
      9 -> NotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<MapRouteFinderStatus> {
    public fun setValue(newValue: MapRouteFinderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MapRouteFinderStatus =
        MapRouteFinderStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MapRouteFinderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MapRouteFinderStatus =
        MapRouteFinderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MapRouteFinderStatus): Int = obj.value
  }
}
