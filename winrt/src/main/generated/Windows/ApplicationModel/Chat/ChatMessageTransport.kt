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

@ABIMarker(ChatMessageTransport.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageTransport;{63a9dbf8-e6b3-5c9a-5f85-d47925b9bd18})")
@WinRTByReference(brClass = ChatMessageTransport.ByReference::class)
public class ChatMessageTransport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageTransport.WithDefault, IChatMessageTransport2.WithDefault,
    IWinRTObject {
  private val __1061751393_Interface: IChatMessageTransport.WithDefault by lazy {
    as_1061751393()
  }


  private val __1445445135_Interface: IChatMessageTransport2.WithDefault by lazy {
    as_1445445135()
  }


  public override val __1061751393_Ptr: JNAPointer? by lazy {
    __1061751393_Interface.__1061751393_Ptr
  }


  public override val __1445445135_Ptr: JNAPointer? by lazy {
    __1445445135_Interface.__1445445135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1061751393_Interface, __1445445135_Interface)

  private fun as_1061751393(): IChatMessageTransport.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageTransport.ABI.makeIChatMessageTransport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageTransport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageTransport.ABI.makeIChatMessageTransport(ref.value))
  }

  private fun as_1445445135(): IChatMessageTransport2.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageTransport2.ABI.makeIChatMessageTransport2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageTransport2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageTransport2.ABI.makeIChatMessageTransport2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageTransport> {
    public override fun getValue() = ChatMessageTransport(pointer.getPointer(0))

    public fun setValue(value: ChatMessageTransport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageTransport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageTransport {
      val address = segment.toRawLongValue()
      return ChatMessageTransport(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageTransport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
