package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
import Windows.Security.Credentials.WebAccount
import Windows.Storage.Streams.IRandomAccessStream
import Windows.System.User
import Windows.Web.Http.HttpCookie
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebAccountManager.ABI::class)
@WinRTByReference(brClass = WebAccountManager.ByReference::class)
public class WebAccountManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAccountManager> {
    public override fun getValue() = WebAccountManager(pointer.getPointer(0))

    public fun setValue(value: WebAccountManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccountManager, MemoryAddress> {
    public val IWebAccountManagerStatics_Instance: IWebAccountManagerStatics by lazy {
      createIWebAccountManagerStatics()
    }


    public val IWebAccountScopeManagerStatics_Instance: IWebAccountScopeManagerStatics by lazy {
      createIWebAccountScopeManagerStatics()
    }


    public val IWebAccountManagerStatics3_Instance: IWebAccountManagerStatics3 by lazy {
      createIWebAccountManagerStatics3()
    }


    public val IWebAccountManagerStatics2_Instance: IWebAccountManagerStatics2 by lazy {
      createIWebAccountManagerStatics2()
    }


    public val IWebAccountManagerStatics4_Instance: IWebAccountManagerStatics4 by lazy {
      createIWebAccountManagerStatics4()
    }


    public val IWebAccountMapManagerStatics_Instance: IWebAccountMapManagerStatics by lazy {
      createIWebAccountMapManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAccountManagerStatics(): IWebAccountManagerStatics {
      val refiid = Guid.REFIID(IWebAccountManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result = IWebAccountManagerStatics.ABI.makeIWebAccountManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIWebAccountScopeManagerStatics(): IWebAccountScopeManagerStatics {
      val refiid = Guid.REFIID(IWebAccountScopeManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAccountScopeManagerStatics.ABI.makeIWebAccountScopeManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIWebAccountManagerStatics3(): IWebAccountManagerStatics3 {
      val refiid = Guid.REFIID(IWebAccountManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result = IWebAccountManagerStatics3.ABI.makeIWebAccountManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIWebAccountManagerStatics2(): IWebAccountManagerStatics2 {
      val refiid = Guid.REFIID(IWebAccountManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result = IWebAccountManagerStatics2.ABI.makeIWebAccountManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIWebAccountManagerStatics4(): IWebAccountManagerStatics4 {
      val refiid = Guid.REFIID(IWebAccountManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result = IWebAccountManagerStatics4.ABI.makeIWebAccountManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIWebAccountMapManagerStatics(): IWebAccountMapManagerStatics {
      val refiid = Guid.REFIID(IWebAccountMapManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebAccountManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAccountMapManagerStatics.ABI.makeIWebAccountMapManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebAccountManager {
      val address = segment.toRawLongValue()
      return WebAccountManager(Pointer(address))
    }

    public override fun toNative(obj: WebAccountManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun UpdateWebAccountPropertiesAsync(
      webAccount: WebAccount,
      webAccountUserName: String,
      additionalProperties: IMapView<String?, String?>
    ) = ABI.IWebAccountManagerStatics_Instance.UpdateWebAccountPropertiesAsync(webAccount,
        webAccountUserName, additionalProperties)

    public fun AddWebAccountAsync(
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>
    ) = ABI.IWebAccountManagerStatics_Instance.AddWebAccountAsync(webAccountId, webAccountUserName,
        props)

    public fun DeleteWebAccountAsync(webAccount: WebAccount) =
        ABI.IWebAccountManagerStatics_Instance.DeleteWebAccountAsync(webAccount)

    public fun FindAllProviderWebAccountsAsync() =
        ABI.IWebAccountManagerStatics_Instance.FindAllProviderWebAccountsAsync()

    public fun PushCookiesAsync(uri: Uri, cookies: IVectorView<HttpCookie?>) =
        ABI.IWebAccountManagerStatics_Instance.PushCookiesAsync(uri, cookies)

    public fun SetViewAsync(webAccount: WebAccount, view: WebAccountClientView) =
        ABI.IWebAccountManagerStatics_Instance.SetViewAsync(webAccount, view)

    public fun ClearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri) =
        ABI.IWebAccountManagerStatics_Instance.ClearViewAsync(webAccount, applicationCallbackUri)

    public fun GetViewsAsync(webAccount: WebAccount) =
        ABI.IWebAccountManagerStatics_Instance.GetViewsAsync(webAccount)

    public fun SetWebAccountPictureAsync(webAccount: WebAccount,
        webAccountPicture: IRandomAccessStream) =
        ABI.IWebAccountManagerStatics_Instance.SetWebAccountPictureAsync(webAccount,
        webAccountPicture)

    public fun ClearWebAccountPictureAsync(webAccount: WebAccount) =
        ABI.IWebAccountManagerStatics_Instance.ClearWebAccountPictureAsync(webAccount)

    public fun AddWebAccountAsync(
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>,
      scope: WebAccountScope
    ) = ABI.IWebAccountScopeManagerStatics_Instance.AddWebAccountAsync(webAccountId,
        webAccountUserName, props, scope)

    public fun SetScopeAsync(webAccount: WebAccount, scope: WebAccountScope) =
        ABI.IWebAccountScopeManagerStatics_Instance.SetScopeAsync(webAccount, scope)

    public fun GetScope(webAccount: WebAccount) =
        ABI.IWebAccountScopeManagerStatics_Instance.GetScope(webAccount)

    public fun FindAllProviderWebAccountsForUserAsync(user: User) =
        ABI.IWebAccountManagerStatics3_Instance.FindAllProviderWebAccountsForUserAsync(user)

    public fun AddWebAccountForUserAsync(
      user: User,
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>
    ) = ABI.IWebAccountManagerStatics3_Instance.AddWebAccountForUserAsync(user, webAccountId,
        webAccountUserName, props)

    public fun AddWebAccountForUserAsync(
      user: User,
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>,
      scope: WebAccountScope
    ) = ABI.IWebAccountManagerStatics3_Instance.AddWebAccountForUserAsync(user, webAccountId,
        webAccountUserName, props, scope)

    public fun AddWebAccountForUserAsync(
      user: User,
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>,
      scope: WebAccountScope,
      perUserWebAccountId: String
    ) = ABI.IWebAccountManagerStatics3_Instance.AddWebAccountForUserAsync(user, webAccountId,
        webAccountUserName, props, scope, perUserWebAccountId)

    public fun PullCookiesAsync(uriString: String, callerPFN: String) =
        ABI.IWebAccountManagerStatics2_Instance.PullCookiesAsync(uriString, callerPFN)

    public fun InvalidateAppCacheForAllAccountsAsync() =
        ABI.IWebAccountManagerStatics4_Instance.InvalidateAppCacheForAllAccountsAsync()

    public fun InvalidateAppCacheForAccountAsync(webAccount: WebAccount) =
        ABI.IWebAccountManagerStatics4_Instance.InvalidateAppCacheForAccountAsync(webAccount)

    public fun AddWebAccountAsync(
      webAccountId: String,
      webAccountUserName: String,
      props: IMapView<String?, String?>,
      scope: WebAccountScope,
      perUserWebAccountId: String
    ) = ABI.IWebAccountMapManagerStatics_Instance.AddWebAccountAsync(webAccountId,
        webAccountUserName, props, scope, perUserWebAccountId)

    public fun SetPerAppToPerUserAccountAsync(perAppAccount: WebAccount,
        perUserWebAccountId: String) =
        ABI.IWebAccountMapManagerStatics_Instance.SetPerAppToPerUserAccountAsync(perAppAccount,
        perUserWebAccountId)

    public fun GetPerUserFromPerAppAccountAsync(perAppAccount: WebAccount) =
        ABI.IWebAccountMapManagerStatics_Instance.GetPerUserFromPerAppAccountAsync(perAppAccount)

    public fun ClearPerUserFromPerAppAccountAsync(perAppAccount: WebAccount) =
        ABI.IWebAccountMapManagerStatics_Instance.ClearPerUserFromPerAppAccountAsync(perAppAccount)
  }
}
