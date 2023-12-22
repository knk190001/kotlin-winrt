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

@ABIMarker(ExposurePriorityVideoControl.ABI::class)
@Signature("rc(Windows.Media.Devices.ExposurePriorityVideoControl;{2cb240a3-5168-4271-9ea5-47621a98a352})")
@WinRTByReference(brClass = ExposurePriorityVideoControl.ByReference::class)
public class ExposurePriorityVideoControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExposurePriorityVideoControl.WithDefault, IWinRTObject {
  private val __1668579986_Interface: IExposurePriorityVideoControl.WithDefault by lazy {
    as_1668579986()
  }


  public override val __1668579986_Ptr: JNAPointer? by lazy {
    __1668579986_Interface.__1668579986_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1668579986_Interface)

  private fun as_1668579986(): IExposurePriorityVideoControl.WithDefault {
    if(pointer == NULL) {
      return(IExposurePriorityVideoControl.ABI.makeIExposurePriorityVideoControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExposurePriorityVideoControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExposurePriorityVideoControl.ABI.makeIExposurePriorityVideoControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExposurePriorityVideoControl> {
    public override fun getValue() = ExposurePriorityVideoControl(pointer.getPointer(0))

    public fun setValue(value: ExposurePriorityVideoControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExposurePriorityVideoControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExposurePriorityVideoControl {
      val address = segment.toRawLongValue()
      return ExposurePriorityVideoControl(Pointer(address))
    }

    public override fun toNative(obj: ExposurePriorityVideoControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
