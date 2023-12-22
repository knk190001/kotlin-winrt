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

@ABIMarker(ICoreWebView2LaunchingExternalUriSchemeEventArgs.ABI::class)
@Signature("{6ab44f8d-ec6a-56a1-ae3c-9c55dff6cbc6}")
@Guid("6ab44f8dec6a56a1ae3c9c55dff6cbc6")
@WinRTInterface("6ab44f8dec6a56a1ae3c9c55dff6cbc6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2LaunchingExternalUriSchemeEventArgs.ByReference::class)
public interface ICoreWebView2LaunchingExternalUriSchemeEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): String?

  @InterfaceMethod(1)
  public fun get_InitiatingOrigin(): String?

  @InterfaceMethod(2)
  public fun get_IsUserInitiated(): Boolean

  @InterfaceMethod(3)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(4)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2LaunchingExternalUriSchemeEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2LaunchingExternalUriSchemeEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2LaunchingExternalUriSchemeEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2LaunchingExternalUriSchemeEventArgs {
    public val __1254531719_Ptr: Pointer?

    public val _1254531719_VtblPtr: Pointer?
      get() = __1254531719_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): String? {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InitiatingOrigin(): String? {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1254531719_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1254531719_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2LaunchingExternalUriSchemeEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1254531719_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2LaunchingExternalUriSchemeEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ab44f8dec6a56a1ae3c9c55dff6cbc6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2LaunchingExternalUriSchemeEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2LaunchingExternalUriSchemeEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2LaunchingExternalUriSchemeEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2LaunchingExternalUriSchemeEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2LaunchingExternalUriSchemeEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1254531719_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2LaunchingExternalUriSchemeEventArgs):
        Array<ICoreWebView2LaunchingExternalUriSchemeEventArgs?> = (elements as
        Array<ICoreWebView2LaunchingExternalUriSchemeEventArgs?>).castToImpl<ICoreWebView2LaunchingExternalUriSchemeEventArgs,ICoreWebView2LaunchingExternalUriSchemeEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2LaunchingExternalUriSchemeEventArgs?>
        = arrayOfNulls<ICoreWebView2LaunchingExternalUriSchemeEventArgs_Impl>(size) as
        Array<ICoreWebView2LaunchingExternalUriSchemeEventArgs?>
  }
}
