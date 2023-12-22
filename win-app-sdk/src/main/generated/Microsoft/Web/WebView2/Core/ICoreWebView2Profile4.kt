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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Profile4.ABI::class)
@Signature("{eeae109a-f641-5a5b-942f-9922594ffb4d}")
@Guid("eeae109af6415a5b942f9922594ffb4d")
@WinRTInterface("eeae109af6415a5b942f9922594ffb4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile4.ByReference::class)
public interface ICoreWebView2Profile4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetPermissionStateAsync(
    PermissionKind: CoreWebView2PermissionKind?,
    origin: String?,
    State: CoreWebView2PermissionState?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile4> {
    public override fun getValue() = ABI.makeICoreWebView2Profile4(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile4 {
    public val __1990099182_Ptr: Pointer?

    public val _1990099182_VtblPtr: Pointer?
      get() = __1990099182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetPermissionStateAsync(
      PermissionKind: CoreWebView2PermissionKind?,
      origin: String?,
      State: CoreWebView2PermissionState?
    ): IAsyncAction? {
      val fnPtr = _1990099182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1990099182_Ptr, marshalToNative(PermissionKind),
          marshalToNative(origin), marshalToNative(State), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Profile4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990099182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eeae109af6415a5b942f9922594ffb4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile4(ptr: Pointer?): WithDefault =
        ICoreWebView2Profile4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile4 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile4(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990099182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile4): Array<ICoreWebView2Profile4?> =
        (elements as
        Array<ICoreWebView2Profile4?>).castToImpl<ICoreWebView2Profile4,ICoreWebView2Profile4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile4?> =
        arrayOfNulls<ICoreWebView2Profile4_Impl>(size) as Array<ICoreWebView2Profile4?>
  }
}
