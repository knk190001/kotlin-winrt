package Microsoft.Web.WebView2.Core

import Windows.Foundation.Deferral
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

@ABIMarker(ICoreWebView2ScriptDialogOpeningEventArgs.ABI::class)
@Signature("{a4315212-c7eb-568a-86e4-c61e31ba6cda}")
@Guid("a4315212c7eb568a86e4c61e31ba6cda")
@WinRTInterface("a4315212c7eb568a86e4c61e31ba6cda")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ScriptDialogOpeningEventArgs.ByReference::class)
public interface ICoreWebView2ScriptDialogOpeningEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_Kind(): CoreWebView2ScriptDialogKind?

  @InterfaceMethod(2)
  public fun get_Message(): String?

  @InterfaceMethod(3)
  public fun get_DefaultText(): String?

  @InterfaceMethod(4)
  public fun get_ResultText(): String?

  @InterfaceMethod(5)
  public fun put_ResultText(value: String?): Unit

  @InterfaceMethod(6)
  public fun Accept(): Unit

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ScriptDialogOpeningEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ScriptDialogOpeningEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ScriptDialogOpeningEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ScriptDialogOpeningEventArgs {
    public val __136972775_Ptr: Pointer?

    public val _136972775_VtblPtr: Pointer?
      get() = __136972775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): CoreWebView2ScriptDialogKind? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ScriptDialogKind>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ScriptDialogKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Message(): String? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultText(): String? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ResultText(): String? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ResultText(value: String?): Unit {
      val fnPtr = _136972775_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Accept(): Unit {
      val fnPtr = _136972775_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _136972775_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__136972775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ScriptDialogOpeningEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __136972775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ScriptDialogOpeningEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4315212c7eb568a86e4c61e31ba6cda")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ScriptDialogOpeningEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2ScriptDialogOpeningEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2ScriptDialogOpeningEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ScriptDialogOpeningEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ScriptDialogOpeningEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__136972775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ScriptDialogOpeningEventArgs):
        Array<ICoreWebView2ScriptDialogOpeningEventArgs?> = (elements as
        Array<ICoreWebView2ScriptDialogOpeningEventArgs?>).castToImpl<ICoreWebView2ScriptDialogOpeningEventArgs,ICoreWebView2ScriptDialogOpeningEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ScriptDialogOpeningEventArgs?> =
        arrayOfNulls<ICoreWebView2ScriptDialogOpeningEventArgs_Impl>(size) as
        Array<ICoreWebView2ScriptDialogOpeningEventArgs?>
  }
}
