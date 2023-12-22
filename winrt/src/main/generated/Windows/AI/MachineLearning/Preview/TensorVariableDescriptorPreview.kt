package Windows.AI.MachineLearning.Preview

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

@ABIMarker(TensorVariableDescriptorPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.TensorVariableDescriptorPreview;{a80f501a-9aac-4233-9784-aceaf92510b5})")
@WinRTByReference(brClass = TensorVariableDescriptorPreview.ByReference::class)
public class TensorVariableDescriptorPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITensorVariableDescriptorPreview.WithDefault,
    ILearningModelVariableDescriptorPreview.WithDefault, IWinRTObject {
  private val __2027404319_Interface: ITensorVariableDescriptorPreview.WithDefault by lazy {
    as_2027404319()
  }


  private val __614308553_Interface: ILearningModelVariableDescriptorPreview.WithDefault by lazy {
    as_614308553()
  }


  public override val __2027404319_Ptr: JNAPointer? by lazy {
    __2027404319_Interface.__2027404319_Ptr
  }


  public override val __614308553_Ptr: JNAPointer? by lazy {
    __614308553_Interface.__614308553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2027404319_Interface, __614308553_Interface)

  private fun as_2027404319(): ITensorVariableDescriptorPreview.WithDefault {
    if(pointer == NULL) {
      return(ITensorVariableDescriptorPreview.ABI.makeITensorVariableDescriptorPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensorVariableDescriptorPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensorVariableDescriptorPreview.ABI.makeITensorVariableDescriptorPreview(ref.value))
  }

  private fun as_614308553(): ILearningModelVariableDescriptorPreview.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelVariableDescriptorPreview.ABI.makeILearningModelVariableDescriptorPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelVariableDescriptorPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelVariableDescriptorPreview.ABI.makeILearningModelVariableDescriptorPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TensorVariableDescriptorPreview> {
    public override fun getValue() = TensorVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: TensorVariableDescriptorPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TensorVariableDescriptorPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TensorVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return TensorVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: TensorVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
