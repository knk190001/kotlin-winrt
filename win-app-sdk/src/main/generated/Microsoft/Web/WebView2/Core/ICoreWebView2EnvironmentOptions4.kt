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

@ABIMarker(ICoreWebView2EnvironmentOptions4.ABI::class)
@Signature("{a2cb850f-cd14-5a7d-9c98-53fd51ec9858}")
@Guid("a2cb850fcd145a7d9c9853fd51ec9858")
@WinRTInterface("a2cb850fcd145a7d9c9853fd51ec9858")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2EnvironmentOptions4.ByReference::class)
public interface ICoreWebView2EnvironmentOptions4 : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2EnvironmentOptions4> {
    public override fun getValue() = ABI.makeICoreWebView2EnvironmentOptions4(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2EnvironmentOptions4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2EnvironmentOptions4 {
    public val __407832894_Ptr: Pointer?

    public val _407832894_VtblPtr: Pointer?
      get() = __407832894_Ptr?.getPointer(0)
  }

  public class ICoreWebView2EnvironmentOptions4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407832894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2EnvironmentOptions4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2cb850fcd145a7d9c9853fd51ec9858")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2EnvironmentOptions4(ptr: Pointer?): WithDefault =
        ICoreWebView2EnvironmentOptions4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2EnvironmentOptions4 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2EnvironmentOptions4(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2EnvironmentOptions4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407832894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2EnvironmentOptions4):
        Array<ICoreWebView2EnvironmentOptions4?> = (elements as
        Array<ICoreWebView2EnvironmentOptions4?>).castToImpl<ICoreWebView2EnvironmentOptions4,ICoreWebView2EnvironmentOptions4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2EnvironmentOptions4?> =
        arrayOfNulls<ICoreWebView2EnvironmentOptions4_Impl>(size) as
        Array<ICoreWebView2EnvironmentOptions4?>
  }
}
