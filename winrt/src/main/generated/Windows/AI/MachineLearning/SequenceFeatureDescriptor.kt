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

@ABIMarker(SequenceFeatureDescriptor.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.SequenceFeatureDescriptor;{84f6945a-562b-4d62-a851-739aced96668})")
@WinRTByReference(brClass = SequenceFeatureDescriptor.ByReference::class)
public class SequenceFeatureDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISequenceFeatureDescriptor.WithDefault,
    ILearningModelFeatureDescriptor.WithDefault, IWinRTObject {
  private val __367885445_Interface: ISequenceFeatureDescriptor.WithDefault by lazy {
    as_367885445()
  }


  private val __400222983_Interface: ILearningModelFeatureDescriptor.WithDefault by lazy {
    as_400222983()
  }


  public override val __367885445_Ptr: JNAPointer? by lazy {
    __367885445_Interface.__367885445_Ptr
  }


  public override val __400222983_Ptr: JNAPointer? by lazy {
    __400222983_Interface.__400222983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__367885445_Interface, __400222983_Interface)

  private fun as_367885445(): ISequenceFeatureDescriptor.WithDefault {
    if(pointer == NULL) {
      return(ISequenceFeatureDescriptor.ABI.makeISequenceFeatureDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISequenceFeatureDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISequenceFeatureDescriptor.ABI.makeISequenceFeatureDescriptor(ref.value))
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
      IByReference<SequenceFeatureDescriptor> {
    public override fun getValue() = SequenceFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: SequenceFeatureDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SequenceFeatureDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SequenceFeatureDescriptor {
      val address = segment.toRawLongValue()
      return SequenceFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: SequenceFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
