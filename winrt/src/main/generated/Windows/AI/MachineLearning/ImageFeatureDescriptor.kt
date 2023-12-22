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

@ABIMarker(ImageFeatureDescriptor.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.ImageFeatureDescriptor;{365585a5-171a-4a2a-985f-265159d3895a})")
@WinRTByReference(brClass = ImageFeatureDescriptor.ByReference::class)
public class ImageFeatureDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageFeatureDescriptor.WithDefault, IImageFeatureDescriptor2.WithDefault,
    ILearningModelFeatureDescriptor.WithDefault, IWinRTObject {
  private val __1042828105_Interface: IImageFeatureDescriptor.WithDefault by lazy {
    as_1042828105()
  }


  private val __2032067063_Interface: IImageFeatureDescriptor2.WithDefault by lazy {
    as_2032067063()
  }


  private val __400222983_Interface: ILearningModelFeatureDescriptor.WithDefault by lazy {
    as_400222983()
  }


  public override val __1042828105_Ptr: JNAPointer? by lazy {
    __1042828105_Interface.__1042828105_Ptr
  }


  public override val __2032067063_Ptr: JNAPointer? by lazy {
    __2032067063_Interface.__2032067063_Ptr
  }


  public override val __400222983_Ptr: JNAPointer? by lazy {
    __400222983_Interface.__400222983_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1042828105_Interface, __2032067063_Interface, __400222983_Interface)

  private fun as_1042828105(): IImageFeatureDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IImageFeatureDescriptor.ABI.makeIImageFeatureDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageFeatureDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageFeatureDescriptor.ABI.makeIImageFeatureDescriptor(ref.value))
  }

  private fun as_2032067063(): IImageFeatureDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IImageFeatureDescriptor2.ABI.makeIImageFeatureDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageFeatureDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageFeatureDescriptor2.ABI.makeIImageFeatureDescriptor2(ref.value))
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
      IByReference<ImageFeatureDescriptor> {
    public override fun getValue() = ImageFeatureDescriptor(pointer.getPointer(0))

    public fun setValue(value: ImageFeatureDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageFeatureDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageFeatureDescriptor {
      val address = segment.toRawLongValue()
      return ImageFeatureDescriptor(Pointer(address))
    }

    public override fun toNative(obj: ImageFeatureDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
