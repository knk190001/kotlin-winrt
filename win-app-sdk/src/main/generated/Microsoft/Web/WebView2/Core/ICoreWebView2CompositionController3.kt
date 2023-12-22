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

@ABIMarker(ICoreWebView2CompositionController3.ABI::class)
@Signature("{bbbecdcf-0f03-50f0-8f85-9cbf6c9bbe10}")
@Guid("bbbecdcf0f0350f08f859cbf6c9bbe10")
@WinRTInterface("bbbecdcf0f0350f08f859cbf6c9bbe10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2CompositionController3.ByReference::class)
public interface ICoreWebView2CompositionController3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DragLeave(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2CompositionController3> {
    public override fun getValue() =
        ABI.makeICoreWebView2CompositionController3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2CompositionController3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2CompositionController3 {
    public val __1659227340_Ptr: Pointer?

    public val _1659227340_VtblPtr: Pointer?
      get() = __1659227340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DragLeave(): Unit {
      val fnPtr = _1659227340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1659227340_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2CompositionController3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1659227340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2CompositionController3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbbecdcf0f0350f08f859cbf6c9bbe10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2CompositionController3(ptr: Pointer?): WithDefault =
        ICoreWebView2CompositionController3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2CompositionController3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2CompositionController3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2CompositionController3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1659227340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2CompositionController3):
        Array<ICoreWebView2CompositionController3?> = (elements as
        Array<ICoreWebView2CompositionController3?>).castToImpl<ICoreWebView2CompositionController3,ICoreWebView2CompositionController3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2CompositionController3?> =
        arrayOfNulls<ICoreWebView2CompositionController3_Impl>(size) as
        Array<ICoreWebView2CompositionController3?>
  }
}
