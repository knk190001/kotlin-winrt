package Windows.ApplicationModel.CommunicationBlocking

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(CommunicationBlockingAccessManager.ABI::class)
@WinRTByReference(brClass = CommunicationBlockingAccessManager.ByReference::class)
public class CommunicationBlockingAccessManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommunicationBlockingAccessManager> {
    public override fun getValue() = CommunicationBlockingAccessManager(pointer.getPointer(0))

    public fun setValue(value: CommunicationBlockingAccessManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommunicationBlockingAccessManager, MemoryAddress> {
    public val ICommunicationBlockingAccessManagerStatics_Instance:
        ICommunicationBlockingAccessManagerStatics by lazy {
      createICommunicationBlockingAccessManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommunicationBlockingAccessManagerStatics():
        ICommunicationBlockingAccessManagerStatics {
      val refiid = Guid.REFIID(ICommunicationBlockingAccessManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.CommunicationBlocking.CommunicationBlockingAccessManager".toHandle(),refiid,interfacePtr)
      val result =
          ICommunicationBlockingAccessManagerStatics.ABI.makeICommunicationBlockingAccessManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CommunicationBlockingAccessManager {
      val address = segment.toRawLongValue()
      return CommunicationBlockingAccessManager(Pointer(address))
    }

    public override fun toNative(obj: CommunicationBlockingAccessManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsBlockingActive() =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.get_IsBlockingActive()

    public fun IsBlockedNumberAsync(number: String) =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.IsBlockedNumberAsync(number)

    public fun ShowBlockNumbersUI(phoneNumbers: IIterable<String?>) =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.ShowBlockNumbersUI(phoneNumbers)

    public fun ShowUnblockNumbersUI(phoneNumbers: IIterable<String?>) =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.ShowUnblockNumbersUI(phoneNumbers)

    public fun ShowBlockedCallsUI() =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.ShowBlockedCallsUI()

    public fun ShowBlockedMessagesUI() =
        ABI.ICommunicationBlockingAccessManagerStatics_Instance.ShowBlockedMessagesUI()
  }
}
