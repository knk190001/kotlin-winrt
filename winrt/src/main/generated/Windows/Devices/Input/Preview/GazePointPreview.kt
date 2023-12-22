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

@ABIMarker(GazePointPreview.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazePointPreview;{e79e7eea-b389-11e7-b201-c8d3ffb75721})")
@WinRTByReference(brClass = GazePointPreview.ByReference::class)
public class GazePointPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazePointPreview.WithDefault, IWinRTObject {
  private val __270998782_Interface: IGazePointPreview.WithDefault by lazy {
    as_270998782()
  }


  public override val __270998782_Ptr: JNAPointer? by lazy {
    __270998782_Interface.__270998782_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__270998782_Interface)

  private fun as_270998782(): IGazePointPreview.WithDefault {
    if(pointer == NULL) {
      return(IGazePointPreview.ABI.makeIGazePointPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazePointPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazePointPreview.ABI.makeIGazePointPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazePointPreview> {
    public override fun getValue() = GazePointPreview(pointer.getPointer(0))

    public fun setValue(value: GazePointPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazePointPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazePointPreview {
      val address = segment.toRawLongValue()
      return GazePointPreview(Pointer(address))
    }

    public override fun toNative(obj: GazePointPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
