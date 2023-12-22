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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2PrivatePartialController.ABI::class)
@Signature("{527f6678-8629-5c2a-bc3b-8d5c95e2b9bc}")
@Guid("527f667886295c2abc3b8d5c95e2b9bc")
@WinRTInterface("527f667886295c2abc3b8d5c95e2b9bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PrivatePartialController.ByReference::class)
public interface ICoreWebView2PrivatePartialController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBrowserHitTransparent(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PrivatePartialController> {
    public override fun getValue() =
        ABI.makeICoreWebView2PrivatePartialController(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PrivatePartialController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PrivatePartialController {
    public val __1032679969_Ptr: Pointer?

    public val _1032679969_VtblPtr: Pointer?
      get() = __1032679969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBrowserHitTransparent(): Boolean {
      val fnPtr = _1032679969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1032679969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2PrivatePartialController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1032679969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PrivatePartialController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("527f667886295c2abc3b8d5c95e2b9bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PrivatePartialController(ptr: Pointer?): WithDefault =
        ICoreWebView2PrivatePartialController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PrivatePartialController {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PrivatePartialController(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PrivatePartialController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1032679969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PrivatePartialController):
        Array<ICoreWebView2PrivatePartialController?> = (elements as
        Array<ICoreWebView2PrivatePartialController?>).castToImpl<ICoreWebView2PrivatePartialController,ICoreWebView2PrivatePartialController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PrivatePartialController?> =
        arrayOfNulls<ICoreWebView2PrivatePartialController_Impl>(size) as
        Array<ICoreWebView2PrivatePartialController?>
  }
}
