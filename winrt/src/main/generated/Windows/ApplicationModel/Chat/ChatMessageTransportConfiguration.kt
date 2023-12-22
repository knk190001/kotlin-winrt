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

@ABIMarker(ChatMessageTransportConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration;{879ff725-1a08-4aca-a075-3355126312e6})")
@WinRTByReference(brClass = ChatMessageTransportConfiguration.ByReference::class)
public class ChatMessageTransportConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageTransportConfiguration.WithDefault, IWinRTObject {
  private val __2129444843_Interface: IChatMessageTransportConfiguration.WithDefault by lazy {
    as_2129444843()
  }


  public override val __2129444843_Ptr: JNAPointer? by lazy {
    __2129444843_Interface.__2129444843_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129444843_Interface)

  private fun as_2129444843(): IChatMessageTransportConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageTransportConfiguration.ABI.makeIChatMessageTransportConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageTransportConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageTransportConfiguration.ABI.makeIChatMessageTransportConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageTransportConfiguration> {
    public override fun getValue() = ChatMessageTransportConfiguration(pointer.getPointer(0))

    public fun setValue(value: ChatMessageTransportConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageTransportConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageTransportConfiguration {
      val address = segment.toRawLongValue()
      return ChatMessageTransportConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageTransportConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
