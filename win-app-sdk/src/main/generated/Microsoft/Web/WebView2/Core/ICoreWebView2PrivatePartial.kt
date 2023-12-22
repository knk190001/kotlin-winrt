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

@ABIMarker(ICoreWebView2PrivatePartial.ABI::class)
@Signature("{2850f27c-0c9d-5cdc-b356-18f5b97d9fcf}")
@Guid("2850f27c0c9d5cdcb35618f5b97d9fcf")
@WinRTInterface("2850f27c0c9d5cdcb35618f5b97d9fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PrivatePartial.ByReference::class)
public interface ICoreWebView2PrivatePartial : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PrivatePartial> {
    public override fun getValue() = ABI.makeICoreWebView2PrivatePartial(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PrivatePartial_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PrivatePartial {
    public val __1050608475_Ptr: Pointer?

    public val _1050608475_VtblPtr: Pointer?
      get() = __1050608475_Ptr?.getPointer(0)
  }

  public class ICoreWebView2PrivatePartial_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1050608475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PrivatePartial, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2850f27c0c9d5cdcb35618f5b97d9fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PrivatePartial(ptr: Pointer?): WithDefault =
        ICoreWebView2PrivatePartial_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PrivatePartial {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PrivatePartial(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PrivatePartial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1050608475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PrivatePartial):
        Array<ICoreWebView2PrivatePartial?> = (elements as
        Array<ICoreWebView2PrivatePartial?>).castToImpl<ICoreWebView2PrivatePartial,ICoreWebView2PrivatePartial_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PrivatePartial?> =
        arrayOfNulls<ICoreWebView2PrivatePartial_Impl>(size) as Array<ICoreWebView2PrivatePartial?>
  }
}
