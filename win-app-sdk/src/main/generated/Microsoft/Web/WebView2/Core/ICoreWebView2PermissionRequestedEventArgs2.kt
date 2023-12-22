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

@ABIMarker(ICoreWebView2PermissionRequestedEventArgs2.ABI::class)
@Signature("{a6652fba-ebe5-5891-addc-cb37da8f7e66}")
@Guid("a6652fbaebe55891addccb37da8f7e66")
@WinRTInterface("a6652fbaebe55891addccb37da8f7e66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PermissionRequestedEventArgs2.ByReference::class)
public interface ICoreWebView2PermissionRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PermissionRequestedEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2PermissionRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PermissionRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PermissionRequestedEventArgs2 {
    public val __479570125_Ptr: Pointer?

    public val _479570125_VtblPtr: Pointer?
      get() = __479570125_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _479570125_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__479570125_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _479570125_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__479570125_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2PermissionRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __479570125_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PermissionRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6652fbaebe55891addccb37da8f7e66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PermissionRequestedEventArgs2(ptr: Pointer?): WithDefault =
        ICoreWebView2PermissionRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2PermissionRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PermissionRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PermissionRequestedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__479570125_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PermissionRequestedEventArgs2):
        Array<ICoreWebView2PermissionRequestedEventArgs2?> = (elements as
        Array<ICoreWebView2PermissionRequestedEventArgs2?>).castToImpl<ICoreWebView2PermissionRequestedEventArgs2,ICoreWebView2PermissionRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PermissionRequestedEventArgs2?> =
        arrayOfNulls<ICoreWebView2PermissionRequestedEventArgs2_Impl>(size) as
        Array<ICoreWebView2PermissionRequestedEventArgs2?>
  }
}
