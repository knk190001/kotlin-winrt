package Windows.AI.MachineLearning

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

@ABIMarker(TensorFeatureDescriptor.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.TensorFeatureDescriptor;{74455c80-946a-4310-a19c-ee0af028fce4})")
@WinRTByReference(brClass = TensorFeatureDescriptor.ByReference::class)
public class TensorFeatureDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITensorFeatureDescriptor.WithDefault,
    ILearningModelFeatureDescriptor.WithDefault, IWinRTObject {
  private val __1138321197_Interface: ITensorFeatureDescriptor.WithDefault by lazy {
    as_1138321197()
  }


  private val __400222983_Interface: ILearningModelFeatureDescriptor.WithDefault by lazy {
    as_400222983()
  }


  public override val __1138321197_Ptr: JNAPointer? by lazy {
    __1138321197_Interface.__1138321197_Ptr
  }


  public override val __400222983_Ptr: JNAPointer? by lazy {
    __400222983_Interface.__400222983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1138321197_Interface, __400222983_Interface)

  private fun as_1138321197(): ITensorFeatureDescriptor.WithDefault {
    if(pointer == NULL) {
      return(ITensorFeatureDescriptor.ABI.makeITensorFeatureDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensorFeatureDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensorFeatureDescriptor.ABI.makeITensorFeatureDescriptor(ref.value))
  }

  private fun as_400222983(): ILearningModelFeatureDescriptor.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelFeatureDescriptor.ABI.makeILearningModelFeatureDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelFeatureDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelFeatureDescriptor.ABI.makeILearningModelFeatureDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TensorFeatureDescriptor> {
    public override fun getValue() = TensorFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: TensorFeatureDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TensorFeatureDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TensorFeatureDescriptor {
      val address = segment.toRawLongValue()
      return TensorFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: TensorFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
