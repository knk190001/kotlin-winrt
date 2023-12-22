package Windows.Security.Authentication.Web

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebAuthenticationBroker.ABI::class)
@WinRTByReference(brClass = WebAuthenticationBroker.ByReference::class)
public class WebAuthenticationBroker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebAuthenticationBroker> {
    public override fun getValue() = WebAuthenticationBroker(pointer.getPointer(0))

    public fun setValue(value: WebAuthenticationBroker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAuthenticationBroker, MemoryAddress> {
    public val IWebAuthenticationBrokerStatics2_Instance: IWebAuthenticationBrokerStatics2 by lazy {
      createIWebAuthenticationBrokerStatics2()
    }


    public val IWebAuthenticationBrokerStatics_Instance: IWebAuthenticationBrokerStatics by lazy {
      createIWebAuthenticationBrokerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAuthenticationBrokerStatics2(): IWebAuthenticationBrokerStatics2 {
      val refiid = Guid.REFIID(IWebAuthenticationBrokerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.WebAuthenticationBroker".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationBrokerStatics2.ABI.makeIWebAuthenticationBrokerStatics2(interfacePtr.value)
      return result
    }

    public fun createIWebAuthenticationBrokerStatics(): IWebAuthenticationBrokerStatics {
      val refiid = Guid.REFIID(IWebAuthenticationBrokerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Web.WebAuthenticationBroker".toHandle(),refiid,interfacePtr)
      val result =
          IWebAuthenticationBrokerStatics.ABI.makeIWebAuthenticationBrokerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WebAuthenticationBroker {
      val address = segment.toRawLongValue()
      return WebAuthenticationBroker(Pointer(address))
    }

    public override fun toNative(obj: WebAuthenticationBroker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun AuthenticateAndContinue(requestUri: Uri) =
        ABI.IWebAuthenticationBrokerStatics2_Instance.AuthenticateAndContinue(requestUri)

    public fun AuthenticateAndContinue(requestUri: Uri, callbackUri: Uri) =
        ABI.IWebAuthenticationBrokerStatics2_Instance.AuthenticateAndContinue(requestUri,
        callbackUri)

    public fun AuthenticateAndContinue(
      requestUri: Uri,
      callbackUri: Uri,
      continuationData: ValueSet,
      options: WebAuthenticationOptions
    ) = ABI.IWebAuthenticationBrokerStatics2_Instance.AuthenticateAndContinue(requestUri,
        callbackUri, continuationData, options)

    public fun AuthenticateSilentlyAsync(requestUri: Uri) =
        ABI.IWebAuthenticationBrokerStatics2_Instance.AuthenticateSilentlyAsync(requestUri)

    public fun AuthenticateSilentlyAsync(requestUri: Uri, options: WebAuthenticationOptions) =
        ABI.IWebAuthenticationBrokerStatics2_Instance.AuthenticateSilentlyAsync(requestUri, options)

    public fun AuthenticateAsync(
      options: WebAuthenticationOptions,
      requestUri: Uri,
      callbackUri: Uri
    ) = ABI.IWebAuthenticationBrokerStatics_Instance.AuthenticateAsync(options, requestUri,
        callbackUri)

    public fun AuthenticateAsync(options: WebAuthenticationOptions, requestUri: Uri) =
        ABI.IWebAuthenticationBrokerStatics_Instance.AuthenticateAsync(options, requestUri)

    public fun GetCurrentApplicationCallbackUri() =
        ABI.IWebAuthenticationBrokerStatics_Instance.GetCurrentApplicationCallbackUri()
  }
}
