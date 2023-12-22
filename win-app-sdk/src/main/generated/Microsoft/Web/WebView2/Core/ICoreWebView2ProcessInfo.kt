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

@ABIMarker(ICoreWebView2ProcessInfo.ABI::class)
@Signature("{b6ec37e1-23eb-5924-b346-e837890aa9d5}")
@Guid("b6ec37e123eb5924b346e837890aa9d5")
@WinRTInterface("b6ec37e123eb5924b346e837890aa9d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ProcessInfo.ByReference::class)
public interface ICoreWebView2ProcessInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProcessId(): Int

  @InterfaceMethod(1)
  public fun get_Kind(): CoreWebView2ProcessKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ProcessInfo> {
    public override fun getValue() = ABI.makeICoreWebView2ProcessInfo(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ProcessInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ProcessInfo {
    public val __709379830_Ptr: Pointer?

    public val _709379830_VtblPtr: Pointer?
      get() = __709379830_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProcessId(): Int {
      val fnPtr = _709379830_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__709379830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Kind(): CoreWebView2ProcessKind? {
      val fnPtr = _709379830_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ProcessKind>()
      val hr = fn.invokeHR(arrayOf(__709379830_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ProcessKind>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ProcessInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __709379830_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ProcessInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6ec37e123eb5924b346e837890aa9d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ProcessInfo(ptr: Pointer?): WithDefault =
        ICoreWebView2ProcessInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ProcessInfo {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ProcessInfo(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ProcessInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__709379830_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ProcessInfo):
        Array<ICoreWebView2ProcessInfo?> = (elements as
        Array<ICoreWebView2ProcessInfo?>).castToImpl<ICoreWebView2ProcessInfo,ICoreWebView2ProcessInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ProcessInfo?> =
        arrayOfNulls<ICoreWebView2ProcessInfo_Impl>(size) as Array<ICoreWebView2ProcessInfo?>
  }
}
