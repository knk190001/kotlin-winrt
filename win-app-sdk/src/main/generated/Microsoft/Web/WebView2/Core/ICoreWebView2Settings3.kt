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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Settings3.ABI::class)
@Signature("{52200f01-5309-5b2e-a03c-3d2677591940}")
@Guid("52200f0153095b2ea03c3d2677591940")
@WinRTInterface("52200f0153095b2ea03c3d2677591940")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings3.ByReference::class)
public interface ICoreWebView2Settings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreBrowserAcceleratorKeysEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AreBrowserAcceleratorKeysEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings3> {
    public override fun getValue() = ABI.makeICoreWebView2Settings3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings3 {
    public val __965763561_Ptr: Pointer?

    public val _965763561_VtblPtr: Pointer?
      get() = __965763561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreBrowserAcceleratorKeysEnabled(): Boolean {
      val fnPtr = _965763561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__965763561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreBrowserAcceleratorKeysEnabled(value: Boolean): Unit {
      val fnPtr = _965763561_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__965763561_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965763561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52200f0153095b2ea03c3d2677591940")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings3(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965763561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings3): Array<ICoreWebView2Settings3?> =
        (elements as
        Array<ICoreWebView2Settings3?>).castToImpl<ICoreWebView2Settings3,ICoreWebView2Settings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings3?> =
        arrayOfNulls<ICoreWebView2Settings3_Impl>(size) as Array<ICoreWebView2Settings3?>
  }
}
