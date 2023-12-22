package Microsoft.Web.WebView2.Core

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

@ABIMarker(ICoreWebView2_17.ABI::class)
@Signature("{2345f9db-5488-559a-82af-9086cc4f7988}")
@Guid("2345f9db5488559a82af9086cc4f7988")
@WinRTInterface("2345f9db5488559a82af9086cc4f7988")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_17.ByReference::class)
public interface ICoreWebView2_17 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PostSharedBufferToScript(
    sharedBuffer: CoreWebView2SharedBuffer?,
    access: CoreWebView2SharedBufferAccess?,
    additionalDataAsJson: String?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_17> {
    public override fun getValue() = ABI.makeICoreWebView2_17(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_17_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_17 {
    public val __1813492962_Ptr: Pointer?

    public val _1813492962_VtblPtr: Pointer?
      get() = __1813492962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PostSharedBufferToScript(
      sharedBuffer: CoreWebView2SharedBuffer?,
      access: CoreWebView2SharedBufferAccess?,
      additionalDataAsJson: String?
    ): Unit {
      val fnPtr = _1813492962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492962_Ptr, marshalToNative(sharedBuffer),
          marshalToNative(access), marshalToNative(additionalDataAsJson),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_17_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_17, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2345f9db5488559a82af9086cc4f7988")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_17(ptr: Pointer?): WithDefault = ICoreWebView2_17_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_17 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_17(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_17): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_17): Array<ICoreWebView2_17?> = (elements as
        Array<ICoreWebView2_17?>).castToImpl<ICoreWebView2_17,ICoreWebView2_17_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_17?> =
        arrayOfNulls<ICoreWebView2_17_Impl>(size) as Array<ICoreWebView2_17?>
  }
}
