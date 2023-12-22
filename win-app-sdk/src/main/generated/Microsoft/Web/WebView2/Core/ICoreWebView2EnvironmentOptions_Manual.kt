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

@ABIMarker(ICoreWebView2EnvironmentOptions_Manual.ABI::class)
@Signature("{1f104443-ea93-5a37-b791-34e6a31172ed}")
@Guid("1f104443ea935a37b79134e6a31172ed")
@WinRTInterface("1f104443ea935a37b79134e6a31172ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2EnvironmentOptions_Manual.ByReference::class)
public interface ICoreWebView2EnvironmentOptions_Manual : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2EnvironmentOptions_Manual> {
    public override fun getValue() =
        ABI.makeICoreWebView2EnvironmentOptions_Manual(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2EnvironmentOptions_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2EnvironmentOptions_Manual {
    public val __582296851_Ptr: Pointer?

    public val _582296851_VtblPtr: Pointer?
      get() = __582296851_Ptr?.getPointer(0)
  }

  public class ICoreWebView2EnvironmentOptions_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __582296851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2EnvironmentOptions_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f104443ea935a37b79134e6a31172ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2EnvironmentOptions_Manual(ptr: Pointer?): WithDefault =
        ICoreWebView2EnvironmentOptions_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2EnvironmentOptions_Manual {
      val address = segment.toRawLongValue()
      return makeICoreWebView2EnvironmentOptions_Manual(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2EnvironmentOptions_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__582296851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2EnvironmentOptions_Manual):
        Array<ICoreWebView2EnvironmentOptions_Manual?> = (elements as
        Array<ICoreWebView2EnvironmentOptions_Manual?>).castToImpl<ICoreWebView2EnvironmentOptions_Manual,ICoreWebView2EnvironmentOptions_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2EnvironmentOptions_Manual?> =
        arrayOfNulls<ICoreWebView2EnvironmentOptions_Manual_Impl>(size) as
        Array<ICoreWebView2EnvironmentOptions_Manual?>
  }
}
