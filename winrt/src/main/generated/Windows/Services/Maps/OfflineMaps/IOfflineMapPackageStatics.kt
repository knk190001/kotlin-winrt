package Windows.Services.Maps.OfflineMaps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geocircle
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IOfflineMapPackageStatics.ABI::class)
@Signature("{185e7922-a831-4ab0-941f-6998fa929285}")
@Guid("185e7922a8314ab0941f6998fa929285")
@WinRTInterface("185e7922a8314ab0941f6998fa929285")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOfflineMapPackageStatics.ByReference::class)
public interface IOfflineMapPackageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindPackagesAsync(queryPoint: Geopoint?):
      IAsyncOperation<OfflineMapPackageQueryResult?>?

  @InterfaceMethod(1)
  public fun FindPackagesInBoundingBoxAsync(queryBoundingBox: GeoboundingBox?):
      IAsyncOperation<OfflineMapPackageQueryResult?>?

  @InterfaceMethod(2)
  public fun FindPackagesInGeocircleAsync(queryCircle: Geocircle?):
      IAsyncOperation<OfflineMapPackageQueryResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOfflineMapPackageStatics> {
    public override fun getValue() = ABI.makeIOfflineMapPackageStatics(pointer.getPointer(0))

    public fun setValue(value: IOfflineMapPackageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOfflineMapPackageStatics {
    public val __2082165255_Ptr: Pointer?

    public val _2082165255_VtblPtr: Pointer?
      get() = __2082165255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindPackagesAsync(queryPoint: Geopoint?):
        IAsyncOperation<OfflineMapPackageQueryResult?>? {
      val fnPtr = _2082165255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OfflineMapPackageQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__2082165255_Ptr, marshalToNative(queryPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<OfflineMapPackageQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindPackagesInBoundingBoxAsync(queryBoundingBox: GeoboundingBox?):
        IAsyncOperation<OfflineMapPackageQueryResult?>? {
      val fnPtr = _2082165255_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OfflineMapPackageQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__2082165255_Ptr, marshalToNative(queryBoundingBox), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<OfflineMapPackageQueryResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindPackagesInGeocircleAsync(queryCircle: Geocircle?):
        IAsyncOperation<OfflineMapPackageQueryResult?>? {
      val fnPtr = _2082165255_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<OfflineMapPackageQueryResult?>>()
      val hr = fn.invokeHR(arrayOf(__2082165255_Ptr, marshalToNative(queryCircle), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<OfflineMapPackageQueryResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IOfflineMapPackageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2082165255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOfflineMapPackageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("185e7922a8314ab0941f6998fa929285")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOfflineMapPackageStatics(ptr: Pointer?): WithDefault =
        IOfflineMapPackageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOfflineMapPackageStatics {
      val address = segment.toRawLongValue()
      return makeIOfflineMapPackageStatics(Pointer(address))
    }

    public override fun toNative(obj: IOfflineMapPackageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2082165255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOfflineMapPackageStatics):
        Array<IOfflineMapPackageStatics?> = (elements as
        Array<IOfflineMapPackageStatics?>).castToImpl<IOfflineMapPackageStatics,IOfflineMapPackageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOfflineMapPackageStatics?> =
        arrayOfNulls<IOfflineMapPackageStatics_Impl>(size) as Array<IOfflineMapPackageStatics?>
  }
}
