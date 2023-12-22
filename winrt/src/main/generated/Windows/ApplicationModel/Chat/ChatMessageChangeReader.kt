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

@ABIMarker(ChatMessageChangeReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageChangeReader;{14267020-28ce-5f26-7b05-9a5c7cce87ca})")
@WinRTByReference(brClass = ChatMessageChangeReader.ByReference::class)
public class ChatMessageChangeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageChangeReader.WithDefault, IWinRTObject {
  private val __362391973_Interface: IChatMessageChangeReader.WithDefault by lazy {
    as_362391973()
  }


  public override val __362391973_Ptr: JNAPointer? by lazy {
    __362391973_Interface.__362391973_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__362391973_Interface)

  private fun as_362391973(): IChatMessageChangeReader.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageChangeReader.ABI.makeIChatMessageChangeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageChangeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageChangeReader.ABI.makeIChatMessageChangeReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageChangeReader> {
    public override fun getValue() = ChatMessageChangeReader(pointer.getPointer(0))

    public fun setValue(value: ChatMessageChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageChangeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageChangeReader {
      val address = segment.toRawLongValue()
      return ChatMessageChangeReader(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
