package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ICoreWebView2Profile2.ABI::class)
@Signature("{93d21e18-1b06-59d0-9687-10f4844b016d}")
@Guid("93d21e181b0659d0968710f4844b016d")
@WinRTInterface("93d21e181b0659d0968710f4844b016d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile2.ByReference::class)
public interface ICoreWebView2Profile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClearBrowsingDataAsync(dataKinds: CoreWebView2BrowsingDataKinds?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile2> {
    public override fun getValue() = ABI.makeICoreWebView2Profile2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile2 {
    public val __1990099184_Ptr: Pointer?

    public val _1990099184_VtblPtr: Pointer?
      get() = __1990099184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClearBrowsingDataAsync(dataKinds: CoreWebView2BrowsingDataKinds?):
        IAsyncAction? {
      val fnPtr = _1990099184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1990099184_Ptr, marshalToNative(dataKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Profile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990099184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93d21e181b0659d0968710f4844b016d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile2(ptr: Pointer?): WithDefault =
        ICoreWebView2Profile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990099184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile2): Array<ICoreWebView2Profile2?> =
        (elements as
        Array<ICoreWebView2Profile2?>).castToImpl<ICoreWebView2Profile2,ICoreWebView2Profile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile2?> =
        arrayOfNulls<ICoreWebView2Profile2_Impl>(size) as Array<ICoreWebView2Profile2?>
  }
}
