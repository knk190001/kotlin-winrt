package Microsoft.Web.WebView2.Core

import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(ICoreWebView2Environment9.ABI::class)
@Signature("{c8213ec7-7dc9-5468-a88b-15c6b7144478}")
@Guid("c8213ec77dc95468a88b15c6b7144478")
@WinRTInterface("c8213ec77dc95468a88b15c6b7144478")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment9.ByReference::class)
public interface ICoreWebView2Environment9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateContextMenuItem(
    Label: String?,
    iconStream: IRandomAccessStream?,
    Kind: CoreWebView2ContextMenuItemKind?
  ): CoreWebView2ContextMenuItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment9> {
    public override fun getValue() = ABI.makeICoreWebView2Environment9(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment9 {
    public val __174970989_Ptr: Pointer?

    public val _174970989_VtblPtr: Pointer?
      get() = __174970989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateContextMenuItem(
      Label: String?,
      iconStream: IRandomAccessStream?,
      Kind: CoreWebView2ContextMenuItemKind?
    ): CoreWebView2ContextMenuItem? {
      val fnPtr = _174970989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ContextMenuItem>()
      val hr = fn.invokeHR(arrayOf(__174970989_Ptr, marshalToNative(Label),
          marshalToNative(iconStream), marshalToNative(Kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ContextMenuItem>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8213ec77dc95468a88b15c6b7144478")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment9(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment9 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment9(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment9):
        Array<ICoreWebView2Environment9?> = (elements as
        Array<ICoreWebView2Environment9?>).castToImpl<ICoreWebView2Environment9,ICoreWebView2Environment9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment9?> =
        arrayOfNulls<ICoreWebView2Environment9_Impl>(size) as Array<ICoreWebView2Environment9?>
  }
}
