package Microsoft.Web.WebView2.Core

import Windows.Foundation.IMemoryBufferReference
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

@ABIMarker(ICoreWebView2SharedBuffer_Manual.ABI::class)
@Signature("{1aa4e213-ace3-5f74-a2ae-c6489ceb3239}")
@Guid("1aa4e213ace35f74a2aec6489ceb3239")
@WinRTInterface("1aa4e213ace35f74a2aec6489ceb3239")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2SharedBuffer_Manual.ByReference::class)
public interface ICoreWebView2SharedBuffer_Manual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Buffer(): IMemoryBufferReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2SharedBuffer_Manual> {
    public override fun getValue() = ABI.makeICoreWebView2SharedBuffer_Manual(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2SharedBuffer_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2SharedBuffer_Manual {
    public val __2042864999_Ptr: Pointer?

    public val _2042864999_VtblPtr: Pointer?
      get() = __2042864999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Buffer(): IMemoryBufferReference? {
      val fnPtr = _2042864999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMemoryBufferReference>()
      val hr = fn.invokeHR(arrayOf(__2042864999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMemoryBufferReference>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2SharedBuffer_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2042864999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2SharedBuffer_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1aa4e213ace35f74a2aec6489ceb3239")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2SharedBuffer_Manual(ptr: Pointer?): WithDefault =
        ICoreWebView2SharedBuffer_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2SharedBuffer_Manual {
      val address = segment.toRawLongValue()
      return makeICoreWebView2SharedBuffer_Manual(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2SharedBuffer_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2042864999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2SharedBuffer_Manual):
        Array<ICoreWebView2SharedBuffer_Manual?> = (elements as
        Array<ICoreWebView2SharedBuffer_Manual?>).castToImpl<ICoreWebView2SharedBuffer_Manual,ICoreWebView2SharedBuffer_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2SharedBuffer_Manual?> =
        arrayOfNulls<ICoreWebView2SharedBuffer_Manual_Impl>(size) as
        Array<ICoreWebView2SharedBuffer_Manual?>
  }
}
