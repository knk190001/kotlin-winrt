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

@ABIMarker(ICoreWebView2PermissionRequestedEventArgs3.ABI::class)
@Signature("{200e8bcc-bc11-5beb-aa7a-79d4c95d73aa}")
@Guid("200e8bccbc115bebaa7a79d4c95d73aa")
@WinRTInterface("200e8bccbc115bebaa7a79d4c95d73aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PermissionRequestedEventArgs3.ByReference::class)
public interface ICoreWebView2PermissionRequestedEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SavesInProfile(): Boolean

  @InterfaceMethod(1)
  public fun put_SavesInProfile(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PermissionRequestedEventArgs3> {
    public override fun getValue() =
        ABI.makeICoreWebView2PermissionRequestedEventArgs3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PermissionRequestedEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PermissionRequestedEventArgs3 {
    public val __479570124_Ptr: Pointer?

    public val _479570124_VtblPtr: Pointer?
      get() = __479570124_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SavesInProfile(): Boolean {
      val fnPtr = _479570124_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__479570124_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SavesInProfile(value: Boolean): Unit {
      val fnPtr = _479570124_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479570124_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2PermissionRequestedEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479570124_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PermissionRequestedEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("200e8bccbc115bebaa7a79d4c95d73aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PermissionRequestedEventArgs3(ptr: Pointer?): WithDefault =
        ICoreWebView2PermissionRequestedEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2PermissionRequestedEventArgs3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PermissionRequestedEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PermissionRequestedEventArgs3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479570124_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PermissionRequestedEventArgs3):
        Array<ICoreWebView2PermissionRequestedEventArgs3?> = (elements as
        Array<ICoreWebView2PermissionRequestedEventArgs3?>).castToImpl<ICoreWebView2PermissionRequestedEventArgs3,ICoreWebView2PermissionRequestedEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PermissionRequestedEventArgs3?> =
        arrayOfNulls<ICoreWebView2PermissionRequestedEventArgs3_Impl>(size) as
        Array<ICoreWebView2PermissionRequestedEventArgs3?>
  }
}
