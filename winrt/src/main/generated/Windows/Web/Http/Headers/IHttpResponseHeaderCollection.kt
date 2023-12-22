package Windows.Web.Http.Headers

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpResponseHeaderCollection.ABI::class)
@Signature("{7a990969-fa3f-41ed-aac6-bf957975c16b}")
@Guid("7a990969fa3f41edaac6bf957975c16b")
@WinRTInterface("7a990969fa3f41edaac6bf957975c16b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpResponseHeaderCollection.ByReference::class)
public interface IHttpResponseHeaderCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Age(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun put_Age(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(2)
  public fun get_Allow(): HttpMethodHeaderValueCollection?

  @InterfaceMethod(3)
  public fun get_CacheControl(): HttpCacheDirectiveHeaderValueCollection?

  @InterfaceMethod(4)
  public fun get_Connection(): HttpConnectionOptionHeaderValueCollection?

  @InterfaceMethod(5)
  public fun get_Date(): IReference<DateTime?>?

  @InterfaceMethod(6)
  public fun put_Date(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(7)
  public fun get_Location(): Uri?

  @InterfaceMethod(8)
  public fun put_Location(value: Uri?): Unit

  @InterfaceMethod(9)
  public fun get_ProxyAuthenticate(): HttpChallengeHeaderValueCollection?

  @InterfaceMethod(10)
  public fun get_RetryAfter(): HttpDateOrDeltaHeaderValue?

  @InterfaceMethod(11)
  public fun put_RetryAfter(value: HttpDateOrDeltaHeaderValue?): Unit

  @InterfaceMethod(12)
  public fun get_TransferEncoding(): HttpTransferCodingHeaderValueCollection?

  @InterfaceMethod(13)
  public fun get_WwwAuthenticate(): HttpChallengeHeaderValueCollection?

  @InterfaceMethod(14)
  public fun Append(name: String?, value: String?): Unit

  @InterfaceMethod(15)
  public fun TryAppendWithoutValidation(name: String?, value: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpResponseHeaderCollection> {
    public override fun getValue() = ABI.makeIHttpResponseHeaderCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpResponseHeaderCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpResponseHeaderCollection {
    public val __1122859432_Ptr: Pointer?

    public val _1122859432_VtblPtr: Pointer?
      get() = __1122859432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Age(): IReference<TimeSpan?>? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Age(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Allow(): HttpMethodHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethodHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethodHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CacheControl(): HttpCacheDirectiveHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCacheDirectiveHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpCacheDirectiveHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Connection(): HttpConnectionOptionHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpConnectionOptionHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpConnectionOptionHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Date(): IReference<DateTime?>? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Date(value: IReference<DateTime?>?): Unit {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Location(): Uri? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Location(value: Uri?): Unit {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_ProxyAuthenticate(): HttpChallengeHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpChallengeHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpChallengeHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_RetryAfter(): HttpDateOrDeltaHeaderValue? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpDateOrDeltaHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpDateOrDeltaHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_RetryAfter(value: HttpDateOrDeltaHeaderValue?): Unit {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TransferEncoding(): HttpTransferCodingHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpTransferCodingHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpTransferCodingHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_WwwAuthenticate(): HttpChallengeHeaderValueCollection? {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpChallengeHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpChallengeHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun Append(name: String?, value: String?): Unit {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(name),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun TryAppendWithoutValidation(name: String?, value: String?): Boolean {
      val fnPtr = _1122859432_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1122859432_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpResponseHeaderCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1122859432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpResponseHeaderCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7a990969fa3f41edaac6bf957975c16b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpResponseHeaderCollection(ptr: Pointer?): WithDefault =
        IHttpResponseHeaderCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpResponseHeaderCollection {
      val address = segment.toRawLongValue()
      return makeIHttpResponseHeaderCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpResponseHeaderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1122859432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpResponseHeaderCollection):
        Array<IHttpResponseHeaderCollection?> = (elements as
        Array<IHttpResponseHeaderCollection?>).castToImpl<IHttpResponseHeaderCollection,IHttpResponseHeaderCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpResponseHeaderCollection?> =
        arrayOfNulls<IHttpResponseHeaderCollection_Impl>(size) as
        Array<IHttpResponseHeaderCollection?>
  }
}
