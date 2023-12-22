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

@ABIMarker(ICoreWebView2NavigationCompletedEventArgs.ABI::class)
@Signature("{4865e238-036a-5664-95a3-447ec44cf498}")
@Guid("4865e238036a566495a3447ec44cf498")
@WinRTInterface("4865e238036a566495a3447ec44cf498")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2NavigationCompletedEventArgs.ByReference::class)
public interface ICoreWebView2NavigationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSuccess(): Boolean

  @InterfaceMethod(1)
  public fun get_WebErrorStatus(): CoreWebView2WebErrorStatus?

  @InterfaceMethod(2)
  public fun get_NavigationId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2NavigationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2NavigationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2NavigationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2NavigationCompletedEventArgs {
    public val __730721191_Ptr: Pointer?

    public val _730721191_VtblPtr: Pointer?
      get() = __730721191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSuccess(): Boolean {
      val fnPtr = _730721191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__730721191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_WebErrorStatus(): CoreWebView2WebErrorStatus? {
      val fnPtr = _730721191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__730721191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2WebErrorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NavigationId(): WinDef.ULONG {
      val fnPtr = _730721191_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__730721191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2NavigationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730721191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2NavigationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4865e238036a566495a3447ec44cf498")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2NavigationCompletedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2NavigationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2NavigationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2NavigationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2NavigationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730721191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2NavigationCompletedEventArgs):
        Array<ICoreWebView2NavigationCompletedEventArgs?> = (elements as
        Array<ICoreWebView2NavigationCompletedEventArgs?>).castToImpl<ICoreWebView2NavigationCompletedEventArgs,ICoreWebView2NavigationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2NavigationCompletedEventArgs?> =
        arrayOfNulls<ICoreWebView2NavigationCompletedEventArgs_Impl>(size) as
        Array<ICoreWebView2NavigationCompletedEventArgs?>
  }
}
