package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IIterable
import Windows.Security.Credentials.WebAccount
import Windows.Security.Credentials.WebAccountProvider
import Windows.System.User
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

@ABIMarker(WebAuthenticationCoreManager.ABI::class)
@WinRTByReference(brClass = WebAuthenticationCoreManager.ByReference::class)
public class WebAuthenticationCoreManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAuthenticationCoreManager> {
    public override fun getValue() = WebAuthenticationCoreManager(pointer.getPointer(0))

    public fun setValue(value: WebAuthenticationCoreManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAuthenticationCoreManager, MemoryAddress> {
    public val IWebAuthenticationCoreManagerStatics3_Instance: IWebAuthenticationCoreManagerStatics3
        by lazy {
      createIWebAuthenticationCoreManagerStatics3()
    }


    public val IWebAuthenticationCoreManagerStatics4_Instance: IWebAuthenticationCoreManagerStatics4
        by lazy {
      createIWebAuthenticationCoreManagerStatics4()
    }


    public val IWebAuthenticationCoreManagerStatics_Instance: IWebAuthenticationCoreManagerStatics
        by lazy {
      createIWebAuthenticationCoreManagerStatics()
    }


    public val IWebAuthenticationCoreManagerStatics2_Instance: IWebAuthenticationCoreManagerStatics2
        by lazy {
      createIWebAuthenticationCoreManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAuthenticationCoreManagerStatics3():
        IWebAuthenticationCoreManagerStatics3 {
      val refiid = Guid.REFIID(IWebAuthenticationCoreManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationCoreManagerStatics3.ABI.makeIWebAuthenticationCoreManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIWebAuthenticationCoreManagerStatics4():
        IWebAuthenticationCoreManagerStatics4 {
      val refiid = Guid.REFIID(IWebAuthenticationCoreManagerStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationCoreManagerStatics4.ABI.makeIWebAuthenticationCoreManagerStatics4(interfacePtr.value)
      return result
    }

    public fun createIWebAuthenticationCoreManagerStatics(): IWebAuthenticationCoreManagerStatics {
      val refiid = Guid.REFIID(IWebAuthenticationCoreManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationCoreManagerStatics.ABI.makeIWebAuthenticationCoreManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIWebAuthenticationCoreManagerStatics2():
        IWebAuthenticationCoreManagerStatics2 {
      val refiid = Guid.REFIID(IWebAuthenticationCoreManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationCoreManagerStatics2.ABI.makeIWebAuthenticationCoreManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebAuthenticationCoreManager {
      val address = segment.toRawLongValue()
      return WebAuthenticationCoreManager(Pointer(address))
    }

    public override fun toNative(obj: WebAuthenticationCoreManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWebAccountMonitor(webAccounts: IIterable<WebAccount?>) =
        ABI.IWebAuthenticationCoreManagerStatics3_Instance.CreateWebAccountMonitor(webAccounts)

    public fun FindAllAccountsAsync(provider: WebAccountProvider) =
        ABI.IWebAuthenticationCoreManagerStatics4_Instance.FindAllAccountsAsync(provider)

    public fun FindAllAccountsAsync(provider: WebAccountProvider, clientId: String) =
        ABI.IWebAuthenticationCoreManagerStatics4_Instance.FindAllAccountsAsync(provider, clientId)

    public fun FindSystemAccountProviderAsync(webAccountProviderId: String) =
        ABI.IWebAuthenticationCoreManagerStatics4_Instance.FindSystemAccountProviderAsync(webAccountProviderId)

    public fun FindSystemAccountProviderAsync(webAccountProviderId: String, authority: String) =
        ABI.IWebAuthenticationCoreManagerStatics4_Instance.FindSystemAccountProviderAsync(webAccountProviderId,
        authority)

    public fun FindSystemAccountProviderAsync(
      webAccountProviderId: String,
      authority: String,
      user: User
    ) =
        ABI.IWebAuthenticationCoreManagerStatics4_Instance.FindSystemAccountProviderAsync(webAccountProviderId,
        authority, user)

    public fun GetTokenSilentlyAsync(request: WebTokenRequest) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.GetTokenSilentlyAsync(request)

    public fun GetTokenSilentlyAsync(request: WebTokenRequest, webAccount: WebAccount) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.GetTokenSilentlyAsync(request, webAccount)

    public fun RequestTokenAsync(request: WebTokenRequest) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.RequestTokenAsync(request)

    public fun RequestTokenAsync(request: WebTokenRequest, webAccount: WebAccount) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.RequestTokenAsync(request, webAccount)

    public fun FindAccountAsync(provider: WebAccountProvider, webAccountId: String) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.FindAccountAsync(provider, webAccountId)

    public fun FindAccountProviderAsync(webAccountProviderId: String) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.FindAccountProviderAsync(webAccountProviderId)

    public fun FindAccountProviderAsync(webAccountProviderId: String, authority: String) =
        ABI.IWebAuthenticationCoreManagerStatics_Instance.FindAccountProviderAsync(webAccountProviderId,
        authority)

    public fun FindAccountProviderAsync(
      webAccountProviderId: String,
      authority: String,
      user: User
    ) =
        ABI.IWebAuthenticationCoreManagerStatics2_Instance.FindAccountProviderAsync(webAccountProviderId,
        authority, user)
  }
}
