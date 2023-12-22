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

@ABIMarker(IWebView6.ABI::class)
@Signature("{38ccd942-2536-467c-a211-af359c3b4fda}")
@Guid("38ccd9422536467ca211af359c3b4fda")
@WinRTInterface("38ccd9422536467ca211af359c3b4fda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebView6.ByReference::class)
public interface IWebView6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SeparateProcessLost(handler: TypedEventHandler<WebView?,
      WebViewSeparateProcessLostEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SeparateProcessLost(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebView6> {
    public override fun getValue() = ABI.makeIWebView6(pointer.getPointer(0))

    public fun setValue(value: IWebView6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebView6 {
    public val __1215835303_Ptr: Pointer?

    public val _1215835303_VtblPtr: Pointer?
      get() = __1215835303_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SeparateProcessLost(handler: TypedEventHandler<WebView?,
        WebViewSeparateProcessLostEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1215835303_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1215835303_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SeparateProcessLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _1215835303_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1215835303_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebView6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215835303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebView6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38ccd9422536467ca211af359c3b4fda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebView6(ptr: Pointer?): WithDefault = IWebView6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebView6 {
      val address = segment.toRawLongValue()
      return makeIWebView6(Pointer(address))
    }

    public override fun toNative(obj: IWebView6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215835303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebView6): Array<IWebView6?> = (elements as
        Array<IWebView6?>).castToImpl<IWebView6,IWebView6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebView6?> = arrayOfNulls<IWebView6_Impl>(size)
        as Array<IWebView6?>
  }
}
