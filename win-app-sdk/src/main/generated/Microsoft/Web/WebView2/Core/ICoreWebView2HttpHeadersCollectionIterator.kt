package Microsoft.Web.WebView2.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2HttpHeadersCollectionIterator.ABI::class)
@Signature("{adf264ee-d980-5f48-a60e-8705de046608}")
@Guid("adf264eed9805f48a60e8705de046608")
@WinRTInterface("adf264eed9805f48a60e8705de046608")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2HttpHeadersCollectionIterator.ByReference::class)
public interface ICoreWebView2HttpHeadersCollectionIterator : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2HttpHeadersCollectionIterator> {
    public override fun getValue() =
        ABI.makeICoreWebView2HttpHeadersCollectionIterator(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2HttpHeadersCollectionIterator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2HttpHeadersCollectionIterator {
    public val __1466619555_Ptr: Pointer?

    public val _1466619555_VtblPtr: Pointer?
      get() = __1466619555_Ptr?.getPointer(0)
  }

  public class ICoreWebView2HttpHeadersCollectionIterator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466619555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2HttpHeadersCollectionIterator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adf264eed9805f48a60e8705de046608")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2HttpHeadersCollectionIterator(ptr: Pointer?): WithDefault =
        ICoreWebView2HttpHeadersCollectionIterator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2HttpHeadersCollectionIterator {
      val address = segment.toRawLongValue()
      return makeICoreWebView2HttpHeadersCollectionIterator(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2HttpHeadersCollectionIterator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1466619555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2HttpHeadersCollectionIterator):
        Array<ICoreWebView2HttpHeadersCollectionIterator?> = (elements as
        Array<ICoreWebView2HttpHeadersCollectionIterator?>).castToImpl<ICoreWebView2HttpHeadersCollectionIterator,ICoreWebView2HttpHeadersCollectionIterator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2HttpHeadersCollectionIterator?> =
        arrayOfNulls<ICoreWebView2HttpHeadersCollectionIterator_Impl>(size) as
        Array<ICoreWebView2HttpHeadersCollectionIterator?>
  }
}
