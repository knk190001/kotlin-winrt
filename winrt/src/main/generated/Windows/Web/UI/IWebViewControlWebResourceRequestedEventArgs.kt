package Windows.Web.UI

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

@ABIMarker(IWebViewControlWebResourceRequestedEventArgs.ABI::class)
@Signature("{44d6524d-55a4-4d8b-891c-931d8e25d42e}")
@Guid("44d6524d55a44d8b891c931d8e25d42e")
@WinRTInterface("44d6524d55a44d8b891c931d8e25d42e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlWebResourceRequestedEventArgs.ByReference::class)
public interface IWebViewControlWebResourceRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  @InterfaceMethod(1)
  public fun get_Request(): HttpRequestMessage?

  @InterfaceMethod(2)
  public fun put_Response(value: HttpResponseMessage?): Unit

  @InterfaceMethod(3)
  public fun get_Response(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlWebResourceRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlWebResourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlWebResourceRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlWebResourceRequestedEventArgs {
    public val __172227895_Ptr: Pointer?

    public val _172227895_VtblPtr: Pointer?
      get() = __172227895_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _172227895_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__172227895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Request(): HttpRequestMessage? {
      val fnPtr = _172227895_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__172227895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Response(value: HttpResponseMessage?): Unit {
      val fnPtr = _172227895_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__172227895_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Response(): HttpResponseMessage? {
      val fnPtr = _172227895_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__172227895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlWebResourceRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __172227895_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlWebResourceRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44d6524d55a44d8b891c931d8e25d42e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlWebResourceRequestedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlWebResourceRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlWebResourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlWebResourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlWebResourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__172227895_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlWebResourceRequestedEventArgs):
        Array<IWebViewControlWebResourceRequestedEventArgs?> = (elements as
        Array<IWebViewControlWebResourceRequestedEventArgs?>).castToImpl<IWebViewControlWebResourceRequestedEventArgs,IWebViewControlWebResourceRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlWebResourceRequestedEventArgs?> =
        arrayOfNulls<IWebViewControlWebResourceRequestedEventArgs_Impl>(size) as
        Array<IWebViewControlWebResourceRequestedEventArgs?>
  }
}
