package Windows.UI.Xaml.Controls

import Windows.Foundation.Deferral
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

@ABIMarker(IWebViewWebResourceRequestedEventArgs.ABI::class)
@Signature("{378d21f6-c77f-5d8b-8f30-93c99df79435}")
@Guid("378d21f6c77f5d8b8f3093c99df79435")
@WinRTInterface("378d21f6c77f5d8b8f3093c99df79435")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewWebResourceRequestedEventArgs.ByReference::class)
public interface IWebViewWebResourceRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): HttpRequestMessage?

  @InterfaceMethod(1)
  public fun get_Response(): HttpResponseMessage?

  @InterfaceMethod(2)
  public fun put_Response(value: HttpResponseMessage?): Unit

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewWebResourceRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewWebResourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewWebResourceRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewWebResourceRequestedEventArgs {
    public val __263004562_Ptr: Pointer?

    public val _263004562_VtblPtr: Pointer?
      get() = __263004562_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): HttpRequestMessage? {
      val fnPtr = _263004562_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__263004562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Response(): HttpResponseMessage? {
      val fnPtr = _263004562_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__263004562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Response(value: HttpResponseMessage?): Unit {
      val fnPtr = _263004562_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__263004562_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _263004562_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__263004562_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewWebResourceRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __263004562_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewWebResourceRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("378d21f6c77f5d8b8f3093c99df79435")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewWebResourceRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewWebResourceRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewWebResourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewWebResourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewWebResourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__263004562_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewWebResourceRequestedEventArgs):
        Array<IWebViewWebResourceRequestedEventArgs?> = (elements as
        Array<IWebViewWebResourceRequestedEventArgs?>).castToImpl<IWebViewWebResourceRequestedEventArgs,IWebViewWebResourceRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewWebResourceRequestedEventArgs?> =
        arrayOfNulls<IWebViewWebResourceRequestedEventArgs_Impl>(size) as
        Array<IWebViewWebResourceRequestedEventArgs?>
  }
}
