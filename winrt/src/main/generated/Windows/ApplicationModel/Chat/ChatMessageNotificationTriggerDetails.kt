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

@ABIMarker(ChatMessageNotificationTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatMessageNotificationTriggerDetails;{fd344dfb-3063-4e17-8586-c6c08262e6c0})")
@WinRTByReference(brClass = ChatMessageNotificationTriggerDetails.ByReference::class)
public class ChatMessageNotificationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatMessageNotificationTriggerDetails.WithDefault,
    IChatMessageNotificationTriggerDetails2.WithDefault, IWinRTObject {
  private val __257526019_Interface: IChatMessageNotificationTriggerDetails.WithDefault by lazy {
    as_257526019()
  }


  private val __606628053_Interface: IChatMessageNotificationTriggerDetails2.WithDefault by lazy {
    as_606628053()
  }


  public override val __257526019_Ptr: JNAPointer? by lazy {
    __257526019_Interface.__257526019_Ptr
  }


  public override val __606628053_Ptr: JNAPointer? by lazy {
    __606628053_Interface.__606628053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__257526019_Interface, __606628053_Interface)

  private fun as_257526019(): IChatMessageNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageNotificationTriggerDetails.ABI.makeIChatMessageNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageNotificationTriggerDetails.ABI.makeIChatMessageNotificationTriggerDetails(ref.value))
  }

  private fun as_606628053(): IChatMessageNotificationTriggerDetails2.WithDefault {
    if(pointer == NULL) {
      return(IChatMessageNotificationTriggerDetails2.ABI.makeIChatMessageNotificationTriggerDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatMessageNotificationTriggerDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatMessageNotificationTriggerDetails2.ABI.makeIChatMessageNotificationTriggerDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatMessageNotificationTriggerDetails> {
    public override fun getValue() = ChatMessageNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ChatMessageNotificationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatMessageNotificationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ChatMessageNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return ChatMessageNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ChatMessageNotificationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
