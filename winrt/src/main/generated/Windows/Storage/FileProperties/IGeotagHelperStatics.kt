package Windows.Storage.FileProperties

import Windows.Devices.Geolocation.Geolocator
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
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

@ABIMarker(IGeotagHelperStatics.ABI::class)
@Signature("{41493244-2524-4655-86a6-ed16f5fc716b}")
@Guid("414932442524465586a6ed16f5fc716b")
@WinRTInterface("414932442524465586a6ed16f5fc716b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeotagHelperStatics.ByReference::class)
public interface IGeotagHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetGeotagAsync(`file`: IStorageFile?): IAsyncOperation<Geopoint?>?

  @InterfaceMethod(1)
  public fun SetGeotagFromGeolocatorAsync(`file`: IStorageFile?, geolocator: Geolocator?):
      IAsyncAction?

  @InterfaceMethod(2)
  public fun SetGeotagAsync(`file`: IStorageFile?, geopoint: Geopoint?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeotagHelperStatics> {
    public override fun getValue() = ABI.makeIGeotagHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IGeotagHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeotagHelperStatics {
    public val __1782793134_Ptr: Pointer?

    public val _1782793134_VtblPtr: Pointer?
      get() = __1782793134_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetGeotagAsync(`file`: IStorageFile?): IAsyncOperation<Geopoint?>? {
      val fnPtr = _1782793134_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Geopoint?>>()
      val hr = fn.invokeHR(arrayOf(__1782793134_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Geopoint?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetGeotagFromGeolocatorAsync(`file`: IStorageFile?,
        geolocator: Geolocator?): IAsyncAction? {
      val fnPtr = _1782793134_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1782793134_Ptr, marshalToNative(file),
          marshalToNative(geolocator), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetGeotagAsync(`file`: IStorageFile?, geopoint: Geopoint?): IAsyncAction? {
      val fnPtr = _1782793134_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1782793134_Ptr, marshalToNative(file),
          marshalToNative(geopoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IGeotagHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1782793134_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeotagHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("414932442524465586a6ed16f5fc716b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeotagHelperStatics(ptr: Pointer?): WithDefault = IGeotagHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeotagHelperStatics {
      val address = segment.toRawLongValue()
      return makeIGeotagHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeotagHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1782793134_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeotagHelperStatics): Array<IGeotagHelperStatics?> =
        (elements as
        Array<IGeotagHelperStatics?>).castToImpl<IGeotagHelperStatics,IGeotagHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeotagHelperStatics?> =
        arrayOfNulls<IGeotagHelperStatics_Impl>(size) as Array<IGeotagHelperStatics?>
  }
}
