package Microsoft.Web.WebView2.Core

import Windows.Foundation.Deferral
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

@ABIMarker(ICoreWebView2DownloadStartingEventArgs.ABI::class)
@Signature("{45d982ba-9256-5b35-b023-26a438599110}")
@Guid("45d982ba92565b35b02326a438599110")
@WinRTInterface("45d982ba92565b35b02326a438599110")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2DownloadStartingEventArgs.ByReference::class)
public interface ICoreWebView2DownloadStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DownloadOperation(): CoreWebView2DownloadOperation?

  @InterfaceMethod(1)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(2)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_ResultFilePath(): String?

  @InterfaceMethod(4)
  public fun put_ResultFilePath(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Handled(): Boolean

  @InterfaceMethod(6)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2DownloadStartingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2DownloadStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2DownloadStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2DownloadStartingEventArgs {
    public val __1298825736_Ptr: Pointer?

    public val _1298825736_VtblPtr: Pointer?
      get() = __1298825736_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DownloadOperation(): CoreWebView2DownloadOperation? {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2DownloadOperation>()
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2DownloadOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_ResultFilePath(): String? {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ResultFilePath(value: String?): Unit {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1298825736_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1298825736_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2DownloadStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1298825736_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2DownloadStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45d982ba92565b35b02326a438599110")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2DownloadStartingEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2DownloadStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2DownloadStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2DownloadStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2DownloadStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1298825736_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2DownloadStartingEventArgs):
        Array<ICoreWebView2DownloadStartingEventArgs?> = (elements as
        Array<ICoreWebView2DownloadStartingEventArgs?>).castToImpl<ICoreWebView2DownloadStartingEventArgs,ICoreWebView2DownloadStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2DownloadStartingEventArgs?> =
        arrayOfNulls<ICoreWebView2DownloadStartingEventArgs_Impl>(size) as
        Array<ICoreWebView2DownloadStartingEventArgs?>
  }
}
