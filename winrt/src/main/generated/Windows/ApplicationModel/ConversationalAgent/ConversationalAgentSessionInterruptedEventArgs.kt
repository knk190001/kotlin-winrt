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

@ABIMarker(ConversationalAgentSessionInterruptedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSessionInterruptedEventArgs;{9766591f-f63d-5d3e-9bf2-bd0760552686})")
@WinRTByReference(brClass = ConversationalAgentSessionInterruptedEventArgs.ByReference::class)
public class ConversationalAgentSessionInterruptedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentSessionInterruptedEventArgs.WithDefault, IWinRTObject {
  private val __100054448_Interface: IConversationalAgentSessionInterruptedEventArgs.WithDefault by
      lazy {
    as_100054448()
  }


  public override val __100054448_Ptr: JNAPointer? by lazy {
    __100054448_Interface.__100054448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__100054448_Interface)

  private fun as_100054448(): IConversationalAgentSessionInterruptedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSessionInterruptedEventArgs.ABI.makeIConversationalAgentSessionInterruptedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSessionInterruptedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSessionInterruptedEventArgs.ABI.makeIConversationalAgentSessionInterruptedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentSessionInterruptedEventArgs> {
    public override fun getValue() =
        ConversationalAgentSessionInterruptedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentSessionInterruptedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentSessionInterruptedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ConversationalAgentSessionInterruptedEventArgs {
      val address = segment.toRawLongValue()
      return ConversationalAgentSessionInterruptedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentSessionInterruptedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
