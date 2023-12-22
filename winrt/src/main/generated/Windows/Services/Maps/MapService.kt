package Windows.Services.Maps

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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapService.ABI::class)
@WinRTByReference(brClass = MapService.ByReference::class)
public class MapService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapService> {
    public override fun getValue() = MapService(pointer.getPointer(0))

    public fun setValue(value: MapService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapService, MemoryAddress> {
    public val IMapServiceStatics3_Instance: IMapServiceStatics3 by lazy {
      createIMapServiceStatics3()
    }


    public val IMapServiceStatics4_Instance: IMapServiceStatics4 by lazy {
      createIMapServiceStatics4()
    }


    public val IMapServiceStatics_Instance: IMapServiceStatics by lazy {
      createIMapServiceStatics()
    }


    public val IMapServiceStatics2_Instance: IMapServiceStatics2 by lazy {
      createIMapServiceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapServiceStatics3(): IMapServiceStatics3 {
      val refiid = Guid.REFIID(IMapServiceStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapService".toHandle(),refiid,interfacePtr)
      val result = IMapServiceStatics3.ABI.makeIMapServiceStatics3(interfacePtr.value)
      return result
    }

    public fun createIMapServiceStatics4(): IMapServiceStatics4 {
      val refiid = Guid.REFIID(IMapServiceStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapService".toHandle(),refiid,interfacePtr)
      val result = IMapServiceStatics4.ABI.makeIMapServiceStatics4(interfacePtr.value)
      return result
    }

    public fun createIMapServiceStatics(): IMapServiceStatics {
      val refiid = Guid.REFIID(IMapServiceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapService".toHandle(),refiid,interfacePtr)
      val result = IMapServiceStatics.ABI.makeIMapServiceStatics(interfacePtr.value)
      return result
    }

    public fun createIMapServiceStatics2(): IMapServiceStatics2 {
      val refiid = Guid.REFIID(IMapServiceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapService".toHandle(),refiid,interfacePtr)
      val result = IMapServiceStatics2.ABI.makeIMapServiceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapService {
      val address = segment.toRawLongValue()
      return MapService(Pointer(address))
    }

    public override fun toNative(obj: MapService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataAttributions() = ABI.IMapServiceStatics3_Instance.get_DataAttributions()

    public fun put_DataUsagePreference(value: MapServiceDataUsagePreference) =
        ABI.IMapServiceStatics4_Instance.put_DataUsagePreference(value)

    public fun get_DataUsagePreference() =
        ABI.IMapServiceStatics4_Instance.get_DataUsagePreference()

    public fun put_ServiceToken(value: String) =
        ABI.IMapServiceStatics_Instance.put_ServiceToken(value)

    public fun get_ServiceToken() = ABI.IMapServiceStatics_Instance.get_ServiceToken()

    public fun get_WorldViewRegionCode() =
        ABI.IMapServiceStatics2_Instance.get_WorldViewRegionCode()
  }
}
