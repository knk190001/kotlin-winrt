package Windows.Web.Http

import Windows.Web.Http.Headers.HttpResponseHeaderCollection
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

@ABIMarker(IHttpResponseMessage.ABI::class)
@Signature("{fee200fb-8664-44e0-95d9-42696199bffc}")
@Guid("fee200fb866444e095d942696199bffc")
@WinRTInterface("fee200fb866444e095d942696199bffc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpResponseMessage.ByReference::class)
public interface IHttpResponseMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IHttpContent?

  @InterfaceMethod(1)
  public fun put_Content(value: IHttpContent?): Unit

  @InterfaceMethod(2)
  public fun get_Headers(): HttpResponseHeaderCollection?

  @InterfaceMethod(3)
  public fun get_IsSuccessStatusCode(): Boolean

  @InterfaceMethod(4)
  public fun get_ReasonPhrase(): String?

  @InterfaceMethod(5)
  public fun put_ReasonPhrase(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_RequestMessage(): HttpRequestMessage?

  @InterfaceMethod(7)
  public fun put_RequestMessage(value: HttpRequestMessage?): Unit

  @InterfaceMethod(8)
  public fun get_Source(): HttpResponseMessageSource?

  @InterfaceMethod(9)
  public fun put_Source(value: HttpResponseMessageSource?): Unit

  @InterfaceMethod(10)
  public fun get_StatusCode(): HttpStatusCode?

  @InterfaceMethod(11)
  public fun put_StatusCode(value: HttpStatusCode?): Unit

  @InterfaceMethod(12)
  public fun get_Version(): HttpVersion?

  @InterfaceMethod(13)
  public fun put_Version(value: HttpVersion?): Unit

  @InterfaceMethod(14)
  public fun EnsureSuccessStatusCode(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpResponseMessage> {
    public override fun getValue() = ABI.makeIHttpResponseMessage(pointer.getPointer(0))

    public fun setValue(value: IHttpResponseMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpResponseMessage {
    public val __797920862_Ptr: Pointer?

    public val _797920862_VtblPtr: Pointer?
      get() = __797920862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IHttpContent? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IHttpContent>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IHttpContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IHttpContent?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Headers(): HttpResponseHeaderCollection? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseHeaderCollection>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseHeaderCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsSuccessStatusCode(): Boolean {
      val fnPtr = _797920862_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ReasonPhrase(): String? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ReasonPhrase(value: String?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_RequestMessage(): HttpRequestMessage? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RequestMessage(value: HttpRequestMessage?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Source(): HttpResponseMessageSource? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessageSource>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Source(value: HttpResponseMessageSource?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_StatusCode(): HttpStatusCode? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStatusCode>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStatusCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_StatusCode(value: HttpStatusCode?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Version(): HttpVersion? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpVersion>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpVersion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Version(value: HttpVersion?): Unit {
      val fnPtr = _797920862_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun EnsureSuccessStatusCode(): HttpResponseMessage? {
      val fnPtr = _797920862_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__797920862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IHttpResponseMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __797920862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpResponseMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fee200fb866444e095d942696199bffc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpResponseMessage(ptr: Pointer?): WithDefault = IHttpResponseMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpResponseMessage {
      val address = segment.toRawLongValue()
      return makeIHttpResponseMessage(Pointer(address))
    }

    public override fun toNative(obj: IHttpResponseMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__797920862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpResponseMessage): Array<IHttpResponseMessage?> =
        (elements as
        Array<IHttpResponseMessage?>).castToImpl<IHttpResponseMessage,IHttpResponseMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpResponseMessage?> =
        arrayOfNulls<IHttpResponseMessage_Impl>(size) as Array<IHttpResponseMessage?>
  }
}
