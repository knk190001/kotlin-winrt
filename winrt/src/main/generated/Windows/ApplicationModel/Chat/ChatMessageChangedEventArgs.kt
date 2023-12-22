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

@ABIMarker(ChatMessageChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageChangedEventArgs;{b6b73e2d-691c-4edf-8660-6eb9896892e3})")
@WinRTByReference(brClass = ChatMessageChangedEventArgs.ByReference::class)
public class ChatMessageChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageChangedEventArgs.WithDefault, IWinRTObject {
  private val __1994375179_Interface: IChatMessageChangedEventArgs.WithDefault by lazy {
    as_1994375179()
  }


  public override val __1994375179_Ptr: JNAPointer? by lazy {
    __1994375179_Interface.__1994375179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1994375179_Interface)

  private fun as_1994375179(): IChatMessageChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageChangedEventArgs.ABI.makeIChatMessageChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageChangedEventArgs.ABI.makeIChatMessageChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageChangedEventArgs> {
    public override fun getValue() = ChatMessageChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ChatMessageChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageChangedEventArgs {
      val address = segment.toRawLongValue()
      return ChatMessageChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
