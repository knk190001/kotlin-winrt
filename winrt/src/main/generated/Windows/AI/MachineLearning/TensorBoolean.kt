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
import kotlin.Boolean
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TensorBoolean.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.TensorBoolean;{50f311ed-29e9-4a5c-a44d-8fc512584eed})")
@WinRTByReference(brClass = TensorBoolean.ByReference::class)
public class TensorBoolean(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITensorBoolean.WithDefault, ITensor.WithDefault,
    ILearningModelFeatureValue.WithDefault, IMemoryBuffer.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __462485072_Interface: ITensorBoolean.WithDefault by lazy {
    as_462485072()
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


  public override val __462485072_Ptr: JNAPointer? by lazy {
    __462485072_Interface.__462485072_Ptr
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
    get() = arrayOf(__462485072_Interface, __593465016_Interface, __608697945_Interface,
        __2070864652_Interface, __1260617006_Interface)

  private fun as_462485072(): ITensorBoolean.WithDefault {
    if(pointer == NULL) {
      return(ITensorBoolean.ABI.makeITensorBoolean(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITensorBoolean>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITensorBoolean.ABI.makeITensorBoolean(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TensorBoolean>
      {
    public override fun getValue() = TensorBoolean(pointer.getPointer(0))

    public fun setValue(value: TensorBoolean): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TensorBoolean, MemoryAddress> {
    public val ITensorBooleanStatics_Instance: ITensorBooleanStatics by lazy {
      createITensorBooleanStatics()
    }


    public val ITensorBooleanStatics2_Instance: ITensorBooleanStatics2 by lazy {
      createITensorBooleanStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITensorBooleanStatics(): ITensorBooleanStatics {
      val refiid = Guid.REFIID(ITensorBooleanStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorBoolean".toHandle(),refiid,interfacePtr)
      val result = ITensorBooleanStatics.ABI.makeITensorBooleanStatics(interfacePtr.value)
      return result
    }

    public fun createITensorBooleanStatics2(): ITensorBooleanStatics2 {
      val refiid = Guid.REFIID(ITensorBooleanStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.TensorBoolean".toHandle(),refiid,interfacePtr)
      val result = ITensorBooleanStatics2.ABI.makeITensorBooleanStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TensorBoolean {
      val address = segment.toRawLongValue()
      return TensorBoolean(Pointer(address))
    }

    public override fun toNative(obj: TensorBoolean): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create() = ABI.ITensorBooleanStatics_Instance.Create()

    public fun Create(shape: IIterable<Long>) = ABI.ITensorBooleanStatics_Instance.Create(shape)

    public fun CreateFromArray(shape: IIterable<Long>, `data`: Array<Boolean>) =
        ABI.ITensorBooleanStatics_Instance.CreateFromArray(shape, data)

    public fun CreateFromIterable(shape: IIterable<Long>, `data`: IIterable<Boolean>) =
        ABI.ITensorBooleanStatics_Instance.CreateFromIterable(shape, data)

    public fun CreateFromShapeArrayAndDataArray(shape: Array<Long>, `data`: Array<Boolean>) =
        ABI.ITensorBooleanStatics2_Instance.CreateFromShapeArrayAndDataArray(shape, data)

    public fun CreateFromBuffer(shape: Array<Long>, buffer: IBuffer) =
        ABI.ITensorBooleanStatics2_Instance.CreateFromBuffer(shape, buffer)
  }
}
