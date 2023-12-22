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

@ABIMarker(PerceptionDepthFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthFrameArrivedEventArgs;{443d25b2-b282-4637-9173-ac978435c985})")
@WinRTByReference(brClass = PerceptionDepthFrameArrivedEventArgs.ByReference::class)
public class PerceptionDepthFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __1690067391_Interface: IPerceptionDepthFrameArrivedEventArgs.WithDefault by lazy {
    as_1690067391()
  }


  public override val __1690067391_Ptr: JNAPointer? by lazy {
    __1690067391_Interface.__1690067391_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1690067391_Interface)

  private fun as_1690067391(): IPerceptionDepthFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameArrivedEventArgs.ABI.makeIPerceptionDepthFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameArrivedEventArgs.ABI.makeIPerceptionDepthFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthFrameArrivedEventArgs> {
    public override fun getValue() = PerceptionDepthFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionDepthFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionDepthFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
