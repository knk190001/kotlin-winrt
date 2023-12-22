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

@ABIMarker(ChatConversationReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatConversationReader;{055136d2-de32-4a47-a93a-b3dc0833852b})")
@WinRTByReference(brClass = ChatConversationReader.ByReference::class)
public class ChatConversationReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatConversationReader.WithDefault, IWinRTObject {
  private val __681011941_Interface: IChatConversationReader.WithDefault by lazy {
    as_681011941()
  }


  public override val __681011941_Ptr: JNAPointer? by lazy {
    __681011941_Interface.__681011941_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__681011941_Interface)

  private fun as_681011941(): IChatConversationReader.WithDefault {
    if(pointer == NULL) {
      return(IChatConversationReader.ABI.makeIChatConversationReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatConversationReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatConversationReader.ABI.makeIChatConversationReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatConversationReader> {
    public override fun getValue() = ChatConversationReader(pointer.getPointer(0))

    public fun setValue(value: ChatConversationReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatConversationReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatConversationReader {
      val address = segment.toRawLongValue()
      return ChatConversationReader(Pointer(address))
    }

    public override fun toNative(obj: ChatConversationReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
