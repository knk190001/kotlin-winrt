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

@ABIMarker(GazeDevicePreview.ABI::class)
@Signature("rc(Windows.Devices.Input.Preview.GazeDevicePreview;{e79e7ee9-b389-11e7-b201-c8d3ffb75721})")
@WinRTByReference(brClass = GazeDevicePreview.ByReference::class)
public class GazeDevicePreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGazeDevicePreview.WithDefault, IWinRTObject {
  private val __9145236_Interface: IGazeDevicePreview.WithDefault by lazy {
    as_9145236()
  }


  public override val __9145236_Ptr: JNAPointer? by lazy {
    __9145236_Interface.__9145236_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__9145236_Interface)

  private fun as_9145236(): IGazeDevicePreview.WithDefault {
    if(pointer == NULL) {
      return(IGazeDevicePreview.ABI.makeIGazeDevicePreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGazeDevicePreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGazeDevicePreview.ABI.makeIGazeDevicePreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GazeDevicePreview> {
    public override fun getValue() = GazeDevicePreview(pointer.getPointer(0))

    public fun setValue(value: GazeDevicePreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GazeDevicePreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GazeDevicePreview {
      val address = segment.toRawLongValue()
      return GazeDevicePreview(Pointer(address))
    }

    public override fun toNative(obj: GazeDevicePreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
