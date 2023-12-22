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

@ABIMarker(PerceptionInfraredFrameSourceAddedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrameSourceAddedEventArgs;{6d334120-95ce-4660-907a-d98035aa2b7c})")
@WinRTByReference(brClass = PerceptionInfraredFrameSourceAddedEventArgs.ByReference::class)
public class PerceptionInfraredFrameSourceAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrameSourceAddedEventArgs.WithDefault, IWinRTObject {
  private val __1645987857_Interface: IPerceptionInfraredFrameSourceAddedEventArgs.WithDefault by
      lazy {
    as_1645987857()
  }


  public override val __1645987857_Ptr: JNAPointer? by lazy {
    __1645987857_Interface.__1645987857_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1645987857_Interface)

  private fun as_1645987857(): IPerceptionInfraredFrameSourceAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameSourceAddedEventArgs.ABI.makeIPerceptionInfraredFrameSourceAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameSourceAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameSourceAddedEventArgs.ABI.makeIPerceptionInfraredFrameSourceAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionInfraredFrameSourceAddedEventArgs> {
    public override fun getValue() =
        PerceptionInfraredFrameSourceAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrameSourceAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrameSourceAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionInfraredFrameSourceAddedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrameSourceAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrameSourceAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
