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

@ABIMarker(ICoreWebView2WebMessageReceivedEventArgs.ABI::class)
@Signature("{eb066159-b725-5d5b-adc8-f5d7b9290304}")
@Guid("eb066159b7255d5badc8f5d7b9290304")
@WinRTInterface("eb066159b7255d5badc8f5d7b9290304")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebMessageReceivedEventArgs.ByReference::class)
public interface ICoreWebView2WebMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): String?

  @InterfaceMethod(1)
  public fun get_WebMessageAsJson(): String?

  @InterfaceMethod(2)
  public fun TryGetWebMessageAsString(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebMessageReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2WebMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebMessageReceivedEventArgs {
    public val __1187132132_Ptr: Pointer?

    public val _1187132132_VtblPtr: Pointer?
      get() = __1187132132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): String? {
      val fnPtr = _1187132132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1187132132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WebMessageAsJson(): String? {
      val fnPtr = _1187132132_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1187132132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryGetWebMessageAsString(): String? {
      val fnPtr = _1187132132_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1187132132_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187132132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb066159b7255d5badc8f5d7b9290304")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2WebMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2WebMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187132132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebMessageReceivedEventArgs):
        Array<ICoreWebView2WebMessageReceivedEventArgs?> = (elements as
        Array<ICoreWebView2WebMessageReceivedEventArgs?>).castToImpl<ICoreWebView2WebMessageReceivedEventArgs,ICoreWebView2WebMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebMessageReceivedEventArgs?> =
        arrayOfNulls<ICoreWebView2WebMessageReceivedEventArgs_Impl>(size) as
        Array<ICoreWebView2WebMessageReceivedEventArgs?>
  }
}
