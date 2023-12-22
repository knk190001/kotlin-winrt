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

@ABIMarker(DispatcherQueueTimer.ABI::class)
@Signature("rc(Microsoft.UI.Dispatching.DispatcherQueueTimer;{ad4d63fd-88fe-541f-ac11-bf2dc1ed2ce5})")
@WinRTByReference(brClass = DispatcherQueueTimer.ByReference::class)
public class DispatcherQueueTimer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherQueueTimer.WithDefault, IWinRTObject {
  private val __1325256598_Interface: IDispatcherQueueTimer.WithDefault by lazy {
    as_1325256598()
  }


  public override val __1325256598_Ptr: JNAPointer? by lazy {
    __1325256598_Interface.__1325256598_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1325256598_Interface)

  private fun as_1325256598(): IDispatcherQueueTimer.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueueTimer.ABI.makeIDispatcherQueueTimer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueueTimer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueueTimer.ABI.makeIDispatcherQueueTimer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DispatcherQueueTimer> {
    public override fun getValue() = DispatcherQueueTimer(pointer.getPointer(0))

    public fun setValue(value: DispatcherQueueTimer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DispatcherQueueTimer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DispatcherQueueTimer {
      val address = segment.toRawLongValue()
      return DispatcherQueueTimer(Pointer(address))
    }

    public override fun toNative(obj: DispatcherQueueTimer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
