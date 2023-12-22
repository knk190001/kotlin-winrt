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

@ABIMarker(ICoreWebView2NewWindowRequestedEventArgs.ABI::class)
@Signature("{e6e013ba-aec8-532e-9ac9-1590af7b25ec}")
@Guid("e6e013baaec8532e9ac91590af7b25ec")
@WinRTInterface("e6e013baaec8532e9ac91590af7b25ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2NewWindowRequestedEventArgs.ByReference::class)
public interface ICoreWebView2NewWindowRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_NewWindow(): CoreWebView2?

  @InterfaceMethod(2)
  public fun put_NewWindow(value: CoreWebView2?): Unit

  @InterfaceMethod(3)
  public fun get_Handled(): Boolean

  @InterfaceMethod(4)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsUserInitiated(): Boolean

  @InterfaceMethod(6)
  public fun get_WindowFeatures(): CoreWebView2WindowFeatures?

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2NewWindowRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2NewWindowRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2NewWindowRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2NewWindowRequestedEventArgs {
    public val __1105450450_Ptr: Pointer?

    public val _1105450450_VtblPtr: Pointer?
      get() = __1105450450_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NewWindow(): CoreWebView2? {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_NewWindow(value: CoreWebView2?): Unit {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_WindowFeatures(): CoreWebView2WindowFeatures? {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WindowFeatures>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WindowFeatures>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1105450450_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1105450450_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2NewWindowRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1105450450_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2NewWindowRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6e013baaec8532e9ac91590af7b25ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2NewWindowRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2NewWindowRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2NewWindowRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2NewWindowRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2NewWindowRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1105450450_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2NewWindowRequestedEventArgs):
        Array<ICoreWebView2NewWindowRequestedEventArgs?> = (elements as
        Array<ICoreWebView2NewWindowRequestedEventArgs?>).castToImpl<ICoreWebView2NewWindowRequestedEventArgs,ICoreWebView2NewWindowRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2NewWindowRequestedEventArgs?> =
        arrayOfNulls<ICoreWebView2NewWindowRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2NewWindowRequestedEventArgs?>
  }
}
