package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ConversationalAgentDetectorManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentDetectorManager;{de94fbb0-597a-5df8-8cfb-9dbb583ba3ff})")
@WinRTByReference(brClass = ConversationalAgentDetectorManager.ByReference::class)
public class ConversationalAgentDetectorManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentDetectorManager.WithDefault,
    IConversationalAgentDetectorManager2.WithDefault, IWinRTObject {
  private val __819021652_Interface: IConversationalAgentDetectorManager.WithDefault by lazy {
    as_819021652()
  }


  private val __380132614_Interface: IConversationalAgentDetectorManager2.WithDefault by lazy {
    as_380132614()
  }


  public override val __819021652_Ptr: JNAPointer? by lazy {
    __819021652_Interface.__819021652_Ptr
  }


  public override val __380132614_Ptr: JNAPointer? by lazy {
    __380132614_Interface.__380132614_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__819021652_Interface, __380132614_Interface)

  private fun as_819021652(): IConversationalAgentDetectorManager.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentDetectorManager.ABI.makeIConversationalAgentDetectorManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentDetectorManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentDetectorManager.ABI.makeIConversationalAgentDetectorManager(ref.value))
  }

  private fun as_380132614(): IConversationalAgentDetectorManager2.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentDetectorManager2.ABI.makeIConversationalAgentDetectorManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentDetectorManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentDetectorManager2.ABI.makeIConversationalAgentDetectorManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentDetectorManager> {
    public override fun getValue() = ConversationalAgentDetectorManager(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentDetectorManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentDetectorManager, MemoryAddress> {
    public val IConversationalAgentDetectorManagerStatics_Instance:
        IConversationalAgentDetectorManagerStatics by lazy {
      createIConversationalAgentDetectorManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIConversationalAgentDetectorManagerStatics():
        IConversationalAgentDetectorManagerStatics {
      val refiid = Guid.REFIID(IConversationalAgentDetectorManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.ConversationalAgent.ConversationalAgentDetectorManager".toHandle(),refiid,interfacePtr)
      val result =
          IConversationalAgentDetectorManagerStatics.ABI.makeIConversationalAgentDetectorManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ConversationalAgentDetectorManager {
      val address = segment.toRawLongValue()
      return ConversationalAgentDetectorManager(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentDetectorManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Default() = ABI.IConversationalAgentDetectorManagerStatics_Instance.get_Default()
  }
}
