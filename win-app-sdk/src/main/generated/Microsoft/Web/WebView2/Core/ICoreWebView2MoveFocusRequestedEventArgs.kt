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

@ABIMarker(ICoreWebView2MoveFocusRequestedEventArgs.ABI::class)
@Signature("{2e29103b-ecdd-5c1d-b288-3f066d608919}")
@Guid("2e29103becdd5c1db2883f066d608919")
@WinRTInterface("2e29103becdd5c1db2883f066d608919")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2MoveFocusRequestedEventArgs.ByReference::class)
public interface ICoreWebView2MoveFocusRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): CoreWebView2MoveFocusReason?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2MoveFocusRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2MoveFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2MoveFocusRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2MoveFocusRequestedEventArgs {
    public val __348399639_Ptr: Pointer?

    public val _348399639_VtblPtr: Pointer?
      get() = __348399639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): CoreWebView2MoveFocusReason? {
      val fnPtr = _348399639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2MoveFocusReason>()
      val hr = fn.invokeHR(arrayOf(__348399639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2MoveFocusReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _348399639_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__348399639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _348399639_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__348399639_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2MoveFocusRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __348399639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2MoveFocusRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e29103becdd5c1db2883f066d608919")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2MoveFocusRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2MoveFocusRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2MoveFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2MoveFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2MoveFocusRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__348399639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2MoveFocusRequestedEventArgs):
        Array<ICoreWebView2MoveFocusRequestedEventArgs?> = (elements as
        Array<ICoreWebView2MoveFocusRequestedEventArgs?>).castToImpl<ICoreWebView2MoveFocusRequestedEventArgs,ICoreWebView2MoveFocusRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2MoveFocusRequestedEventArgs?> =
        arrayOfNulls<ICoreWebView2MoveFocusRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2MoveFocusRequestedEventArgs?>
  }
}
