package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeopointFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Geopoint.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geopoint;{6bfa00eb-e56e-49bb-9caf-cbaa78a8bcef})")
@WinRTByReference(brClass = Geopoint.ByReference::class)
public class Geopoint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeopoint.WithDefault, IGeoshape.WithDefault, IWinRTObject {
  private val __247161506_Interface: IGeopoint.WithDefault by lazy {
    as_247161506()
  }


  private val __244607121_Interface: IGeoshape.WithDefault by lazy {
    as_244607121()
  }


  public override val __247161506_Ptr: JNAPointer? by lazy {
    __247161506_Interface.__247161506_Ptr
  }


  public override val __244607121_Ptr: JNAPointer? by lazy {
    __244607121_Interface.__244607121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__247161506_Interface, __244607121_Interface)

  public constructor(position: BasicGeoposition) : this(ABI.activate(position))

  public constructor(position: BasicGeoposition, altitudeReferenceSystem: AltitudeReferenceSystem) :
      this(ABI.activate(position, altitudeReferenceSystem))

  public constructor(
    position: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: WinDef.UINT
  ) : this(ABI.activate(position, altitudeReferenceSystem, spatialReferenceId))

  private fun as_247161506(): IGeopoint.WithDefault {
    if(pointer == NULL) {
      return(IGeopoint.ABI.makeIGeopoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeopoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeopoint.ABI.makeIGeopoint(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geopoint> {
    public override fun getValue() = Geopoint(pointer.getPointer(0))

    public fun setValue(value: Geopoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geopoint, MemoryAddress> {
    public val IGeopointFactory_Instance: IGeopointFactory by lazy {
      createIGeopointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeopointFactory(): IGeopointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geopoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeopointFactory.ABI.makeIGeopointFactory(factoryActivatorPtr.value))
    }

    public fun activate(position: BasicGeoposition): JNAPointer? =
        IGeopointFactory_Instance.Create(position)?.pointer

    public fun activate(position: BasicGeoposition,
        altitudeReferenceSystem: AltitudeReferenceSystem): JNAPointer? =
        IGeopointFactory_Instance.CreateWithAltitudeReferenceSystem(position,
        altitudeReferenceSystem)?.pointer

    public fun activate(
      position: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: WinDef.UINT
    ): JNAPointer? =
        IGeopointFactory_Instance.CreateWithAltitudeReferenceSystemAndSpatialReferenceId(position,
        altitudeReferenceSystem, spatialReferenceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Geopoint {
      val address = segment.toRawLongValue()
      return Geopoint(Pointer(address))
    }

    public override fun toNative(obj: Geopoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
