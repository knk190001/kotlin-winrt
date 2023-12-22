package Windows.Devices.Perception

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

@ABIMarker(PerceptionDepthFrameSourceWatcher.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher;{780e96d1-8d02-4d2b-ada4-5ba624a0eb10})")
@WinRTByReference(brClass = PerceptionDepthFrameSourceWatcher.ByReference::class)
public class PerceptionDepthFrameSourceWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthFrameSourceWatcher.WithDefault, IWinRTObject {
  private val __1156471062_Interface: IPerceptionDepthFrameSourceWatcher.WithDefault by lazy {
    as_1156471062()
  }


  public override val __1156471062_Ptr: JNAPointer? by lazy {
    __1156471062_Interface.__1156471062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156471062_Interface)

  private fun as_1156471062(): IPerceptionDepthFrameSourceWatcher.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameSourceWatcher.ABI.makeIPerceptionDepthFrameSourceWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameSourceWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameSourceWatcher.ABI.makeIPerceptionDepthFrameSourceWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthFrameSourceWatcher> {
    public override fun getValue() = PerceptionDepthFrameSourceWatcher(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthFrameSourceWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthFrameSourceWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionDepthFrameSourceWatcher {
      val address = segment.toRawLongValue()
      return PerceptionDepthFrameSourceWatcher(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthFrameSourceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
