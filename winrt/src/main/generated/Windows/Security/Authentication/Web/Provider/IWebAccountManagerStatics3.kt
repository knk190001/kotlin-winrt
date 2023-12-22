package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Security.Credentials.WebAccount
import Windows.System.User
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

@ABIMarker(IWebAccountManagerStatics3.ABI::class)
@Signature("{dd4523a6-8a4f-4aa2-b15e-03f550af1359}")
@Guid("dd4523a68a4f4aa2b15e03f550af1359")
@WinRTInterface("dd4523a68a4f4aa2b15e03f550af1359")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountManagerStatics3.ByReference::class)
public interface IWebAccountManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllProviderWebAccountsForUserAsync(user: User?):
      IAsyncOperation<IVectorView<WebAccount?>?>?

  @InterfaceMethod(1)
  public fun AddWebAccountForUserAsync(
    user: User?,
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?
  ): IAsyncOperation<WebAccount?>?

  @InterfaceMethod(2)
  public fun AddWebAccountForUserAsync(
    user: User?,
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?,
    scope: WebAccountScope?
  ): IAsyncOperation<WebAccount?>?

  @InterfaceMethod(3)
  public fun AddWebAccountForUserAsync(
    user: User?,
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?,
    scope: WebAccountScope?,
    perUserWebAccountId: String?
  ): IAsyncOperation<WebAccount?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountManagerStatics3> {
    public override fun getValue() = ABI.makeIWebAccountManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IWebAccountManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountManagerStatics3 {
    public val __1099550423_Ptr: Pointer?

    public val _1099550423_VtblPtr: Pointer?
      get() = __1099550423_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllProviderWebAccountsForUserAsync(user: User?):
        IAsyncOperation<IVectorView<WebAccount?>?>? {
      val fnPtr = _1099550423_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WebAccount?>?>>()
      val hr = fn.invokeHR(arrayOf(__1099550423_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WebAccount?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddWebAccountForUserAsync(
      user: User?,
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _1099550423_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1099550423_Ptr, marshalToNative(user),
          marshalToNative(webAccountId), marshalToNative(webAccountUserName),
          marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun AddWebAccountForUserAsync(
      user: User?,
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?,
      scope: WebAccountScope?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _1099550423_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1099550423_Ptr, marshalToNative(user),
          marshalToNative(webAccountId), marshalToNative(webAccountUserName),
          marshalToNative(props), marshalToNative(scope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun AddWebAccountForUserAsync(
      user: User?,
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?,
      scope: WebAccountScope?,
      perUserWebAccountId: String?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _1099550423_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1099550423_Ptr, marshalToNative(user),
          marshalToNative(webAccountId), marshalToNative(webAccountUserName),
          marshalToNative(props), marshalToNative(scope), marshalToNative(perUserWebAccountId),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1099550423_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd4523a68a4f4aa2b15e03f550af1359")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountManagerStatics3(ptr: Pointer?): WithDefault =
        IWebAccountManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIWebAccountManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1099550423_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountManagerStatics3):
        Array<IWebAccountManagerStatics3?> = (elements as
        Array<IWebAccountManagerStatics3?>).castToImpl<IWebAccountManagerStatics3,IWebAccountManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountManagerStatics3?> =
        arrayOfNulls<IWebAccountManagerStatics3_Impl>(size) as Array<IWebAccountManagerStatics3?>
  }
}
