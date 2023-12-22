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

@ABIMarker(ICoreWebView2Environment_Manual.ABI::class)
@Signature("{f51cfabe-73ad-5635-a935-6386aef9238e}")
@Guid("f51cfabe73ad5635a9356386aef9238e")
@WinRTInterface("f51cfabe73ad5635a9356386aef9238e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment_Manual.ByReference::class)
public interface ICoreWebView2Environment_Manual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCoreWebView2ControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?,
      options: CoreWebView2ControllerOptions?): IAsyncOperation<CoreWebView2Controller?>?

  @InterfaceMethod(1)
  public
      fun CreateCoreWebView2CompositionControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?,
      options: CoreWebView2ControllerOptions?): IAsyncOperation<CoreWebView2CompositionController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment_Manual> {
    public override fun getValue() = ABI.makeICoreWebView2Environment_Manual(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment_Manual {
    public val __271601095_Ptr: Pointer?

    public val _271601095_VtblPtr: Pointer?
      get() = __271601095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateCoreWebView2ControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?,
        options: CoreWebView2ControllerOptions?): IAsyncOperation<CoreWebView2Controller?>? {
      val fnPtr = _271601095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2Controller?>>()
      val hr = fn.invokeHR(arrayOf(__271601095_Ptr, marshalToNative(ParentWindow),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2Controller?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun CreateCoreWebView2CompositionControllerAsync(ParentWindow: CoreWebView2ControllerWindowReference?,
        options: CoreWebView2ControllerOptions?):
        IAsyncOperation<CoreWebView2CompositionController?>? {
      val fnPtr = _271601095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2CompositionController?>>()
      val hr = fn.invokeHR(arrayOf(__271601095_Ptr, marshalToNative(ParentWindow),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2CompositionController?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __271601095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f51cfabe73ad5635a9356386aef9238e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment_Manual(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment_Manual {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment_Manual(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__271601095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment_Manual):
        Array<ICoreWebView2Environment_Manual?> = (elements as
        Array<ICoreWebView2Environment_Manual?>).castToImpl<ICoreWebView2Environment_Manual,ICoreWebView2Environment_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment_Manual?> =
        arrayOfNulls<ICoreWebView2Environment_Manual_Impl>(size) as
        Array<ICoreWebView2Environment_Manual?>
  }
}
