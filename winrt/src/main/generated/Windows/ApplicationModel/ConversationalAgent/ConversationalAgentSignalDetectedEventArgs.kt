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

@ABIMarker(ConversationalAgentSignalDetectedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSignalDetectedEventArgs;{4d57eb8f-f88a-599b-91d3-d604876708bc})")
@WinRTByReference(brClass = ConversationalAgentSignalDetectedEventArgs.ByReference::class)
public class ConversationalAgentSignalDetectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentSignalDetectedEventArgs.WithDefault, IWinRTObject {
  private val __1590236398_Interface: IConversationalAgentSignalDetectedEventArgs.WithDefault by
      lazy {
    as_1590236398()
  }


  public override val __1590236398_Ptr: JNAPointer? by lazy {
    __1590236398_Interface.__1590236398_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1590236398_Interface)

  private fun as_1590236398(): IConversationalAgentSignalDetectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSignalDetectedEventArgs.ABI.makeIConversationalAgentSignalDetectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSignalDetectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSignalDetectedEventArgs.ABI.makeIConversationalAgentSignalDetectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentSignalDetectedEventArgs> {
    public override fun getValue() =
        ConversationalAgentSignalDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentSignalDetectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentSignalDetectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ConversationalAgentSignalDetectedEventArgs {
      val address = segment.toRawLongValue()
      return ConversationalAgentSignalDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentSignalDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
