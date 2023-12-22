package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
import Windows.Foundation.Point
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Thickness
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControl.ABI::class)
@Signature("{42d0b851-5256-4747-9e6c-0d11e966141e}")
@Guid("42d0b851525647479e6c0d11e966141e")
@WinRTInterface("42d0b851525647479e6c0d11e966141e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl.ByReference::class)
public interface IMapControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Center(): Geopoint?

  @InterfaceMethod(1)
  public fun put_Center(value: Geopoint?): Unit

  @InterfaceMethod(2)
  public fun get_Children(): IVector<DependencyObject?>?

  @InterfaceMethod(3)
  public fun get_ColorScheme(): MapColorScheme?

  @InterfaceMethod(4)
  public fun put_ColorScheme(value: MapColorScheme?): Unit

  @InterfaceMethod(5)
  public fun get_DesiredPitch(): Double

  @InterfaceMethod(6)
  public fun put_DesiredPitch(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_Heading(): Double

  @InterfaceMethod(8)
  public fun put_Heading(value: Double): Unit

  @InterfaceMethod(9)
  public fun get_LandmarksVisible(): Boolean

  @InterfaceMethod(10)
  public fun put_LandmarksVisible(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_LoadingStatus(): MapLoadingStatus?

  @InterfaceMethod(12)
  public fun get_MapServiceToken(): String?

  @InterfaceMethod(13)
  public fun put_MapServiceToken(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_MaxZoomLevel(): Double

  @InterfaceMethod(15)
  public fun get_MinZoomLevel(): Double

  @InterfaceMethod(16)
  public fun get_PedestrianFeaturesVisible(): Boolean

  @InterfaceMethod(17)
  public fun put_PedestrianFeaturesVisible(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_Pitch(): Double

  @InterfaceMethod(19)
  public fun get_MapStyle(): MapStyle?

  @InterfaceMethod(20)
  public fun put_MapStyle(value: MapStyle?): Unit

  @InterfaceMethod(21)
  public fun get_TrafficFlowVisible(): Boolean

  @InterfaceMethod(22)
  public fun put_TrafficFlowVisible(value: Boolean): Unit

  @InterfaceMethod(23)
  public fun get_TransformOrigin(): Point?

  @InterfaceMethod(24)
  public fun put_TransformOrigin(value: Point?): Unit

  @InterfaceMethod(25)
  public fun get_WatermarkMode(): MapWatermarkMode?

  @InterfaceMethod(26)
  public fun put_WatermarkMode(value: MapWatermarkMode?): Unit

  @InterfaceMethod(27)
  public fun get_ZoomLevel(): Double

  @InterfaceMethod(28)
  public fun put_ZoomLevel(value: Double): Unit

  @InterfaceMethod(29)
  public fun get_MapElements(): IVector<MapElement?>?

  @InterfaceMethod(30)
  public fun get_Routes(): IVector<MapRouteView?>?

  @InterfaceMethod(31)
  public fun get_TileSources(): IVector<MapTileSource?>?

  @InterfaceMethod(32)
  public fun add_CenterChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_CenterChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun add_HeadingChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(35)
  public fun remove_HeadingChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(36)
  public fun add_LoadingStatusChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(37)
  public fun remove_LoadingStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(38)
  public fun add_MapDoubleTapped(handler: TypedEventHandler<MapControl?, MapInputEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(39)
  public fun remove_MapDoubleTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(40)
  public fun add_MapHolding(handler: TypedEventHandler<MapControl?, MapInputEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(41)
  public fun remove_MapHolding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(42)
  public fun add_MapTapped(handler: TypedEventHandler<MapControl?, MapInputEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(43)
  public fun remove_MapTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(44)
  public fun add_PitchChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(45)
  public fun remove_PitchChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(46)
  public fun add_TransformOriginChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(47)
  public fun remove_TransformOriginChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(48)
  public fun add_ZoomLevelChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(49)
  public fun remove_ZoomLevelChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(50)
  public fun FindMapElementsAtOffset(offset: Point?): IVectorView<MapElement?>?

  @InterfaceMethod(51)
  public fun GetLocationFromOffset(offset: Point?,
      location: Windows.Devices.Geolocation.Geopoint.ByReference?): Unit

  @InterfaceMethod(52)
  public fun GetOffsetFromLocation(location: Geopoint?,
      offset: Windows.Foundation.Point.ByReference?): Unit

  @InterfaceMethod(53)
  public fun IsLocationInView(location: Geopoint?, isInView: Boolean): Unit

  @InterfaceMethod(54)
  public fun TrySetViewBoundsAsync(
    bounds: GeoboundingBox?,
    margin: IReference<Thickness?>?,
    animation: MapAnimationKind?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(55)
  public fun TrySetViewAsync(center: Geopoint?): IAsyncOperation<Boolean>?

  @InterfaceMethod(56)
  public fun TrySetViewAsync(center: Geopoint?, zoomLevel: IReference<Double>?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(57)
  public fun TrySetViewAsync(
    center: Geopoint?,
    zoomLevel: IReference<Double>?,
    heading: IReference<Double>?,
    desiredPitch: IReference<Double>?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(58)
  public fun TrySetViewAsync(
    center: Geopoint?,
    zoomLevel: IReference<Double>?,
    heading: IReference<Double>?,
    desiredPitch: IReference<Double>?,
    animation: MapAnimationKind?
  ): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl> {
    public override fun getValue() = ABI.makeIMapControl(pointer.getPointer(0))

    public fun setValue(value: IMapControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl {
    public val __1051364238_Ptr: Pointer?

    public val _1051364238_VtblPtr: Pointer?
      get() = __1051364238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Center(): Geopoint? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Center(value: Geopoint?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Children(): IVector<DependencyObject?>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ColorScheme(): MapColorScheme? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapColorScheme>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapColorScheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ColorScheme(value: MapColorScheme?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DesiredPitch(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_DesiredPitch(value: Double): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Heading(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_Heading(value: Double): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_LandmarksVisible(): Boolean {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_LandmarksVisible(value: Boolean): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_LoadingStatus(): MapLoadingStatus? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapLoadingStatus>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapLoadingStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_MapServiceToken(): String? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_MapServiceToken(value: String?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MaxZoomLevel(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_MinZoomLevel(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_PedestrianFeaturesVisible(): Boolean {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_PedestrianFeaturesVisible(value: Boolean): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_Pitch(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_MapStyle(): MapStyle? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyle>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_MapStyle(value: MapStyle?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_TrafficFlowVisible(): Boolean {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_TrafficFlowVisible(value: Boolean): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_TransformOrigin(): Point? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_TransformOrigin(value: Point?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_WatermarkMode(): MapWatermarkMode? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapWatermarkMode>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapWatermarkMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun put_WatermarkMode(value: MapWatermarkMode?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun get_ZoomLevel(): Double {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun put_ZoomLevel(value: Double): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(29)
    public override fun get_MapElements(): IVector<MapElement?>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapElement?>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(30)
    public override fun get_Routes(): IVector<MapRouteView?>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapRouteView?>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapRouteView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun get_TileSources(): IVector<MapTileSource?>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapTileSource?>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapTileSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(32)
    public override fun add_CenterChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_CenterChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun add_HeadingChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(35)
    public override fun remove_HeadingChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun add_LoadingStatusChanged(handler: TypedEventHandler<MapControl?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(37)
    public override fun remove_LoadingStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun add_MapDoubleTapped(handler: TypedEventHandler<MapControl?,
        MapInputEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(39)
    public override fun remove_MapDoubleTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun add_MapHolding(handler: TypedEventHandler<MapControl?,
        MapInputEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun remove_MapHolding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun add_MapTapped(handler: TypedEventHandler<MapControl?, MapInputEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun remove_MapTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun add_PitchChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun remove_PitchChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun add_TransformOriginChanged(handler: TypedEventHandler<MapControl?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun remove_TransformOriginChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun add_ZoomLevelChanged(handler: TypedEventHandler<MapControl?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun remove_ZoomLevelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun FindMapElementsAtOffset(offset: Point?): IVectorView<MapElement?>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MapElement?>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(offset), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MapElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun GetLocationFromOffset(offset: Point?,
        location: Windows.Devices.Geolocation.Geopoint.ByReference?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(offset),
          marshalToNative(location),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun GetOffsetFromLocation(location: Geopoint?,
        offset: Windows.Foundation.Point.ByReference?): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(location),
          marshalToNative(offset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(53)
    public override fun IsLocationInView(location: Geopoint?, isInView: Boolean): Unit {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(location), isInView,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun TrySetViewBoundsAsync(
      bounds: GeoboundingBox?,
      margin: IReference<Thickness?>?,
      animation: MapAnimationKind?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(bounds),
          marshalToNative(margin), marshalToNative(animation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(55)
    public override fun TrySetViewAsync(center: Geopoint?): IAsyncOperation<Boolean>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(center), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(56)
    public override fun TrySetViewAsync(center: Geopoint?, zoomLevel: IReference<Double>?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(62L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(center),
          marshalToNative(zoomLevel), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(57)
    public override fun TrySetViewAsync(
      center: Geopoint?,
      zoomLevel: IReference<Double>?,
      heading: IReference<Double>?,
      desiredPitch: IReference<Double>?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(63L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(center),
          marshalToNative(zoomLevel), marshalToNative(heading), marshalToNative(desiredPitch),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(58)
    public override fun TrySetViewAsync(
      center: Geopoint?,
      zoomLevel: IReference<Double>?,
      heading: IReference<Double>?,
      desiredPitch: IReference<Double>?,
      animation: MapAnimationKind?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1051364238_VtblPtr!!.getPointer(64L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1051364238_Ptr, marshalToNative(center),
          marshalToNative(zoomLevel), marshalToNative(heading), marshalToNative(desiredPitch),
          marshalToNative(animation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1051364238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42d0b851525647479e6c0d11e966141e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl(ptr: Pointer?): WithDefault = IMapControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl {
      val address = segment.toRawLongValue()
      return makeIMapControl(Pointer(address))
    }

    public override fun toNative(obj: IMapControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1051364238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl): Array<IMapControl?> = (elements as
        Array<IMapControl?>).castToImpl<IMapControl,IMapControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl?> =
        arrayOfNulls<IMapControl_Impl>(size) as Array<IMapControl?>
  }
}
