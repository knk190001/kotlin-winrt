package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackage
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
import Windows.UI.Xaml.Navigation.LoadCompletedEventHandler
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebView.ABI::class)
@Signature("{5862cc46-1f7d-479b-92a6-de7858fe8d54}")
@Guid("5862cc461f7d479b92a6de7858fe8d54")
@WinRTInterface("5862cc461f7d479b92a6de7858fe8d54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView.ByReference::class)
public interface IWebView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Uri?

  @InterfaceMethod(1)
  public fun put_Source(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_AllowedScriptNotifyUris(): IVector<Uri?>?

  @InterfaceMethod(3)
  public fun put_AllowedScriptNotifyUris(value: IVector<Uri?>?): Unit

  @InterfaceMethod(4)
  public fun get_DataTransferPackage(): DataPackage?

  @InterfaceMethod(5)
  public fun add_LoadCompleted(handler: LoadCompletedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_LoadCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_ScriptNotify(handler: NotifyEventHandler?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_ScriptNotify(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_NavigationFailed(handler: WebViewNavigationFailedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_NavigationFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun InvokeScript(scriptName: String?, arguments: Array<String?>): String?

  @InterfaceMethod(12)
  public fun Navigate(source: Uri?): Unit

  @InterfaceMethod(13)
  public fun NavigateToString(text: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView> {
    public override fun getValue() = ABI.makeIWebView(pointer.getPointer(0))

    public fun setValue(value: IWebView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView {
    public val __376421501_Ptr: Pointer?

    public val _376421501_VtblPtr: Pointer?
      get() = __376421501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Uri? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: Uri?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AllowedScriptNotifyUris(): IVector<Uri?>? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AllowedScriptNotifyUris(value: IVector<Uri?>?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DataTransferPackage(): DataPackage? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_LoadCompleted(handler: LoadCompletedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_LoadCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_ScriptNotify(handler: NotifyEventHandler?): EventRegistrationToken? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_ScriptNotify(token: EventRegistrationToken?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_NavigationFailed(handler: WebViewNavigationFailedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_NavigationFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun InvokeScript(scriptName: String?, arguments: Array<String?>): String? {
      val fnPtr = _376421501_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(scriptName),
          arguments.size,marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun Navigate(source: Uri?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun NavigateToString(text: String?): Unit {
      val fnPtr = _376421501_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__376421501_Ptr, marshalToNative(text),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __376421501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5862cc461f7d479b92a6de7858fe8d54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView(ptr: Pointer?): WithDefault = IWebView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView {
      val address = segment.toRawLongValue()
      return makeIWebView(Pointer(address))
    }

    public override fun toNative(obj: IWebView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__376421501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView): Array<IWebView?> = (elements as
        Array<IWebView?>).castToImpl<IWebView,IWebView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView?> = arrayOfNulls<IWebView_Impl>(size) as
        Array<IWebView?>
  }
}
