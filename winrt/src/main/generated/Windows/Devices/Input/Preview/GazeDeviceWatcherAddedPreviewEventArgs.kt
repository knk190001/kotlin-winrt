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

@ABIMarker(GazeDeviceWatcherAddedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeDeviceWatcherAddedPreviewEventArgs;{e79e7eed-b389-11e7-b201-c8d3ffb75721})")
@WinRTByReference(brClass = GazeDeviceWatcherAddedPreviewEventArgs.ByReference::class)
public class GazeDeviceWatcherAddedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeDeviceWatcherAddedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1360862799_Interface: IGazeDeviceWatcherAddedPreviewEventArgs.WithDefault by lazy {
    as_1360862799()
  }


  public override val __1360862799_Ptr: JNAPointer? by lazy {
    __1360862799_Interface.__1360862799_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1360862799_Interface)

  private fun as_1360862799(): IGazeDeviceWatcherAddedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeDeviceWatcherAddedPreviewEventArgs.ABI.makeIGazeDeviceWatcherAddedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeDeviceWatcherAddedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeDeviceWatcherAddedPreviewEventArgs.ABI.makeIGazeDeviceWatcherAddedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeDeviceWatcherAddedPreviewEventArgs> {
    public override fun getValue() = GazeDeviceWatcherAddedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeDeviceWatcherAddedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeDeviceWatcherAddedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazeDeviceWatcherAddedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeDeviceWatcherAddedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeDeviceWatcherAddedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
