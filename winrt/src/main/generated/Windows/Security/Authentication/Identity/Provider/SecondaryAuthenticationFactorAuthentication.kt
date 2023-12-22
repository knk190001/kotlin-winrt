package Windows.Security.Authentication.Identity.Provider

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(SecondaryAuthenticationFactorAuthentication.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthentication;{020a16e5-6a25-40a3-8c00-50a023f619d1})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthentication.ByReference::class)
public class SecondaryAuthenticationFactorAuthentication(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorAuthentication.WithDefault, IWinRTObject {
  private val __670576104_Interface: ISecondaryAuthenticationFactorAuthentication.WithDefault by
      lazy {
    as_670576104()
  }


  public override val __670576104_Ptr: JNAPointer? by lazy {
    __670576104_Interface.__670576104_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__670576104_Interface)

  private fun as_670576104(): ISecondaryAuthenticationFactorAuthentication.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorAuthentication.ABI.makeISecondaryAuthenticationFactorAuthentication(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorAuthentication>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorAuthentication.ABI.makeISecondaryAuthenticationFactorAuthentication(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorAuthentication> {
    public override fun getValue() =
        SecondaryAuthenticationFactorAuthentication(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorAuthentication): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthentication, MemoryAddress> {
    public val ISecondaryAuthenticationFactorAuthenticationStatics_Instance:
        ISecondaryAuthenticationFactorAuthenticationStatics by lazy {
      createISecondaryAuthenticationFactorAuthenticationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISecondaryAuthenticationFactorAuthenticationStatics():
        ISecondaryAuthenticationFactorAuthenticationStatics {
      val refiid = Guid.REFIID(ISecondaryAuthenticationFactorAuthenticationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthentication".toHandle(),refiid,interfacePtr)
      val result =
          ISecondaryAuthenticationFactorAuthenticationStatics.ABI.makeISecondaryAuthenticationFactorAuthenticationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorAuthentication {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorAuthentication(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthentication): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowNotificationMessageAsync(deviceName: String,
        message: SecondaryAuthenticationFactorAuthenticationMessage) =
        ABI.ISecondaryAuthenticationFactorAuthenticationStatics_Instance.ShowNotificationMessageAsync(deviceName,
        message)

    public fun StartAuthenticationAsync(deviceId: String, serviceAuthenticationNonce: IBuffer) =
        ABI.ISecondaryAuthenticationFactorAuthenticationStatics_Instance.StartAuthenticationAsync(deviceId,
        serviceAuthenticationNonce)

    public
        fun add_AuthenticationStageChanged(handler: EventHandler<SecondaryAuthenticationFactorAuthenticationStageChangedEventArgs?>)
        =
        ABI.ISecondaryAuthenticationFactorAuthenticationStatics_Instance.add_AuthenticationStageChanged(handler)

    public fun remove_AuthenticationStageChanged(token: EventRegistrationToken) =
        ABI.ISecondaryAuthenticationFactorAuthenticationStatics_Instance.remove_AuthenticationStageChanged(token)

    public fun GetAuthenticationStageInfoAsync() =
        ABI.ISecondaryAuthenticationFactorAuthenticationStatics_Instance.GetAuthenticationStageInfoAsync()
  }
}
