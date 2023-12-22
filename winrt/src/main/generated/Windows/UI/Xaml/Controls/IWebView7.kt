package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IWebView7.ABI::class)
@Signature("{27707c2b-042f-5353-9021-55cd06585fdf}")
@Guid("27707c2b042f5353902155cd06585fdf")
@WinRTInterface("27707c2b042f5353902155cd06585fdf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView7.ByReference::class)
public interface IWebView7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_WebResourceRequested(handler: TypedEventHandler<WebView?,
      WebViewWebResourceRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView7> {
    public override fun getValue() = ABI.makeIWebView7(pointer.getPointer(0))

    public fun setValue(value: IWebView7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView7 {
    public val __1215835302_Ptr: Pointer?

    public val _1215835302_VtblPtr: Pointer?
      get() = __1215835302_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_WebResourceRequested(handler: TypedEventHandler<WebView?,
        WebViewWebResourceRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835302_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835302_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_WebResourceRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835302_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835302_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebView7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215835302_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27707c2b042f5353902155cd06585fdf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView7(ptr: Pointer?): WithDefault = IWebView7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView7 {
      val address = segment.toRawLongValue()
      return makeIWebView7(Pointer(address))
    }

    public override fun toNative(obj: IWebView7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215835302_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView7): Array<IWebView7?> = (elements as
        Array<IWebView7?>).castToImpl<IWebView7,IWebView7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView7?> = arrayOfNulls<IWebView7_Impl>(size)
        as Array<IWebView7?>
  }
}
