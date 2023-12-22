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

@ABIMarker(ICoreWebView2Settings6.ABI::class)
@Signature("{3fe4ae85-0540-5bf1-b4d9-99ec57aa64f5}")
@Guid("3fe4ae8505405bf1b4d999ec57aa64f5")
@WinRTInterface("3fe4ae8505405bf1b4d999ec57aa64f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings6.ByReference::class)
public interface ICoreWebView2Settings6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSwipeNavigationEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsSwipeNavigationEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings6> {
    public override fun getValue() = ABI.makeICoreWebView2Settings6(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings6 {
    public val __965763564_Ptr: Pointer?

    public val _965763564_VtblPtr: Pointer?
      get() = __965763564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSwipeNavigationEnabled(): Boolean {
      val fnPtr = _965763564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965763564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsSwipeNavigationEnabled(value: Boolean): Unit {
      val fnPtr = _965763564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965763564_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965763564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fe4ae8505405bf1b4d999ec57aa64f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings6(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings6 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings6(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965763564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings6): Array<ICoreWebView2Settings6?> =
        (elements as
        Array<ICoreWebView2Settings6?>).castToImpl<ICoreWebView2Settings6,ICoreWebView2Settings6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings6?> =
        arrayOfNulls<ICoreWebView2Settings6_Impl>(size) as Array<ICoreWebView2Settings6?>
  }
}
