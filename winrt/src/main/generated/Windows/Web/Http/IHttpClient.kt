package Windows.Web.Http

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import Windows.Web.Http.Headers.HttpRequestHeaderCollection
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpClient.ABI::class)
@Signature("{7fda1151-3574-4880-a8ba-e6b1e0061f3d}")
@Guid("7fda115135744880a8bae6b1e0061f3d")
@WinRTInterface("7fda115135744880a8bae6b1e0061f3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpClient.ByReference::class)
public interface IHttpClient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DeleteAsync(uri: Uri?): IAsyncOperationWithProgress<HttpResponseMessage?,
      HttpProgress?>?

  @InterfaceMethod(1)
  public fun GetAsync(uri: Uri?): IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  @InterfaceMethod(2)
  public fun GetAsync(uri: Uri?, completionOption: HttpCompletionOption?):
      IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  @InterfaceMethod(3)
  public fun GetBufferAsync(uri: Uri?): IAsyncOperationWithProgress<IBuffer?, HttpProgress?>?

  @InterfaceMethod(4)
  public fun GetInputStreamAsync(uri: Uri?): IAsyncOperationWithProgress<IInputStream?,
      HttpProgress?>?

  @InterfaceMethod(5)
  public fun GetStringAsync(uri: Uri?): IAsyncOperationWithProgress<String?, HttpProgress?>?

  @InterfaceMethod(6)
  public fun PostAsync(uri: Uri?, content: IHttpContent?):
      IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  @InterfaceMethod(7)
  public fun PutAsync(uri: Uri?, content: IHttpContent?):
      IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  @InterfaceMethod(8)
  public fun SendRequestAsync(request: HttpRequestMessage?):
      IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  @InterfaceMethod(9)
  public fun SendRequestAsync(request: HttpRequestMessage?,
      completionOption: HttpCompletionOption?): IAsyncOperationWithProgress<HttpResponseMessage?,
      HttpProgress?>?

  @InterfaceMethod(10)
  public fun get_DefaultRequestHeaders(): HttpRequestHeaderCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHttpClient> {
    public override fun getValue() = ABI.makeIHttpClient(pointer.getPointer(0))

    public fun setValue(value: IHttpClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpClient {
    public val __1755101999_Ptr: Pointer?

    public val _1755101999_VtblPtr: Pointer?
      get() = __1755101999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DeleteAsync(uri: Uri?): IAsyncOperationWithProgress<HttpResponseMessage?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAsync(uri: Uri?): IAsyncOperationWithProgress<HttpResponseMessage?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAsync(uri: Uri?, completionOption: HttpCompletionOption?):
        IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri),
          marshalToNative(completionOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetBufferAsync(uri: Uri?): IAsyncOperationWithProgress<IBuffer?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IBuffer?, HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IBuffer?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetInputStreamAsync(uri: Uri?): IAsyncOperationWithProgress<IInputStream?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IInputStream?, HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IInputStream?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetStringAsync(uri: Uri?): IAsyncOperationWithProgress<String?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<String?, HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<String?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun PostAsync(uri: Uri?, content: IHttpContent?):
        IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), marshalToNative(content),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun PutAsync(uri: Uri?, content: IHttpContent?):
        IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(uri), marshalToNative(content),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SendRequestAsync(request: HttpRequestMessage?):
        IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SendRequestAsync(request: HttpRequestMessage?,
        completionOption: HttpCompletionOption?): IAsyncOperationWithProgress<HttpResponseMessage?,
        HttpProgress?>? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr, marshalToNative(request),
          marshalToNative(completionOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_DefaultRequestHeaders(): HttpRequestHeaderCollection? {
      val fnPtr = _1755101999_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestHeaderCollection>()
      val hr = fn.invokeHR(arrayOf(__1755101999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestHeaderCollection>(result.getValue())
      return resultValue
    }
  }

  public class IHttpClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1755101999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7fda115135744880a8bae6b1e0061f3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpClient(ptr: Pointer?): WithDefault = IHttpClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpClient {
      val address = segment.toRawLongValue()
      return makeIHttpClient(Pointer(address))
    }

    public override fun toNative(obj: IHttpClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1755101999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpClient): Array<IHttpClient?> = (elements as
        Array<IHttpClient?>).castToImpl<IHttpClient,IHttpClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpClient?> =
        arrayOfNulls<IHttpClient_Impl>(size) as Array<IHttpClient?>
  }
}
