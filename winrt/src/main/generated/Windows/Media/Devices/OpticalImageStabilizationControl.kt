package Windows.Media.Devices

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

@ABIMarker(OpticalImageStabilizationControl.ABI::class)
@Signature("rc(Windows.Media.Devices.OpticalImageStabilizationControl;{bfad9c1d-00bc-423b-8eb2-a0178ca94247})")
@WinRTByReference(brClass = OpticalImageStabilizationControl.ByReference::class)
public class OpticalImageStabilizationControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOpticalImageStabilizationControl.WithDefault, IWinRTObject {
  private val __1969761150_Interface: IOpticalImageStabilizationControl.WithDefault by lazy {
    as_1969761150()
  }


  public override val __1969761150_Ptr: JNAPointer? by lazy {
    __1969761150_Interface.__1969761150_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1969761150_Interface)

  private fun as_1969761150(): IOpticalImageStabilizationControl.WithDefault {
    if(pointer == NULL) {
      return(IOpticalImageStabilizationControl.ABI.makeIOpticalImageStabilizationControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOpticalImageStabilizationControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOpticalImageStabilizationControl.ABI.makeIOpticalImageStabilizationControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OpticalImageStabilizationControl> {
    public override fun getValue() = OpticalImageStabilizationControl(pointer.getPointer(0))

    public fun setValue(value: OpticalImageStabilizationControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OpticalImageStabilizationControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OpticalImageStabilizationControl {
      val address = segment.toRawLongValue()
      return OpticalImageStabilizationControl(Pointer(address))
    }

    public override fun toNative(obj: OpticalImageStabilizationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
