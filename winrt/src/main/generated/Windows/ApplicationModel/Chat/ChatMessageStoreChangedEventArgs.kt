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

@ABIMarker(ChatMessageStoreChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs;{65c66fac-fe8c-46d4-9119-57b8410311d5})")
@WinRTByReference(brClass = ChatMessageStoreChangedEventArgs.ByReference::class)
public class ChatMessageStoreChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageStoreChangedEventArgs.WithDefault, IWinRTObject {
  private val __857359236_Interface: IChatMessageStoreChangedEventArgs.WithDefault by lazy {
    as_857359236()
  }


  public override val __857359236_Ptr: JNAPointer? by lazy {
    __857359236_Interface.__857359236_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__857359236_Interface)

  private fun as_857359236(): IChatMessageStoreChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageStoreChangedEventArgs.ABI.makeIChatMessageStoreChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageStoreChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageStoreChangedEventArgs.ABI.makeIChatMessageStoreChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageStoreChangedEventArgs> {
    public override fun getValue() = ChatMessageStoreChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ChatMessageStoreChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageStoreChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageStoreChangedEventArgs {
      val address = segment.toRawLongValue()
      return ChatMessageStoreChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageStoreChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
