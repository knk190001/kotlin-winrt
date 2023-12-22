package Microsoft.Web.WebView2.Core

import Windows.Foundation.Deferral
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2PermissionRequestedEventArgs.ABI::class)
@Signature("{118bdd9b-cef1-5910-929e-c1a321328239}")
@Guid("118bdd9bcef15910929ec1a321328239")
@WinRTInterface("118bdd9bcef15910929ec1a321328239")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PermissionRequestedEventArgs.ByReference::class)
public interface ICoreWebView2PermissionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_PermissionKind(): CoreWebView2PermissionKind?

  @InterfaceMethod(2)
  public fun get_IsUserInitiated(): Boolean

  @InterfaceMethod(3)
  public fun get_State(): CoreWebView2PermissionState?

  @InterfaceMethod(4)
  public fun put_State(value: CoreWebView2PermissionState?): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PermissionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2PermissionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PermissionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PermissionRequestedEventArgs {
    public val __677266655_Ptr: Pointer?

    public val _677266655_VtblPtr: Pointer?
      get() = __677266655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _677266655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PermissionKind(): CoreWebView2PermissionKind? {
      val fnPtr = _677266655_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PermissionKind>()
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PermissionKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _677266655_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_State(): CoreWebView2PermissionState? {
      val fnPtr = _677266655_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PermissionState>()
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PermissionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_State(value: CoreWebView2PermissionState?): Unit {
      val fnPtr = _677266655_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _677266655_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__677266655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2PermissionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __677266655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PermissionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("118bdd9bcef15910929ec1a321328239")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PermissionRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2PermissionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2PermissionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PermissionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PermissionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__677266655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PermissionRequestedEventArgs):
        Array<ICoreWebView2PermissionRequestedEventArgs?> = (elements as
        Array<ICoreWebView2PermissionRequestedEventArgs?>).castToImpl<ICoreWebView2PermissionRequestedEventArgs,ICoreWebView2PermissionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PermissionRequestedEventArgs?> =
        arrayOfNulls<ICoreWebView2PermissionRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2PermissionRequestedEventArgs?>
  }
}
