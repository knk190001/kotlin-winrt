package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapLocationFinder.ABI::class)
@WinRTByReference(brClass = MapLocationFinder.ByReference::class)
public class MapLocationFinder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapLocationFinder> {
    public override fun getValue() = MapLocationFinder(pointer.getPointer(0))

    public fun setValue(value: MapLocationFinder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapLocationFinder, MemoryAddress> {
    public val IMapLocationFinderStatics_Instance: IMapLocationFinderStatics by lazy {
      createIMapLocationFinderStatics()
    }


    public val IMapLocationFinderStatics2_Instance: IMapLocationFinderStatics2 by lazy {
      createIMapLocationFinderStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapLocationFinderStatics(): IMapLocationFinderStatics {
      val refiid = Guid.REFIID(IMapLocationFinderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapLocationFinder".toHandle(),refiid,interfacePtr)
      val result = IMapLocationFinderStatics.ABI.makeIMapLocationFinderStatics(interfacePtr.value)
      return result
    }

    public fun createIMapLocationFinderStatics2(): IMapLocationFinderStatics2 {
      val refiid = Guid.REFIID(IMapLocationFinderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapLocationFinder".toHandle(),refiid,interfacePtr)
      val result = IMapLocationFinderStatics2.ABI.makeIMapLocationFinderStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapLocationFinder {
      val address = segment.toRawLongValue()
      return MapLocationFinder(Pointer(address))
    }

    public override fun toNative(obj: MapLocationFinder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindLocationsAtAsync(queryPoint: Geopoint) =
        ABI.IMapLocationFinderStatics_Instance.FindLocationsAtAsync(queryPoint)

    public fun FindLocationsAsync(searchText: String, referencePoint: Geopoint) =
        ABI.IMapLocationFinderStatics_Instance.FindLocationsAsync(searchText, referencePoint)

    public fun FindLocationsAsync(
      searchText: String,
      referencePoint: Geopoint,
      maxCount: WinDef.UINT
    ) = ABI.IMapLocationFinderStatics_Instance.FindLocationsAsync(searchText, referencePoint,
        maxCount)

    public fun FindLocationsAtAsync(queryPoint: Geopoint, accuracy: MapLocationDesiredAccuracy) =
        ABI.IMapLocationFinderStatics2_Instance.FindLocationsAtAsync(queryPoint, accuracy)
  }
}
