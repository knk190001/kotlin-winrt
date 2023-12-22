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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2SourceChangedEventArgs.ABI::class)
@Signature("{ca437b2c-6a18-5552-b749-b198f8cc34d9}")
@Guid("ca437b2c6a185552b749b198f8cc34d9")
@WinRTInterface("ca437b2c6a185552b749b198f8cc34d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2SourceChangedEventArgs.ByReference::class)
public interface ICoreWebView2SourceChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsNewDocument(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2SourceChangedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2SourceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2SourceChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2SourceChangedEventArgs {
    public val __8926299_Ptr: Pointer?

    public val _8926299_VtblPtr: Pointer?
      get() = __8926299_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsNewDocument(): Boolean {
      val fnPtr = _8926299_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__8926299_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2SourceChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __8926299_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2SourceChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca437b2c6a185552b749b198f8cc34d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2SourceChangedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2SourceChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2SourceChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2SourceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2SourceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__8926299_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2SourceChangedEventArgs):
        Array<ICoreWebView2SourceChangedEventArgs?> = (elements as
        Array<ICoreWebView2SourceChangedEventArgs?>).castToImpl<ICoreWebView2SourceChangedEventArgs,ICoreWebView2SourceChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2SourceChangedEventArgs?> =
        arrayOfNulls<ICoreWebView2SourceChangedEventArgs_Impl>(size) as
        Array<ICoreWebView2SourceChangedEventArgs?>
  }
}
