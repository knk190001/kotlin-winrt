package Windows.Services.Maps.LocalSearch

import Windows.Devices.Geolocation.Geocircle
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

@ABIMarker(ILocalLocationFinderStatics.ABI::class)
@Signature("{d2ef7344-a0de-48ca-81a8-07c7dcfd37ab}")
@Guid("d2ef7344a0de48ca81a807c7dcfd37ab")
@WinRTInterface("d2ef7344a0de48ca81a807c7dcfd37ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalLocationFinderStatics.ByReference::class)
public interface ILocalLocationFinderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindLocalLocationsAsync(
    searchTerm: String?,
    searchArea: Geocircle?,
    localCategory: String?,
    maxResults: WinDef.UINT
  ): IAsyncOperation<LocalLocationFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILocalLocationFinderStatics> {
    public override fun getValue() = ABI.makeILocalLocationFinderStatics(pointer.getPointer(0))

    public fun setValue(value: ILocalLocationFinderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalLocationFinderStatics {
    public val __785684263_Ptr: Pointer?

    public val _785684263_VtblPtr: Pointer?
      get() = __785684263_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindLocalLocationsAsync(
      searchTerm: String?,
      searchArea: Geocircle?,
      localCategory: String?,
      maxResults: WinDef.UINT
    ): IAsyncOperation<LocalLocationFinderResult?>? {
      val fnPtr = _785684263_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<LocalLocationFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__785684263_Ptr, marshalToNative(searchTerm),
          marshalToNative(searchArea), marshalToNative(localCategory), maxResults, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<LocalLocationFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class ILocalLocationFinderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __785684263_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalLocationFinderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2ef7344a0de48ca81a807c7dcfd37ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalLocationFinderStatics(ptr: Pointer?): WithDefault =
        ILocalLocationFinderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalLocationFinderStatics {
      val address = segment.toRawLongValue()
      return makeILocalLocationFinderStatics(Pointer(address))
    }

    public override fun toNative(obj: ILocalLocationFinderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__785684263_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalLocationFinderStatics):
        Array<ILocalLocationFinderStatics?> = (elements as
        Array<ILocalLocationFinderStatics?>).castToImpl<ILocalLocationFinderStatics,ILocalLocationFinderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalLocationFinderStatics?> =
        arrayOfNulls<ILocalLocationFinderStatics_Impl>(size) as Array<ILocalLocationFinderStatics?>
  }
}
