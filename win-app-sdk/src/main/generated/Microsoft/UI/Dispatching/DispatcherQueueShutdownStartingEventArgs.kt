package Microsoft.UI.Dispatching

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

@ABIMarker(DispatcherQueueShutdownStartingEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Dispatching.DispatcherQueueShutdownStartingEventArgs;{32519be5-072b-5660-a70e-8835c9b8157d})")
@WinRTByReference(brClass = DispatcherQueueShutdownStartingEventArgs.ByReference::class)
public class DispatcherQueueShutdownStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherQueueShutdownStartingEventArgs.WithDefault, IWinRTObject {
  private val __2011875410_Interface: IDispatcherQueueShutdownStartingEventArgs.WithDefault by
      lazy {
    as_2011875410()
  }


  public override val __2011875410_Ptr: JNAPointer? by lazy {
    __2011875410_Interface.__2011875410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2011875410_Interface)

  private fun as_2011875410(): IDispatcherQueueShutdownStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueueShutdownStartingEventArgs.ABI.makeIDispatcherQueueShutdownStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueueShutdownStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueueShutdownStartingEventArgs.ABI.makeIDispatcherQueueShutdownStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DispatcherQueueShutdownStartingEventArgs> {
    public override fun getValue() = DispatcherQueueShutdownStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: DispatcherQueueShutdownStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DispatcherQueueShutdownStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DispatcherQueueShutdownStartingEventArgs {
      val address = segment.toRawLongValue()
      return DispatcherQueueShutdownStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DispatcherQueueShutdownStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
