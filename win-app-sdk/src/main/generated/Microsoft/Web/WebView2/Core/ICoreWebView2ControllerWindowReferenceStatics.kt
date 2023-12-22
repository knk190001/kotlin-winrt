package Microsoft.Web.WebView2.Core

import Windows.UI.Core.CoreWindow
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2ControllerWindowReferenceStatics.ABI::class)
@Signature("{ddf6ebf1-ebc6-5a34-9008-661c3a2eb767}")
@Guid("ddf6ebf1ebc65a349008661c3a2eb767")
@WinRTInterface("ddf6ebf1ebc65a349008661c3a2eb767")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ControllerWindowReferenceStatics.ByReference::class)
public interface ICoreWebView2ControllerWindowReferenceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromWindowHandle(windowHandle: WinDef.ULONG):
      CoreWebView2ControllerWindowReference?

  @InterfaceMethod(1)
  public fun CreateFromCoreWindow(coreWindow: CoreWindow?): CoreWebView2ControllerWindowReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ControllerWindowReferenceStatics> {
    public override fun getValue() =
        ABI.makeICoreWebView2ControllerWindowReferenceStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ControllerWindowReferenceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ControllerWindowReferenceStatics {
    public val __1345314605_Ptr: Pointer?

    public val _1345314605_VtblPtr: Pointer?
      get() = __1345314605_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromWindowHandle(windowHandle: WinDef.ULONG):
        CoreWebView2ControllerWindowReference? {
      val fnPtr = _1345314605_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ControllerWindowReference>()
      val hr = fn.invokeHR(arrayOf(__1345314605_Ptr, windowHandle, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ControllerWindowReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromCoreWindow(coreWindow: CoreWindow?):
        CoreWebView2ControllerWindowReference? {
      val fnPtr = _1345314605_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ControllerWindowReference>()
      val hr = fn.invokeHR(arrayOf(__1345314605_Ptr, marshalToNative(coreWindow), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ControllerWindowReference>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ControllerWindowReferenceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1345314605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ControllerWindowReferenceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddf6ebf1ebc65a349008661c3a2eb767")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ControllerWindowReferenceStatics(ptr: Pointer?): WithDefault =
        ICoreWebView2ControllerWindowReferenceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2ControllerWindowReferenceStatics {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ControllerWindowReferenceStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ControllerWindowReferenceStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1345314605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ControllerWindowReferenceStatics):
        Array<ICoreWebView2ControllerWindowReferenceStatics?> = (elements as
        Array<ICoreWebView2ControllerWindowReferenceStatics?>).castToImpl<ICoreWebView2ControllerWindowReferenceStatics,ICoreWebView2ControllerWindowReferenceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ControllerWindowReferenceStatics?> =
        arrayOfNulls<ICoreWebView2ControllerWindowReferenceStatics_Impl>(size) as
        Array<ICoreWebView2ControllerWindowReferenceStatics?>
  }
}
