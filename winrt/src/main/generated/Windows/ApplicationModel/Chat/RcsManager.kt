package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsManager.ABI::class)
@WinRTByReference(brClass = RcsManager.ByReference::class)
public class RcsManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RcsManager> {
    public override fun getValue() = RcsManager(pointer.getPointer(0))

    public fun setValue(value: RcsManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsManager, MemoryAddress> {
    public val IRcsManagerStatics2_Instance: IRcsManagerStatics2 by lazy {
      createIRcsManagerStatics2()
    }


    public val IRcsManagerStatics_Instance: IRcsManagerStatics by lazy {
      createIRcsManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRcsManagerStatics2(): IRcsManagerStatics2 {
      val refiid = Guid.REFIID(IRcsManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.RcsManager".toHandle(),refiid,interfacePtr)
      val result = IRcsManagerStatics2.ABI.makeIRcsManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIRcsManagerStatics(): IRcsManagerStatics {
      val refiid = Guid.REFIID(IRcsManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.RcsManager".toHandle(),refiid,interfacePtr)
      val result = IRcsManagerStatics.ABI.makeIRcsManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RcsManager {
      val address = segment.toRawLongValue()
      return RcsManager(Pointer(address))
    }

    public override fun toNative(obj: RcsManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun add_TransportListChanged(handler: EventHandler<IUnknown?>) =
        ABI.IRcsManagerStatics2_Instance.add_TransportListChanged(handler)

    public fun remove_TransportListChanged(token: EventRegistrationToken) =
        ABI.IRcsManagerStatics2_Instance.remove_TransportListChanged(token)

    public fun GetEndUserMessageManager() =
        ABI.IRcsManagerStatics_Instance.GetEndUserMessageManager()

    public fun GetTransportsAsync() = ABI.IRcsManagerStatics_Instance.GetTransportsAsync()

    public fun GetTransportAsync(transportId: String) =
        ABI.IRcsManagerStatics_Instance.GetTransportAsync(transportId)

    public fun LeaveConversationAsync(conversation: ChatConversation) =
        ABI.IRcsManagerStatics_Instance.LeaveConversationAsync(conversation)
  }
}
