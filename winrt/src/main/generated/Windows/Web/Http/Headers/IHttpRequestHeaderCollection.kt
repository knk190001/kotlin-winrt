package Windows.Web.Http.Headers

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.Uri
import Windows.Networking.HostName
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpRequestHeaderCollection.ABI::class)
@Signature("{af40329b-b544-469b-86b9-ac3d466fea36}")
@Guid("af40329bb544469b86b9ac3d466fea36")
@WinRTInterface("af40329bb544469b86b9ac3d466fea36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpRequestHeaderCollection.ByReference::class)
public interface IHttpRequestHeaderCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Accept(): HttpMediaTypeWithQualityHeaderValueCollection?

  @InterfaceMethod(1)
  public fun get_AcceptEncoding(): HttpContentCodingWithQualityHeaderValueCollection?

  @InterfaceMethod(2)
  public fun get_AcceptLanguage(): HttpLanguageRangeWithQualityHeaderValueCollection?

  @InterfaceMethod(3)
  public fun get_Authorization(): HttpCredentialsHeaderValue?

  @InterfaceMethod(4)
  public fun put_Authorization(value: HttpCredentialsHeaderValue?): Unit

  @InterfaceMethod(5)
  public fun get_CacheControl(): HttpCacheDirectiveHeaderValueCollection?

  @InterfaceMethod(6)
  public fun get_Connection(): HttpConnectionOptionHeaderValueCollection?

  @InterfaceMethod(7)
  public fun get_Cookie(): HttpCookiePairHeaderValueCollection?

  @InterfaceMethod(8)
  public fun get_Date(): IReference<DateTime?>?

  @InterfaceMethod(9)
  public fun put_Date(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(10)
  public fun get_Expect(): HttpExpectationHeaderValueCollection?

  @InterfaceMethod(11)
  public fun get_From(): String?

  @InterfaceMethod(12)
  public fun put_From(value: String?): Unit

  @InterfaceMethod(13)
  public fun get_Host(): HostName?

  @InterfaceMethod(14)
  public fun put_Host(value: HostName?): Unit

  @InterfaceMethod(15)
  public fun get_IfModifiedSince(): IReference<DateTime?>?

  @InterfaceMethod(16)
  public fun put_IfModifiedSince(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(17)
  public fun get_IfUnmodifiedSince(): IReference<DateTime?>?

  @InterfaceMethod(18)
  public fun put_IfUnmodifiedSince(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(19)
  public fun get_MaxForwards(): IReference<WinDef.UINT>?

  @InterfaceMethod(20)
  public fun put_MaxForwards(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(21)
  public fun get_ProxyAuthorization(): HttpCredentialsHeaderValue?

  @InterfaceMethod(22)
  public fun put_ProxyAuthorization(value: HttpCredentialsHeaderValue?): Unit

  @InterfaceMethod(23)
  public fun get_Referer(): Uri?

  @InterfaceMethod(24)
  public fun put_Referer(value: Uri?): Unit

  @InterfaceMethod(25)
  public fun get_TransferEncoding(): HttpTransferCodingHeaderValueCollection?

  @InterfaceMethod(26)
  public fun get_UserAgent(): HttpProductInfoHeaderValueCollection?

  @InterfaceMethod(27)
  public fun Append(name: String?, value: String?): Unit

  @InterfaceMethod(28)
  public fun TryAppendWithoutValidation(name: String?, value: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpRequestHeaderCollection> {
    public override fun getValue() = ABI.makeIHttpRequestHeaderCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpRequestHeaderCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpRequestHeaderCollection {
    public val __954884786_Ptr: Pointer?

    public val _954884786_VtblPtr: Pointer?
      get() = __954884786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Accept(): HttpMediaTypeWithQualityHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMediaTypeWithQualityHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpMediaTypeWithQualityHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AcceptEncoding(): HttpContentCodingWithQualityHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingWithQualityHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpContentCodingWithQualityHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AcceptLanguage(): HttpLanguageRangeWithQualityHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpLanguageRangeWithQualityHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpLanguageRangeWithQualityHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Authorization(): HttpCredentialsHeaderValue? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCredentialsHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCredentialsHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Authorization(value: HttpCredentialsHeaderValue?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CacheControl(): HttpCacheDirectiveHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCacheDirectiveHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpCacheDirectiveHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Connection(): HttpConnectionOptionHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpConnectionOptionHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpConnectionOptionHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Cookie(): HttpCookiePairHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCookiePairHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCookiePairHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Date(): IReference<DateTime?>? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Date(value: IReference<DateTime?>?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Expect(): HttpExpectationHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpExpectationHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpExpectationHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_From(): String? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_From(value: String?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_Host(): HostName? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HostName>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HostName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Host(value: HostName?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_IfModifiedSince(): IReference<DateTime?>? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_IfModifiedSince(value: IReference<DateTime?>?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_IfUnmodifiedSince(): IReference<DateTime?>? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_IfUnmodifiedSince(value: IReference<DateTime?>?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_MaxForwards(): IReference<WinDef.UINT>? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_MaxForwards(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_ProxyAuthorization(): HttpCredentialsHeaderValue? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCredentialsHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCredentialsHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun put_ProxyAuthorization(value: HttpCredentialsHeaderValue?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_Referer(): Uri? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun put_Referer(value: Uri?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(25)
    public override fun get_TransferEncoding(): HttpTransferCodingHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpTransferCodingHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpTransferCodingHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(26)
    public override fun get_UserAgent(): HttpProductInfoHeaderValueCollection? {
      val fnPtr = _954884786_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductInfoHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductInfoHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun Append(name: String?, value: String?): Unit {
      val fnPtr = _954884786_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun TryAppendWithoutValidation(name: String?, value: String?): Boolean {
      val fnPtr = _954884786_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__954884786_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpRequestHeaderCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __954884786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpRequestHeaderCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af40329bb544469b86b9ac3d466fea36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpRequestHeaderCollection(ptr: Pointer?): WithDefault =
        IHttpRequestHeaderCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpRequestHeaderCollection {
      val address = segment.toRawLongValue()
      return makeIHttpRequestHeaderCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpRequestHeaderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__954884786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpRequestHeaderCollection):
        Array<IHttpRequestHeaderCollection?> = (elements as
        Array<IHttpRequestHeaderCollection?>).castToImpl<IHttpRequestHeaderCollection,IHttpRequestHeaderCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpRequestHeaderCollection?> =
        arrayOfNulls<IHttpRequestHeaderCollection_Impl>(size) as
        Array<IHttpRequestHeaderCollection?>
  }
}
