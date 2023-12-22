package Microsoft.Web.WebView2.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWebView2NavigationStartingEventArgs.ABI::class)
@Signature("{548d23d3-fea3-5616-bd05-ae08066c86d3}")
@Guid("548d23d3fea35616bd05ae08066c86d3")
@WinRTInterface("548d23d3fea35616bd05ae08066c86d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2NavigationStartingEventArgs.ByReference::class)
public interface ICoreWebView2NavigationStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_IsUserInitiated(): Boolean

  @InterfaceMethod(2)
  public fun get_IsRedirected(): Boolean

  @InterfaceMethod(3)
  public fun get_RequestHeaders(): CoreWebView2HttpRequestHeaders?

  @InterfaceMethod(4)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(5)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_NavigationId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2NavigationStartingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2NavigationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2NavigationStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2NavigationStartingEventArgs {
    public val __1840443460_Ptr: Pointer?

    public val _1840443460_VtblPtr: Pointer?
      get() = __1840443460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsRedirected(): Boolean {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_RequestHeaders(): CoreWebView2HttpRequestHeaders? {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2HttpRequestHeaders>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2HttpRequestHeaders>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_NavigationId(): WinDef.ULONG {
      val fnPtr = _1840443460_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1840443460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2NavigationStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1840443460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2NavigationStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("548d23d3fea35616bd05ae08066c86d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2NavigationStartingEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2NavigationStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2NavigationStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2NavigationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2NavigationStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1840443460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2NavigationStartingEventArgs):
        Array<ICoreWebView2NavigationStartingEventArgs?> = (elements as
        Array<ICoreWebView2NavigationStartingEventArgs?>).castToImpl<ICoreWebView2NavigationStartingEventArgs,ICoreWebView2NavigationStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2NavigationStartingEventArgs?> =
        arrayOfNulls<ICoreWebView2NavigationStartingEventArgs_Impl>(size) as
        Array<ICoreWebView2NavigationStartingEventArgs?>
  }
}
