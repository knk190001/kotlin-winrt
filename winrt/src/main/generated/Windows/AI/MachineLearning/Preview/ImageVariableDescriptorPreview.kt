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

@ABIMarker(ImageVariableDescriptorPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.ImageVariableDescriptorPreview;{7ae1fa72-029e-4dc5-a2f8-5fb763154150})")
@WinRTByReference(brClass = ImageVariableDescriptorPreview.ByReference::class)
public class ImageVariableDescriptorPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageVariableDescriptorPreview.WithDefault,
    ILearningModelVariableDescriptorPreview.WithDefault, IWinRTObject {
  private val __1091653241_Interface: IImageVariableDescriptorPreview.WithDefault by lazy {
    as_1091653241()
  }


  private val __614308553_Interface: ILearningModelVariableDescriptorPreview.WithDefault by lazy {
    as_614308553()
  }


  public override val __1091653241_Ptr: JNAPointer? by lazy {
    __1091653241_Interface.__1091653241_Ptr
  }


  public override val __614308553_Ptr: JNAPointer? by lazy {
    __614308553_Interface.__614308553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1091653241_Interface, __614308553_Interface)

  private fun as_1091653241(): IImageVariableDescriptorPreview.WithDefault {
    if(pointer == NULL) {
      return(IImageVariableDescriptorPreview.ABI.makeIImageVariableDescriptorPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageVariableDescriptorPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageVariableDescriptorPreview.ABI.makeIImageVariableDescriptorPreview(ref.value))
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
      IByReference<ImageVariableDescriptorPreview> {
    public override fun getValue() = ImageVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: ImageVariableDescriptorPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageVariableDescriptorPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return ImageVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: ImageVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
