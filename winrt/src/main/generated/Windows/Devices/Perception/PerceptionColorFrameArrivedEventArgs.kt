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

@ABIMarker(PerceptionColorFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionColorFrameArrivedEventArgs;{8fad02d5-86f7-4d8d-b966-5a3761ba9f59})")
@WinRTByReference(brClass = PerceptionColorFrameArrivedEventArgs.ByReference::class)
public class PerceptionColorFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionColorFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __1584898655_Interface: IPerceptionColorFrameArrivedEventArgs.WithDefault by lazy {
    as_1584898655()
  }


  public override val __1584898655_Ptr: JNAPointer? by lazy {
    __1584898655_Interface.__1584898655_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1584898655_Interface)

  private fun as_1584898655(): IPerceptionColorFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrameArrivedEventArgs.ABI.makeIPerceptionColorFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrameArrivedEventArgs.ABI.makeIPerceptionColorFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionColorFrameArrivedEventArgs> {
    public override fun getValue() = PerceptionColorFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionColorFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionColorFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionColorFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionColorFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionColorFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
