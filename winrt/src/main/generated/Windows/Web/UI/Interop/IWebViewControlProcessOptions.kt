package Windows.Web.UI.Interop

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

@ABIMarker(IWebViewControlProcessOptions.ABI::class)
@Signature("{1cca72a7-3bd6-4826-8261-6c8189505d89}")
@Guid("1cca72a73bd6482682616c8189505d89")
@WinRTInterface("1cca72a73bd6482682616c8189505d89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlProcessOptions.ByReference::class)
public interface IWebViewControlProcessOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_EnterpriseId(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_EnterpriseId(): String?

  @InterfaceMethod(2)
  public fun put_PrivateNetworkClientServerCapability(value: WebViewControlProcessCapabilityState?):
      Unit

  @InterfaceMethod(3)
  public fun get_PrivateNetworkClientServerCapability(): WebViewControlProcessCapabilityState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlProcessOptions> {
    public override fun getValue() = ABI.makeIWebViewControlProcessOptions(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlProcessOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlProcessOptions {
    public val __432722156_Ptr: Pointer?

    public val _432722156_VtblPtr: Pointer?
      get() = __432722156_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_EnterpriseId(value: String?): Unit {
      val fnPtr = _432722156_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__432722156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _432722156_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__432722156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun put_PrivateNetworkClientServerCapability(value: WebViewControlProcessCapabilityState?):
        Unit {
      val fnPtr = _432722156_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__432722156_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PrivateNetworkClientServerCapability():
        WebViewControlProcessCapabilityState? {
      val fnPtr = _432722156_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlProcessCapabilityState>()
      val hr = fn.invokeHR(arrayOf(__432722156_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebViewControlProcessCapabilityState>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlProcessOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __432722156_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlProcessOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cca72a73bd6482682616c8189505d89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlProcessOptions(ptr: Pointer?): WithDefault =
        IWebViewControlProcessOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlProcessOptions {
      val address = segment.toRawLongValue()
      return makeIWebViewControlProcessOptions(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlProcessOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__432722156_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlProcessOptions):
        Array<IWebViewControlProcessOptions?> = (elements as
        Array<IWebViewControlProcessOptions?>).castToImpl<IWebViewControlProcessOptions,IWebViewControlProcessOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlProcessOptions?> =
        arrayOfNulls<IWebViewControlProcessOptions_Impl>(size) as
        Array<IWebViewControlProcessOptions?>
  }
}
