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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2PermissionSetting.ABI::class)
@Signature("{b4158d0b-8ef8-575f-8e99-5fe02e8b579e}")
@Guid("b4158d0b8ef8575f8e995fe02e8b579e")
@WinRTInterface("b4158d0b8ef8575f8e995fe02e8b579e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PermissionSetting.ByReference::class)
public interface ICoreWebView2PermissionSetting : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PermissionKind(): CoreWebView2PermissionKind?

  @InterfaceMethod(1)
  public fun get_PermissionOrigin(): String?

  @InterfaceMethod(2)
  public fun get_PermissionState(): CoreWebView2PermissionState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PermissionSetting> {
    public override fun getValue() = ABI.makeICoreWebView2PermissionSetting(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PermissionSetting_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PermissionSetting {
    public val __1982293510_Ptr: Pointer?

    public val _1982293510_VtblPtr: Pointer?
      get() = __1982293510_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PermissionKind(): CoreWebView2PermissionKind? {
      val fnPtr = _1982293510_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PermissionKind>()
      val hr = fn.invokeHR(arrayOf(__1982293510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PermissionKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PermissionOrigin(): String? {
      val fnPtr = _1982293510_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1982293510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PermissionState(): CoreWebView2PermissionState? {
      val fnPtr = _1982293510_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PermissionState>()
      val hr = fn.invokeHR(arrayOf(__1982293510_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PermissionState>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2PermissionSetting_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1982293510_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PermissionSetting, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4158d0b8ef8575f8e995fe02e8b579e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PermissionSetting(ptr: Pointer?): WithDefault =
        ICoreWebView2PermissionSetting_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PermissionSetting {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PermissionSetting(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PermissionSetting): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1982293510_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PermissionSetting):
        Array<ICoreWebView2PermissionSetting?> = (elements as
        Array<ICoreWebView2PermissionSetting?>).castToImpl<ICoreWebView2PermissionSetting,ICoreWebView2PermissionSetting_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PermissionSetting?> =
        arrayOfNulls<ICoreWebView2PermissionSetting_Impl>(size) as
        Array<ICoreWebView2PermissionSetting?>
  }
}
