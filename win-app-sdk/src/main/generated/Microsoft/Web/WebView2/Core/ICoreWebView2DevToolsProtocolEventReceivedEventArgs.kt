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

@ABIMarker(ICoreWebView2DevToolsProtocolEventReceivedEventArgs.ABI::class)
@Signature("{b6a4b41d-fd18-59fa-923a-c57555d960ce}")
@Guid("b6a4b41dfd1859fa923ac57555d960ce")
@WinRTInterface("b6a4b41dfd1859fa923ac57555d960ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2DevToolsProtocolEventReceivedEventArgs.ByReference::class)
public interface ICoreWebView2DevToolsProtocolEventReceivedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_ParameterObjectAsJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2DevToolsProtocolEventReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2DevToolsProtocolEventReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2DevToolsProtocolEventReceivedEventArgs {
    public val __577496959_Ptr: Pointer?

    public val _577496959_VtblPtr: Pointer?
      get() = __577496959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ParameterObjectAsJson(): String? {
      val fnPtr = _577496959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__577496959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2DevToolsProtocolEventReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __577496959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2DevToolsProtocolEventReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6a4b41dfd1859fa923ac57555d960ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2DevToolsProtocolEventReceivedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2DevToolsProtocolEventReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2DevToolsProtocolEventReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2DevToolsProtocolEventReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2DevToolsProtocolEventReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__577496959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2DevToolsProtocolEventReceivedEventArgs):
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs?> = (elements as
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs?>).castToImpl<ICoreWebView2DevToolsProtocolEventReceivedEventArgs,ICoreWebView2DevToolsProtocolEventReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs?> =
        arrayOfNulls<ICoreWebView2DevToolsProtocolEventReceivedEventArgs_Impl>(size) as
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs?>
  }
}
