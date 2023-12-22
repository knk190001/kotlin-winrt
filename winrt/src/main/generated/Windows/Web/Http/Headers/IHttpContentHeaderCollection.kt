package Windows.Web.Http.Headers

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
import Windows.Foundation.Uri
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IHttpContentHeaderCollection.ABI::class)
@Signature("{40612a44-47ae-4b7e-9124-69628b64aa18}")
@Guid("40612a4447ae4b7e912469628b64aa18")
@WinRTInterface("40612a4447ae4b7e912469628b64aa18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentHeaderCollection.ByReference::class)
public interface IHttpContentHeaderCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentDisposition(): HttpContentDispositionHeaderValue?

  @InterfaceMethod(1)
  public fun put_ContentDisposition(value: HttpContentDispositionHeaderValue?): Unit

  @InterfaceMethod(2)
  public fun get_ContentEncoding(): HttpContentCodingHeaderValueCollection?

  @InterfaceMethod(3)
  public fun get_ContentLanguage(): HttpLanguageHeaderValueCollection?

  @InterfaceMethod(4)
  public fun get_ContentLength(): IReference<WinDef.ULONG>?

  @InterfaceMethod(5)
  public fun put_ContentLength(value: IReference<WinDef.ULONG>?): Unit

  @InterfaceMethod(6)
  public fun get_ContentLocation(): Uri?

  @InterfaceMethod(7)
  public fun put_ContentLocation(value: Uri?): Unit

  @InterfaceMethod(8)
  public fun get_ContentMD5(): IBuffer?

  @InterfaceMethod(9)
  public fun put_ContentMD5(value: IBuffer?): Unit

  @InterfaceMethod(10)
  public fun get_ContentRange(): HttpContentRangeHeaderValue?

  @InterfaceMethod(11)
  public fun put_ContentRange(value: HttpContentRangeHeaderValue?): Unit

  @InterfaceMethod(12)
  public fun get_ContentType(): HttpMediaTypeHeaderValue?

  @InterfaceMethod(13)
  public fun put_ContentType(value: HttpMediaTypeHeaderValue?): Unit

  @InterfaceMethod(14)
  public fun get_Expires(): IReference<DateTime?>?

  @InterfaceMethod(15)
  public fun put_Expires(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(16)
  public fun get_LastModified(): IReference<DateTime?>?

  @InterfaceMethod(17)
  public fun put_LastModified(value: IReference<DateTime?>?): Unit

  @InterfaceMethod(18)
  public fun Append(name: String?, value: String?): Unit

  @InterfaceMethod(19)
  public fun TryAppendWithoutValidation(name: String?, value: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentHeaderCollection> {
    public override fun getValue() = ABI.makeIHttpContentHeaderCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpContentHeaderCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentHeaderCollection {
    public val __887043272_Ptr: Pointer?

    public val _887043272_VtblPtr: Pointer?
      get() = __887043272_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentDisposition(): HttpContentDispositionHeaderValue? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentDispositionHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentDispositionHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentDisposition(value: HttpContentDispositionHeaderValue?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentEncoding(): HttpContentCodingHeaderValueCollection? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentCodingHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ContentLanguage(): HttpLanguageHeaderValueCollection? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpLanguageHeaderValueCollection>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpLanguageHeaderValueCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ContentLength(): IReference<WinDef.ULONG>? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ContentLength(value: IReference<WinDef.ULONG>?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ContentLocation(): Uri? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ContentLocation(value: Uri?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ContentMD5(): IBuffer? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ContentMD5(value: IBuffer?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ContentRange(): HttpContentRangeHeaderValue? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentRangeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentRangeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ContentRange(value: HttpContentRangeHeaderValue?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ContentType(): HttpMediaTypeHeaderValue? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMediaTypeHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMediaTypeHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_ContentType(value: HttpMediaTypeHeaderValue?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Expires(): IReference<DateTime?>? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Expires(value: IReference<DateTime?>?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_LastModified(): IReference<DateTime?>? {
      val fnPtr = _887043272_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_LastModified(value: IReference<DateTime?>?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun Append(name: String?, value: String?): Unit {
      val fnPtr = _887043272_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun TryAppendWithoutValidation(name: String?, value: String?): Boolean {
      val fnPtr = _887043272_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__887043272_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpContentHeaderCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __887043272_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentHeaderCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40612a4447ae4b7e912469628b64aa18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentHeaderCollection(ptr: Pointer?): WithDefault =
        IHttpContentHeaderCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentHeaderCollection {
      val address = segment.toRawLongValue()
      return makeIHttpContentHeaderCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentHeaderCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__887043272_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentHeaderCollection):
        Array<IHttpContentHeaderCollection?> = (elements as
        Array<IHttpContentHeaderCollection?>).castToImpl<IHttpContentHeaderCollection,IHttpContentHeaderCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentHeaderCollection?> =
        arrayOfNulls<IHttpContentHeaderCollection_Impl>(size) as
        Array<IHttpContentHeaderCollection?>
  }
}
