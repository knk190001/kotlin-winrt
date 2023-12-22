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

@ABIMarker(ICoreWebView2NavigationStartingEventArgs2.ABI::class)
@Signature("{d7a3824e-7654-5c4b-b069-e6501634d84c}")
@Guid("d7a3824e76545c4bb069e6501634d84c")
@WinRTInterface("d7a3824e76545c4bb069e6501634d84c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2NavigationStartingEventArgs2.ByReference::class)
public interface ICoreWebView2NavigationStartingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdditionalAllowedFrameAncestors(): String?

  @InterfaceMethod(1)
  public fun put_AdditionalAllowedFrameAncestors(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2NavigationStartingEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2NavigationStartingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2NavigationStartingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2NavigationStartingEventArgs2 {
    public val __1219172362_Ptr: Pointer?

    public val _1219172362_VtblPtr: Pointer?
      get() = __1219172362_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdditionalAllowedFrameAncestors(): String? {
      val fnPtr = _1219172362_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1219172362_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AdditionalAllowedFrameAncestors(value: String?): Unit {
      val fnPtr = _1219172362_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1219172362_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2NavigationStartingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1219172362_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2NavigationStartingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7a3824e76545c4bb069e6501634d84c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2NavigationStartingEventArgs2(ptr: Pointer?): WithDefault =
        ICoreWebView2NavigationStartingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2NavigationStartingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2NavigationStartingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2NavigationStartingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1219172362_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2NavigationStartingEventArgs2):
        Array<ICoreWebView2NavigationStartingEventArgs2?> = (elements as
        Array<ICoreWebView2NavigationStartingEventArgs2?>).castToImpl<ICoreWebView2NavigationStartingEventArgs2,ICoreWebView2NavigationStartingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2NavigationStartingEventArgs2?> =
        arrayOfNulls<ICoreWebView2NavigationStartingEventArgs2_Impl>(size) as
        Array<ICoreWebView2NavigationStartingEventArgs2?>
  }
}
