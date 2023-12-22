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

@ABIMarker(ICoreWebView2_6.ABI::class)
@Signature("{92b34b96-853d-5bb6-ac52-30297ce805f1}")
@Guid("92b34b96853d5bb6ac5230297ce805f1")
@WinRTInterface("92b34b96853d5bb6ac5230297ce805f1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_6.ByReference::class)
public interface ICoreWebView2_6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenTaskManagerWindow(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_6> {
    public override fun getValue() = ABI.makeICoreWebView2_6(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_6 {
    public val __335594434_Ptr: Pointer?

    public val _335594434_VtblPtr: Pointer?
      get() = __335594434_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenTaskManagerWindow(): Unit {
      val fnPtr = _335594434_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594434_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594434_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92b34b96853d5bb6ac5230297ce805f1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_6(ptr: Pointer?): WithDefault = ICoreWebView2_6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_6 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_6(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594434_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_6): Array<ICoreWebView2_6?> = (elements as
        Array<ICoreWebView2_6?>).castToImpl<ICoreWebView2_6,ICoreWebView2_6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_6?> =
        arrayOfNulls<ICoreWebView2_6_Impl>(size) as Array<ICoreWebView2_6?>
  }
}
