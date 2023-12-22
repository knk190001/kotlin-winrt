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

@ABIMarker(ICoreWebView2_19.ABI::class)
@Signature("{35a94a5c-e027-5dc5-8c2b-c2fc7d589159}")
@Guid("35a94a5ce0275dc58c2bc2fc7d589159")
@WinRTInterface("35a94a5ce0275dc58c2bc2fc7d589159")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_19.ByReference::class)
public interface ICoreWebView2_19 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MemoryUsageTargetLevel(): CoreWebView2MemoryUsageTargetLevel?

  @InterfaceMethod(1)
  public fun put_MemoryUsageTargetLevel(value: CoreWebView2MemoryUsageTargetLevel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_19> {
    public override fun getValue() = ABI.makeICoreWebView2_19(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_19_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_19 {
    public val __1813492960_Ptr: Pointer?

    public val _1813492960_VtblPtr: Pointer?
      get() = __1813492960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MemoryUsageTargetLevel(): CoreWebView2MemoryUsageTargetLevel? {
      val fnPtr = _1813492960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2MemoryUsageTargetLevel>()
      val hr = fn.invokeHR(arrayOf(__1813492960_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2MemoryUsageTargetLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MemoryUsageTargetLevel(value: CoreWebView2MemoryUsageTargetLevel?):
        Unit {
      val fnPtr = _1813492960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1813492960_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_19_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813492960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_19, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35a94a5ce0275dc58c2bc2fc7d589159")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_19(ptr: Pointer?): WithDefault = ICoreWebView2_19_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_19 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_19(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_19): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813492960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_19): Array<ICoreWebView2_19?> = (elements as
        Array<ICoreWebView2_19?>).castToImpl<ICoreWebView2_19,ICoreWebView2_19_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_19?> =
        arrayOfNulls<ICoreWebView2_19_Impl>(size) as Array<ICoreWebView2_19?>
  }
}
