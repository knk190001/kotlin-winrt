package Windows.Storage.FileProperties

import Windows.Devices.Geolocation.Geolocator
import Windows.Devices.Geolocation.Geopoint
import Windows.Storage.IStorageFile
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

@ABIMarker(GeotagHelper.ABI::class)
@WinRTByReference(brClass = GeotagHelper.ByReference::class)
public class GeotagHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GeotagHelper> {
    public override fun getValue() = GeotagHelper(pointer.getPointer(0))

    public fun setValue(value: GeotagHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeotagHelper, MemoryAddress> {
    public val IGeotagHelperStatics_Instance: IGeotagHelperStatics by lazy {
      createIGeotagHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeotagHelperStatics(): IGeotagHelperStatics {
      val refiid = Guid.REFIID(IGeotagHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.FileProperties.GeotagHelper".toHandle(),refiid,interfacePtr)
      val result = IGeotagHelperStatics.ABI.makeIGeotagHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GeotagHelper {
      val address = segment.toRawLongValue()
      return GeotagHelper(Pointer(address))
    }

    public override fun toNative(obj: GeotagHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetGeotagAsync(`file`: IStorageFile) =
        ABI.IGeotagHelperStatics_Instance.GetGeotagAsync(file)

    public fun SetGeotagFromGeolocatorAsync(`file`: IStorageFile, geolocator: Geolocator) =
        ABI.IGeotagHelperStatics_Instance.SetGeotagFromGeolocatorAsync(file, geolocator)

    public fun SetGeotagAsync(`file`: IStorageFile, geopoint: Geopoint) =
        ABI.IGeotagHelperStatics_Instance.SetGeotagAsync(file, geopoint)
  }
}
