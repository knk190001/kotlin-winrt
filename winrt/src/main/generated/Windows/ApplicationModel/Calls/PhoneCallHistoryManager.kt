package Windows.ApplicationModel.Calls

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneCallHistoryManager.ABI::class)
@WinRTByReference(brClass = PhoneCallHistoryManager.ByReference::class)
public class PhoneCallHistoryManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryManager> {
    public override fun getValue() = PhoneCallHistoryManager(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryManager, MemoryAddress> {
    public val IPhoneCallHistoryManagerStatics2_Instance: IPhoneCallHistoryManagerStatics2 by lazy {
      createIPhoneCallHistoryManagerStatics2()
    }


    public val IPhoneCallHistoryManagerStatics_Instance: IPhoneCallHistoryManagerStatics by lazy {
      createIPhoneCallHistoryManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneCallHistoryManagerStatics2(): IPhoneCallHistoryManagerStatics2 {
      val refiid = Guid.REFIID(IPhoneCallHistoryManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryManager".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneCallHistoryManagerStatics2.ABI.makeIPhoneCallHistoryManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIPhoneCallHistoryManagerStatics(): IPhoneCallHistoryManagerStatics {
      val refiid = Guid.REFIID(IPhoneCallHistoryManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryManager".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneCallHistoryManagerStatics.ABI.makeIPhoneCallHistoryManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryManager {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryManager(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) =
        ABI.IPhoneCallHistoryManagerStatics2_Instance.GetForUser(user)

    public fun RequestStoreAsync(accessType: PhoneCallHistoryStoreAccessType) =
        ABI.IPhoneCallHistoryManagerStatics_Instance.RequestStoreAsync(accessType)
  }
}
