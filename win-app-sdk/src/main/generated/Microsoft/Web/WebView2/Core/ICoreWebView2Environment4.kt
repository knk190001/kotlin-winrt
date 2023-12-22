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

@ABIMarker(ICoreWebView2Environment4.ABI::class)
@Signature("{6db697da-eebd-5818-8790-1fe57ef319e2}")
@Guid("6db697daeebd581887901fe57ef319e2")
@WinRTInterface("6db697daeebd581887901fe57ef319e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment4.ByReference::class)
public interface ICoreWebView2Environment4 : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment4> {
    public override fun getValue() = ABI.makeICoreWebView2Environment4(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment4 {
    public val __174970984_Ptr: Pointer?

    public val _174970984_VtblPtr: Pointer?
      get() = __174970984_Ptr?.getPointer(0)
  }

  public class ICoreWebView2Environment4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6db697daeebd581887901fe57ef319e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment4(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment4 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment4(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment4):
        Array<ICoreWebView2Environment4?> = (elements as
        Array<ICoreWebView2Environment4?>).castToImpl<ICoreWebView2Environment4,ICoreWebView2Environment4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment4?> =
        arrayOfNulls<ICoreWebView2Environment4_Impl>(size) as Array<ICoreWebView2Environment4?>
  }
}
