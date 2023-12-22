package Windows.Security.Authentication.Web.Core

import Windows.Foundation.IAsyncOperation
import Windows.Security.Authentication.Web.Core.IWebAuthenticationCoreManagerStatics.ABI.IID
import Windows.Security.Credentials.WebAccountProvider
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebAuthenticationCoreManagerStatics4.ABI::class)
@Signature("{54e633fe-96e0-41e8-9832-1298897c2aaf}")
@Guid("54e633fe96e041e898321298897c2aaf")
@WinRTInterface("54e633fe96e041e898321298897c2aaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationCoreManagerStatics4.ByReference::class)
public interface IWebAuthenticationCoreManagerStatics4 : NativeMapped, IWinRTInterface,
    IWebAuthenticationCoreManagerStatics {
  @InterfaceMethod(0)
  public fun FindAllAccountsAsync(provider: WebAccountProvider?):
      IAsyncOperation<FindAllAccountsResult?>?

  @InterfaceMethod(1)
  public fun FindAllAccountsAsync(provider: WebAccountProvider?, clientId: String?):
      IAsyncOperation<FindAllAccountsResult?>?

  @InterfaceMethod(2)
  public fun FindSystemAccountProviderAsync(webAccountProviderId: String?):
      IAsyncOperation<WebAccountProvider?>?

  @InterfaceMethod(3)
  public fun FindSystemAccountProviderAsync(webAccountProviderId: String?, authority: String?):
      IAsyncOperation<WebAccountProvider?>?

  @InterfaceMethod(4)
  public fun FindSystemAccountProviderAsync(
    webAccountProviderId: String?,
    authority: String?,
    user: User?
  ): IAsyncOperation<WebAccountProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationCoreManagerStatics4> {
    public override fun getValue() =
        ABI.makeIWebAuthenticationCoreManagerStatics4(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationCoreManagerStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationCoreManagerStatics4,
      IWebAuthenticationCoreManagerStatics.WithDefault {
    public val __1154541742_Ptr: Pointer?

    public val _1154541742_VtblPtr: Pointer?
      get() = __1154541742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAccountsAsync(provider: WebAccountProvider?):
        IAsyncOperation<FindAllAccountsResult?>? {
      val fnPtr = _1154541742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FindAllAccountsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1154541742_Ptr, marshalToNative(provider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<FindAllAccountsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAccountsAsync(provider: WebAccountProvider?, clientId: String?):
        IAsyncOperation<FindAllAccountsResult?>? {
      val fnPtr = _1154541742_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FindAllAccountsResult?>>()
      val hr = fn.invokeHR(arrayOf(__1154541742_Ptr, marshalToNative(provider),
          marshalToNative(clientId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<FindAllAccountsResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindSystemAccountProviderAsync(webAccountProviderId: String?):
        IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1154541742_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1154541742_Ptr, marshalToNative(webAccountProviderId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindSystemAccountProviderAsync(webAccountProviderId: String?,
        authority: String?): IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1154541742_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1154541742_Ptr, marshalToNative(webAccountProviderId),
          marshalToNative(authority), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindSystemAccountProviderAsync(
      webAccountProviderId: String?,
      authority: String?,
      user: User?
    ): IAsyncOperation<WebAccountProvider?>? {
      val fnPtr = _1154541742_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccountProvider?>>()
      val hr = fn.invokeHR(arrayOf(__1154541742_Ptr, marshalToNative(webAccountProviderId),
          marshalToNative(authority), marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccountProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAuthenticationCoreManagerStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IWebAuthenticationCoreManagerStatics {
    public override val __1838358598_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1154541742_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1154541742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationCoreManagerStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54e633fe96e041e898321298897c2aaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationCoreManagerStatics4(ptr: Pointer?): WithDefault =
        IWebAuthenticationCoreManagerStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationCoreManagerStatics4 {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationCoreManagerStatics4(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationCoreManagerStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154541742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationCoreManagerStatics4):
        Array<IWebAuthenticationCoreManagerStatics4?> = (elements as
        Array<IWebAuthenticationCoreManagerStatics4?>).castToImpl<IWebAuthenticationCoreManagerStatics4,IWebAuthenticationCoreManagerStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationCoreManagerStatics4?> =
        arrayOfNulls<IWebAuthenticationCoreManagerStatics4_Impl>(size) as
        Array<IWebAuthenticationCoreManagerStatics4?>
  }
}
