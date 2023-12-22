package Windows.Security.Authentication.Web.Provider

import Windows.Security.Authentication.Web.Core.WebTokenResponse
import Windows.Security.Authentication.Web.Provider.IWebProviderTokenResponseFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebProviderTokenResponse.ABI::class)
@Signature("rc(Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse;{ef213793-ef55-4186-b7ce-8cb2e7f9849e})")
@WinRTByReference(brClass = WebProviderTokenResponse.ByReference::class)
public class WebProviderTokenResponse(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebProviderTokenResponse.WithDefault, IWinRTObject {
  private val __777687264_Interface: IWebProviderTokenResponse.WithDefault by lazy {
    as_777687264()
  }


  public override val __777687264_Ptr: JNAPointer? by lazy {
    __777687264_Interface.__777687264_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__777687264_Interface)

  public constructor(webTokenResponse: WebTokenResponse) : this(ABI.activate(webTokenResponse))

  private fun as_777687264(): IWebProviderTokenResponse.WithDefault {
    if(pointer == NULL) {
      return(IWebProviderTokenResponse.ABI.makeIWebProviderTokenResponse(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebProviderTokenResponse>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebProviderTokenResponse.ABI.makeIWebProviderTokenResponse(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebProviderTokenResponse> {
    public override fun getValue() = WebProviderTokenResponse(pointer.getPointer(0))

    public fun setValue(value: WebProviderTokenResponse): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebProviderTokenResponse, MemoryAddress> {
    public val IWebProviderTokenResponseFactory_Instance: IWebProviderTokenResponseFactory by lazy {
      createIWebProviderTokenResponseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebProviderTokenResponseFactory(): IWebProviderTokenResponseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebProviderTokenResponseFactory.ABI.makeIWebProviderTokenResponseFactory(factoryActivatorPtr.value))
    }

    public fun activate(webTokenResponse: WebTokenResponse): JNAPointer? =
        IWebProviderTokenResponseFactory_Instance.Create(webTokenResponse)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebProviderTokenResponse {
      val address = segment.toRawLongValue()
      return WebProviderTokenResponse(Pointer(address))
    }

    public override fun toNative(obj: WebProviderTokenResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
