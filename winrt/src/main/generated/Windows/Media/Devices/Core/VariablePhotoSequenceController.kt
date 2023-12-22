package Windows.Media.Devices.Core

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

@ABIMarker(VariablePhotoSequenceController.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.VariablePhotoSequenceController;{7fbff880-ed8c-43fd-a7c3-b35809e4229a})")
@WinRTByReference(brClass = VariablePhotoSequenceController.ByReference::class)
public class VariablePhotoSequenceController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVariablePhotoSequenceController.WithDefault, IWinRTObject {
  private val __481718769_Interface: IVariablePhotoSequenceController.WithDefault by lazy {
    as_481718769()
  }


  public override val __481718769_Ptr: JNAPointer? by lazy {
    __481718769_Interface.__481718769_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__481718769_Interface)

  private fun as_481718769(): IVariablePhotoSequenceController.WithDefault {
    if(pointer == NULL) {
      return(IVariablePhotoSequenceController.ABI.makeIVariablePhotoSequenceController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVariablePhotoSequenceController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVariablePhotoSequenceController.ABI.makeIVariablePhotoSequenceController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VariablePhotoSequenceController> {
    public override fun getValue() = VariablePhotoSequenceController(pointer.getPointer(0))

    public fun setValue(value: VariablePhotoSequenceController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VariablePhotoSequenceController, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VariablePhotoSequenceController {
      val address = segment.toRawLongValue()
      return VariablePhotoSequenceController(Pointer(address))
    }

    public override fun toNative(obj: VariablePhotoSequenceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
