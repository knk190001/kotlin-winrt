package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeopathFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(Geopath.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geopath;{e53fd7b9-2da4-4714-a652-de8593289898})")
@WinRTByReference(brClass = Geopath.ByReference::class)
public class Geopath(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeopath.WithDefault, IGeoshape.WithDefault, IWinRTObject {
  private val __1654581911_Interface: IGeopath.WithDefault by lazy {
    as_1654581911()
  }


  private val __244607121_Interface: IGeoshape.WithDefault by lazy {
    as_244607121()
  }


  public override val __1654581911_Ptr: JNAPointer? by lazy {
    __1654581911_Interface.__1654581911_Ptr
  }


  public override val __244607121_Ptr: JNAPointer? by lazy {
    __244607121_Interface.__244607121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1654581911_Interface, __244607121_Interface)

  public constructor(positions: IIterable<BasicGeoposition?>) : this(ABI.activate(positions))

  public constructor(positions: IIterable<BasicGeoposition?>,
      altitudeReferenceSystem: AltitudeReferenceSystem) : this(ABI.activate(positions,
      altitudeReferenceSystem))

  public constructor(
    positions: IIterable<BasicGeoposition?>,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: WinDef.UINT
  ) : this(ABI.activate(positions, altitudeReferenceSystem, spatialReferenceId))

  private fun as_1654581911(): IGeopath.WithDefault {
    if(pointer == NULL) {
      return(IGeopath.ABI.makeIGeopath(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeopath>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeopath.ABI.makeIGeopath(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geopath> {
    public override fun getValue() = Geopath(pointer.getPointer(0))

    public fun setValue(value: Geopath): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geopath, MemoryAddress> {
    public val IGeopathFactory_Instance: IGeopathFactory by lazy {
      createIGeopathFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeopathFactory(): IGeopathFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.Geopath".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeopathFactory.ABI.makeIGeopathFactory(factoryActivatorPtr.value))
    }

    public fun activate(positions: IIterable<BasicGeoposition?>): JNAPointer? =
        IGeopathFactory_Instance.Create(positions)?.pointer

    public fun activate(positions: IIterable<BasicGeoposition?>,
        altitudeReferenceSystem: AltitudeReferenceSystem): JNAPointer? =
        IGeopathFactory_Instance.CreateWithAltitudeReference(positions,
        altitudeReferenceSystem)?.pointer

    public fun activate(
      positions: IIterable<BasicGeoposition?>,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: WinDef.UINT
    ): JNAPointer? =
        IGeopathFactory_Instance.CreateWithAltitudeReferenceAndSpatialReference(positions,
        altitudeReferenceSystem, spatialReferenceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): Geopath {
      val address = segment.toRawLongValue()
      return Geopath(Pointer(address))
    }

    public override fun toNative(obj: Geopath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
