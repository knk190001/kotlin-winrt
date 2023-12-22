package Windows.Security.Authentication.Web.Core

import Windows.Security.Authentication.Web.Core.IWebTokenRequestFactory.ABI.IID
import Windows.Security.Credentials.WebAccountProvider
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(WebTokenRequest.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Core.WebTokenRequest;{b77b4d68-adcb-4673-b364-0cf7b35caf97})")
@WinRTByReference(brClass = WebTokenRequest.ByReference::class)
public class WebTokenRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebTokenRequest.WithDefault, IWebTokenRequest2.WithDefault,
    IWebTokenRequest3.WithDefault, IWinRTObject {
  private val __180493651_Interface: IWebTokenRequest.WithDefault by lazy {
    as_180493651()
  }


  private val __1300335835_Interface: IWebTokenRequest2.WithDefault by lazy {
    as_1300335835()
  }


  private val __1300335834_Interface: IWebTokenRequest3.WithDefault by lazy {
    as_1300335834()
  }


  public override val __180493651_Ptr: JNAPointer? by lazy {
    __180493651_Interface.__180493651_Ptr
  }


  public override val __1300335835_Ptr: JNAPointer? by lazy {
    __1300335835_Interface.__1300335835_Ptr
  }


  public override val __1300335834_Ptr: JNAPointer? by lazy {
    __1300335834_Interface.__1300335834_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__180493651_Interface, __1300335835_Interface, __1300335834_Interface)

  public constructor(
    provider: WebAccountProvider,
    scope: String,
    clientId: String
  ) : this(ABI.activate(provider, scope, clientId))

  public constructor(
    provider: WebAccountProvider,
    scope: String,
    clientId: String,
    promptType: WebTokenRequestPromptType
  ) : this(ABI.activate(provider, scope, clientId, promptType))

  public constructor(provider: WebAccountProvider) : this(ABI.activate(provider))

  public constructor(provider: WebAccountProvider, scope: String) : this(ABI.activate(provider,
      scope))

  private fun as_180493651(): IWebTokenRequest.WithDefault {
    if(pointer == NULL) {
      return(IWebTokenRequest.ABI.makeIWebTokenRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebTokenRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebTokenRequest.ABI.makeIWebTokenRequest(ref.value))
  }

  private fun as_1300335835(): IWebTokenRequest2.WithDefault {
    if(pointer == NULL) {
      return(IWebTokenRequest2.ABI.makeIWebTokenRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebTokenRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebTokenRequest2.ABI.makeIWebTokenRequest2(ref.value))
  }

  private fun as_1300335834(): IWebTokenRequest3.WithDefault {
    if(pointer == NULL) {
      return(IWebTokenRequest3.ABI.makeIWebTokenRequest3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebTokenRequest3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebTokenRequest3.ABI.makeIWebTokenRequest3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebTokenRequest> {
    public override fun getValue() = WebTokenRequest(pointer.getPointer(0))

    public fun setValue(value: WebTokenRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebTokenRequest, MemoryAddress> {
    public val IWebTokenRequestFactory_Instance: IWebTokenRequestFactory by lazy {
      createIWebTokenRequestFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebTokenRequestFactory(): IWebTokenRequestFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Core.WebTokenRequest".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebTokenRequestFactory.ABI.makeIWebTokenRequestFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      provider: WebAccountProvider,
      scope: String,
      clientId: String
    ): JNAPointer? = IWebTokenRequestFactory_Instance.Create(provider, scope, clientId)?.pointer

    public fun activate(
      provider: WebAccountProvider,
      scope: String,
      clientId: String,
      promptType: WebTokenRequestPromptType
    ): JNAPointer? = IWebTokenRequestFactory_Instance.CreateWithPromptType(provider, scope,
        clientId, promptType)?.pointer

    public fun activate(provider: WebAccountProvider): JNAPointer? =
        IWebTokenRequestFactory_Instance.CreateWithProvider(provider)?.pointer

    public fun activate(provider: WebAccountProvider, scope: String): JNAPointer? =
        IWebTokenRequestFactory_Instance.CreateWithScope(provider, scope)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebTokenRequest {
      val address = segment.toRawLongValue()
      return WebTokenRequest(Pointer(address))
    }

    public override fun toNative(obj: WebTokenRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
