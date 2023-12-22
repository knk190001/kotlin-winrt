package Windows.Devices.Input.Preview

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

@ABIMarker(GazeDeviceWatcherRemovedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeDeviceWatcherRemovedPreviewEventArgs;{f2631f08-0e3f-431f-a606-50b35af94a1c})")
@WinRTByReference(brClass = GazeDeviceWatcherRemovedPreviewEventArgs.ByReference::class)
public class GazeDeviceWatcherRemovedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeDeviceWatcherRemovedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __307115439_Interface: IGazeDeviceWatcherRemovedPreviewEventArgs.WithDefault by lazy {
    as_307115439()
  }


  public override val __307115439_Ptr: JNAPointer? by lazy {
    __307115439_Interface.__307115439_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__307115439_Interface)

  private fun as_307115439(): IGazeDeviceWatcherRemovedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeDeviceWatcherRemovedPreviewEventArgs.ABI.makeIGazeDeviceWatcherRemovedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeDeviceWatcherRemovedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeDeviceWatcherRemovedPreviewEventArgs.ABI.makeIGazeDeviceWatcherRemovedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeDeviceWatcherRemovedPreviewEventArgs> {
    public override fun getValue() = GazeDeviceWatcherRemovedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeDeviceWatcherRemovedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeDeviceWatcherRemovedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GazeDeviceWatcherRemovedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeDeviceWatcherRemovedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeDeviceWatcherRemovedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
