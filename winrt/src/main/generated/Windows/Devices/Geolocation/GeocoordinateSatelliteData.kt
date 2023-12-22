package Windows.Devices.Geolocation

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

@ABIMarker(GeocoordinateSatelliteData.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.GeocoordinateSatelliteData;{c32a74d9-2608-474c-912c-06dd490f4af7})")
@WinRTByReference(brClass = GeocoordinateSatelliteData.ByReference::class)
public class GeocoordinateSatelliteData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeocoordinateSatelliteData.WithDefault,
    IGeocoordinateSatelliteData2.WithDefault, IWinRTObject {
  private val __2146327237_Interface: IGeocoordinateSatelliteData.WithDefault by lazy {
    as_2146327237()
  }


  private val __2111634857_Interface: IGeocoordinateSatelliteData2.WithDefault by lazy {
    as_2111634857()
  }


  public override val __2146327237_Ptr: JNAPointer? by lazy {
    __2146327237_Interface.__2146327237_Ptr
  }


  public override val __2111634857_Ptr: JNAPointer? by lazy {
    __2111634857_Interface.__2111634857_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2146327237_Interface, __2111634857_Interface)

  private fun as_2146327237(): IGeocoordinateSatelliteData.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateSatelliteData.ABI.makeIGeocoordinateSatelliteData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateSatelliteData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateSatelliteData.ABI.makeIGeocoordinateSatelliteData(ref.value))
  }

  private fun as_2111634857(): IGeocoordinateSatelliteData2.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateSatelliteData2.ABI.makeIGeocoordinateSatelliteData2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateSatelliteData2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateSatelliteData2.ABI.makeIGeocoordinateSatelliteData2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeocoordinateSatelliteData> {
    public override fun getValue() = GeocoordinateSatelliteData(pointer.getPointer(0))

    public fun setValue(value: GeocoordinateSatelliteData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeocoordinateSatelliteData, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GeocoordinateSatelliteData {
      val address = segment.toRawLongValue()
      return GeocoordinateSatelliteData(Pointer(address))
    }

    public override fun toNative(obj: GeocoordinateSatelliteData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
