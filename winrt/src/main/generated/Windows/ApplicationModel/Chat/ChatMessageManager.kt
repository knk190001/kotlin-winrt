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

@ABIMarker(ChatMessageManager.ABI::class)
@WinRTByReference(brClass = ChatMessageManager.ByReference::class)
public class ChatMessageManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageManager> {
    public override fun getValue() = ChatMessageManager(pointer.getPointer(0))

    public fun setValue(value: ChatMessageManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageManager, MemoryAddress> {
    public val IChatMessageManagerStatics3_Instance: IChatMessageManagerStatics3 by lazy {
      createIChatMessageManagerStatics3()
    }


    public val IChatMessageManager2Statics_Instance: IChatMessageManager2Statics by lazy {
      createIChatMessageManager2Statics()
    }


    public val IChatMessageManagerStatic_Instance: IChatMessageManagerStatic by lazy {
      createIChatMessageManagerStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIChatMessageManagerStatics3(): IChatMessageManagerStatics3 {
      val refiid = Guid.REFIID(IChatMessageManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessageManager".toHandle(),refiid,interfacePtr)
      val result =
          IChatMessageManagerStatics3.ABI.makeIChatMessageManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIChatMessageManager2Statics(): IChatMessageManager2Statics {
      val refiid = Guid.REFIID(IChatMessageManager2Statics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessageManager".toHandle(),refiid,interfacePtr)
      val result =
          IChatMessageManager2Statics.ABI.makeIChatMessageManager2Statics(interfacePtr.value)
      return result
    }

    public fun createIChatMessageManagerStatic(): IChatMessageManagerStatic {
      val refiid = Guid.REFIID(IChatMessageManagerStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessageManager".toHandle(),refiid,interfacePtr)
      val result = IChatMessageManagerStatic.ABI.makeIChatMessageManagerStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ChatMessageManager {
      val address = segment.toRawLongValue()
      return ChatMessageManager(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestSyncManagerAsync() =
        ABI.IChatMessageManagerStatics3_Instance.RequestSyncManagerAsync()

    public fun RegisterTransportAsync() =
        ABI.IChatMessageManager2Statics_Instance.RegisterTransportAsync()

    public fun GetTransportAsync(transportId: String) =
        ABI.IChatMessageManager2Statics_Instance.GetTransportAsync(transportId)

    public fun GetTransportsAsync() = ABI.IChatMessageManagerStatic_Instance.GetTransportsAsync()

    public fun RequestStoreAsync() = ABI.IChatMessageManagerStatic_Instance.RequestStoreAsync()

    public fun ShowComposeSmsMessageAsync(message: ChatMessage) =
        ABI.IChatMessageManagerStatic_Instance.ShowComposeSmsMessageAsync(message)

    public fun ShowSmsSettings() = ABI.IChatMessageManagerStatic_Instance.ShowSmsSettings()
  }
}
