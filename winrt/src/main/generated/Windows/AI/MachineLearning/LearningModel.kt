package Windows.AI.MachineLearning

import Windows.Foundation.IClosable
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LearningModel.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModel;{5b8e4920-489f-4e86-9128-265a327b78fa})")
@WinRTByReference(brClass = LearningModel.ByReference::class)
public class LearningModel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModel.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __261038228_Interface: ILearningModel.WithDefault by lazy {
    as_261038228()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __261038228_Ptr: JNAPointer? by lazy {
    __261038228_Interface.__261038228_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__261038228_Interface, __1260617006_Interface)

  private fun as_261038228(): ILearningModel.WithDefault {
    if(pointer == NULL) {
      return(ILearningModel.ABI.makeILearningModel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModel.ABI.makeILearningModel(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LearningModel>
      {
    public override fun getValue() = LearningModel(pointer.getPointer(0))

    public fun setValue(value: LearningModel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModel, MemoryAddress> {
    public val ILearningModelStatics_Instance: ILearningModelStatics by lazy {
      createILearningModelStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelStatics(): ILearningModelStatics {
      val refiid = Guid.REFIID(ILearningModelStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModel".toHandle(),refiid,interfacePtr)
      val result = ILearningModelStatics.ABI.makeILearningModelStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LearningModel {
      val address = segment.toRawLongValue()
      return LearningModel(Pointer(address))
    }

    public override fun toNative(obj: LearningModel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadFromStorageFileAsync(modelFile: IStorageFile) =
        ABI.ILearningModelStatics_Instance.LoadFromStorageFileAsync(modelFile)

    public fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference) =
        ABI.ILearningModelStatics_Instance.LoadFromStreamAsync(modelStream)

    public fun LoadFromFilePath(filePath: String) =
        ABI.ILearningModelStatics_Instance.LoadFromFilePath(filePath)

    public fun LoadFromStream(modelStream: IRandomAccessStreamReference) =
        ABI.ILearningModelStatics_Instance.LoadFromStream(modelStream)

    public fun LoadFromStorageFileAsync(modelFile: IStorageFile,
        operatorProvider: ILearningModelOperatorProvider) =
        ABI.ILearningModelStatics_Instance.LoadFromStorageFileAsync(modelFile, operatorProvider)

    public fun LoadFromStreamAsync(modelStream: IRandomAccessStreamReference,
        operatorProvider: ILearningModelOperatorProvider) =
        ABI.ILearningModelStatics_Instance.LoadFromStreamAsync(modelStream, operatorProvider)

    public fun LoadFromFilePath(filePath: String, operatorProvider: ILearningModelOperatorProvider)
        = ABI.ILearningModelStatics_Instance.LoadFromFilePath(filePath, operatorProvider)

    public fun LoadFromStream(modelStream: IRandomAccessStreamReference,
        operatorProvider: ILearningModelOperatorProvider) =
        ABI.ILearningModelStatics_Instance.LoadFromStream(modelStream, operatorProvider)
  }
}
