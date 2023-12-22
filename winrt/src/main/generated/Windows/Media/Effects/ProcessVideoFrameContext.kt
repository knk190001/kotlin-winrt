package Windows.Media.Effects

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

@ABIMarker(ProcessVideoFrameContext.ABI::class)
@Signature("rc(Windows.Media.Effects.ProcessVideoFrameContext;{276f0e2b-6461-401e-ba78-0fdad6114eec})")
@WinRTByReference(brClass = ProcessVideoFrameContext.ByReference::class)
public class ProcessVideoFrameContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProcessVideoFrameContext.WithDefault, IWinRTObject {
  private val __937388682_Interface: IProcessVideoFrameContext.WithDefault by lazy {
    as_937388682()
  }


  public override val __937388682_Ptr: JNAPointer? by lazy {
    __937388682_Interface.__937388682_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__937388682_Interface)

  private fun as_937388682(): IProcessVideoFrameContext.WithDefault {
    if(pointer == NULL) {
      return(IProcessVideoFrameContext.ABI.makeIProcessVideoFrameContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProcessVideoFrameContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProcessVideoFrameContext.ABI.makeIProcessVideoFrameContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProcessVideoFrameContext> {
    public override fun getValue() = ProcessVideoFrameContext(pointer.getPointer(0))

    public fun setValue(value: ProcessVideoFrameContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProcessVideoFrameContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProcessVideoFrameContext {
      val address = segment.toRawLongValue()
      return ProcessVideoFrameContext(Pointer(address))
    }

    public override fun toNative(obj: ProcessVideoFrameContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
