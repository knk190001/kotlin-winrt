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

@ABIMarker(ConversationalAgentSystemStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ConversationalAgentSystemStateChangedEventArgs;{1c2c6e3e-2785-59a7-8e71-38adeef79928})")
@WinRTByReference(brClass = ConversationalAgentSystemStateChangedEventArgs.ByReference::class)
public class ConversationalAgentSystemStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConversationalAgentSystemStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __887131690_Interface: IConversationalAgentSystemStateChangedEventArgs.WithDefault by
      lazy {
    as_887131690()
  }


  public override val __887131690_Ptr: JNAPointer? by lazy {
    __887131690_Interface.__887131690_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__887131690_Interface)

  private fun as_887131690(): IConversationalAgentSystemStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IConversationalAgentSystemStateChangedEventArgs.ABI.makeIConversationalAgentSystemStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConversationalAgentSystemStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConversationalAgentSystemStateChangedEventArgs.ABI.makeIConversationalAgentSystemStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConversationalAgentSystemStateChangedEventArgs> {
    public override fun getValue() =
        ConversationalAgentSystemStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ConversationalAgentSystemStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConversationalAgentSystemStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ConversationalAgentSystemStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return ConversationalAgentSystemStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ConversationalAgentSystemStateChangedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
