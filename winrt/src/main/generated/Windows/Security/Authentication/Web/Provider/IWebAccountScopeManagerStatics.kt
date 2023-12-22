package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IWebAccountScopeManagerStatics.ABI::class)
@Signature("{5c6ce37c-12b2-423a-bf3d-85b8d7e53656}")
@Guid("5c6ce37c12b2423abf3d85b8d7e53656")
@WinRTInterface("5c6ce37c12b2423abf3d85b8d7e53656")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountScopeManagerStatics.ByReference::class)
public interface IWebAccountScopeManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddWebAccountAsync(
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?,
    scope: WebAccountScope?
  ): IAsyncOperation<WebAccount?>?

  @InterfaceMethod(1)
  public fun SetScopeAsync(webAccount: WebAccount?, scope: WebAccountScope?): IAsyncAction?

  @InterfaceMethod(2)
  public fun GetScope(webAccount: WebAccount?): WebAccountScope?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountScopeManagerStatics> {
    public override fun getValue() = ABI.makeIWebAccountScopeManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWebAccountScopeManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountScopeManagerStatics {
    public val __224322504_Ptr: Pointer?

    public val _224322504_VtblPtr: Pointer?
      get() = __224322504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddWebAccountAsync(
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?,
      scope: WebAccountScope?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _224322504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__224322504_Ptr, marshalToNative(webAccountId),
          marshalToNative(webAccountUserName), marshalToNative(props), marshalToNative(scope),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetScopeAsync(webAccount: WebAccount?, scope: WebAccountScope?):
        IAsyncAction? {
      val fnPtr = _224322504_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__224322504_Ptr, marshalToNative(webAccount),
          marshalToNative(scope), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetScope(webAccount: WebAccount?): WebAccountScope? {
      val fnPtr = _224322504_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountScope>()
      val hr = fn.invokeHR(arrayOf(__224322504_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountScope>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountScopeManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __224322504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountScopeManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c6ce37c12b2423abf3d85b8d7e53656")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountScopeManagerStatics(ptr: Pointer?): WithDefault =
        IWebAccountScopeManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountScopeManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWebAccountScopeManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountScopeManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__224322504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountScopeManagerStatics):
        Array<IWebAccountScopeManagerStatics?> = (elements as
        Array<IWebAccountScopeManagerStatics?>).castToImpl<IWebAccountScopeManagerStatics,IWebAccountScopeManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountScopeManagerStatics?> =
        arrayOfNulls<IWebAccountScopeManagerStatics_Impl>(size) as
        Array<IWebAccountScopeManagerStatics?>
  }
}
