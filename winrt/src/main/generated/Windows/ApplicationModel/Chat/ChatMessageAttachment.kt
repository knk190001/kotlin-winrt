package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageAttachmentFactory.ABI.IID
import Windows.Storage.Streams.IRandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ChatMessageAttachment.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageAttachment;{c7c4fd74-bf63-58eb-508c-8b863ff16b67})")
@WinRTByReference(brClass = ChatMessageAttachment.ByReference::class)
public class ChatMessageAttachment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageAttachment.WithDefault, IChatMessageAttachment2.WithDefault,
    IWinRTObject {
  private val __1691112213_Interface: IChatMessageAttachment.WithDefault by lazy {
    as_1691112213()
  }


  private val __884871001_Interface: IChatMessageAttachment2.WithDefault by lazy {
    as_884871001()
  }


  public override val __1691112213_Ptr: JNAPointer? by lazy {
    __1691112213_Interface.__1691112213_Ptr
  }


  public override val __884871001_Ptr: JNAPointer? by lazy {
    __884871001_Interface.__884871001_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691112213_Interface, __884871001_Interface)

  public constructor(mimeType: String, dataStreamReference: IRandomAccessStreamReference) :
      this(ABI.activate(mimeType, dataStreamReference))

  private fun as_1691112213(): IChatMessageAttachment.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageAttachment.ABI.makeIChatMessageAttachment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageAttachment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageAttachment.ABI.makeIChatMessageAttachment(ref.value))
  }

  private fun as_884871001(): IChatMessageAttachment2.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageAttachment2.ABI.makeIChatMessageAttachment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageAttachment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageAttachment2.ABI.makeIChatMessageAttachment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageAttachment> {
    public override fun getValue() = ChatMessageAttachment(pointer.getPointer(0))

    public fun setValue(value: ChatMessageAttachment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageAttachment, MemoryAddress> {
    public val IChatMessageAttachmentFactory_Instance: IChatMessageAttachmentFactory by lazy {
      createIChatMessageAttachmentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIChatMessageAttachmentFactory(): IChatMessageAttachmentFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessageAttachment".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IChatMessageAttachmentFactory.ABI.makeIChatMessageAttachmentFactory(factoryActivatorPtr.value))
    }

    public fun activate(mimeType: String, dataStreamReference: IRandomAccessStreamReference):
        JNAPointer? = IChatMessageAttachmentFactory_Instance.CreateChatMessageAttachment(mimeType,
        dataStreamReference)?.pointer

    public override fun fromNative(segment: MemoryAddress): ChatMessageAttachment {
      val address = segment.toRawLongValue()
      return ChatMessageAttachment(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
