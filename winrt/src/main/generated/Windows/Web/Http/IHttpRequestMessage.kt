package Windows.Web.Http

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Uri
import Windows.Web.Http.Headers.HttpRequestHeaderCollection
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IHttpRequestMessage.ABI::class)
@Signature("{f5762b3c-74d4-4811-b5dc-9f8b4e2f9abf}")
@Guid("f5762b3c74d44811b5dc9f8b4e2f9abf")
@WinRTInterface("f5762b3c74d44811b5dc9f8b4e2f9abf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpRequestMessage.ByReference::class)
public interface IHttpRequestMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Content(): IHttpContent?

  @InterfaceMethod(1)
  public fun put_Content(value: IHttpContent?): Unit

  @InterfaceMethod(2)
  public fun get_Headers(): HttpRequestHeaderCollection?

  @InterfaceMethod(3)
  public fun get_Method(): HttpMethod?

  @InterfaceMethod(4)
  public fun put_Method(value: HttpMethod?): Unit

  @InterfaceMethod(5)
  public fun get_Properties(): IMap<String?, IUnknown?>?

  @InterfaceMethod(6)
  public fun get_RequestUri(): Uri?

  @InterfaceMethod(7)
  public fun put_RequestUri(value: Uri?): Unit

  @InterfaceMethod(8)
  public fun get_TransportInformation(): HttpTransportInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpRequestMessage> {
    public override fun getValue() = ABI.makeIHttpRequestMessage(pointer.getPointer(0))

    public fun setValue(value: IHttpRequestMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpRequestMessage {
    public val __131504604_Ptr: Pointer?

    public val _131504604_VtblPtr: Pointer?
      get() = __131504604_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Content(): IHttpContent? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IHttpContent>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IHttpContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Content(value: IHttpContent?): Unit {
      val fnPtr = _131504604_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Headers(): HttpRequestHeaderCollection? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestHeaderCollection>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestHeaderCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Method(): HttpMethod? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Method(value: HttpMethod?): Unit {
      val fnPtr = _131504604_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IMap<String?, IUnknown?>? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RequestUri(): Uri? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_RequestUri(value: Uri?): Unit {
      val fnPtr = _131504604_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TransportInformation(): HttpTransportInformation? {
      val fnPtr = _131504604_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpTransportInformation>()
      val hr = fn.invokeHR(arrayOf(__131504604_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpTransportInformation>(result.getValue())
      return resultValue
    }
  }

  public class IHttpRequestMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __131504604_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpRequestMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5762b3c74d44811b5dc9f8b4e2f9abf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpRequestMessage(ptr: Pointer?): WithDefault = IHttpRequestMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpRequestMessage {
      val address = segment.toRawLongValue()
      return makeIHttpRequestMessage(Pointer(address))
    }

    public override fun toNative(obj: IHttpRequestMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__131504604_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpRequestMessage): Array<IHttpRequestMessage?> =
        (elements as
        Array<IHttpRequestMessage?>).castToImpl<IHttpRequestMessage,IHttpRequestMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpRequestMessage?> =
        arrayOfNulls<IHttpRequestMessage_Impl>(size) as Array<IHttpRequestMessage?>
  }
}
