package Windows.AI.MachineLearning.Preview

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LearningModelPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.LearningModelPreview;{049c266a-93b4-478c-aeb8-70157bf0ff94})")
@WinRTByReference(brClass = LearningModelPreview.ByReference::class)
public class LearningModelPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelPreview.WithDefault, IWinRTObject {
  private val __1539506498_Interface: ILearningModelPreview.WithDefault by lazy {
    as_1539506498()
  }


  public override val __1539506498_Ptr: JNAPointer? by lazy {
    __1539506498_Interface.__1539506498_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1539506498_Interface)

  private fun as_1539506498(): ILearningModelPreview.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelPreview.ABI.makeILearningModelPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelPreview.ABI.makeILearningModelPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelPreview> {
    public override fun getValue() = LearningModelPreview(pointer.getPointer(0))

    public fun setValue(value: LearningModelPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelPreview, MemoryAddress> {
    public val ILearningModelPreviewStatics_Instance: ILearningModelPreviewStatics by lazy {
      createILearningModelPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelPreviewStatics(): ILearningModelPreviewStatics {
      val refiid = Guid.REFIID(ILearningModelPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.Preview.LearningModelPreview".toHandle(),refiid,interfacePtr)
      val result =
          ILearningModelPreviewStatics.ABI.makeILearningModelPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LearningModelPreview {
      val address = segment.toRawLongValue()
      return LearningModelPreview(Pointer(address))
    }

    public override fun toNative(obj: LearningModelPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadModelFromStorageFileAsync(modelFile: IStorageFile) =
        ABI.ILearningModelPreviewStatics_Instance.LoadModelFromStorageFileAsync(modelFile)

    public fun LoadModelFromStreamAsync(modelStream: IRandomAccessStreamReference) =
        ABI.ILearningModelPreviewStatics_Instance.LoadModelFromStreamAsync(modelStream)
  }
}
