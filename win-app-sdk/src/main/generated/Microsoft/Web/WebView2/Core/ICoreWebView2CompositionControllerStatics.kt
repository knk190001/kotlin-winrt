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

@ABIMarker(ICoreWebView2CompositionControllerStatics.ABI::class)
@Signature("{4df0ab1f-7f2a-573b-b81a-b9b531224736}")
@Guid("4df0ab1f7f2a573bb81ab9b531224736")
@WinRTInterface("4df0ab1f7f2a573bb81ab9b531224736")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CompositionControllerStatics.ByReference::class)
public interface ICoreWebView2CompositionControllerStatics : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CompositionControllerStatics> {
    public override fun getValue() =
        ABI.makeICoreWebView2CompositionControllerStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CompositionControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CompositionControllerStatics {
    public val __428685850_Ptr: Pointer?

    public val _428685850_VtblPtr: Pointer?
      get() = __428685850_Ptr?.getPointer(0)
  }

  public class ICoreWebView2CompositionControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __428685850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CompositionControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4df0ab1f7f2a573bb81ab9b531224736")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CompositionControllerStatics(ptr: Pointer?): WithDefault =
        ICoreWebView2CompositionControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2CompositionControllerStatics {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CompositionControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CompositionControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__428685850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CompositionControllerStatics):
        Array<ICoreWebView2CompositionControllerStatics?> = (elements as
        Array<ICoreWebView2CompositionControllerStatics?>).castToImpl<ICoreWebView2CompositionControllerStatics,ICoreWebView2CompositionControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2CompositionControllerStatics?> =
        arrayOfNulls<ICoreWebView2CompositionControllerStatics_Impl>(size) as
        Array<ICoreWebView2CompositionControllerStatics?>
  }
}
