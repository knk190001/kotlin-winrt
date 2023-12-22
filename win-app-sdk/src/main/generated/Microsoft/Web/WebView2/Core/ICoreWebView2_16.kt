package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(ICoreWebView2_16.ABI::class)
@Signature("{61d0a57c-6c4f-50ff-a137-314b0099a2b8}")
@Guid("61d0a57c6c4f50ffa137314b0099a2b8")
@WinRTInterface("61d0a57c6c4f50ffa137314b0099a2b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_16.ByReference::class)
public interface ICoreWebView2_16 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PrintAsync(printSettings: CoreWebView2PrintSettings?):
      IAsyncOperation<CoreWebView2PrintStatus?>?

  @InterfaceMethod(1)
  public fun ShowPrintUI(printDialogKind: CoreWebView2PrintDialogKind?): Unit

  @InterfaceMethod(2)
  public fun PrintToPdfStreamAsync(printSettings: CoreWebView2PrintSettings?):
      IAsyncOperation<IRandomAccessStream?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_16> {
    public override fun getValue() = ABI.makeICoreWebView2_16(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_16_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_16 {
    public val __1813492963_Ptr: Pointer?

    public val _1813492963_VtblPtr: Pointer?
      get() = __1813492963_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PrintAsync(printSettings: CoreWebView2PrintSettings?):
        IAsyncOperation<CoreWebView2PrintStatus?>? {
      val fnPtr = _1813492963_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2PrintStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1813492963_Ptr, marshalToNative(printSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2PrintStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowPrintUI(printDialogKind: CoreWebView2PrintDialogKind?): Unit {
      val fnPtr = _1813492963_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492963_Ptr, marshalToNative(printDialogKind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun PrintToPdfStreamAsync(printSettings: CoreWebView2PrintSettings?):
        IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1813492963_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1813492963_Ptr, marshalToNative(printSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2_16_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492963_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_16, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61d0a57c6c4f50ffa137314b0099a2b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_16(ptr: Pointer?): WithDefault = ICoreWebView2_16_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_16 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_16(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_16): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492963_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_16): Array<ICoreWebView2_16?> = (elements as
        Array<ICoreWebView2_16?>).castToImpl<ICoreWebView2_16,ICoreWebView2_16_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_16?> =
        arrayOfNulls<ICoreWebView2_16_Impl>(size) as Array<ICoreWebView2_16?>
  }
}
