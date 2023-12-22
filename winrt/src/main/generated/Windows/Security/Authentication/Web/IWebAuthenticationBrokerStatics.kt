package Windows.Security.Authentication.Web

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
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

@ABIMarker(IWebAuthenticationBrokerStatics.ABI::class)
@Signature("{2f149f1a-e673-40b5-bc22-201a6864a37b}")
@Guid("2f149f1ae67340b5bc22201a6864a37b")
@WinRTInterface("2f149f1ae67340b5bc22201a6864a37b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationBrokerStatics.ByReference::class)
public interface IWebAuthenticationBrokerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AuthenticateAsync(
    options: WebAuthenticationOptions?,
    requestUri: Uri?,
    callbackUri: Uri?
  ): IAsyncOperation<WebAuthenticationResult?>?

  @InterfaceMethod(1)
  public fun AuthenticateAsync(options: WebAuthenticationOptions?, requestUri: Uri?):
      IAsyncOperation<WebAuthenticationResult?>?

  @InterfaceMethod(2)
  public fun GetCurrentApplicationCallbackUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationBrokerStatics> {
    public override fun getValue() = ABI.makeIWebAuthenticationBrokerStatics(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationBrokerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationBrokerStatics {
    public val __1746697848_Ptr: Pointer?

    public val _1746697848_VtblPtr: Pointer?
      get() = __1746697848_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AuthenticateAsync(
      options: WebAuthenticationOptions?,
      requestUri: Uri?,
      callbackUri: Uri?
    ): IAsyncOperation<WebAuthenticationResult?>? {
      val fnPtr = _1746697848_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAuthenticationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1746697848_Ptr, marshalToNative(options),
          marshalToNative(requestUri), marshalToNative(callbackUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebAuthenticationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AuthenticateAsync(options: WebAuthenticationOptions?, requestUri: Uri?):
        IAsyncOperation<WebAuthenticationResult?>? {
      val fnPtr = _1746697848_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAuthenticationResult?>>()
      val hr = fn.invokeHR(arrayOf(__1746697848_Ptr, marshalToNative(options),
          marshalToNative(requestUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WebAuthenticationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCurrentApplicationCallbackUri(): Uri? {
      val fnPtr = _1746697848_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1746697848_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationBrokerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1746697848_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationBrokerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f149f1ae67340b5bc22201a6864a37b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationBrokerStatics(ptr: Pointer?): WithDefault =
        IWebAuthenticationBrokerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationBrokerStatics {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationBrokerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationBrokerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1746697848_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationBrokerStatics):
        Array<IWebAuthenticationBrokerStatics?> = (elements as
        Array<IWebAuthenticationBrokerStatics?>).castToImpl<IWebAuthenticationBrokerStatics,IWebAuthenticationBrokerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationBrokerStatics?> =
        arrayOfNulls<IWebAuthenticationBrokerStatics_Impl>(size) as
        Array<IWebAuthenticationBrokerStatics?>
  }
}
