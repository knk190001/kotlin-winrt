package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(ICoreWebView2_15.ABI::class)
@Signature("{4443f532-d2ba-5ae2-a9b3-8de62bd5d4a9}")
@Guid("4443f532d2ba5ae2a9b38de62bd5d4a9")
@WinRTInterface("4443f532d2ba5ae2a9b38de62bd5d4a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_15.ByReference::class)
public interface ICoreWebView2_15 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FaviconUri(): String?

  @InterfaceMethod(1)
  public fun add_FaviconChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_FaviconChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun GetFaviconAsync(format: CoreWebView2FaviconImageFormat?):
      IAsyncOperation<IRandomAccessStream?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_15> {
    public override fun getValue() = ABI.makeICoreWebView2_15(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_15_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_15 {
    public val __1813492964_Ptr: Pointer?

    public val _1813492964_VtblPtr: Pointer?
      get() = __1813492964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FaviconUri(): String? {
      val fnPtr = _1813492964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1813492964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_FaviconChanged(handler: TypedEventHandler<CoreWebView2?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1813492964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1813492964_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_FaviconChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1813492964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492964_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetFaviconAsync(format: CoreWebView2FaviconImageFormat?):
        IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1813492964_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1813492964_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2_15_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_15, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4443f532d2ba5ae2a9b38de62bd5d4a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_15(ptr: Pointer?): WithDefault = ICoreWebView2_15_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_15 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_15(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_15): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_15): Array<ICoreWebView2_15?> = (elements as
        Array<ICoreWebView2_15?>).castToImpl<ICoreWebView2_15,ICoreWebView2_15_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_15?> =
        arrayOfNulls<ICoreWebView2_15_Impl>(size) as Array<ICoreWebView2_15?>
  }
}
