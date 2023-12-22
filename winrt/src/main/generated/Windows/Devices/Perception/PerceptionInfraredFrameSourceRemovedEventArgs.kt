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

@ABIMarker(PerceptionInfraredFrameSourceRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrameSourceRemovedEventArgs;{ea1a8071-7a70-4a61-af94-07303853f695})")
@WinRTByReference(brClass = PerceptionInfraredFrameSourceRemovedEventArgs.ByReference::class)
public class PerceptionInfraredFrameSourceRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrameSourceRemovedEventArgs.WithDefault, IWinRTObject {
  private val __998465999_Interface: IPerceptionInfraredFrameSourceRemovedEventArgs.WithDefault by
      lazy {
    as_998465999()
  }


  public override val __998465999_Ptr: JNAPointer? by lazy {
    __998465999_Interface.__998465999_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__998465999_Interface)

  private fun as_998465999(): IPerceptionInfraredFrameSourceRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameSourceRemovedEventArgs.ABI.makeIPerceptionInfraredFrameSourceRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameSourceRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameSourceRemovedEventArgs.ABI.makeIPerceptionInfraredFrameSourceRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionInfraredFrameSourceRemovedEventArgs> {
    public override fun getValue() =
        PerceptionInfraredFrameSourceRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrameSourceRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrameSourceRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PerceptionInfraredFrameSourceRemovedEventArgs {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrameSourceRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrameSourceRemovedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
