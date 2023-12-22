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
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TensorInt64Bit.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.TensorInt64Bit;{499665ba-1fa2-45ad-af25-a0bd9bda4c87})")
@WinRTByReference(brClass = TensorInt64Bit.ByReference::class)
public class TensorInt64Bit(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITensorInt64Bit.WithDefault, ITensor.WithDefault,
    ILearningModelFeatureValue.WithDefault, IMemoryBuffer.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __28811848_Interface: ITensorInt64Bit.WithDefault by lazy {
    as_28811848()
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


  public override val __28811848_Ptr: JNAPointer? by lazy {
    __28811848_Interface.__28811848_Ptr
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
    get() = arrayOf(__28811848_Interface, __593465016_Interface, __608697945_Interface,
        __2070864652_Interface, __1260617006_Interface)

  private fun as_28811848(): ITensorInt64Bit.WithDefault {
    if(pointer == NULL) {
      return(ITensorInt64Bit.ABI.makeITensorInt64Bit(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensorInt64Bit>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensorInt64Bit.ABI.makeITensorInt64Bit(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TensorInt64Bit>
      {
    public override fun getValue() = TensorInt64Bit(pointer.getPointer(0))

    public fun setValue(value: TensorInt64Bit): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TensorInt64Bit, MemoryAddress> {
    public val ITensorInt64BitStatics2_Instance: ITensorInt64BitStatics2 by lazy {
      createITensorInt64BitStatics2()
    }


    public val ITensorInt64BitStatics_Instance: ITensorInt64BitStatics by lazy {
      createITensorInt64BitStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITensorInt64BitStatics2(): ITensorInt64BitStatics2 {
      val refiid = Guid.REFIID(ITensorInt64BitStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorInt64Bit".toHandle(),refiid,interfacePtr)
      val result = ITensorInt64BitStatics2.ABI.makeITensorInt64BitStatics2(interfacePtr.value)
      return result
    }

    public fun createITensorInt64BitStatics(): ITensorInt64BitStatics {
      val refiid = Guid.REFIID(ITensorInt64BitStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorInt64Bit".toHandle(),refiid,interfacePtr)
      val result = ITensorInt64BitStatics.ABI.makeITensorInt64BitStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TensorInt64Bit {
      val address = segment.toRawLongValue()
      return TensorInt64Bit(Pointer(address))
    }

    public override fun toNative(obj: TensorInt64Bit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Long>) =
        ABI.ITensorInt64BitStatics2_Instance.CreateFromShapeArrayAndDataArray(shape, data)

    public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer) =
        ABI.ITensorInt64BitStatics2_Instance.CreateFromBuffer(shape, buffer)

    public fun Create() = ABI.ITensorInt64BitStatics_Instance.Create()

    public fun Create(shape: IIterable<Long>) = ABI.ITensorInt64BitStatics_Instance.Create(shape)

    public fun CreateFromArray(shape: IIterable<Long>, `data`: Array<Long>) =
        ABI.ITensorInt64BitStatics_Instance.CreateFromArray(shape, data)

    public fun CreateFromIterable(shape: IIterable<Long>, `data`: IIterable<Long>) =
        ABI.ITensorInt64BitStatics_Instance.CreateFromIterable(shape, data)
  }
}
