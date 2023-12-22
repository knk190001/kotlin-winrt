package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICoreWebView2ProcessFailedEventArgs2.ABI::class)
@Signature("{c5d9c952-b456-5dc7-9f76-fde967484af5}")
@Guid("c5d9c952b4565dc79f76fde967484af5")
@WinRTInterface("c5d9c952b4565dc79f76fde967484af5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ProcessFailedEventArgs2.ByReference::class)
public interface ICoreWebView2ProcessFailedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): CoreWebView2ProcessFailedReason?

  @InterfaceMethod(1)
  public fun get_ExitCode(): Int

  @InterfaceMethod(2)
  public fun get_ProcessDescription(): String?

  @InterfaceMethod(3)
  public fun get_FrameInfosForFailedProcess(): IVectorView<CoreWebView2FrameInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ProcessFailedEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2ProcessFailedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ProcessFailedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ProcessFailedEventArgs2 {
    public val __1955580192_Ptr: Pointer?

    public val _1955580192_VtblPtr: Pointer?
      get() = __1955580192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): CoreWebView2ProcessFailedReason? {
      val fnPtr = _1955580192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ProcessFailedReason>()
      val hr = fn.invokeHR(arrayOf(__1955580192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ProcessFailedReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExitCode(): Int {
      val fnPtr = _1955580192_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1955580192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ProcessDescription(): String? {
      val fnPtr = _1955580192_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1955580192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FrameInfosForFailedProcess(): IVectorView<CoreWebView2FrameInfo?>? {
      val fnPtr = _1955580192_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<CoreWebView2FrameInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1955580192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<CoreWebView2FrameInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ProcessFailedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1955580192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ProcessFailedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5d9c952b4565dc79f76fde967484af5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ProcessFailedEventArgs2(ptr: Pointer?): WithDefault =
        ICoreWebView2ProcessFailedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2ProcessFailedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ProcessFailedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ProcessFailedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1955580192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ProcessFailedEventArgs2):
        Array<ICoreWebView2ProcessFailedEventArgs2?> = (elements as
        Array<ICoreWebView2ProcessFailedEventArgs2?>).castToImpl<ICoreWebView2ProcessFailedEventArgs2,ICoreWebView2ProcessFailedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ProcessFailedEventArgs2?> =
        arrayOfNulls<ICoreWebView2ProcessFailedEventArgs2_Impl>(size) as
        Array<ICoreWebView2ProcessFailedEventArgs2?>
  }
}
