package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeoboundingBoxFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(GeoboundingBox.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.GeoboundingBox;{0896c80b-274f-43da-9a06-cbfcdaeb4ec2})")
@WinRTByReference(brClass = GeoboundingBox.ByReference::class)
public class GeoboundingBox(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeoboundingBox.WithDefault, IGeoshape.WithDefault, IWinRTObject {
  private val __958455083_Interface: IGeoboundingBox.WithDefault by lazy {
    as_958455083()
  }


  private val __244607121_Interface: IGeoshape.WithDefault by lazy {
    as_244607121()
  }


  public override val __958455083_Ptr: JNAPointer? by lazy {
    __958455083_Interface.__958455083_Ptr
  }


  public override val __244607121_Ptr: JNAPointer? by lazy {
    __244607121_Interface.__244607121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__958455083_Interface, __244607121_Interface)

  public constructor(northwestCorner: BasicGeoposition, southeastCorner: BasicGeoposition) :
      this(ABI.activate(northwestCorner, southeastCorner))

  public constructor(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem
  ) : this(ABI.activate(northwestCorner, southeastCorner, altitudeReferenceSystem))

  public constructor(
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    altitudeReferenceSystem: AltitudeReferenceSystem,
    spatialReferenceId: WinDef.UINT
  ) : this(ABI.activate(northwestCorner, southeastCorner, altitudeReferenceSystem,
      spatialReferenceId))

  private fun as_958455083(): IGeoboundingBox.WithDefault {
    if(pointer == NULL) {
      return(IGeoboundingBox.ABI.makeIGeoboundingBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeoboundingBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeoboundingBox.ABI.makeIGeoboundingBox(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GeoboundingBox>
      {
    public override fun getValue() = GeoboundingBox(pointer.getPointer(0))

    public fun setValue(value: GeoboundingBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeoboundingBox, MemoryAddress> {
    public val IGeoboundingBoxStatics_Instance: IGeoboundingBoxStatics by lazy {
      createIGeoboundingBoxStatics()
    }


    public val IGeoboundingBoxFactory_Instance: IGeoboundingBoxFactory by lazy {
      createIGeoboundingBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeoboundingBoxStatics(): IGeoboundingBoxStatics {
      val refiid = Guid.REFIID(IGeoboundingBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.GeoboundingBox".toHandle(),refiid,interfacePtr)
      val result = IGeoboundingBoxStatics.ABI.makeIGeoboundingBoxStatics(interfacePtr.value)
      return result
    }

    public fun createIGeoboundingBoxFactory(): IGeoboundingBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Geolocation.GeoboundingBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGeoboundingBoxFactory.ABI.makeIGeoboundingBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(northwestCorner: BasicGeoposition, southeastCorner: BasicGeoposition):
        JNAPointer? = IGeoboundingBoxFactory_Instance.Create(northwestCorner,
        southeastCorner)?.pointer

    public fun activate(
      northwestCorner: BasicGeoposition,
      southeastCorner: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem
    ): JNAPointer? = IGeoboundingBoxFactory_Instance.CreateWithAltitudeReference(northwestCorner,
        southeastCorner, altitudeReferenceSystem)?.pointer

    public fun activate(
      northwestCorner: BasicGeoposition,
      southeastCorner: BasicGeoposition,
      altitudeReferenceSystem: AltitudeReferenceSystem,
      spatialReferenceId: WinDef.UINT
    ): JNAPointer? =
        IGeoboundingBoxFactory_Instance.CreateWithAltitudeReferenceAndSpatialReference(northwestCorner,
        southeastCorner, altitudeReferenceSystem, spatialReferenceId)?.pointer

    public override fun fromNative(segment: MemoryAddress): GeoboundingBox {
      val address = segment.toRawLongValue()
      return GeoboundingBox(Pointer(address))
    }

    public override fun toNative(obj: GeoboundingBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCompute(positions: IIterable<BasicGeoposition?>) =
        ABI.IGeoboundingBoxStatics_Instance.TryCompute(positions)

    public fun TryCompute(positions: IIterable<BasicGeoposition?>,
        altitudeRefSystem: AltitudeReferenceSystem) =
        ABI.IGeoboundingBoxStatics_Instance.TryCompute(positions, altitudeRefSystem)

    public fun TryCompute(
      positions: IIterable<BasicGeoposition?>,
      altitudeRefSystem: AltitudeReferenceSystem,
      spatialReferenceId: WinDef.UINT
    ) = ABI.IGeoboundingBoxStatics_Instance.TryCompute(positions, altitudeRefSystem,
        spatialReferenceId)
  }
}
