package Windows.Services.Maps.OfflineMaps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geocircle
import Windows.Devices.Geolocation.Geopoint
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(OfflineMapPackage.ABI::class)
@Signature("rc(Windows.Services.Maps.OfflineMaps.OfflineMapPackage;{a797673b-a5b5-4144-b525-e68c8862664b})")
@WinRTByReference(brClass = OfflineMapPackage.ByReference::class)
public class OfflineMapPackage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOfflineMapPackage.WithDefault, IWinRTObject {
  private val __199253972_Interface: IOfflineMapPackage.WithDefault by lazy {
    as_199253972()
  }


  public override val __199253972_Ptr: JNAPointer? by lazy {
    __199253972_Interface.__199253972_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__199253972_Interface)

  private fun as_199253972(): IOfflineMapPackage.WithDefault {
    if(pointer == NULL) {
      return(IOfflineMapPackage.ABI.makeIOfflineMapPackage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOfflineMapPackage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOfflineMapPackage.ABI.makeIOfflineMapPackage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OfflineMapPackage> {
    public override fun getValue() = OfflineMapPackage(pointer.getPointer(0))

    public fun setValue(value: OfflineMapPackage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OfflineMapPackage, MemoryAddress> {
    public val IOfflineMapPackageStatics_Instance: IOfflineMapPackageStatics by lazy {
      createIOfflineMapPackageStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIOfflineMapPackageStatics(): IOfflineMapPackageStatics {
      val refiid = Guid.REFIID(IOfflineMapPackageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.OfflineMaps.OfflineMapPackage".toHandle(),refiid,interfacePtr)
      val result = IOfflineMapPackageStatics.ABI.makeIOfflineMapPackageStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): OfflineMapPackage {
      val address = segment.toRawLongValue()
      return OfflineMapPackage(Pointer(address))
    }

    public override fun toNative(obj: OfflineMapPackage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindPackagesAsync(queryPoint: Geopoint) =
        ABI.IOfflineMapPackageStatics_Instance.FindPackagesAsync(queryPoint)

    public fun FindPackagesInBoundingBoxAsync(queryBoundingBox: GeoboundingBox) =
        ABI.IOfflineMapPackageStatics_Instance.FindPackagesInBoundingBoxAsync(queryBoundingBox)

    public fun FindPackagesInGeocircleAsync(queryCircle: Geocircle) =
        ABI.IOfflineMapPackageStatics_Instance.FindPackagesInGeocircleAsync(queryCircle)
  }
}
