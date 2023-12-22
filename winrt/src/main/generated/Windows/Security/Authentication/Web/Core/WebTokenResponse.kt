package Windows.Security.Authentication.Web.Core

import Windows.Security.Credentials.WebAccount
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(WebTokenResponse.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebTokenResponse;{67a7c5ca-83f6-44c6-a3b1-0eb69e41fa8a})")
@WinRTByReference(brClass = WebTokenResponse.ByReference::class)
public class WebTokenResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebTokenResponse.WithDefault, IWinRTObject {
  private val __1247402013_Interface: IWebTokenResponse.WithDefault by lazy {
    as_1247402013()
  }


  public override val __1247402013_Ptr: JNAPointer? by lazy {
    __1247402013_Interface.__1247402013_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1247402013_Interface)

  public constructor() : this(ABI.activate())

  public constructor(token: String) : this(ABI.activate(token))

  public constructor(token: String, webAccount: WebAccount) : this(ABI.activate(token, webAccount))

  public constructor(
    token: String,
    webAccount: WebAccount,
    error: WebProviderError
  ) : this(ABI.activate(token, webAccount, error))

  private fun as_1247402013(): IWebTokenResponse.WithDefault {
    if(pointer == NULL) {
      return(IWebTokenResponse.ABI.makeIWebTokenResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebTokenResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebTokenResponse.ABI.makeIWebTokenResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebTokenResponse> {
    public override fun getValue() = WebTokenResponse(pointer.getPointer(0))

    public fun setValue(value: WebTokenResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebTokenResponse, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWebTokenResponseFactory_Instance: IWebTokenResponseFactory by lazy {
      createIWebTokenResponseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebTokenResponse".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIWebTokenResponseFactory(): IWebTokenResponseFactory {
      val refiid = Guid.REFIID(IWebTokenResponseFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebTokenResponse".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebTokenResponseFactory.ABI.makeIWebTokenResponseFactory(factoryActivatorPtr.value))
    }

    public fun activate(token: String): JNAPointer? =
        IWebTokenResponseFactory_Instance.CreateWithToken(token)?.pointer

    public fun activate(token: String, webAccount: WebAccount): JNAPointer? =
        IWebTokenResponseFactory_Instance.CreateWithTokenAndAccount(token, webAccount)?.pointer

    public fun activate(
      token: String,
      webAccount: WebAccount,
      error: WebProviderError
    ): JNAPointer? = IWebTokenResponseFactory_Instance.CreateWithTokenAccountAndError(token,
        webAccount, error)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebTokenResponse {
      val address = segment.toRawLongValue()
      return WebTokenResponse(Pointer(address))
    }

    public override fun toNative(obj: WebTokenResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
