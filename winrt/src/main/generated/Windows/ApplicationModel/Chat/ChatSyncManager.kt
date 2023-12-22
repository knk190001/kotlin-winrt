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

@ABIMarker(ChatSyncManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatSyncManager;{7ba52c63-2650-486f-b4b4-6bd9d3d63c84})")
@WinRTByReference(brClass = ChatSyncManager.ByReference::class)
public class ChatSyncManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatSyncManager.WithDefault, IWinRTObject {
  private val __1106630221_Interface: IChatSyncManager.WithDefault by lazy {
    as_1106630221()
  }


  public override val __1106630221_Ptr: JNAPointer? by lazy {
    __1106630221_Interface.__1106630221_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1106630221_Interface)

  private fun as_1106630221(): IChatSyncManager.WithDefault {
    if(pointer == NULL) {
      return(IChatSyncManager.ABI.makeIChatSyncManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatSyncManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatSyncManager.ABI.makeIChatSyncManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatSyncManager> {
    public override fun getValue() = ChatSyncManager(pointer.getPointer(0))

    public fun setValue(value: ChatSyncManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatSyncManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatSyncManager {
      val address = segment.toRawLongValue()
      return ChatSyncManager(Pointer(address))
    }

    public override fun toNative(obj: ChatSyncManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
