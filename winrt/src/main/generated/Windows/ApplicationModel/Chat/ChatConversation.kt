package Windows.ApplicationModel.Chat

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

@ABIMarker(ChatConversation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatConversation;{a58c080d-1a6f-46dc-8f3d-f5028660b6ee})")
@WinRTByReference(brClass = ChatConversation.ByReference::class)
public class ChatConversation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatConversation.WithDefault, IChatConversation2.WithDefault,
    IChatItem.WithDefault, IWinRTObject {
  private val __20598658_Interface: IChatConversation.WithDefault by lazy {
    as_20598658()
  }


  private val __638558448_Interface: IChatConversation2.WithDefault by lazy {
    as_638558448()
  }


  private val __2120983278_Interface: IChatItem.WithDefault by lazy {
    as_2120983278()
  }


  public override val __20598658_Ptr: JNAPointer? by lazy {
    __20598658_Interface.__20598658_Ptr
  }


  public override val __638558448_Ptr: JNAPointer? by lazy {
    __638558448_Interface.__638558448_Ptr
  }


  public override val __2120983278_Ptr: JNAPointer? by lazy {
    __2120983278_Interface.__2120983278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__20598658_Interface, __638558448_Interface, __2120983278_Interface)

  private fun as_20598658(): IChatConversation.WithDefault {
    if(pointer == NULL) {
      return(IChatConversation.ABI.makeIChatConversation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatConversation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatConversation.ABI.makeIChatConversation(ref.value))
  }

  private fun as_638558448(): IChatConversation2.WithDefault {
    if(pointer == NULL) {
      return(IChatConversation2.ABI.makeIChatConversation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatConversation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatConversation2.ABI.makeIChatConversation2(ref.value))
  }

  private fun as_2120983278(): IChatItem.WithDefault {
    if(pointer == NULL) {
      return(IChatItem.ABI.makeIChatItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatItem.ABI.makeIChatItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatConversation> {
    public override fun getValue() = ChatConversation(pointer.getPointer(0))

    public fun setValue(value: ChatConversation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatConversation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatConversation {
      val address = segment.toRawLongValue()
      return ChatConversation(Pointer(address))
    }

    public override fun toNative(obj: ChatConversation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
