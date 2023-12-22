package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeocircleFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Geocircle.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geocircle;{39e45843-a7f9-4e63-92a7-ba0c28d124b1})")
@WinRTByReference(brClass = Geocircle.ByReference::class)
public class Geocircle(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeocircle.WithDefault, IGeoshape.WithDefault, IWinRTObject {
  private val __550465218_Interface: IGeocircle.WithDefault by lazy {
    as_550465218()
  }


  private val __244607121_Interface: IGeoshape.WithDefault by lazy {
    as_244607121()
  }


  public override val __550465218_Ptr: JNAPointer? by lazy {
    __550465218_Interface.__550465218_Ptr
  }


  public override val __244607121_Ptr: JNAPointer? by lazy {
    __244607121_Interface.__244607121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__550465218_Interface, __244607121_Interface)

  public constructor(position: BasicGeoposition, radius: Double) : this(ABI.activate(position,
      radius))

  public constructor(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: AltitudeReferenceSystem
  ) : this(ABI.activate(position, radius, altitudeReferenceSystem))

  public constructor(
    position: BasicGeoposition,
    radius: Double,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: WinDef.UINT
  ) : this(ABI.activate(position, radius, altitudeReferenceSystem, spatialReferenceId))

  private fun as_550465218(): IGeocircle.WithDefault {
    if(pointer == NULL) {
      return(IGeocircle.ABI.makeIGeocircle(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeocircle>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeocircle.ABI.makeIGeocircle(ref.value))
  }

  private fun as_244607121(): IGeoshape.WithDefault {
    if(pointer == NULL) {
      return(IGeoshape.ABI.makeIGeoshape(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeoshape>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeoshape.ABI.makeIGeoshape(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geocircle> {
    public override fun getValue() = Geocircle(pointer.getPointer(0))

    public fun setValue(value: Geocircle): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geocircle, MemoryAddress> {
    public val IGeocircleFactory_Instance: IGeocircleFactory by lazy {
      createIGeocircleFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeocircleFactory(): IGeocircleFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geocircle".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeocircleFactory.ABI.makeIGeocircleFactory(factoryActivatorPtr.value))
    }

    public fun activate(position: BasicGeoposition, radius: Double): JNAPointer? =
        IGeocircleFactory_Instance.Create(position, radius)?.pointer

    public fun activate(
      position: BasicGeoposition,
      radius: Double,
      altitudeReferenceSystem: AltitudeReferenceSystem
    ): JNAPointer? = IGeocircleFactory_Instance.CreateWithAltitudeReferenceSystem(position, radius,
        altitudeReferenceSystem)?.pointer

    public fun activate(
      position: BasicGeoposition,
      radius: Double,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: WinDef.UINT
    ): JNAPointer? =
        IGeocircleFactory_Instance.CreateWithAltitudeReferenceSystemAndSpatialReferenceId(position,
        radius, altitudeReferenceSystem, spatialReferenceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Geocircle {
      val address = segment.toRawLongValue()
      return Geocircle(Pointer(address))
    }

    public override fun toNative(obj: Geocircle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
