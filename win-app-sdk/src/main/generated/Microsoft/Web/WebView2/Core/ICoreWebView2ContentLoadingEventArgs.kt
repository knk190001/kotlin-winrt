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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWebView2ContentLoadingEventArgs.ABI::class)
@Signature("{6cf95373-946c-5dae-9b3e-0fe23d5aa29f}")
@Guid("6cf95373946c5dae9b3e0fe23d5aa29f")
@WinRTInterface("6cf95373946c5dae9b3e0fe23d5aa29f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ContentLoadingEventArgs.ByReference::class)
public interface ICoreWebView2ContentLoadingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsErrorPage(): Boolean

  @InterfaceMethod(1)
  public fun get_NavigationId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ContentLoadingEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ContentLoadingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ContentLoadingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ContentLoadingEventArgs {
    public val __1251330803_Ptr: Pointer?

    public val _1251330803_VtblPtr: Pointer?
      get() = __1251330803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsErrorPage(): Boolean {
      val fnPtr = _1251330803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1251330803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_NavigationId(): WinDef.ULONG {
      val fnPtr = _1251330803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1251330803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2ContentLoadingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1251330803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ContentLoadingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6cf95373946c5dae9b3e0fe23d5aa29f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ContentLoadingEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2ContentLoadingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ContentLoadingEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ContentLoadingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ContentLoadingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1251330803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ContentLoadingEventArgs):
        Array<ICoreWebView2ContentLoadingEventArgs?> = (elements as
        Array<ICoreWebView2ContentLoadingEventArgs?>).castToImpl<ICoreWebView2ContentLoadingEventArgs,ICoreWebView2ContentLoadingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ContentLoadingEventArgs?> =
        arrayOfNulls<ICoreWebView2ContentLoadingEventArgs_Impl>(size) as
        Array<ICoreWebView2ContentLoadingEventArgs?>
  }
}
