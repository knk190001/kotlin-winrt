package Windows.UI.Xaml.Input

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

@ABIMarker(ProcessKeyboardAcceleratorEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs;{fb79c216-972b-440c-9b83-2b4198dcf09d})")
@WinRTByReference(brClass = ProcessKeyboardAcceleratorEventArgs.ByReference::class)
public class ProcessKeyboardAcceleratorEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessKeyboardAcceleratorEventArgs.WithDefault, IWinRTObject {
  private val __108999060_Interface: IProcessKeyboardAcceleratorEventArgs.WithDefault by lazy {
    as_108999060()
  }


  public override val __108999060_Ptr: JNAPointer? by lazy {
    __108999060_Interface.__108999060_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__108999060_Interface)

  private fun as_108999060(): IProcessKeyboardAcceleratorEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IProcessKeyboardAcceleratorEventArgs.ABI.makeIProcessKeyboardAcceleratorEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessKeyboardAcceleratorEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessKeyboardAcceleratorEventArgs.ABI.makeIProcessKeyboardAcceleratorEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessKeyboardAcceleratorEventArgs> {
    public override fun getValue() = ProcessKeyboardAcceleratorEventArgs(pointer.getPointer(0))

    public fun setValue(value: ProcessKeyboardAcceleratorEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessKeyboardAcceleratorEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessKeyboardAcceleratorEventArgs {
      val address = segment.toRawLongValue()
      return ProcessKeyboardAcceleratorEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ProcessKeyboardAcceleratorEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
