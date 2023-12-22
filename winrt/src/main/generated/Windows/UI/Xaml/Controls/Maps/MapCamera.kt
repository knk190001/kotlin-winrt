package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.UI.Xaml.Controls.Maps.IMapCameraFactory.ABI.IID
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

@ABIMarker(MapCamera.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapCamera;{53a6b623-c0f8-4d8b-ad1e-a59598ea840b})")
@WinRTByReference(brClass = MapCamera.ByReference::class)
public class MapCamera(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapCamera.WithDefault, IWinRTObject {
  private val __922942832_Interface: IMapCamera.WithDefault by lazy {
    as_922942832()
  }


  public override val __922942832_Ptr: JNAPointer? by lazy {
    __922942832_Interface.__922942832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922942832_Interface)

  public constructor(location: Geopoint) : this(ABI.activate(location))

  public constructor(location: Geopoint, headingInDegrees: Double) : this(ABI.activate(location,
      headingInDegrees))

  public constructor(
    location: Geopoint,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ) : this(ABI.activate(location, headingInDegrees, pitchInDegrees))

  public constructor(
    location: Geopoint,
    headingInDegrees: Double,
    pitchInDegrees: Double,
    rollInDegrees: Double,
    fieldOfViewInDegrees: Double
  ) : this(ABI.activate(location, headingInDegrees, pitchInDegrees, rollInDegrees,
      fieldOfViewInDegrees))

  private fun as_922942832(): IMapCamera.WithDefault {
    if(pointer == NULL) {
      return(IMapCamera.ABI.makeIMapCamera(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapCamera>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapCamera.ABI.makeIMapCamera(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapCamera> {
    public override fun getValue() = MapCamera(pointer.getPointer(0))

    public fun setValue(value: MapCamera): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapCamera, MemoryAddress> {
    public val IMapCameraFactory_Instance: IMapCameraFactory by lazy {
      createIMapCameraFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapCameraFactory(): IMapCameraFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapCamera".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMapCameraFactory.ABI.makeIMapCameraFactory(factoryActivatorPtr.value))
    }

    public fun activate(location: Geopoint): JNAPointer? =
        IMapCameraFactory_Instance.CreateInstanceWithLocation(location)?.pointer

    public fun activate(location: Geopoint, headingInDegrees: Double): JNAPointer? =
        IMapCameraFactory_Instance.CreateInstanceWithLocationAndHeading(location,
        headingInDegrees)?.pointer

    public fun activate(
      location: Geopoint,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): JNAPointer? = IMapCameraFactory_Instance.CreateInstanceWithLocationHeadingAndPitch(location,
        headingInDegrees, pitchInDegrees)?.pointer

    public fun activate(
      location: Geopoint,
      headingInDegrees: Double,
      pitchInDegrees: Double,
      rollInDegrees: Double,
      fieldOfViewInDegrees: Double
    ): JNAPointer? =
        IMapCameraFactory_Instance.CreateInstanceWithLocationHeadingPitchRollAndFieldOfView(location,
        headingInDegrees, pitchInDegrees, rollInDegrees, fieldOfViewInDegrees)?.pointer

    public override fun fromNative(segment: MemoryAddress): MapCamera {
      val address = segment.toRawLongValue()
      return MapCamera(Pointer(address))
    }

    public override fun toNative(obj: MapCamera): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
