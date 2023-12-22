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

@ABIMarker(SequenceVariableDescriptorPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.SequenceVariableDescriptorPreview;{9cd8f292-98b2-4530-a1b6-2ded5fecbc26})")
@WinRTByReference(brClass = SequenceVariableDescriptorPreview.ByReference::class)
public class SequenceVariableDescriptorPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISequenceVariableDescriptorPreview.WithDefault,
    ILearningModelVariableDescriptorPreview.WithDefault, IWinRTObject {
  private val __1177193737_Interface: ISequenceVariableDescriptorPreview.WithDefault by lazy {
    as_1177193737()
  }


  private val __614308553_Interface: ILearningModelVariableDescriptorPreview.WithDefault by lazy {
    as_614308553()
  }


  public override val __1177193737_Ptr: JNAPointer? by lazy {
    __1177193737_Interface.__1177193737_Ptr
  }


  public override val __614308553_Ptr: JNAPointer? by lazy {
    __614308553_Interface.__614308553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1177193737_Interface, __614308553_Interface)

  private fun as_1177193737(): ISequenceVariableDescriptorPreview.WithDefault {
    if(pointer == NULL) {
      return(ISequenceVariableDescriptorPreview.ABI.makeISequenceVariableDescriptorPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISequenceVariableDescriptorPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISequenceVariableDescriptorPreview.ABI.makeISequenceVariableDescriptorPreview(ref.value))
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
      IByReference<SequenceVariableDescriptorPreview> {
    public override fun getValue() = SequenceVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: SequenceVariableDescriptorPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SequenceVariableDescriptorPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SequenceVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return SequenceVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: SequenceVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
