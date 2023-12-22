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

@ABIMarker(ICoreWebView2ControllerWindowReference.ABI::class)
@Signature("{0feddad4-48a3-5cc4-9f61-e7adfd1e9c76}")
@Guid("0feddad448a35cc49f61e7adfd1e9c76")
@WinRTInterface("0feddad448a35cc49f61e7adfd1e9c76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ControllerWindowReference.ByReference::class)
public interface ICoreWebView2ControllerWindowReference : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WindowHandle(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun get_CoreWindow(): CoreWindow?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ControllerWindowReference> {
    public override fun getValue() =
        ABI.makeICoreWebView2ControllerWindowReference(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ControllerWindowReference_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ControllerWindowReference {
    public val __210067080_Ptr: Pointer?

    public val _210067080_VtblPtr: Pointer?
      get() = __210067080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WindowHandle(): WinDef.ULONG {
      val fnPtr = _210067080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__210067080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CoreWindow(): CoreWindow? {
      val fnPtr = _210067080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWindow>()
      val hr = fn.invokeHR(arrayOf(__210067080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWindow>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ControllerWindowReference_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __210067080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ControllerWindowReference, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0feddad448a35cc49f61e7adfd1e9c76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ControllerWindowReference(ptr: Pointer?): WithDefault =
        ICoreWebView2ControllerWindowReference_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ControllerWindowReference {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ControllerWindowReference(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ControllerWindowReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__210067080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ControllerWindowReference):
        Array<ICoreWebView2ControllerWindowReference?> = (elements as
        Array<ICoreWebView2ControllerWindowReference?>).castToImpl<ICoreWebView2ControllerWindowReference,ICoreWebView2ControllerWindowReference_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ControllerWindowReference?> =
        arrayOfNulls<ICoreWebView2ControllerWindowReference_Impl>(size) as
        Array<ICoreWebView2ControllerWindowReference?>
  }
}
