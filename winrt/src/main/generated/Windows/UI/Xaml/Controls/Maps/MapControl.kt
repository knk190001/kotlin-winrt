package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Point
import Windows.UI.Xaml.Controls.Control
import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapControl.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapControl;{42d0b851-5256-4747-9e6c-0d11e966141e})")
@WinRTByReference(brClass = MapControl.ByReference::class)
public class MapControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMapControl.WithDefault, IMapControl2.WithDefault, IMapControl3.WithDefault,
    IMapControl4.WithDefault, IMapControl5.WithDefault, IMapControl6.WithDefault,
    IMapControl7.WithDefault, IMapControl8.WithDefault, IWinRTObject {
  private val __1051364238_Interface: IMapControl.WithDefault by lazy {
    as_1051364238()
  }


  private val __1767447040_Interface: IMapControl2.WithDefault by lazy {
    as_1767447040()
  }


  private val __1767447041_Interface: IMapControl3.WithDefault by lazy {
    as_1767447041()
  }


  private val __1767447042_Interface: IMapControl4.WithDefault by lazy {
    as_1767447042()
  }


  private val __1767447043_Interface: IMapControl5.WithDefault by lazy {
    as_1767447043()
  }


  private val __1767447044_Interface: IMapControl6.WithDefault by lazy {
    as_1767447044()
  }


  private val __1767447045_Interface: IMapControl7.WithDefault by lazy {
    as_1767447045()
  }


  private val __1767447046_Interface: IMapControl8.WithDefault by lazy {
    as_1767447046()
  }


  public override val __1051364238_Ptr: JNAPointer? by lazy {
    __1051364238_Interface.__1051364238_Ptr
  }


  public override val __1767447040_Ptr: JNAPointer? by lazy {
    __1767447040_Interface.__1767447040_Ptr
  }


  public override val __1767447041_Ptr: JNAPointer? by lazy {
    __1767447041_Interface.__1767447041_Ptr
  }


  public override val __1767447042_Ptr: JNAPointer? by lazy {
    __1767447042_Interface.__1767447042_Ptr
  }


  public override val __1767447043_Ptr: JNAPointer? by lazy {
    __1767447043_Interface.__1767447043_Ptr
  }


  public override val __1767447044_Ptr: JNAPointer? by lazy {
    __1767447044_Interface.__1767447044_Ptr
  }


  public override val __1767447045_Ptr: JNAPointer? by lazy {
    __1767447045_Interface.__1767447045_Ptr
  }


  public override val __1767447046_Ptr: JNAPointer? by lazy {
    __1767447046_Interface.__1767447046_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1051364238_Interface, __1767447040_Interface, __1767447041_Interface,
        __1767447042_Interface, __1767447043_Interface, __1767447044_Interface,
        __1767447045_Interface, __1767447046_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1051364238(): IMapControl.WithDefault {
    if(pointer == NULL) {
      return(IMapControl.ABI.makeIMapControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl.ABI.makeIMapControl(ref.value))
  }

  private fun as_1767447040(): IMapControl2.WithDefault {
    if(pointer == NULL) {
      return(IMapControl2.ABI.makeIMapControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl2.ABI.makeIMapControl2(ref.value))
  }

  private fun as_1767447041(): IMapControl3.WithDefault {
    if(pointer == NULL) {
      return(IMapControl3.ABI.makeIMapControl3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl3.ABI.makeIMapControl3(ref.value))
  }

  private fun as_1767447042(): IMapControl4.WithDefault {
    if(pointer == NULL) {
      return(IMapControl4.ABI.makeIMapControl4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl4.ABI.makeIMapControl4(ref.value))
  }

  private fun as_1767447043(): IMapControl5.WithDefault {
    if(pointer == NULL) {
      return(IMapControl5.ABI.makeIMapControl5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl5.ABI.makeIMapControl5(ref.value))
  }

  private fun as_1767447044(): IMapControl6.WithDefault {
    if(pointer == NULL) {
      return(IMapControl6.ABI.makeIMapControl6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl6.ABI.makeIMapControl6(ref.value))
  }

  private fun as_1767447045(): IMapControl7.WithDefault {
    if(pointer == NULL) {
      return(IMapControl7.ABI.makeIMapControl7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl7.ABI.makeIMapControl7(ref.value))
  }

  private fun as_1767447046(): IMapControl8.WithDefault {
    if(pointer == NULL) {
      return(IMapControl8.ABI.makeIMapControl8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapControl8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapControl8.ABI.makeIMapControl8(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapControl> {
    public override fun getValue() = MapControl(pointer.getPointer(0))

    public fun setValue(value: MapControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapControl, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMapControlStatics5_Instance: IMapControlStatics5 by lazy {
      createIMapControlStatics5()
    }


    public val IMapControlStatics6_Instance: IMapControlStatics6 by lazy {
      createIMapControlStatics6()
    }


    public val IMapControlStatics2_Instance: IMapControlStatics2 by lazy {
      createIMapControlStatics2()
    }


    public val IMapControlStatics8_Instance: IMapControlStatics8 by lazy {
      createIMapControlStatics8()
    }


    public val IMapControlStatics_Instance: IMapControlStatics by lazy {
      createIMapControlStatics()
    }


    public val IMapControlStatics7_Instance: IMapControlStatics7 by lazy {
      createIMapControlStatics7()
    }


    public val IMapControlStatics4_Instance: IMapControlStatics4 by lazy {
      createIMapControlStatics4()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIMapControlStatics5(): IMapControlStatics5 {
      val refiid = Guid.REFIID(IMapControlStatics5.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics5.ABI.makeIMapControlStatics5(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics6(): IMapControlStatics6 {
      val refiid = Guid.REFIID(IMapControlStatics6.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics6.ABI.makeIMapControlStatics6(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics2(): IMapControlStatics2 {
      val refiid = Guid.REFIID(IMapControlStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics2.ABI.makeIMapControlStatics2(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics8(): IMapControlStatics8 {
      val refiid = Guid.REFIID(IMapControlStatics8.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics8.ABI.makeIMapControlStatics8(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics(): IMapControlStatics {
      val refiid = Guid.REFIID(IMapControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics.ABI.makeIMapControlStatics(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics7(): IMapControlStatics7 {
      val refiid = Guid.REFIID(IMapControlStatics7.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics7.ABI.makeIMapControlStatics7(interfacePtr.value)
      return result
    }

    public fun createIMapControlStatics4(): IMapControlStatics4 {
      val refiid = Guid.REFIID(IMapControlStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapControl".toHandle(),refiid,interfacePtr)
      val result = IMapControlStatics4.ABI.makeIMapControlStatics4(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapControl {
      val address = segment.toRawLongValue()
      return MapControl(Pointer(address))
    }

    public override fun toNative(obj: MapControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MapProjectionProperty() =
        ABI.IMapControlStatics5_Instance.get_MapProjectionProperty()

    public fun get_StyleSheetProperty() = ABI.IMapControlStatics5_Instance.get_StyleSheetProperty()

    public fun get_ViewPaddingProperty() =
        ABI.IMapControlStatics5_Instance.get_ViewPaddingProperty()

    public fun get_LayersProperty() = ABI.IMapControlStatics6_Instance.get_LayersProperty()

    public fun get_BusinessLandmarksVisibleProperty() =
        ABI.IMapControlStatics2_Instance.get_BusinessLandmarksVisibleProperty()

    public fun get_TransitFeaturesVisibleProperty() =
        ABI.IMapControlStatics2_Instance.get_TransitFeaturesVisibleProperty()

    public fun get_PanInteractionModeProperty() =
        ABI.IMapControlStatics2_Instance.get_PanInteractionModeProperty()

    public fun get_RotateInteractionModeProperty() =
        ABI.IMapControlStatics2_Instance.get_RotateInteractionModeProperty()

    public fun get_TiltInteractionModeProperty() =
        ABI.IMapControlStatics2_Instance.get_TiltInteractionModeProperty()

    public fun get_ZoomInteractionModeProperty() =
        ABI.IMapControlStatics2_Instance.get_ZoomInteractionModeProperty()

    public fun get_Is3DSupportedProperty() =
        ABI.IMapControlStatics2_Instance.get_Is3DSupportedProperty()

    public fun get_IsStreetsideSupportedProperty() =
        ABI.IMapControlStatics2_Instance.get_IsStreetsideSupportedProperty()

    public fun get_SceneProperty() = ABI.IMapControlStatics2_Instance.get_SceneProperty()

    public fun get_CanTiltDownProperty() =
        ABI.IMapControlStatics8_Instance.get_CanTiltDownProperty()

    public fun get_CanTiltUpProperty() = ABI.IMapControlStatics8_Instance.get_CanTiltUpProperty()

    public fun get_CanZoomInProperty() = ABI.IMapControlStatics8_Instance.get_CanZoomInProperty()

    public fun get_CanZoomOutProperty() = ABI.IMapControlStatics8_Instance.get_CanZoomOutProperty()

    public fun get_CenterProperty() = ABI.IMapControlStatics_Instance.get_CenterProperty()

    public fun get_ChildrenProperty() = ABI.IMapControlStatics_Instance.get_ChildrenProperty()

    public fun get_ColorSchemeProperty() = ABI.IMapControlStatics_Instance.get_ColorSchemeProperty()

    public fun get_DesiredPitchProperty() =
        ABI.IMapControlStatics_Instance.get_DesiredPitchProperty()

    public fun get_HeadingProperty() = ABI.IMapControlStatics_Instance.get_HeadingProperty()

    public fun get_LandmarksVisibleProperty() =
        ABI.IMapControlStatics_Instance.get_LandmarksVisibleProperty()

    public fun get_LoadingStatusProperty() =
        ABI.IMapControlStatics_Instance.get_LoadingStatusProperty()

    public fun get_MapServiceTokenProperty() =
        ABI.IMapControlStatics_Instance.get_MapServiceTokenProperty()

    public fun get_PedestrianFeaturesVisibleProperty() =
        ABI.IMapControlStatics_Instance.get_PedestrianFeaturesVisibleProperty()

    public fun get_PitchProperty() = ABI.IMapControlStatics_Instance.get_PitchProperty()

    public fun get_StyleProperty() = ABI.IMapControlStatics_Instance.get_StyleProperty()

    public fun get_TrafficFlowVisibleProperty() =
        ABI.IMapControlStatics_Instance.get_TrafficFlowVisibleProperty()

    public fun get_TransformOriginProperty() =
        ABI.IMapControlStatics_Instance.get_TransformOriginProperty()

    public fun get_WatermarkModeProperty() =
        ABI.IMapControlStatics_Instance.get_WatermarkModeProperty()

    public fun get_ZoomLevelProperty() = ABI.IMapControlStatics_Instance.get_ZoomLevelProperty()

    public fun get_MapElementsProperty() = ABI.IMapControlStatics_Instance.get_MapElementsProperty()

    public fun get_RoutesProperty() = ABI.IMapControlStatics_Instance.get_RoutesProperty()

    public fun get_TileSourcesProperty() = ABI.IMapControlStatics_Instance.get_TileSourcesProperty()

    public fun get_LocationProperty() = ABI.IMapControlStatics_Instance.get_LocationProperty()

    public fun GetLocation(element: DependencyObject) =
        ABI.IMapControlStatics_Instance.GetLocation(element)

    public fun SetLocation(element: DependencyObject, value: Geopoint) =
        ABI.IMapControlStatics_Instance.SetLocation(element, value)

    public fun get_NormalizedAnchorPointProperty() =
        ABI.IMapControlStatics_Instance.get_NormalizedAnchorPointProperty()

    public fun GetNormalizedAnchorPoint(element: DependencyObject) =
        ABI.IMapControlStatics_Instance.GetNormalizedAnchorPoint(element)

    public fun SetNormalizedAnchorPoint(element: DependencyObject, value: Point) =
        ABI.IMapControlStatics_Instance.SetNormalizedAnchorPoint(element, value)

    public fun get_RegionProperty() = ABI.IMapControlStatics7_Instance.get_RegionProperty()

    public fun get_BusinessLandmarksEnabledProperty() =
        ABI.IMapControlStatics4_Instance.get_BusinessLandmarksEnabledProperty()

    public fun get_TransitFeaturesEnabledProperty() =
        ABI.IMapControlStatics4_Instance.get_TransitFeaturesEnabledProperty()
  }
}
