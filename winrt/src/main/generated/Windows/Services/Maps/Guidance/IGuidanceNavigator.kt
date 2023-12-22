package Windows.Services.Maps.Guidance

import Windows.Devices.Geolocation.BasicGeoposition
import Windows.Devices.Geolocation.Geocoordinate
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceNavigator.ABI::class)
@Signature("{08f17ef7-8e3f-4d9a-be8a-108f9a012c67}")
@Guid("08f17ef78e3f4d9abe8a108f9a012c67")
@WinRTInterface("08f17ef78e3f4d9abe8a108f9a012c67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceNavigator.ByReference::class)
public interface IGuidanceNavigator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartNavigating(route: GuidanceRoute?): Unit

  @InterfaceMethod(1)
  public fun StartSimulating(route: GuidanceRoute?, speedInMetersPerSecond: Int): Unit

  @InterfaceMethod(2)
  public fun StartTracking(): Unit

  @InterfaceMethod(3)
  public fun Pause(): Unit

  @InterfaceMethod(4)
  public fun Resume(): Unit

  @InterfaceMethod(5)
  public fun Stop(): Unit

  @InterfaceMethod(6)
  public fun RepeatLastAudioNotification(): Unit

  @InterfaceMethod(7)
  public fun get_AudioMeasurementSystem(): GuidanceAudioMeasurementSystem?

  @InterfaceMethod(8)
  public fun put_AudioMeasurementSystem(value: GuidanceAudioMeasurementSystem?): Unit

  @InterfaceMethod(9)
  public fun get_AudioNotifications(): GuidanceAudioNotifications?

  @InterfaceMethod(10)
  public fun put_AudioNotifications(value: GuidanceAudioNotifications?): Unit

  @InterfaceMethod(11)
  public fun add_GuidanceUpdated(handler: TypedEventHandler<GuidanceNavigator?,
      GuidanceUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_GuidanceUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_DestinationReached(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_DestinationReached(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_Rerouting(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Rerouting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun add_Rerouted(handler: TypedEventHandler<GuidanceNavigator?,
      GuidanceReroutedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_Rerouted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(19)
  public fun add_RerouteFailed(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(20)
  public fun remove_RerouteFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(21)
  public fun add_UserLocationLost(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(22)
  public fun remove_UserLocationLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(23)
  public fun add_UserLocationRestored(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(24)
  public fun remove_UserLocationRestored(token: EventRegistrationToken?): Unit

  @InterfaceMethod(25)
  public fun SetGuidanceVoice(voiceId: Int, voiceFolder: String?): Unit

  @InterfaceMethod(26)
  public fun UpdateUserLocation(userLocation: Geocoordinate?): Unit

  @InterfaceMethod(27)
  public fun UpdateUserLocation(userLocation: Geocoordinate?, positionOverride: BasicGeoposition?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceNavigator> {
    public override fun getValue() = ABI.makeIGuidanceNavigator(pointer.getPointer(0))

    public fun setValue(value: IGuidanceNavigator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceNavigator {
    public val __1988824416_Ptr: Pointer?

    public val _1988824416_VtblPtr: Pointer?
      get() = __1988824416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartNavigating(route: GuidanceRoute?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(route),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun StartSimulating(route: GuidanceRoute?, speedInMetersPerSecond: Int): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(route),
          speedInMetersPerSecond,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun StartTracking(): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Pause(): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Resume(): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Stop(): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RepeatLastAudioNotification(): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_AudioMeasurementSystem(): GuidanceAudioMeasurementSystem? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceAudioMeasurementSystem>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceAudioMeasurementSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_AudioMeasurementSystem(value: GuidanceAudioMeasurementSystem?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_AudioNotifications(): GuidanceAudioNotifications? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceAudioNotifications>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceAudioNotifications>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_AudioNotifications(value: GuidanceAudioNotifications?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_GuidanceUpdated(handler: TypedEventHandler<GuidanceNavigator?,
        GuidanceUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_GuidanceUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_DestinationReached(handler: TypedEventHandler<GuidanceNavigator?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_DestinationReached(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_Rerouting(handler: TypedEventHandler<GuidanceNavigator?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Rerouting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun add_Rerouted(handler: TypedEventHandler<GuidanceNavigator?,
        GuidanceReroutedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_Rerouted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun add_RerouteFailed(handler: TypedEventHandler<GuidanceNavigator?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun remove_RerouteFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun add_UserLocationLost(handler: TypedEventHandler<GuidanceNavigator?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun remove_UserLocationLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun add_UserLocationRestored(handler: TypedEventHandler<GuidanceNavigator?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun remove_UserLocationRestored(token: EventRegistrationToken?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun SetGuidanceVoice(voiceId: Int, voiceFolder: String?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, voiceId, marshalToNative(voiceFolder),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun UpdateUserLocation(userLocation: Geocoordinate?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(userLocation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(27)
    public override fun UpdateUserLocation(userLocation: Geocoordinate?,
        positionOverride: BasicGeoposition?): Unit {
      val fnPtr = _1988824416_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1988824416_Ptr, marshalToNative(userLocation),
          marshalToNative(positionOverride),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGuidanceNavigator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1988824416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceNavigator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08f17ef78e3f4d9abe8a108f9a012c67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceNavigator(ptr: Pointer?): WithDefault = IGuidanceNavigator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceNavigator {
      val address = segment.toRawLongValue()
      return makeIGuidanceNavigator(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceNavigator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1988824416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceNavigator): Array<IGuidanceNavigator?> =
        (elements as
        Array<IGuidanceNavigator?>).castToImpl<IGuidanceNavigator,IGuidanceNavigator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceNavigator?> =
        arrayOfNulls<IGuidanceNavigator_Impl>(size) as Array<IGuidanceNavigator?>
  }
}
