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

@ABIMarker(ExposureCompensationControl.ABI::class)
@Signature("rc(Windows.Media.Devices.ExposureCompensationControl;{81c8e834-dcec-4011-a610-1f3847e64aca})")
@WinRTByReference(brClass = ExposureCompensationControl.ByReference::class)
public class ExposureCompensationControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExposureCompensationControl.WithDefault, IWinRTObject {
  private val __730691237_Interface: IExposureCompensationControl.WithDefault by lazy {
    as_730691237()
  }


  public override val __730691237_Ptr: JNAPointer? by lazy {
    __730691237_Interface.__730691237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__730691237_Interface)

  private fun as_730691237(): IExposureCompensationControl.WithDefault {
    if(pointer == NULL) {
      return(IExposureCompensationControl.ABI.makeIExposureCompensationControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExposureCompensationControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExposureCompensationControl.ABI.makeIExposureCompensationControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExposureCompensationControl> {
    public override fun getValue() = ExposureCompensationControl(pointer.getPointer(0))

    public fun setValue(value: ExposureCompensationControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExposureCompensationControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExposureCompensationControl {
      val address = segment.toRawLongValue()
      return ExposureCompensationControl(Pointer(address))
    }

    public override fun toNative(obj: ExposureCompensationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
