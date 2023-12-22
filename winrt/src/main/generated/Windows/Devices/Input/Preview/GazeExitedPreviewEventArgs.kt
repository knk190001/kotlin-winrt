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

@ABIMarker(GazeExitedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeExitedPreviewEventArgs;{5d0af07e-7d83-40ef-9f0a-fbc1bbdcc5ac})")
@WinRTByReference(brClass = GazeExitedPreviewEventArgs.ByReference::class)
public class GazeExitedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeExitedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1274615438_Interface: IGazeExitedPreviewEventArgs.WithDefault by lazy {
    as_1274615438()
  }


  public override val __1274615438_Ptr: JNAPointer? by lazy {
    __1274615438_Interface.__1274615438_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1274615438_Interface)

  private fun as_1274615438(): IGazeExitedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeExitedPreviewEventArgs.ABI.makeIGazeExitedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeExitedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeExitedPreviewEventArgs.ABI.makeIGazeExitedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeExitedPreviewEventArgs> {
    public override fun getValue() = GazeExitedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeExitedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeExitedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazeExitedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeExitedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeExitedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
