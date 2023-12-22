package Windows.AI.MachineLearning

import Windows.Media.VideoFrame
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

@ABIMarker(ImageFeatureValue.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.ImageFeatureValue;{f0414fd9-c9aa-4405-b7fb-94f87c8a3037})")
@WinRTByReference(brClass = ImageFeatureValue.ByReference::class)
public class ImageFeatureValue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageFeatureValue.WithDefault, ILearningModelFeatureValue.WithDefault,
    IWinRTObject {
  private val __1853888855_Interface: IImageFeatureValue.WithDefault by lazy {
    as_1853888855()
  }


  private val __608697945_Interface: ILearningModelFeatureValue.WithDefault by lazy {
    as_608697945()
  }


  public override val __1853888855_Ptr: JNAPointer? by lazy {
    __1853888855_Interface.__1853888855_Ptr
  }


  public override val __608697945_Ptr: JNAPointer? by lazy {
    __608697945_Interface.__608697945_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1853888855_Interface, __608697945_Interface)

  private fun as_1853888855(): IImageFeatureValue.WithDefault {
    if(pointer == NULL) {
      return(IImageFeatureValue.ABI.makeIImageFeatureValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageFeatureValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageFeatureValue.ABI.makeIImageFeatureValue(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageFeatureValue> {
    public override fun getValue() = ImageFeatureValue(pointer.getPointer(0))

    public fun setValue(value: ImageFeatureValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageFeatureValue, MemoryAddress> {
    public val IImageFeatureValueStatics_Instance: IImageFeatureValueStatics by lazy {
      createIImageFeatureValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIImageFeatureValueStatics(): IImageFeatureValueStatics {
      val refiid = Guid.REFIID(IImageFeatureValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.ImageFeatureValue".toHandle(),refiid,interfacePtr)
      val result = IImageFeatureValueStatics.ABI.makeIImageFeatureValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ImageFeatureValue {
      val address = segment.toRawLongValue()
      return ImageFeatureValue(Pointer(address))
    }

    public override fun toNative(obj: ImageFeatureValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromVideoFrame(image: VideoFrame) =
        ABI.IImageFeatureValueStatics_Instance.CreateFromVideoFrame(image)
  }
}
