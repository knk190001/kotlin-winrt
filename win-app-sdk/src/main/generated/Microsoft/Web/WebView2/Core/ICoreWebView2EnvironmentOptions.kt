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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2EnvironmentOptions.ABI::class)
@Signature("{25d6dc39-0062-5735-8b09-a6f535f19e97}")
@Guid("25d6dc39006257358b09a6f535f19e97")
@WinRTInterface("25d6dc39006257358b09a6f535f19e97")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2EnvironmentOptions.ByReference::class)
public interface ICoreWebView2EnvironmentOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdditionalBrowserArguments(): String?

  @InterfaceMethod(1)
  public fun put_AdditionalBrowserArguments(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Language(): String?

  @InterfaceMethod(3)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_TargetCompatibleBrowserVersion(): String?

  @InterfaceMethod(5)
  public fun put_TargetCompatibleBrowserVersion(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_AllowSingleSignOnUsingOSPrimaryAccount(): Boolean

  @InterfaceMethod(7)
  public fun put_AllowSingleSignOnUsingOSPrimaryAccount(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2EnvironmentOptions> {
    public override fun getValue() = ABI.makeICoreWebView2EnvironmentOptions(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2EnvironmentOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2EnvironmentOptions {
    public val __567345230_Ptr: Pointer?

    public val _567345230_VtblPtr: Pointer?
      get() = __567345230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdditionalBrowserArguments(): String? {
      val fnPtr = _567345230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AdditionalBrowserArguments(value: String?): Unit {
      val fnPtr = _567345230_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Language(): String? {
      val fnPtr = _567345230_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _567345230_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TargetCompatibleBrowserVersion(): String? {
      val fnPtr = _567345230_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TargetCompatibleBrowserVersion(value: String?): Unit {
      val fnPtr = _567345230_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_AllowSingleSignOnUsingOSPrimaryAccount(): Boolean {
      val fnPtr = _567345230_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_AllowSingleSignOnUsingOSPrimaryAccount(value: Boolean): Unit {
      val fnPtr = _567345230_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__567345230_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2EnvironmentOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __567345230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2EnvironmentOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25d6dc39006257358b09a6f535f19e97")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2EnvironmentOptions(ptr: Pointer?): WithDefault =
        ICoreWebView2EnvironmentOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2EnvironmentOptions {
      val address = segment.toRawLongValue()
      return makeICoreWebView2EnvironmentOptions(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2EnvironmentOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__567345230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2EnvironmentOptions):
        Array<ICoreWebView2EnvironmentOptions?> = (elements as
        Array<ICoreWebView2EnvironmentOptions?>).castToImpl<ICoreWebView2EnvironmentOptions,ICoreWebView2EnvironmentOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2EnvironmentOptions?> =
        arrayOfNulls<ICoreWebView2EnvironmentOptions_Impl>(size) as
        Array<ICoreWebView2EnvironmentOptions?>
  }
}
