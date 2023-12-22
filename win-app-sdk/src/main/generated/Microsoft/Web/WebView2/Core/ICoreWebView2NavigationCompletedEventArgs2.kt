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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2NavigationCompletedEventArgs2.ABI::class)
@Signature("{6e4d3c33-a6e2-5896-90c5-68b4b5e55b40}")
@Guid("6e4d3c33a6e2589690c568b4b5e55b40")
@WinRTInterface("6e4d3c33a6e2589690c568b4b5e55b40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2NavigationCompletedEventArgs2.ByReference::class)
public interface ICoreWebView2NavigationCompletedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HttpStatusCode(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2NavigationCompletedEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2NavigationCompletedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2NavigationCompletedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2NavigationCompletedEventArgs2 {
    public val __1177520491_Ptr: Pointer?

    public val _1177520491_VtblPtr: Pointer?
      get() = __1177520491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HttpStatusCode(): Int {
      val fnPtr = _1177520491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1177520491_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2NavigationCompletedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1177520491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2NavigationCompletedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e4d3c33a6e2589690c568b4b5e55b40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2NavigationCompletedEventArgs2(ptr: Pointer?): WithDefault =
        ICoreWebView2NavigationCompletedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2NavigationCompletedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2NavigationCompletedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2NavigationCompletedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1177520491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2NavigationCompletedEventArgs2):
        Array<ICoreWebView2NavigationCompletedEventArgs2?> = (elements as
        Array<ICoreWebView2NavigationCompletedEventArgs2?>).castToImpl<ICoreWebView2NavigationCompletedEventArgs2,ICoreWebView2NavigationCompletedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2NavigationCompletedEventArgs2?> =
        arrayOfNulls<ICoreWebView2NavigationCompletedEventArgs2_Impl>(size) as
        Array<ICoreWebView2NavigationCompletedEventArgs2?>
  }
}
