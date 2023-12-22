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

@ABIMarker(PerceptionColorFrameSourceWatcher.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionColorFrameSourceWatcher;{96bd1392-e667-40c4-89f9-1462dea6a9cc})")
@WinRTByReference(brClass = PerceptionColorFrameSourceWatcher.ByReference::class)
public class PerceptionColorFrameSourceWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionColorFrameSourceWatcher.WithDefault, IWinRTObject {
  private val __36971402_Interface: IPerceptionColorFrameSourceWatcher.WithDefault by lazy {
    as_36971402()
  }


  public override val __36971402_Ptr: JNAPointer? by lazy {
    __36971402_Interface.__36971402_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__36971402_Interface)

  private fun as_36971402(): IPerceptionColorFrameSourceWatcher.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrameSourceWatcher.ABI.makeIPerceptionColorFrameSourceWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrameSourceWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrameSourceWatcher.ABI.makeIPerceptionColorFrameSourceWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionColorFrameSourceWatcher> {
    public override fun getValue() = PerceptionColorFrameSourceWatcher(pointer.getPointer(0))

    public fun setValue(value: PerceptionColorFrameSourceWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionColorFrameSourceWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionColorFrameSourceWatcher {
      val address = segment.toRawLongValue()
      return PerceptionColorFrameSourceWatcher(Pointer(address))
    }

    public override fun toNative(obj: PerceptionColorFrameSourceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
