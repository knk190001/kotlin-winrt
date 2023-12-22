package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.Core.WebTokenRequest
import Windows.Security.Authentication.Web.TokenBindingKeyType
import Windows.Security.Credentials.WebAccount
import Windows.Security.Cryptography.Core.CryptographicKey
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

@ABIMarker(IWebProviderTokenRequest.ABI::class)
@Signature("{1e18778b-8805-454b-9f11-468d2af1095a}")
@Guid("1e18778b8805454b9f11468d2af1095a")
@WinRTInterface("1e18778b8805454b9f11468d2af1095a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderTokenRequest.ByReference::class)
public interface IWebProviderTokenRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClientRequest(): WebTokenRequest?

  @InterfaceMethod(1)
  public fun get_WebAccounts(): IVectorView<WebAccount?>?

  @InterfaceMethod(2)
  public fun get_WebAccountSelectionOptions(): WebAccountSelectionOptions?

  @InterfaceMethod(3)
  public fun get_ApplicationCallbackUri(): Uri?

  @InterfaceMethod(4)
  public fun GetApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType?, target: Uri?):
      IAsyncOperation<CryptographicKey?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderTokenRequest> {
    public override fun getValue() = ABI.makeIWebProviderTokenRequest(pointer.getPointer(0))

    public fun setValue(value: IWebProviderTokenRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderTokenRequest {
    public val __1777736176_Ptr: Pointer?

    public val _1777736176_VtblPtr: Pointer?
      get() = __1777736176_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClientRequest(): WebTokenRequest? {
      val fnPtr = _1777736176_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__1777736176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebTokenRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WebAccounts(): IVectorView<WebAccount?>? {
      val fnPtr = _1777736176_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1777736176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_WebAccountSelectionOptions(): WebAccountSelectionOptions? {
      val fnPtr = _1777736176_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountSelectionOptions>()
      val hr = fn.invokeHR(arrayOf(__1777736176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountSelectionOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ApplicationCallbackUri(): Uri? {
      val fnPtr = _1777736176_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1777736176_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType?,
        target: Uri?): IAsyncOperation<CryptographicKey?>? {
      val fnPtr = _1777736176_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CryptographicKey?>>()
      val hr = fn.invokeHR(arrayOf(__1777736176_Ptr, marshalToNative(keyType),
          marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CryptographicKey?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderTokenRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1777736176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderTokenRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e18778b8805454b9f11468d2af1095a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderTokenRequest(ptr: Pointer?): WithDefault =
        IWebProviderTokenRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderTokenRequest {
      val address = segment.toRawLongValue()
      return makeIWebProviderTokenRequest(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderTokenRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1777736176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderTokenRequest):
        Array<IWebProviderTokenRequest?> = (elements as
        Array<IWebProviderTokenRequest?>).castToImpl<IWebProviderTokenRequest,IWebProviderTokenRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderTokenRequest?> =
        arrayOfNulls<IWebProviderTokenRequest_Impl>(size) as Array<IWebProviderTokenRequest?>
  }
}
