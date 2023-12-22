package Windows.Services.Maps

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMapLocationFinderStatics.ABI::class)
@Signature("{318adb5d-1c5d-4f35-a2df-aaca94959517}")
@Guid("318adb5d1c5d4f35a2dfaaca94959517")
@WinRTInterface("318adb5d1c5d4f35a2dfaaca94959517")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapLocationFinderStatics.ByReference::class)
public interface IMapLocationFinderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindLocationsAtAsync(queryPoint: Geopoint?): IAsyncOperation<MapLocationFinderResult?>?

  @InterfaceMethod(1)
  public fun FindLocationsAsync(searchText: String?, referencePoint: Geopoint?):
      IAsyncOperation<MapLocationFinderResult?>?

  @InterfaceMethod(2)
  public fun FindLocationsAsync(
    searchText: String?,
    referencePoint: Geopoint?,
    maxCount: WinDef.UINT
  ): IAsyncOperation<MapLocationFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapLocationFinderStatics> {
    public override fun getValue() = ABI.makeIMapLocationFinderStatics(pointer.getPointer(0))

    public fun setValue(value: IMapLocationFinderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapLocationFinderStatics {
    public val __692428261_Ptr: Pointer?

    public val _692428261_VtblPtr: Pointer?
      get() = __692428261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindLocationsAtAsync(queryPoint: Geopoint?):
        IAsyncOperation<MapLocationFinderResult?>? {
      val fnPtr = _692428261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapLocationFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__692428261_Ptr, marshalToNative(queryPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MapLocationFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindLocationsAsync(searchText: String?, referencePoint: Geopoint?):
        IAsyncOperation<MapLocationFinderResult?>? {
      val fnPtr = _692428261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapLocationFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__692428261_Ptr, marshalToNative(searchText),
          marshalToNative(referencePoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MapLocationFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindLocationsAsync(
      searchText: String?,
      referencePoint: Geopoint?,
      maxCount: WinDef.UINT
    ): IAsyncOperation<MapLocationFinderResult?>? {
      val fnPtr = _692428261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapLocationFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__692428261_Ptr, marshalToNative(searchText),
          marshalToNative(referencePoint), maxCount, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MapLocationFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapLocationFinderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __692428261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapLocationFinderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("318adb5d1c5d4f35a2dfaaca94959517")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapLocationFinderStatics(ptr: Pointer?): WithDefault =
        IMapLocationFinderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapLocationFinderStatics {
      val address = segment.toRawLongValue()
      return makeIMapLocationFinderStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapLocationFinderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__692428261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapLocationFinderStatics):
        Array<IMapLocationFinderStatics?> = (elements as
        Array<IMapLocationFinderStatics?>).castToImpl<IMapLocationFinderStatics,IMapLocationFinderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapLocationFinderStatics?> =
        arrayOfNulls<IMapLocationFinderStatics_Impl>(size) as Array<IMapLocationFinderStatics?>
  }
}
