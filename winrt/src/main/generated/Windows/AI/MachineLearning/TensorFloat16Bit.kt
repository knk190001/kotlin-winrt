package Windows.AI.MachineLearning

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IClosable
import Windows.Foundation.IMemoryBuffer
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.Float
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TensorFloat16Bit.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.TensorFloat16Bit;{0ab994fc-5b89-4c3c-b5e4-5282a5316c0a})")
@WinRTByReference(brClass = TensorFloat16Bit.ByReference::class)
public class TensorFloat16Bit(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITensorFloat16Bit.WithDefault, ITensor.WithDefault,
    ILearningModelFeatureValue.WithDefault, IMemoryBuffer.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __810062684_Interface: ITensorFloat16Bit.WithDefault by lazy {
    as_810062684()
  }


  private val __593465016_Interface: ITensor.WithDefault by lazy {
    as_593465016()
  }


  private val __608697945_Interface: ILearningModelFeatureValue.WithDefault by lazy {
    as_608697945()
  }


  private val __2070864652_Interface: IMemoryBuffer.WithDefault by lazy {
    as_2070864652()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __810062684_Ptr: JNAPointer? by lazy {
    __810062684_Interface.__810062684_Ptr
  }


  public override val __593465016_Ptr: JNAPointer? by lazy {
    __593465016_Interface.__593465016_Ptr
  }


  public override val __608697945_Ptr: JNAPointer? by lazy {
    __608697945_Interface.__608697945_Ptr
  }


  public override val __2070864652_Ptr: JNAPointer? by lazy {
    __2070864652_Interface.__2070864652_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__810062684_Interface, __593465016_Interface, __608697945_Interface,
        __2070864652_Interface, __1260617006_Interface)

  private fun as_810062684(): ITensorFloat16Bit.WithDefault {
    if(pointer == NULL) {
      return(ITensorFloat16Bit.ABI.makeITensorFloat16Bit(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensorFloat16Bit>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensorFloat16Bit.ABI.makeITensorFloat16Bit(ref.value))
  }

  private fun as_593465016(): ITensor.WithDefault {
    if(pointer == NULL) {
      return(ITensor.ABI.makeITensor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensor.ABI.makeITensor(ref.value))
  }

  private fun as_608697945(): ILearningModelFeatureValue.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelFeatureValue.ABI.makeILearningModelFeatureValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelFeatureValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelFeatureValue.ABI.makeILearningModelFeatureValue(ref.value))
  }

  private fun as_2070864652(): IMemoryBuffer.WithDefault {
    if(pointer == NULL) {
      return(IMemoryBuffer.ABI.makeIMemoryBuffer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMemoryBuffer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMemoryBuffer.ABI.makeIMemoryBuffer(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TensorFloat16Bit> {
    public override fun getValue() = TensorFloat16Bit(pointer.getPointer(0))

    public fun setValue(value: TensorFloat16Bit): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TensorFloat16Bit, MemoryAddress> {
    public val ITensorFloat16BitStatics_Instance: ITensorFloat16BitStatics by lazy {
      createITensorFloat16BitStatics()
    }


    public val ITensorFloat16BitStatics2_Instance: ITensorFloat16BitStatics2 by lazy {
      createITensorFloat16BitStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITensorFloat16BitStatics(): ITensorFloat16BitStatics {
      val refiid = Guid.REFIID(ITensorFloat16BitStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorFloat16Bit".toHandle(),refiid,interfacePtr)
      val result = ITensorFloat16BitStatics.ABI.makeITensorFloat16BitStatics(interfacePtr.value)
      return result
    }

    public fun createITensorFloat16BitStatics2(): ITensorFloat16BitStatics2 {
      val refiid = Guid.REFIID(ITensorFloat16BitStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorFloat16Bit".toHandle(),refiid,interfacePtr)
      val result = ITensorFloat16BitStatics2.ABI.makeITensorFloat16BitStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TensorFloat16Bit {
      val address = segment.toRawLongValue()
      return TensorFloat16Bit(Pointer(address))
    }

    public override fun toNative(obj: TensorFloat16Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create() = ABI.ITensorFloat16BitStatics_Instance.Create()

    public fun Create(shape: IIterable<Long>) = ABI.ITensorFloat16BitStatics_Instance.Create(shape)

    public fun CreateFromArray(shape: IIterable<Long>, `data`: Array<Float>) =
        ABI.ITensorFloat16BitStatics_Instance.CreateFromArray(shape, data)

    public fun CreateFromIterable(shape: IIterable<Long>, `data`: IIterable<Float>) =
        ABI.ITensorFloat16BitStatics_Instance.CreateFromIterable(shape, data)

    public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Float>) =
        ABI.ITensorFloat16BitStatics2_Instance.CreateFromShapeArrayAndDataArray(shape, data)

    public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer) =
        ABI.ITensorFloat16BitStatics2_Instance.CreateFromBuffer(shape, buffer)
  }
}
