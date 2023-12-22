package Windows.ApplicationModel.Chat

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

@ABIMarker(ChatCapabilitiesManager.ABI::class)
@WinRTByReference(brClass = ChatCapabilitiesManager.ByReference::class)
public class ChatCapabilitiesManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatCapabilitiesManager> {
    public override fun getValue() = ChatCapabilitiesManager(pointer.getPointer(0))

    public fun setValue(value: ChatCapabilitiesManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatCapabilitiesManager, MemoryAddress> {
    public val IChatCapabilitiesManagerStatics2_Instance: IChatCapabilitiesManagerStatics2 by lazy {
      createIChatCapabilitiesManagerStatics2()
    }


    public val IChatCapabilitiesManagerStatics_Instance: IChatCapabilitiesManagerStatics by lazy {
      createIChatCapabilitiesManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIChatCapabilitiesManagerStatics2(): IChatCapabilitiesManagerStatics2 {
      val refiid = Guid.REFIID(IChatCapabilitiesManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatCapabilitiesManager".toHandle(),refiid,interfacePtr)
      val result =
          IChatCapabilitiesManagerStatics2.ABI.makeIChatCapabilitiesManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIChatCapabilitiesManagerStatics(): IChatCapabilitiesManagerStatics {
      val refiid = Guid.REFIID(IChatCapabilitiesManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatCapabilitiesManager".toHandle(),refiid,interfacePtr)
      val result =
          IChatCapabilitiesManagerStatics.ABI.makeIChatCapabilitiesManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ChatCapabilitiesManager {
      val address = segment.toRawLongValue()
      return ChatCapabilitiesManager(Pointer(address))
    }

    public override fun toNative(obj: ChatCapabilitiesManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCachedCapabilitiesAsync(address: String, transportId: String) =
        ABI.IChatCapabilitiesManagerStatics2_Instance.GetCachedCapabilitiesAsync(address,
        transportId)

    public fun GetCapabilitiesFromNetworkAsync(address: String, transportId: String) =
        ABI.IChatCapabilitiesManagerStatics2_Instance.GetCapabilitiesFromNetworkAsync(address,
        transportId)

    public fun GetCachedCapabilitiesAsync(address: String) =
        ABI.IChatCapabilitiesManagerStatics_Instance.GetCachedCapabilitiesAsync(address)

    public fun GetCapabilitiesFromNetworkAsync(address: String) =
        ABI.IChatCapabilitiesManagerStatics_Instance.GetCapabilitiesFromNetworkAsync(address)
  }
}
