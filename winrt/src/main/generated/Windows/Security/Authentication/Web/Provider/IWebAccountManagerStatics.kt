package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Security.Credentials.WebAccount
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Web.Http.HttpCookie
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

@ABIMarker(IWebAccountManagerStatics.ABI::class)
@Signature("{b2e8e1a6-d49a-4032-84bf-1a2847747bf1}")
@Guid("b2e8e1a6d49a403284bf1a2847747bf1")
@WinRTInterface("b2e8e1a6d49a403284bf1a2847747bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountManagerStatics.ByReference::class)
public interface IWebAccountManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UpdateWebAccountPropertiesAsync(
    webAccount: WebAccount?,
    webAccountUserName: String?,
    additionalProperties: IMapView<String?, String?>?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun AddWebAccountAsync(
    webAccountId: String?,
    webAccountUserName: String?,
    props: IMapView<String?, String?>?
  ): IAsyncOperation<WebAccount?>?

  @InterfaceMethod(2)
  public fun DeleteWebAccountAsync(webAccount: WebAccount?): IAsyncAction?

  @InterfaceMethod(3)
  public fun FindAllProviderWebAccountsAsync(): IAsyncOperation<IVectorView<WebAccount?>?>?

  @InterfaceMethod(4)
  public fun PushCookiesAsync(uri: Uri?, cookies: IVectorView<HttpCookie?>?): IAsyncAction?

  @InterfaceMethod(5)
  public fun SetViewAsync(webAccount: WebAccount?, view: WebAccountClientView?): IAsyncAction?

  @InterfaceMethod(6)
  public fun ClearViewAsync(webAccount: WebAccount?, applicationCallbackUri: Uri?): IAsyncAction?

  @InterfaceMethod(7)
  public fun GetViewsAsync(webAccount: WebAccount?):
      IAsyncOperation<IVectorView<WebAccountClientView?>?>?

  @InterfaceMethod(8)
  public fun SetWebAccountPictureAsync(webAccount: WebAccount?,
      webAccountPicture: IRandomAccessStream?): IAsyncAction?

  @InterfaceMethod(9)
  public fun ClearWebAccountPictureAsync(webAccount: WebAccount?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountManagerStatics> {
    public override fun getValue() = ABI.makeIWebAccountManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWebAccountManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountManagerStatics {
    public val __1282395356_Ptr: Pointer?

    public val _1282395356_VtblPtr: Pointer?
      get() = __1282395356_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UpdateWebAccountPropertiesAsync(
      webAccount: WebAccount?,
      webAccountUserName: String?,
      additionalProperties: IMapView<String?, String?>?
    ): IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount),
          marshalToNative(webAccountUserName), marshalToNative(additionalProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddWebAccountAsync(
      webAccountId: String?,
      webAccountUserName: String?,
      props: IMapView<String?, String?>?
    ): IAsyncOperation<WebAccount?>? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccountId),
          marshalToNative(webAccountUserName), marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteWebAccountAsync(webAccount: WebAccount?): IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAllProviderWebAccountsAsync():
        IAsyncOperation<IVectorView<WebAccount?>?>? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WebAccount?>?>>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WebAccount?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun PushCookiesAsync(uri: Uri?, cookies: IVectorView<HttpCookie?>?):
        IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(uri), marshalToNative(cookies),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetViewAsync(webAccount: WebAccount?, view: WebAccountClientView?):
        IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount),
          marshalToNative(view), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ClearViewAsync(webAccount: WebAccount?, applicationCallbackUri: Uri?):
        IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount),
          marshalToNative(applicationCallbackUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetViewsAsync(webAccount: WebAccount?):
        IAsyncOperation<IVectorView<WebAccountClientView?>?>? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<WebAccountClientView?>?>>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<WebAccountClientView?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetWebAccountPictureAsync(webAccount: WebAccount?,
        webAccountPicture: IRandomAccessStream?): IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount),
          marshalToNative(webAccountPicture), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ClearWebAccountPictureAsync(webAccount: WebAccount?): IAsyncAction? {
      val fnPtr = _1282395356_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1282395356_Ptr, marshalToNative(webAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1282395356_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2e8e1a6d49a403284bf1a2847747bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountManagerStatics(ptr: Pointer?): WithDefault =
        IWebAccountManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWebAccountManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1282395356_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountManagerStatics):
        Array<IWebAccountManagerStatics?> = (elements as
        Array<IWebAccountManagerStatics?>).castToImpl<IWebAccountManagerStatics,IWebAccountManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountManagerStatics?> =
        arrayOfNulls<IWebAccountManagerStatics_Impl>(size) as Array<IWebAccountManagerStatics?>
  }
}
