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

@ABIMarker(ChatMessageChange.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageChange;{1c18c355-421e-54b8-6d38-6b3a6c82fccc})")
@WinRTByReference(brClass = ChatMessageChange.ByReference::class)
public class ChatMessageChange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageChange.WithDefault, IWinRTObject {
  private val __1436846968_Interface: IChatMessageChange.WithDefault by lazy {
    as_1436846968()
  }


  public override val __1436846968_Ptr: JNAPointer? by lazy {
    __1436846968_Interface.__1436846968_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1436846968_Interface)

  private fun as_1436846968(): IChatMessageChange.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageChange.ABI.makeIChatMessageChange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageChange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageChange.ABI.makeIChatMessageChange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageChange> {
    public override fun getValue() = ChatMessageChange(pointer.getPointer(0))

    public fun setValue(value: ChatMessageChange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageChange, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageChange {
      val address = segment.toRawLongValue()
      return ChatMessageChange(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
