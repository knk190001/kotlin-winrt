package Windows.Web.UI.Interop

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewControlProcess.ABI::class)
@Signature("{02c723ec-98d6-424a-b63e-c6136c36a0f2}")
@Guid("02c723ec98d6424ab63ec6136c36a0f2")
@WinRTInterface("02c723ec98d6424ab63ec6136c36a0f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlProcess.ByReference::class)
public interface IWebViewControlProcess : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProcessId(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EnterpriseId(): String?

  @InterfaceMethod(2)
  public fun get_IsPrivateNetworkClientServerCapabilityEnabled(): Boolean

  @InterfaceMethod(3)
  public fun CreateWebViewControlAsync(hostWindowHandle: Long, bounds: Rect?):
      IAsyncOperation<WebViewControl?>?

  @InterfaceMethod(4)
  public fun GetWebViewControls(): IVectorView<WebViewControl?>?

  @InterfaceMethod(5)
  public fun Terminate(): Unit

  @InterfaceMethod(6)
  public fun add_ProcessExited(handler: TypedEventHandler<WebViewControlProcess?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ProcessExited(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlProcess> {
    public override fun getValue() = ABI.makeIWebViewControlProcess(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlProcess_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlProcess {
    public val __224539606_Ptr: Pointer?

    public val _224539606_VtblPtr: Pointer?
      get() = __224539606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProcessId(): WinDef.UINT {
      val fnPtr = _224539606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _224539606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPrivateNetworkClientServerCapabilityEnabled(): Boolean {
      val fnPtr = _224539606_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun CreateWebViewControlAsync(hostWindowHandle: Long, bounds: Rect?):
        IAsyncOperation<WebViewControl?>? {
      val fnPtr = _224539606_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebViewControl?>>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr, hostWindowHandle, marshalToNative(bounds),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebViewControl?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetWebViewControls(): IVectorView<WebViewControl?>? {
      val fnPtr = _224539606_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WebViewControl?>>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WebViewControl?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Terminate(): Unit {
      val fnPtr = _224539606_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ProcessExited(handler: TypedEventHandler<WebViewControlProcess?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _224539606_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ProcessExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _224539606_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__224539606_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlProcess_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __224539606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlProcess, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02c723ec98d6424ab63ec6136c36a0f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlProcess(ptr: Pointer?): WithDefault =
        IWebViewControlProcess_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlProcess {
      val address = segment.toRawLongValue()
      return makeIWebViewControlProcess(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlProcess): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__224539606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlProcess): Array<IWebViewControlProcess?> =
        (elements as
        Array<IWebViewControlProcess?>).castToImpl<IWebViewControlProcess,IWebViewControlProcess_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlProcess?> =
        arrayOfNulls<IWebViewControlProcess_Impl>(size) as Array<IWebViewControlProcess?>
  }
}
