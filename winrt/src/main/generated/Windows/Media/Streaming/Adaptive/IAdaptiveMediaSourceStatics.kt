package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStream
import Windows.Web.Http.HttpClient
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceStatics.ABI::class)
@Signature("{50a6bd5d-66ef-4cd3-9579-9e660507dc3f}")
@Guid("50a6bd5d66ef4cd395799e660507dc3f")
@WinRTInterface("50a6bd5d66ef4cd395799e660507dc3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceStatics.ByReference::class)
public interface IAdaptiveMediaSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsContentTypeSupported(contentType: String?): Boolean

  @InterfaceMethod(1)
  public fun CreateFromUriAsync(uri: Uri?): IAsyncOperation<AdaptiveMediaSourceCreationResult?>?

  @InterfaceMethod(2)
  public fun CreateFromUriAsync(uri: Uri?, httpClient: HttpClient?):
      IAsyncOperation<AdaptiveMediaSourceCreationResult?>?

  @InterfaceMethod(3)
  public fun CreateFromStreamAsync(
    stream: IInputStream?,
    uri: Uri?,
    contentType: String?
  ): IAsyncOperation<AdaptiveMediaSourceCreationResult?>?

  @InterfaceMethod(4)
  public fun CreateFromStreamAsync(
    stream: IInputStream?,
    uri: Uri?,
    contentType: String?,
    httpClient: HttpClient?
  ): IAsyncOperation<AdaptiveMediaSourceCreationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceStatics> {
    public override fun getValue() = ABI.makeIAdaptiveMediaSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceStatics {
    public val __2097123026_Ptr: Pointer?

    public val _2097123026_VtblPtr: Pointer?
      get() = __2097123026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsContentTypeSupported(contentType: String?): Boolean {
      val fnPtr = _2097123026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2097123026_Ptr, marshalToNative(contentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun CreateFromUriAsync(uri: Uri?):
        IAsyncOperation<AdaptiveMediaSourceCreationResult?>? {
      val fnPtr = _2097123026_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2097123026_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromUriAsync(uri: Uri?, httpClient: HttpClient?):
        IAsyncOperation<AdaptiveMediaSourceCreationResult?>? {
      val fnPtr = _2097123026_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2097123026_Ptr, marshalToNative(uri),
          marshalToNative(httpClient), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromStreamAsync(
      stream: IInputStream?,
      uri: Uri?,
      contentType: String?
    ): IAsyncOperation<AdaptiveMediaSourceCreationResult?>? {
      val fnPtr = _2097123026_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2097123026_Ptr, marshalToNative(stream), marshalToNative(uri),
          marshalToNative(contentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFromStreamAsync(
      stream: IInputStream?,
      uri: Uri?,
      contentType: String?,
      httpClient: HttpClient?
    ): IAsyncOperation<AdaptiveMediaSourceCreationResult?>? {
      val fnPtr = _2097123026_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>()
      val hr = fn.invokeHR(arrayOf(__2097123026_Ptr, marshalToNative(stream), marshalToNative(uri),
          marshalToNative(contentType), marshalToNative(httpClient), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdaptiveMediaSourceCreationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2097123026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50a6bd5d66ef4cd395799e660507dc3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceStatics(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceStatics {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2097123026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceStatics):
        Array<IAdaptiveMediaSourceStatics?> = (elements as
        Array<IAdaptiveMediaSourceStatics?>).castToImpl<IAdaptiveMediaSourceStatics,IAdaptiveMediaSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceStatics?> =
        arrayOfNulls<IAdaptiveMediaSourceStatics_Impl>(size) as Array<IAdaptiveMediaSourceStatics?>
  }
}
