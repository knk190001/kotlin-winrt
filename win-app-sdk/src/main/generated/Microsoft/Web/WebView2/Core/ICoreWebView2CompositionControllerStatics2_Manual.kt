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

@ABIMarker(ICoreWebView2CompositionControllerStatics2_Manual.ABI::class)
@Signature("{48a321e7-4f40-526e-837e-1eb0c477b69d}")
@Guid("48a321e74f40526e837e1eb0c477b69d")
@WinRTInterface("48a321e74f40526e837e1eb0c477b69d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CompositionControllerStatics2_Manual.ByReference::class)
public interface ICoreWebView2CompositionControllerStatics2_Manual : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CompositionControllerStatics2_Manual> {
    public override fun getValue() =
        ABI.makeICoreWebView2CompositionControllerStatics2_Manual(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CompositionControllerStatics2_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CompositionControllerStatics2_Manual {
    public val __1481370503_Ptr: Pointer?

    public val _1481370503_VtblPtr: Pointer?
      get() = __1481370503_Ptr?.getPointer(0)
  }

  public class ICoreWebView2CompositionControllerStatics2_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1481370503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CompositionControllerStatics2_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48a321e74f40526e837e1eb0c477b69d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CompositionControllerStatics2_Manual(ptr: Pointer?): WithDefault =
        ICoreWebView2CompositionControllerStatics2_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2CompositionControllerStatics2_Manual {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CompositionControllerStatics2_Manual(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CompositionControllerStatics2_Manual):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1481370503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CompositionControllerStatics2_Manual):
        Array<ICoreWebView2CompositionControllerStatics2_Manual?> = (elements as
        Array<ICoreWebView2CompositionControllerStatics2_Manual?>).castToImpl<ICoreWebView2CompositionControllerStatics2_Manual,ICoreWebView2CompositionControllerStatics2_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ICoreWebView2CompositionControllerStatics2_Manual?> =
        arrayOfNulls<ICoreWebView2CompositionControllerStatics2_Manual_Impl>(size) as
        Array<ICoreWebView2CompositionControllerStatics2_Manual?>
  }
}
