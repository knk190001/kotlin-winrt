package Windows.ApplicationModel.Chat

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ChatMessageBlocking.ABI::class)
@WinRTByReference(brClass = ChatMessageBlocking.ByReference::class)
public class ChatMessageBlocking(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageBlocking> {
    public override fun getValue() = ChatMessageBlocking(pointer.getPointer(0))

    public fun setValue(value: ChatMessageBlocking): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageBlocking, MemoryAddress> {
    public val IChatMessageBlockingStatic_Instance: IChatMessageBlockingStatic by lazy {
      createIChatMessageBlockingStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIChatMessageBlockingStatic(): IChatMessageBlockingStatic {
      val refiid = Guid.REFIID(IChatMessageBlockingStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessageBlocking".toHandle(),refiid,interfacePtr)
      val result = IChatMessageBlockingStatic.ABI.makeIChatMessageBlockingStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ChatMessageBlocking {
      val address = segment.toRawLongValue()
      return ChatMessageBlocking(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageBlocking): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun MarkMessageAsBlockedAsync(localChatMessageId: String, blocked: Boolean) =
        ABI.IChatMessageBlockingStatic_Instance.MarkMessageAsBlockedAsync(localChatMessageId,
        blocked)
  }
}
