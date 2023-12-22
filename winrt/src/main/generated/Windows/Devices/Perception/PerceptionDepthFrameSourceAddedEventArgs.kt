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

@ABIMarker(PerceptionDepthFrameSourceAddedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthFrameSourceAddedEventArgs;{93a48168-8bf8-45d2-a2f8-4ac0931cc7a6})")
@WinRTByReference(brClass = PerceptionDepthFrameSourceAddedEventArgs.ByReference::class)
public class PerceptionDepthFrameSourceAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthFrameSourceAddedEventArgs.WithDefault, IWinRTObject {
  private val __826221431_Interface: IPerceptionDepthFrameSourceAddedEventArgs.WithDefault by lazy {
    as_826221431()
  }


  public override val __826221431_Ptr: JNAPointer? by lazy {
    __826221431_Interface.__826221431_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__826221431_Interface)

  private fun as_826221431(): IPerceptionDepthFrameSourceAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameSourceAddedEventArgs.ABI.makeIPerceptionDepthFrameSourceAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameSourceAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameSourceAddedEventArgs.ABI.makeIPerceptionDepthFrameSourceAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthFrameSourceAddedEventArgs> {
    public override fun getValue() = PerceptionDepthFrameSourceAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthFrameSourceAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthFrameSourceAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionDepthFrameSourceAddedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionDepthFrameSourceAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthFrameSourceAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
