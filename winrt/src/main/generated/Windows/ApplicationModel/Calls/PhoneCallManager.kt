package Windows.ApplicationModel.Calls

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(PhoneCallManager.ABI::class)
@WinRTByReference(brClass = PhoneCallManager.ByReference::class)
public class PhoneCallManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallManager> {
    public override fun getValue() = PhoneCallManager(pointer.getPointer(0))

    public fun setValue(value: PhoneCallManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallManager, MemoryAddress> {
    public val IPhoneCallManagerStatics_Instance: IPhoneCallManagerStatics by lazy {
      createIPhoneCallManagerStatics()
    }


    public val IPhoneCallManagerStatics2_Instance: IPhoneCallManagerStatics2 by lazy {
      createIPhoneCallManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneCallManagerStatics(): IPhoneCallManagerStatics {
      val refiid = Guid.REFIID(IPhoneCallManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallManager".toHandle(),refiid,interfacePtr)
      val result = IPhoneCallManagerStatics.ABI.makeIPhoneCallManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIPhoneCallManagerStatics2(): IPhoneCallManagerStatics2 {
      val refiid = Guid.REFIID(IPhoneCallManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallManager".toHandle(),refiid,interfacePtr)
      val result = IPhoneCallManagerStatics2.ABI.makeIPhoneCallManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCallManager {
      val address = segment.toRawLongValue()
      return PhoneCallManager(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ShowPhoneCallUI(phoneNumber: String, displayName: String) =
        ABI.IPhoneCallManagerStatics_Instance.ShowPhoneCallUI(phoneNumber, displayName)

    public fun add_CallStateChanged(handler: EventHandler<IUnknown?>) =
        ABI.IPhoneCallManagerStatics2_Instance.add_CallStateChanged(handler)

    public fun remove_CallStateChanged(token: EventRegistrationToken) =
        ABI.IPhoneCallManagerStatics2_Instance.remove_CallStateChanged(token)

    public fun get_IsCallActive() = ABI.IPhoneCallManagerStatics2_Instance.get_IsCallActive()

    public fun get_IsCallIncoming() = ABI.IPhoneCallManagerStatics2_Instance.get_IsCallIncoming()

    public fun ShowPhoneCallSettingsUI() =
        ABI.IPhoneCallManagerStatics2_Instance.ShowPhoneCallSettingsUI()

    public fun RequestStoreAsync() = ABI.IPhoneCallManagerStatics2_Instance.RequestStoreAsync()
  }
}
