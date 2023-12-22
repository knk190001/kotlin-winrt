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

@ABIMarker(GazeDeviceWatcherUpdatedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeDeviceWatcherUpdatedPreviewEventArgs;{7fe830ef-7f08-4737-88e1-4a83ae4e4885})")
@WinRTByReference(brClass = GazeDeviceWatcherUpdatedPreviewEventArgs.ByReference::class)
public class GazeDeviceWatcherUpdatedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeDeviceWatcherUpdatedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __18016266_Interface: IGazeDeviceWatcherUpdatedPreviewEventArgs.WithDefault by lazy {
    as_18016266()
  }


  public override val __18016266_Ptr: JNAPointer? by lazy {
    __18016266_Interface.__18016266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__18016266_Interface)

  private fun as_18016266(): IGazeDeviceWatcherUpdatedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeDeviceWatcherUpdatedPreviewEventArgs.ABI.makeIGazeDeviceWatcherUpdatedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeDeviceWatcherUpdatedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeDeviceWatcherUpdatedPreviewEventArgs.ABI.makeIGazeDeviceWatcherUpdatedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeDeviceWatcherUpdatedPreviewEventArgs> {
    public override fun getValue() = GazeDeviceWatcherUpdatedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeDeviceWatcherUpdatedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeDeviceWatcherUpdatedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        GazeDeviceWatcherUpdatedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeDeviceWatcherUpdatedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeDeviceWatcherUpdatedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
