package Windows.System.Implementation.FileExplorer

import Windows.Foundation.IAsyncOperation
import Windows.Web.Http.HttpRequestMessage
import Windows.Web.Http.HttpResponseMessage
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

@ABIMarker(ISysStorageProviderHttpRequestProvider.ABI::class)
@Signature("{cb6fefb6-e76a-5c25-a33e-3e78a6e0e0ce}")
@Guid("cb6fefb6e76a5c25a33e3e78a6e0e0ce")
@WinRTInterface("cb6fefb6e76a5c25a33e3e78a6e0e0ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISysStorageProviderHttpRequestProvider.ByReference::class)
public interface ISysStorageProviderHttpRequestProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendRequestAsync(request: HttpRequestMessage?): IAsyncOperation<HttpResponseMessage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISysStorageProviderHttpRequestProvider> {
    public override fun getValue() =
        ABI.makeISysStorageProviderHttpRequestProvider(pointer.getPointer(0))

    public fun setValue(value: ISysStorageProviderHttpRequestProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISysStorageProviderHttpRequestProvider {
    public val __1175139245_Ptr: Pointer?

    public val _1175139245_VtblPtr: Pointer?
      get() = __1175139245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendRequestAsync(request: HttpRequestMessage?):
        IAsyncOperation<HttpResponseMessage?>? {
      val fnPtr = _1175139245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HttpResponseMessage?>>()
      val hr = fn.invokeHR(arrayOf(__1175139245_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HttpResponseMessage?>>(result.getValue())
      return resultValue
    }
  }

  public class ISysStorageProviderHttpRequestProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1175139245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISysStorageProviderHttpRequestProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb6fefb6e76a5c25a33e3e78a6e0e0ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISysStorageProviderHttpRequestProvider(ptr: Pointer?): WithDefault =
        ISysStorageProviderHttpRequestProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISysStorageProviderHttpRequestProvider {
      val address = segment.toRawLongValue()
      return makeISysStorageProviderHttpRequestProvider(Pointer(address))
    }

    public override fun toNative(obj: ISysStorageProviderHttpRequestProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175139245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISysStorageProviderHttpRequestProvider):
        Array<ISysStorageProviderHttpRequestProvider?> = (elements as
        Array<ISysStorageProviderHttpRequestProvider?>).castToImpl<ISysStorageProviderHttpRequestProvider,ISysStorageProviderHttpRequestProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISysStorageProviderHttpRequestProvider?> =
        arrayOfNulls<ISysStorageProviderHttpRequestProvider_Impl>(size) as
        Array<ISysStorageProviderHttpRequestProvider?>
  }
}
