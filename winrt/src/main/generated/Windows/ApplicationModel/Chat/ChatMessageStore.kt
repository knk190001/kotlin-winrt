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

@ABIMarker(ChatMessageStore.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageStore;{31f2fd01-ccf6-580b-4976-0a07dd5d3b47})")
@WinRTByReference(brClass = ChatMessageStore.ByReference::class)
public class ChatMessageStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageStore.WithDefault, IChatMessageStore2.WithDefault,
    IChatMessageStore3.WithDefault, IWinRTObject {
  private val __2016712679_Interface: IChatMessageStore.WithDefault by lazy {
    as_2016712679()
  }


  private val __1906416441_Interface: IChatMessageStore2.WithDefault by lazy {
    as_1906416441()
  }


  private val __1906416442_Interface: IChatMessageStore3.WithDefault by lazy {
    as_1906416442()
  }


  public override val __2016712679_Ptr: JNAPointer? by lazy {
    __2016712679_Interface.__2016712679_Ptr
  }


  public override val __1906416441_Ptr: JNAPointer? by lazy {
    __1906416441_Interface.__1906416441_Ptr
  }


  public override val __1906416442_Ptr: JNAPointer? by lazy {
    __1906416442_Interface.__1906416442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2016712679_Interface, __1906416441_Interface, __1906416442_Interface)

  private fun as_2016712679(): IChatMessageStore.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageStore.ABI.makeIChatMessageStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageStore.ABI.makeIChatMessageStore(ref.value))
  }

  private fun as_1906416441(): IChatMessageStore2.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageStore2.ABI.makeIChatMessageStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageStore2.ABI.makeIChatMessageStore2(ref.value))
  }

  private fun as_1906416442(): IChatMessageStore3.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageStore3.ABI.makeIChatMessageStore3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageStore3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageStore3.ABI.makeIChatMessageStore3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageStore> {
    public override fun getValue() = ChatMessageStore(pointer.getPointer(0))

    public fun setValue(value: ChatMessageStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageStore {
      val address = segment.toRawLongValue()
      return ChatMessageStore(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
