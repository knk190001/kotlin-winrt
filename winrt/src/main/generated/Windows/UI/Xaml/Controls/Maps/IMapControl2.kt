package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControl2.ABI::class)
@Signature("{e1fd644d-96ec-4065-b0f0-75281da3654d}")
@Guid("e1fd644d96ec4065b0f075281da3654d")
@WinRTInterface("e1fd644d96ec4065b0f075281da3654d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl2.ByReference::class)
public interface IMapControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BusinessLandmarksVisible(): Boolean

  @InterfaceMethod(1)
  public fun put_BusinessLandmarksVisible(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TransitFeaturesVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_TransitFeaturesVisible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PanInteractionMode(): MapPanInteractionMode?

  @InterfaceMethod(5)
  public fun put_PanInteractionMode(value: MapPanInteractionMode?): Unit

  @InterfaceMethod(6)
  public fun get_RotateInteractionMode(): MapInteractionMode?

  @InterfaceMethod(7)
  public fun put_RotateInteractionMode(value: MapInteractionMode?): Unit

  @InterfaceMethod(8)
  public fun get_TiltInteractionMode(): MapInteractionMode?

  @InterfaceMethod(9)
  public fun put_TiltInteractionMode(value: MapInteractionMode?): Unit

  @InterfaceMethod(10)
  public fun get_ZoomInteractionMode(): MapInteractionMode?

  @InterfaceMethod(11)
  public fun put_ZoomInteractionMode(value: MapInteractionMode?): Unit

  @InterfaceMethod(12)
  public fun get_Is3DSupported(): Boolean

  @InterfaceMethod(13)
  public fun get_IsStreetsideSupported(): Boolean

  @InterfaceMethod(14)
  public fun get_Scene(): MapScene?

  @InterfaceMethod(15)
  public fun put_Scene(value: MapScene?): Unit

  @InterfaceMethod(16)
  public fun get_ActualCamera(): MapCamera?

  @InterfaceMethod(17)
  public fun get_TargetCamera(): MapCamera?

  @InterfaceMethod(18)
  public fun get_CustomExperience(): MapCustomExperience?

  @InterfaceMethod(19)
  public fun put_CustomExperience(value: MapCustomExperience?): Unit

  @InterfaceMethod(20)
  public fun add_MapElementClick(handler: TypedEventHandler<MapControl?,
      MapElementClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_MapElementClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_MapElementPointerEntered(handler: TypedEventHandler<MapControl?,
      MapElementPointerEnteredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_MapElementPointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_MapElementPointerExited(handler: TypedEventHandler<MapControl?,
      MapElementPointerExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_MapElementPointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(26)
  public fun add_ActualCameraChanged(handler: TypedEventHandler<MapControl?,
      MapActualCameraChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_ActualCameraChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_ActualCameraChanging(handler: TypedEventHandler<MapControl?,
      MapActualCameraChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_ActualCameraChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(30)
  public fun add_TargetCameraChanged(handler: TypedEventHandler<MapControl?,
      MapTargetCameraChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(31)
  public fun remove_TargetCameraChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(32)
  public fun add_CustomExperienceChanged(handler: TypedEventHandler<MapControl?,
      MapCustomExperienceChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(33)
  public fun remove_CustomExperienceChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(34)
  public fun StartContinuousRotate(rateInDegreesPerSecond: Double): Unit

  @InterfaceMethod(35)
  public fun StopContinuousRotate(): Unit

  @InterfaceMethod(36)
  public fun StartContinuousTilt(rateInDegreesPerSecond: Double): Unit

  @InterfaceMethod(37)
  public fun StopContinuousTilt(): Unit

  @InterfaceMethod(38)
  public fun StartContinuousZoom(rateOfChangePerSecond: Double): Unit

  @InterfaceMethod(39)
  public fun StopContinuousZoom(): Unit

  @InterfaceMethod(40)
  public fun TryRotateAsync(degrees: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(41)
  public fun TryRotateToAsync(angleInDegrees: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(42)
  public fun TryTiltAsync(degrees: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(43)
  public fun TryTiltToAsync(angleInDegrees: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(44)
  public fun TryZoomInAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(45)
  public fun TryZoomOutAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(46)
  public fun TryZoomToAsync(zoomLevel: Double): IAsyncOperation<Boolean>?

  @InterfaceMethod(47)
  public fun TrySetSceneAsync(scene: MapScene?): IAsyncOperation<Boolean>?

  @InterfaceMethod(48)
  public fun TrySetSceneAsync(scene: MapScene?, animationKind: MapAnimationKind?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl2> {
    public override fun getValue() = ABI.makeIMapControl2(pointer.getPointer(0))

    public fun setValue(value: IMapControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl2 {
    public val __1767447040_Ptr: Pointer?

    public val _1767447040_VtblPtr: Pointer?
      get() = __1767447040_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BusinessLandmarksVisible(): Boolean {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BusinessLandmarksVisible(value: Boolean): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TransitFeaturesVisible(): Boolean {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TransitFeaturesVisible(value: Boolean): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PanInteractionMode(): MapPanInteractionMode? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapPanInteractionMode>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapPanInteractionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PanInteractionMode(value: MapPanInteractionMode?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RotateInteractionMode(): MapInteractionMode? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapInteractionMode>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapInteractionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RotateInteractionMode(value: MapInteractionMode?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TiltInteractionMode(): MapInteractionMode? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapInteractionMode>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapInteractionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TiltInteractionMode(value: MapInteractionMode?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ZoomInteractionMode(): MapInteractionMode? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapInteractionMode>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapInteractionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ZoomInteractionMode(value: MapInteractionMode?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Is3DSupported(): Boolean {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsStreetsideSupported(): Boolean {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_Scene(): MapScene? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Scene(value: MapScene?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ActualCamera(): MapCamera? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_TargetCamera(): MapCamera? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_CustomExperience(): MapCustomExperience? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCustomExperience>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCustomExperience>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_CustomExperience(value: MapCustomExperience?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_MapElementClick(handler: TypedEventHandler<MapControl?,
        MapElementClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_MapElementClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_MapElementPointerEntered(handler: TypedEventHandler<MapControl?,
        MapElementPointerEnteredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_MapElementPointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_MapElementPointerExited(handler: TypedEventHandler<MapControl?,
        MapElementPointerExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_MapElementPointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_ActualCameraChanged(handler: TypedEventHandler<MapControl?,
        MapActualCameraChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_ActualCameraChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun add_ActualCameraChanging(handler: TypedEventHandler<MapControl?,
        MapActualCameraChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_ActualCameraChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun add_TargetCameraChanged(handler: TypedEventHandler<MapControl?,
        MapTargetCameraChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(31)
    public override fun remove_TargetCameraChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun add_CustomExperienceChanged(handler: TypedEventHandler<MapControl?,
        MapCustomExperienceChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(33)
    public override fun remove_CustomExperienceChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun StartContinuousRotate(rateInDegreesPerSecond: Double): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, rateInDegreesPerSecond,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(35)
    public override fun StopContinuousRotate(): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun StartContinuousTilt(rateInDegreesPerSecond: Double): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, rateInDegreesPerSecond,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(37)
    public override fun StopContinuousTilt(): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun StartContinuousZoom(rateOfChangePerSecond: Double): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, rateOfChangePerSecond,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(39)
    public override fun StopContinuousZoom(): Unit {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun TryRotateAsync(degrees: Double): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, degrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(41)
    public override fun TryRotateToAsync(angleInDegrees: Double): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, angleInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(42)
    public override fun TryTiltAsync(degrees: Double): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, degrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(43)
    public override fun TryTiltToAsync(angleInDegrees: Double): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, angleInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(44)
    public override fun TryZoomInAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(45)
    public override fun TryZoomOutAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(46)
    public override fun TryZoomToAsync(zoomLevel: Double): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, zoomLevel, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(47)
    public override fun TrySetSceneAsync(scene: MapScene?): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(scene), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(48)
    public override fun TrySetSceneAsync(scene: MapScene?, animationKind: MapAnimationKind?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1767447040_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447040_Ptr, marshalToNative(scene),
          marshalToNative(animationKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447040_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1fd644d96ec4065b0f075281da3654d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl2(ptr: Pointer?): WithDefault = IMapControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl2 {
      val address = segment.toRawLongValue()
      return makeIMapControl2(Pointer(address))
    }

    public override fun toNative(obj: IMapControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447040_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl2): Array<IMapControl2?> = (elements as
        Array<IMapControl2?>).castToImpl<IMapControl2,IMapControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl2?> =
        arrayOfNulls<IMapControl2_Impl>(size) as Array<IMapControl2?>
  }
}
