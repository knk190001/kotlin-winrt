package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ConversationalAgentSignal.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSignal;{20ed25f7-b120-51f2-8603-265d6a47f232})")
@WinRTByReference(brClass = ConversationalAgentSignal.ByReference::class)
public class ConversationalAgentSignal(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentSignal.WithDefault,
    IConversationalAgentSignal2.WithDefault, IWinRTObject {
  private val __1074561693_Interface: IConversationalAgentSignal.WithDefault by lazy {
    as_1074561693()
  }


  private val __1048325935_Interface: IConversationalAgentSignal2.WithDefault by lazy {
    as_1048325935()
  }


  public override val __1074561693_Ptr: JNAPointer? by lazy {
    __1074561693_Interface.__1074561693_Ptr
  }


  public override val __1048325935_Ptr: JNAPointer? by lazy {
    __1048325935_Interface.__1048325935_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1074561693_Interface, __1048325935_Interface)

  private fun as_1074561693(): IConversationalAgentSignal.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSignal.ABI.makeIConversationalAgentSignal(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSignal>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSignal.ABI.makeIConversationalAgentSignal(ref.value))
  }

  private fun as_1048325935(): IConversationalAgentSignal2.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSignal2.ABI.makeIConversationalAgentSignal2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSignal2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSignal2.ABI.makeIConversationalAgentSignal2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentSignal> {
    public override fun getValue() = ConversationalAgentSignal(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentSignal): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentSignal, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConversationalAgentSignal {
      val address = segment.toRawLongValue()
      return ConversationalAgentSignal(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentSignal): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
