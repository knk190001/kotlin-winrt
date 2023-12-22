package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IIterable
import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapScene.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapScene;{8bba10a9-50e7-482c-9789-c688b178ac24})")
@WinRTByReference(brClass = MapScene.ByReference::class)
public class MapScene(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapScene.WithDefault, IWinRTObject {
  private val __1340872479_Interface: IMapScene.WithDefault by lazy {
    as_1340872479()
  }


  public override val __1340872479_Ptr: JNAPointer? by lazy {
    __1340872479_Interface.__1340872479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1340872479_Interface)

  private fun as_1340872479(): IMapScene.WithDefault {
    if(pointer == NULL) {
      return(IMapScene.ABI.makeIMapScene(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapScene>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapScene.ABI.makeIMapScene(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapScene> {
    public override fun getValue() = MapScene(pointer.getPointer(0))

    public fun setValue(value: MapScene): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapScene, MemoryAddress> {
    public val IMapSceneStatics_Instance: IMapSceneStatics by lazy {
      createIMapSceneStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapSceneStatics(): IMapSceneStatics {
      val refiid = Guid.REFIID(IMapSceneStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapScene".toHandle(),refiid,interfacePtr)
      val result = IMapSceneStatics.ABI.makeIMapSceneStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapScene {
      val address = segment.toRawLongValue()
      return MapScene(Pointer(address))
    }

    public override fun toNative(obj: MapScene): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromBoundingBox(bounds: GeoboundingBox) =
        ABI.IMapSceneStatics_Instance.CreateFromBoundingBox(bounds)

    public fun CreateFromBoundingBox(
      bounds: GeoboundingBox,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ) = ABI.IMapSceneStatics_Instance.CreateFromBoundingBox(bounds, headingInDegrees,
        pitchInDegrees)

    public fun CreateFromCamera(camera: MapCamera) =
        ABI.IMapSceneStatics_Instance.CreateFromCamera(camera)

    public fun CreateFromLocation(location: Geopoint) =
        ABI.IMapSceneStatics_Instance.CreateFromLocation(location)

    public fun CreateFromLocation(
      location: Geopoint,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ) = ABI.IMapSceneStatics_Instance.CreateFromLocation(location, headingInDegrees, pitchInDegrees)

    public fun CreateFromLocationAndRadius(location: Geopoint, radiusInMeters: Double) =
        ABI.IMapSceneStatics_Instance.CreateFromLocationAndRadius(location, radiusInMeters)

    public fun CreateFromLocationAndRadius(
      location: Geopoint,
      radiusInMeters: Double,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ) = ABI.IMapSceneStatics_Instance.CreateFromLocationAndRadius(location, radiusInMeters,
        headingInDegrees, pitchInDegrees)

    public fun CreateFromLocations(locations: IIterable<Geopoint?>) =
        ABI.IMapSceneStatics_Instance.CreateFromLocations(locations)

    public fun CreateFromLocations(
      locations: IIterable<Geopoint?>,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ) = ABI.IMapSceneStatics_Instance.CreateFromLocations(locations, headingInDegrees,
        pitchInDegrees)
  }
}
