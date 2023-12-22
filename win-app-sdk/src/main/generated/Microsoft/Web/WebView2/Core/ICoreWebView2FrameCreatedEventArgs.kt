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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2FrameCreatedEventArgs.ABI::class)
@Signature("{527b01b8-fc6d-5543-8dce-96cdfdb32c81}")
@Guid("527b01b8fc6d55438dce96cdfdb32c81")
@WinRTInterface("527b01b8fc6d55438dce96cdfdb32c81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2FrameCreatedEventArgs.ByReference::class)
public interface ICoreWebView2FrameCreatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): CoreWebView2Frame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2FrameCreatedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2FrameCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2FrameCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2FrameCreatedEventArgs {
    public val __260349931_Ptr: Pointer?

    public val _260349931_VtblPtr: Pointer?
      get() = __260349931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): CoreWebView2Frame? {
      val fnPtr = _260349931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2Frame>()
      val hr = fn.invokeHR(arrayOf(__260349931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2Frame>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2FrameCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __260349931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2FrameCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("527b01b8fc6d55438dce96cdfdb32c81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2FrameCreatedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2FrameCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2FrameCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2FrameCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2FrameCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__260349931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2FrameCreatedEventArgs):
        Array<ICoreWebView2FrameCreatedEventArgs?> = (elements as
        Array<ICoreWebView2FrameCreatedEventArgs?>).castToImpl<ICoreWebView2FrameCreatedEventArgs,ICoreWebView2FrameCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2FrameCreatedEventArgs?> =
        arrayOfNulls<ICoreWebView2FrameCreatedEventArgs_Impl>(size) as
        Array<ICoreWebView2FrameCreatedEventArgs?>
  }
}
