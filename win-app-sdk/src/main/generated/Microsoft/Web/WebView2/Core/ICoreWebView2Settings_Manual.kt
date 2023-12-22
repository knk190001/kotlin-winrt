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

@ABIMarker(ICoreWebView2Settings_Manual.ABI::class)
@Signature("{0a538c87-e000-511c-87ca-ded3413d03da}")
@Guid("0a538c87e000511c87caded3413d03da")
@WinRTInterface("0a538c87e000511c87caded3413d03da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Settings_Manual.ByReference::class)
public interface ICoreWebView2Settings_Manual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HostObjectDispatchAdapter(): ICoreWebView2DispatchAdapter?

  @InterfaceMethod(1)
  public fun put_HostObjectDispatchAdapter(value: ICoreWebView2DispatchAdapter?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Settings_Manual> {
    public override fun getValue() = ABI.makeICoreWebView2Settings_Manual(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Settings_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Settings_Manual {
    public val __804154821_Ptr: Pointer?

    public val _804154821_VtblPtr: Pointer?
      get() = __804154821_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HostObjectDispatchAdapter(): ICoreWebView2DispatchAdapter? {
      val fnPtr = _804154821_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICoreWebView2DispatchAdapter>()
      val hr = fn.invokeHR(arrayOf(__804154821_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICoreWebView2DispatchAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HostObjectDispatchAdapter(value: ICoreWebView2DispatchAdapter?): Unit {
      val fnPtr = _804154821_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__804154821_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Settings_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __804154821_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Settings_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0a538c87e000511c87caded3413d03da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Settings_Manual(ptr: Pointer?): WithDefault =
        ICoreWebView2Settings_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Settings_Manual {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Settings_Manual(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Settings_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__804154821_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Settings_Manual):
        Array<ICoreWebView2Settings_Manual?> = (elements as
        Array<ICoreWebView2Settings_Manual?>).castToImpl<ICoreWebView2Settings_Manual,ICoreWebView2Settings_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Settings_Manual?> =
        arrayOfNulls<ICoreWebView2Settings_Manual_Impl>(size) as
        Array<ICoreWebView2Settings_Manual?>
  }
}
