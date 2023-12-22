package Windows.Devices.Geolocation

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeolocator.ABI::class)
@Signature("{a9c3bf62-4524-4989-8aa9-de019d2e551f}")
@Guid("a9c3bf62452449898aa9de019d2e551f")
@WinRTInterface("a9c3bf62452449898aa9de019d2e551f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeolocator.ByReference::class)
public interface IGeolocator : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredAccuracy(): PositionAccuracy?

  @InterfaceMethod(1)
  public fun put_DesiredAccuracy(value: PositionAccuracy?): Unit

  @InterfaceMethod(2)
  public fun get_MovementThreshold(): Double

  @InterfaceMethod(3)
  public fun put_MovementThreshold(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ReportInterval(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_ReportInterval(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_LocationStatus(): PositionStatus?

  @InterfaceMethod(7)
  public fun GetGeopositionAsync(): IAsyncOperation<Geoposition?>?

  @InterfaceMethod(8)
  public fun GetGeopositionAsync(maximumAge: TimeSpan?, timeout: TimeSpan?):
      IAsyncOperation<Geoposition?>?

  @InterfaceMethod(9)
  public fun add_PositionChanged(handler: TypedEventHandler<Geolocator?,
      PositionChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_PositionChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_StatusChanged(handler: TypedEventHandler<Geolocator?, StatusChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeolocator> {
    public override fun getValue() = ABI.makeIGeolocator(pointer.getPointer(0))

    public fun setValue(value: IGeolocator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeolocator {
    public val __559978268_Ptr: Pointer?

    public val _559978268_VtblPtr: Pointer?
      get() = __559978268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredAccuracy(): PositionAccuracy? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PositionAccuracy>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PositionAccuracy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredAccuracy(value: PositionAccuracy?): Unit {
      val fnPtr = _559978268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MovementThreshold(): Double {
      val fnPtr = _559978268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MovementThreshold(value: Double): Unit {
      val fnPtr = _559978268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ReportInterval(): WinDef.UINT {
      val fnPtr = _559978268_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ReportInterval(value: WinDef.UINT): Unit {
      val fnPtr = _559978268_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LocationStatus(): PositionStatus? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PositionStatus>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PositionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetGeopositionAsync(): IAsyncOperation<Geoposition?>? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Geoposition?>>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Geoposition?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetGeopositionAsync(maximumAge: TimeSpan?, timeout: TimeSpan?):
        IAsyncOperation<Geoposition?>? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Geoposition?>>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(maximumAge),
          marshalToNative(timeout), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Geoposition?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_PositionChanged(handler: TypedEventHandler<Geolocator?,
        PositionChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_PositionChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _559978268_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_StatusChanged(handler: TypedEventHandler<Geolocator?,
        StatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _559978268_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _559978268_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__559978268_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeolocator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __559978268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeolocator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9c3bf62452449898aa9de019d2e551f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeolocator(ptr: Pointer?): WithDefault = IGeolocator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeolocator {
      val address = segment.toRawLongValue()
      return makeIGeolocator(Pointer(address))
    }

    public override fun toNative(obj: IGeolocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__559978268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeolocator): Array<IGeolocator?> = (elements as
        Array<IGeolocator?>).castToImpl<IGeolocator,IGeolocator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeolocator?> =
        arrayOfNulls<IGeolocator_Impl>(size) as Array<IGeolocator?>
  }
}
