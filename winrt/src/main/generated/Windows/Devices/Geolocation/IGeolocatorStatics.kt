package Windows.Devices.Geolocation

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeolocatorStatics.ABI::class)
@Signature("{9a8e7571-2df5-4591-9f87-eb5fd894e9b7}")
@Guid("9a8e75712df545919f87eb5fd894e9b7")
@WinRTInterface("9a8e75712df545919f87eb5fd894e9b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeolocatorStatics.ByReference::class)
public interface IGeolocatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(): IAsyncOperation<GeolocationAccessStatus?>?

  @InterfaceMethod(1)
  public fun GetGeopositionHistoryAsync(startTime: DateTime?):
      IAsyncOperation<IVectorView<Geoposition?>?>?

  @InterfaceMethod(2)
  public fun GetGeopositionHistoryAsync(startTime: DateTime?, duration: TimeSpan?):
      IAsyncOperation<IVectorView<Geoposition?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeolocatorStatics> {
    public override fun getValue() = ABI.makeIGeolocatorStatics(pointer.getPointer(0))

    public fun setValue(value: IGeolocatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeolocatorStatics {
    public val __829171265_Ptr: Pointer?

    public val _829171265_VtblPtr: Pointer?
      get() = __829171265_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(): IAsyncOperation<GeolocationAccessStatus?>? {
      val fnPtr = _829171265_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GeolocationAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__829171265_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GeolocationAccessStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetGeopositionHistoryAsync(startTime: DateTime?):
        IAsyncOperation<IVectorView<Geoposition?>?>? {
      val fnPtr = _829171265_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Geoposition?>?>>()
      val hr = fn.invokeHR(arrayOf(__829171265_Ptr, marshalToNative(startTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Geoposition?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetGeopositionHistoryAsync(startTime: DateTime?, duration: TimeSpan?):
        IAsyncOperation<IVectorView<Geoposition?>?>? {
      val fnPtr = _829171265_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Geoposition?>?>>()
      val hr = fn.invokeHR(arrayOf(__829171265_Ptr, marshalToNative(startTime),
          marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Geoposition?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IGeolocatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829171265_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeolocatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a8e75712df545919f87eb5fd894e9b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeolocatorStatics(ptr: Pointer?): WithDefault = IGeolocatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeolocatorStatics {
      val address = segment.toRawLongValue()
      return makeIGeolocatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeolocatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829171265_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeolocatorStatics): Array<IGeolocatorStatics?> =
        (elements as
        Array<IGeolocatorStatics?>).castToImpl<IGeolocatorStatics,IGeolocatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeolocatorStatics?> =
        arrayOfNulls<IGeolocatorStatics_Impl>(size) as Array<IGeolocatorStatics?>
  }
}
