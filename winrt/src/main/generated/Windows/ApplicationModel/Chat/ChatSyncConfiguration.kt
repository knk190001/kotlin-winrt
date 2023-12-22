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

@ABIMarker(ChatSyncConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatSyncConfiguration;{09f869b2-69f4-4aff-82b6-06992ff402d2})")
@WinRTByReference(brClass = ChatSyncConfiguration.ByReference::class)
public class ChatSyncConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatSyncConfiguration.WithDefault, IWinRTObject {
  private val __1440845188_Interface: IChatSyncConfiguration.WithDefault by lazy {
    as_1440845188()
  }


  public override val __1440845188_Ptr: JNAPointer? by lazy {
    __1440845188_Interface.__1440845188_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1440845188_Interface)

  private fun as_1440845188(): IChatSyncConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IChatSyncConfiguration.ABI.makeIChatSyncConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatSyncConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatSyncConfiguration.ABI.makeIChatSyncConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatSyncConfiguration> {
    public override fun getValue() = ChatSyncConfiguration(pointer.getPointer(0))

    public fun setValue(value: ChatSyncConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatSyncConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatSyncConfiguration {
      val address = segment.toRawLongValue()
      return ChatSyncConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ChatSyncConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
