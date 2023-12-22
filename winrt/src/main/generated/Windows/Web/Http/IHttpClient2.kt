package Windows.Web.Http

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
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

@ABIMarker(IHttpClient2.ABI::class)
@Signature("{cdd83348-e8b7-4cec-b1b0-dc455fe72c92}")
@Guid("cdd83348e8b74cecb1b0dc455fe72c92")
@WinRTInterface("cdd83348e8b74cecb1b0dc455fe72c92")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpClient2.ByReference::class)
public interface IHttpClient2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryDeleteAsync(uri: Uri?): IAsyncOperationWithProgress<HttpRequestResult?,
      HttpProgress?>?

  @InterfaceMethod(1)
  public fun TryGetAsync(uri: Uri?): IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>?

  @InterfaceMethod(2)
  public fun TryGetAsync(uri: Uri?, completionOption: HttpCompletionOption?):
      IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>?

  @InterfaceMethod(3)
  public fun TryGetBufferAsync(uri: Uri?): IAsyncOperationWithProgress<HttpGetBufferResult?,
      HttpProgress?>?

  @InterfaceMethod(4)
  public fun TryGetInputStreamAsync(uri: Uri?):
      IAsyncOperationWithProgress<HttpGetInputStreamResult?, HttpProgress?>?

  @InterfaceMethod(5)
  public fun TryGetStringAsync(uri: Uri?): IAsyncOperationWithProgress<HttpGetStringResult?,
      HttpProgress?>?

  @InterfaceMethod(6)
  public fun TryPostAsync(uri: Uri?, content: IHttpContent?):
      IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>?

  @InterfaceMethod(7)
  public fun TryPutAsync(uri: Uri?, content: IHttpContent?):
      IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>?

  @InterfaceMethod(8)
  public fun TrySendRequestAsync(request: HttpRequestMessage?):
      IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>?

  @InterfaceMethod(9)
  public fun TrySendRequestAsync(request: HttpRequestMessage?,
      completionOption: HttpCompletionOption?): IAsyncOperationWithProgress<HttpRequestResult?,
      HttpProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHttpClient2> {
    public override fun getValue() = ABI.makeIHttpClient2(pointer.getPointer(0))

    public fun setValue(value: IHttpClient2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpClient2 {
    public val __1426412829_Ptr: Pointer?

    public val _1426412829_VtblPtr: Pointer?
      get() = __1426412829_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryDeleteAsync(uri: Uri?): IAsyncOperationWithProgress<HttpRequestResult?,
        HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetAsync(uri: Uri?): IAsyncOperationWithProgress<HttpRequestResult?,
        HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryGetAsync(uri: Uri?, completionOption: HttpCompletionOption?):
        IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri),
          marshalToNative(completionOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryGetBufferAsync(uri: Uri?):
        IAsyncOperationWithProgress<HttpGetBufferResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpGetBufferResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpGetBufferResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryGetInputStreamAsync(uri: Uri?):
        IAsyncOperationWithProgress<HttpGetInputStreamResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpGetInputStreamResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpGetInputStreamResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryGetStringAsync(uri: Uri?):
        IAsyncOperationWithProgress<HttpGetStringResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpGetStringResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpGetStringResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryPostAsync(uri: Uri?, content: IHttpContent?):
        IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), marshalToNative(content),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryPutAsync(uri: Uri?, content: IHttpContent?):
        IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(uri), marshalToNative(content),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun TrySendRequestAsync(request: HttpRequestMessage?):
        IAsyncOperationWithProgress<HttpRequestResult?, HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun TrySendRequestAsync(request: HttpRequestMessage?,
        completionOption: HttpCompletionOption?): IAsyncOperationWithProgress<HttpRequestResult?,
        HttpProgress?>? {
      val fnPtr = _1426412829_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__1426412829_Ptr, marshalToNative(request),
          marshalToNative(completionOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpRequestResult?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpClient2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1426412829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpClient2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cdd83348e8b74cecb1b0dc455fe72c92")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpClient2(ptr: Pointer?): WithDefault = IHttpClient2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpClient2 {
      val address = segment.toRawLongValue()
      return makeIHttpClient2(Pointer(address))
    }

    public override fun toNative(obj: IHttpClient2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1426412829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpClient2): Array<IHttpClient2?> = (elements as
        Array<IHttpClient2?>).castToImpl<IHttpClient2,IHttpClient2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpClient2?> =
        arrayOfNulls<IHttpClient2_Impl>(size) as Array<IHttpClient2?>
  }
}
