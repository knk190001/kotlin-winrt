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

@ABIMarker(GazeEnteredPreviewEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeEnteredPreviewEventArgs;{2567bf43-1225-489f-9dd1-daa7c50fbf4b})")
@WinRTByReference(brClass = GazeEnteredPreviewEventArgs.ByReference::class)
public class GazeEnteredPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeEnteredPreviewEventArgs.WithDefault, IWinRTObject {
  private val __1121171808_Interface: IGazeEnteredPreviewEventArgs.WithDefault by lazy {
    as_1121171808()
  }


  public override val __1121171808_Ptr: JNAPointer? by lazy {
    __1121171808_Interface.__1121171808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1121171808_Interface)

  private fun as_1121171808(): IGazeEnteredPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGazeEnteredPreviewEventArgs.ABI.makeIGazeEnteredPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeEnteredPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeEnteredPreviewEventArgs.ABI.makeIGazeEnteredPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeEnteredPreviewEventArgs> {
    public override fun getValue() = GazeEnteredPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: GazeEnteredPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeEnteredPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazeEnteredPreviewEventArgs {
      val address = segment.toRawLongValue()
      return GazeEnteredPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GazeEnteredPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
