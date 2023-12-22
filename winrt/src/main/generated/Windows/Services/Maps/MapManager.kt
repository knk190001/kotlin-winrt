package Windows.Services.Maps

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapManager.ABI::class)
@WinRTByReference(brClass = MapManager.ByReference::class)
public class MapManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapManager> {
    public override fun getValue() = MapManager(pointer.getPointer(0))

    public fun setValue(value: MapManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapManager, MemoryAddress> {
    public val IMapManagerStatics_Instance: IMapManagerStatics by lazy {
      createIMapManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapManagerStatics(): IMapManagerStatics {
      val refiid = Guid.REFIID(IMapManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.MapManager".toHandle(),refiid,interfacePtr)
      val result = IMapManagerStatics.ABI.makeIMapManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapManager {
      val address = segment.toRawLongValue()
      return MapManager(Pointer(address))
    }

    public override fun toNative(obj: MapManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowDownloadedMapsUI() = ABI.IMapManagerStatics_Instance.ShowDownloadedMapsUI()

    public fun ShowMapsUpdateUI() = ABI.IMapManagerStatics_Instance.ShowMapsUpdateUI()
  }
}
