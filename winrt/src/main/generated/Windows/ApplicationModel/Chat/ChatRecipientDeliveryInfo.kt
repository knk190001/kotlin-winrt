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

@ABIMarker(ChatRecipientDeliveryInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo;{ffc7b2a2-283c-4c0a-8a0e-8c33bdbf0545})")
@WinRTByReference(brClass = ChatRecipientDeliveryInfo.ByReference::class)
public class ChatRecipientDeliveryInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatRecipientDeliveryInfo.WithDefault, IWinRTObject {
  private val __244727972_Interface: IChatRecipientDeliveryInfo.WithDefault by lazy {
    as_244727972()
  }


  public override val __244727972_Ptr: JNAPointer? by lazy {
    __244727972_Interface.__244727972_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__244727972_Interface)

  public constructor() : this(ABI.activate())

  private fun as_244727972(): IChatRecipientDeliveryInfo.WithDefault {
    if(pointer == NULL) {
      return(IChatRecipientDeliveryInfo.ABI.makeIChatRecipientDeliveryInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatRecipientDeliveryInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatRecipientDeliveryInfo.ABI.makeIChatRecipientDeliveryInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatRecipientDeliveryInfo> {
    public override fun getValue() = ChatRecipientDeliveryInfo(pointer.getPointer(0))

    public fun setValue(value: ChatRecipientDeliveryInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatRecipientDeliveryInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ChatRecipientDeliveryInfo {
      val address = segment.toRawLongValue()
      return ChatRecipientDeliveryInfo(Pointer(address))
    }

    public override fun toNative(obj: ChatRecipientDeliveryInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
