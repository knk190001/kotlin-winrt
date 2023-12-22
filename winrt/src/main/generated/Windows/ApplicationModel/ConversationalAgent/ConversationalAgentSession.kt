package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.IClosable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ConversationalAgentSession.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSession;{daaae09a-b7ba-57e5-ad13-df520f9b6fa7})")
@WinRTByReference(brClass = ConversationalAgentSession.ByReference::class)
public class ConversationalAgentSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentSession.WithDefault,
    IConversationalAgentSession2.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __945048379_Interface: IConversationalAgentSession.WithDefault by lazy {
    as_945048379()
  }


  private val __768271273_Interface: IConversationalAgentSession2.WithDefault by lazy {
    as_768271273()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __945048379_Ptr: JNAPointer? by lazy {
    __945048379_Interface.__945048379_Ptr
  }


  public override val __768271273_Ptr: JNAPointer? by lazy {
    __768271273_Interface.__768271273_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__945048379_Interface, __768271273_Interface, __1260617006_Interface)

  private fun as_945048379(): IConversationalAgentSession.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSession.ABI.makeIConversationalAgentSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSession.ABI.makeIConversationalAgentSession(ref.value))
  }

  private fun as_768271273(): IConversationalAgentSession2.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSession2.ABI.makeIConversationalAgentSession2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSession2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSession2.ABI.makeIConversationalAgentSession2(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentSession> {
    public override fun getValue() = ConversationalAgentSession(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentSession, MemoryAddress> {
    public val IConversationalAgentSessionStatics_Instance: IConversationalAgentSessionStatics by
        lazy {
      createIConversationalAgentSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIConversationalAgentSessionStatics(): IConversationalAgentSessionStatics {
      val refiid = Guid.REFIID(IConversationalAgentSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSession".toHandle(),refiid,interfacePtr)
      val result =
          IConversationalAgentSessionStatics.ABI.makeIConversationalAgentSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ConversationalAgentSession {
      val address = segment.toRawLongValue()
      return ConversationalAgentSession(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrentSessionAsync() =
        ABI.IConversationalAgentSessionStatics_Instance.GetCurrentSessionAsync()

    public fun GetCurrentSessionSync() =
        ABI.IConversationalAgentSessionStatics_Instance.GetCurrentSessionSync()
  }
}
