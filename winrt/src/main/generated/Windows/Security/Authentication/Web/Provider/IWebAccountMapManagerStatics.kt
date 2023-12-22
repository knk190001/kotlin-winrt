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

@ABIMarker(IWebAccountMapManagerStatics.ABI::class)
@Signature("{e8fa446f-3a1b-48a4-8e90-1e59ca6f54db}")
@Guid("e8fa446f3a1b48a48e901e59ca6f54db")
@WinRTInterface("e8fa446f3a1b48a48e901e59ca6f54db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountMapManagerStatics.ByReference::class)
public interface IWebAccountMapManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddWebAccountAsync(
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?,
    scope: WebAccountScope?,
    perUserWebAccountId: String?
  ): IAsyncOperation<WebAccount?>?

  @InterfaceMethod(1)
  public fun SetPerAppToPerUserAccountAsync(perAppAccount: WebAccount?,
      perUserWebAccountId: String?): IAsyncAction?

  @InterfaceMethod(2)
  public fun GetPerUserFromPerAppAccountAsync(perAppAccount: WebAccount?):
      IAsyncOperation<WebAccount?>?

  @InterfaceMethod(3)
  public fun ClearPerUserFromPerAppAccountAsync(perAppAccount: WebAccount?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountMapManagerStatics> {
    public override fun getValue() = ABI.makeIWebAccountMapManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWebAccountMapManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountMapManagerStatics {
    public val __1817996240_Ptr: Pointer?

    public val _1817996240_VtblPtr: Pointer?
      get() = __1817996240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddWebAccountAsync(
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?,
      scope: WebAccountScope?,
      perUserWebAccountId: String?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _1817996240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1817996240_Ptr, marshalToNative(webAccountId),
          marshalToNative(webAccountUserName), marshalToNative(props), marshalToNative(scope),
          marshalToNative(perUserWebAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPerAppToPerUserAccountAsync(perAppAccount: WebAccount?,
        perUserWebAccountId: String?): IAsyncAction? {
      val fnPtr = _1817996240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1817996240_Ptr, marshalToNative(perAppAccount),
          marshalToNative(perUserWebAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPerUserFromPerAppAccountAsync(perAppAccount: WebAccount?):
        IAsyncOperation<WebAccount?>? {
      val fnPtr = _1817996240_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1817996240_Ptr, marshalToNative(perAppAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ClearPerUserFromPerAppAccountAsync(perAppAccount: WebAccount?):
        IAsyncAction? {
      val fnPtr = _1817996240_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1817996240_Ptr, marshalToNative(perAppAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountMapManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1817996240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountMapManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8fa446f3a1b48a48e901e59ca6f54db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountMapManagerStatics(ptr: Pointer?): WithDefault =
        IWebAccountMapManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountMapManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWebAccountMapManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountMapManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1817996240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountMapManagerStatics):
        Array<IWebAccountMapManagerStatics?> = (elements as
        Array<IWebAccountMapManagerStatics?>).castToImpl<IWebAccountMapManagerStatics,IWebAccountMapManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountMapManagerStatics?> =
        arrayOfNulls<IWebAccountMapManagerStatics_Impl>(size) as
        Array<IWebAccountMapManagerStatics?>
  }
}
