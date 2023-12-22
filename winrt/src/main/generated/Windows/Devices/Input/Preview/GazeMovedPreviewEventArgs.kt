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

@ABIMarker(GazeMovedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeMovedPreviewEventArgs;{e79e7eeb-b389-11e7-b201-c8d3ffb75721})")
@WinRTByReference(brClass = GazeMovedPreviewEventArgs.ByReference::class)
public class GazeMovedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeMovedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1717362268_Interface: IGazeMovedPreviewEventArgs.WithDefault by lazy {
    as_1717362268()
  }


  public override val __1717362268_Ptr: JNAPointer? by lazy {
    __1717362268_Interface.__1717362268_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1717362268_Interface)

  private fun as_1717362268(): IGazeMovedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeMovedPreviewEventArgs.ABI.makeIGazeMovedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeMovedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeMovedPreviewEventArgs.ABI.makeIGazeMovedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeMovedPreviewEventArgs> {
    public override fun getValue() = GazeMovedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeMovedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeMovedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazeMovedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeMovedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeMovedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
