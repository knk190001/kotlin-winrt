package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICoreWebView2Environment3.ABI::class)
@Signature("{5e33f46c-c0b9-5126-8840-17f9c11b3a8a}")
@Guid("5e33f46cc0b95126884017f9c11b3a8a")
@WinRTInterface("5e33f46cc0b95126884017f9c11b3a8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment3.ByReference::class)
public interface ICoreWebView2Environment3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun CreateCoreWebView2CompositionControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?):
      IAsyncOperation<CoreWebView2CompositionController?>?

  @InterfaceMethod(1)
  public fun CreateCoreWebView2PointerInfo(): CoreWebView2PointerInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment3> {
    public override fun getValue() = ABI.makeICoreWebView2Environment3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment3 {
    public val __174970983_Ptr: Pointer?

    public val _174970983_VtblPtr: Pointer?
      get() = __174970983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateCoreWebView2CompositionControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?):
        IAsyncOperation<CoreWebView2CompositionController?>? {
      val fnPtr = _174970983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2CompositionController?>>()
      val hr = fn.invokeHR(arrayOf(__174970983_Ptr, marshalToNative(ParentWindow), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2CompositionController?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateCoreWebView2PointerInfo(): CoreWebView2PointerInfo? {
      val fnPtr = _174970983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PointerInfo>()
      val hr = fn.invokeHR(arrayOf(__174970983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PointerInfo>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174970983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e33f46cc0b95126884017f9c11b3a8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment3(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174970983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment3):
        Array<ICoreWebView2Environment3?> = (elements as
        Array<ICoreWebView2Environment3?>).castToImpl<ICoreWebView2Environment3,ICoreWebView2Environment3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment3?> =
        arrayOfNulls<ICoreWebView2Environment3_Impl>(size) as Array<ICoreWebView2Environment3?>
  }
}
