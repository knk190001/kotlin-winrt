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

@ABIMarker(ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.ABI::class)
@Signature("{221728ba-635e-50d2-bd3c-fd22f4113978}")
@Guid("221728ba635e50d2bd3cfd22f4113978")
@WinRTInterface("221728ba635e50d2bd3cfd22f4113978")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2DevToolsProtocolEventReceivedEventArgs2.ByReference::class)
public interface ICoreWebView2DevToolsProtocolEventReceivedEventArgs2 : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SessionId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2DevToolsProtocolEventReceivedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2DevToolsProtocolEventReceivedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2DevToolsProtocolEventReceivedEventArgs2 {
    public val __722536495_Ptr: Pointer?

    public val _722536495_VtblPtr: Pointer?
      get() = __722536495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionId(): String? {
      val fnPtr = _722536495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__722536495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2DevToolsProtocolEventReceivedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __722536495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("221728ba635e50d2bd3cfd22f4113978")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2DevToolsProtocolEventReceivedEventArgs2(ptr: Pointer?): WithDefault
        = ICoreWebView2DevToolsProtocolEventReceivedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2DevToolsProtocolEventReceivedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2DevToolsProtocolEventReceivedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2DevToolsProtocolEventReceivedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__722536495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2DevToolsProtocolEventReceivedEventArgs2):
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2?> = (elements as
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2?>).castToImpl<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2,ICoreWebView2DevToolsProtocolEventReceivedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2?> =
        arrayOfNulls<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2_Impl>(size) as
        Array<ICoreWebView2DevToolsProtocolEventReceivedEventArgs2?>
  }
}
