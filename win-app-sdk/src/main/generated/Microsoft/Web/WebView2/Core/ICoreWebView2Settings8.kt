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

@ABIMarker(ICoreWebView2Settings8.ABI::class)
@Signature("{956f1a8f-3198-5577-b250-7d91d17f7eed}")
@Guid("956f1a8f31985577b2507d91d17f7eed")
@WinRTInterface("956f1a8f31985577b2507d91d17f7eed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings8.ByReference::class)
public interface ICoreWebView2Settings8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReputationCheckingRequired(): Boolean

  @InterfaceMethod(1)
  public fun put_IsReputationCheckingRequired(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings8> {
    public override fun getValue() = ABI.makeICoreWebView2Settings8(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings8 {
    public val __965763566_Ptr: Pointer?

    public val _965763566_VtblPtr: Pointer?
      get() = __965763566_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReputationCheckingRequired(): Boolean {
      val fnPtr = _965763566_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965763566_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsReputationCheckingRequired(value: Boolean): Unit {
      val fnPtr = _965763566_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965763566_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965763566_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("956f1a8f31985577b2507d91d17f7eed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings8(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings8 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings8(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965763566_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings8): Array<ICoreWebView2Settings8?> =
        (elements as
        Array<ICoreWebView2Settings8?>).castToImpl<ICoreWebView2Settings8,ICoreWebView2Settings8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings8?> =
        arrayOfNulls<ICoreWebView2Settings8_Impl>(size) as Array<ICoreWebView2Settings8?>
  }
}
