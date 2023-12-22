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

@ABIMarker(ChatMessageChangeTracker.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageChangeTracker;{60b7f066-70a0-5224-508c-242ef7c1d06f})")
@WinRTByReference(brClass = ChatMessageChangeTracker.ByReference::class)
public class ChatMessageChangeTracker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageChangeTracker.WithDefault, IWinRTObject {
  private val __497054560_Interface: IChatMessageChangeTracker.WithDefault by lazy {
    as_497054560()
  }


  public override val __497054560_Ptr: JNAPointer? by lazy {
    __497054560_Interface.__497054560_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__497054560_Interface)

  private fun as_497054560(): IChatMessageChangeTracker.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageChangeTracker.ABI.makeIChatMessageChangeTracker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageChangeTracker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageChangeTracker.ABI.makeIChatMessageChangeTracker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageChangeTracker> {
    public override fun getValue() = ChatMessageChangeTracker(pointer.getPointer(0))

    public fun setValue(value: ChatMessageChangeTracker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageChangeTracker, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageChangeTracker {
      val address = segment.toRawLongValue()
      return ChatMessageChangeTracker(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageChangeTracker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
