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

@ABIMarker(ExposureControl.ABI::class)
@Signature("rc(Windows.Media.Devices.ExposureControl;{09e8cbe2-ad96-4f28-a0e0-96ed7e1b5fd2})")
@WinRTByReference(brClass = ExposureControl.ByReference::class)
public class ExposureControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExposureControl.WithDefault, IWinRTObject {
  private val __283090155_Interface: IExposureControl.WithDefault by lazy {
    as_283090155()
  }


  public override val __283090155_Ptr: JNAPointer? by lazy {
    __283090155_Interface.__283090155_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__283090155_Interface)

  private fun as_283090155(): IExposureControl.WithDefault {
    if(pointer == NULL) {
      return(IExposureControl.ABI.makeIExposureControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExposureControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExposureControl.ABI.makeIExposureControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExposureControl> {
    public override fun getValue() = ExposureControl(pointer.getPointer(0))

    public fun setValue(value: ExposureControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExposureControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExposureControl {
      val address = segment.toRawLongValue()
      return ExposureControl(Pointer(address))
    }

    public override fun toNative(obj: ExposureControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
