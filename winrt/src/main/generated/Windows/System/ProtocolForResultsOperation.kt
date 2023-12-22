package Windows.System

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

@ABIMarker(ProtocolForResultsOperation.ABI::class)
@Signature("rc(Windows.System.ProtocolForResultsOperation;{d581293a-6de9-4d28-9378-f86782e182bb})")
@WinRTByReference(brClass = ProtocolForResultsOperation.ByReference::class)
public class ProtocolForResultsOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProtocolForResultsOperation.WithDefault, IWinRTObject {
  private val __598301299_Interface: IProtocolForResultsOperation.WithDefault by lazy {
    as_598301299()
  }


  public override val __598301299_Ptr: JNAPointer? by lazy {
    __598301299_Interface.__598301299_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__598301299_Interface)

  private fun as_598301299(): IProtocolForResultsOperation.WithDefault {
    if(pointer == NULL) {
      return(IProtocolForResultsOperation.ABI.makeIProtocolForResultsOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProtocolForResultsOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProtocolForResultsOperation.ABI.makeIProtocolForResultsOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProtocolForResultsOperation> {
    public override fun getValue() = ProtocolForResultsOperation(pointer.getPointer(0))

    public fun setValue(value: ProtocolForResultsOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProtocolForResultsOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProtocolForResultsOperation {
      val address = segment.toRawLongValue()
      return ProtocolForResultsOperation(Pointer(address))
    }

    public override fun toNative(obj: ProtocolForResultsOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
