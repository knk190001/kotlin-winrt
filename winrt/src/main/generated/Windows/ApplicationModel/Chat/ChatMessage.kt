package Windows.ApplicationModel.Chat

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ChatMessage.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessage;{4b39052a-1142-5089-76da-f2db3d17cd05})")
@WinRTByReference(brClass = ChatMessage.ByReference::class)
public class ChatMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessage.WithDefault, IChatMessage2.WithDefault,
    IChatMessage3.WithDefault, IChatMessage4.WithDefault, IChatItem.WithDefault, IWinRTObject {
  private val __184838568_Interface: IChatMessage.WithDefault by lazy {
    as_184838568()
  }


  private val __1435028362_Interface: IChatMessage2.WithDefault by lazy {
    as_1435028362()
  }


  private val __1435028363_Interface: IChatMessage3.WithDefault by lazy {
    as_1435028363()
  }


  private val __1435028364_Interface: IChatMessage4.WithDefault by lazy {
    as_1435028364()
  }


  private val __2120983278_Interface: IChatItem.WithDefault by lazy {
    as_2120983278()
  }


  public override val __184838568_Ptr: JNAPointer? by lazy {
    __184838568_Interface.__184838568_Ptr
  }


  public override val __1435028362_Ptr: JNAPointer? by lazy {
    __1435028362_Interface.__1435028362_Ptr
  }


  public override val __1435028363_Ptr: JNAPointer? by lazy {
    __1435028363_Interface.__1435028363_Ptr
  }


  public override val __1435028364_Ptr: JNAPointer? by lazy {
    __1435028364_Interface.__1435028364_Ptr
  }


  public override val __2120983278_Ptr: JNAPointer? by lazy {
    __2120983278_Interface.__2120983278_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__184838568_Interface, __1435028362_Interface, __1435028363_Interface,
        __1435028364_Interface, __2120983278_Interface)

  public constructor() : this(ABI.activate())

  private fun as_184838568(): IChatMessage.WithDefault {
    if(pointer == NULL) {
      return(IChatMessage.ABI.makeIChatMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessage.ABI.makeIChatMessage(ref.value))
  }

  private fun as_1435028362(): IChatMessage2.WithDefault {
    if(pointer == NULL) {
      return(IChatMessage2.ABI.makeIChatMessage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessage2.ABI.makeIChatMessage2(ref.value))
  }

  private fun as_1435028363(): IChatMessage3.WithDefault {
    if(pointer == NULL) {
      return(IChatMessage3.ABI.makeIChatMessage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessage3.ABI.makeIChatMessage3(ref.value))
  }

  private fun as_1435028364(): IChatMessage4.WithDefault {
    if(pointer == NULL) {
      return(IChatMessage4.ABI.makeIChatMessage4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessage4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessage4.ABI.makeIChatMessage4(ref.value))
  }

  private fun as_2120983278(): IChatItem.WithDefault {
    if(pointer == NULL) {
      return(IChatItem.ABI.makeIChatItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatItem.ABI.makeIChatItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ChatMessage> {
    public override fun getValue() = ChatMessage(pointer.getPointer(0))

    public fun setValue(value: ChatMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatMessage".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ChatMessage {
      val address = segment.toRawLongValue()
      return ChatMessage(Pointer(address))
    }

    public override fun toNative(obj: ChatMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
