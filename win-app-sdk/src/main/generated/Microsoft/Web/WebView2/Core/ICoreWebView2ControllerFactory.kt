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

@ABIMarker(ICoreWebView2ControllerFactory.ABI::class)
@Signature("{270b2c5b-c3a9-53d8-a5ca-262ea9ea62e8}")
@Guid("270b2c5bc3a953d8a5ca262ea9ea62e8")
@WinRTInterface("270b2c5bc3a953d8a5ca262ea9ea62e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ControllerFactory.ByReference::class)
public interface ICoreWebView2ControllerFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ControllerFactory> {
    public override fun getValue() = ABI.makeICoreWebView2ControllerFactory(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ControllerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ControllerFactory {
    public val __845311559_Ptr: Pointer?

    public val _845311559_VtblPtr: Pointer?
      get() = __845311559_Ptr?.getPointer(0)
  }

  public class ICoreWebView2ControllerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __845311559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ControllerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("270b2c5bc3a953d8a5ca262ea9ea62e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ControllerFactory(ptr: Pointer?): WithDefault =
        ICoreWebView2ControllerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ControllerFactory {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ControllerFactory(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ControllerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__845311559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ControllerFactory):
        Array<ICoreWebView2ControllerFactory?> = (elements as
        Array<ICoreWebView2ControllerFactory?>).castToImpl<ICoreWebView2ControllerFactory,ICoreWebView2ControllerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ControllerFactory?> =
        arrayOfNulls<ICoreWebView2ControllerFactory_Impl>(size) as
        Array<ICoreWebView2ControllerFactory?>
  }
}
