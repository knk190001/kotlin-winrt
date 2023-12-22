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

@ABIMarker(Geocoordinate.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geocoordinate;{ee21a3aa-976a-4c70-803d-083ea55bcbc4})")
@WinRTByReference(brClass = Geocoordinate.ByReference::class)
public class Geocoordinate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeocoordinate.WithDefault, IGeocoordinateWithPositionData.WithDefault,
    IGeocoordinateWithPoint.WithDefault, IGeocoordinateWithPositionSourceTimestamp.WithDefault,
    IGeocoordinateWithRemoteSource.WithDefault, IWinRTObject {
  private val __2008031638_Interface: IGeocoordinate.WithDefault by lazy {
    as_2008031638()
  }


  private val __1941939485_Interface: IGeocoordinateWithPositionData.WithDefault by lazy {
    as_1941939485()
  }


  private val __468313824_Interface: IGeocoordinateWithPoint.WithDefault by lazy {
    as_468313824()
  }


  private val __299521634_Interface: IGeocoordinateWithPositionSourceTimestamp.WithDefault by lazy {
    as_299521634()
  }


  private val __2024105359_Interface: IGeocoordinateWithRemoteSource.WithDefault by lazy {
    as_2024105359()
  }


  public override val __2008031638_Ptr: JNAPointer? by lazy {
    __2008031638_Interface.__2008031638_Ptr
  }


  public override val __1941939485_Ptr: JNAPointer? by lazy {
    __1941939485_Interface.__1941939485_Ptr
  }


  public override val __468313824_Ptr: JNAPointer? by lazy {
    __468313824_Interface.__468313824_Ptr
  }


  public override val __299521634_Ptr: JNAPointer? by lazy {
    __299521634_Interface.__299521634_Ptr
  }


  public override val __2024105359_Ptr: JNAPointer? by lazy {
    __2024105359_Interface.__2024105359_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2008031638_Interface, __1941939485_Interface, __468313824_Interface,
        __299521634_Interface, __2024105359_Interface)

  private fun as_2008031638(): IGeocoordinate.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinate.ABI.makeIGeocoordinate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinate.ABI.makeIGeocoordinate(ref.value))
  }

  private fun as_1941939485(): IGeocoordinateWithPositionData.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateWithPositionData.ABI.makeIGeocoordinateWithPositionData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateWithPositionData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateWithPositionData.ABI.makeIGeocoordinateWithPositionData(ref.value))
  }

  private fun as_468313824(): IGeocoordinateWithPoint.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateWithPoint.ABI.makeIGeocoordinateWithPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateWithPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateWithPoint.ABI.makeIGeocoordinateWithPoint(ref.value))
  }

  private fun as_299521634(): IGeocoordinateWithPositionSourceTimestamp.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateWithPositionSourceTimestamp.ABI.makeIGeocoordinateWithPositionSourceTimestamp(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateWithPositionSourceTimestamp>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateWithPositionSourceTimestamp.ABI.makeIGeocoordinateWithPositionSourceTimestamp(ref.value))
  }

  private fun as_2024105359(): IGeocoordinateWithRemoteSource.WithDefault {
    if(pointer == NULL) {
      return(IGeocoordinateWithRemoteSource.ABI.makeIGeocoordinateWithRemoteSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocoordinateWithRemoteSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocoordinateWithRemoteSource.ABI.makeIGeocoordinateWithRemoteSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geocoordinate>
      {
    public override fun getValue() = Geocoordinate(pointer.getPointer(0))

    public fun setValue(value: Geocoordinate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geocoordinate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Geocoordinate {
      val address = segment.toRawLongValue()
      return Geocoordinate(Pointer(address))
    }

    public override fun toNative(obj: Geocoordinate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
