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

@ABIMarker(MapVariableDescriptorPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.MapVariableDescriptorPreview;{3cb38370-c02b-4236-b3e8-6bdca49c3129})")
@WinRTByReference(brClass = MapVariableDescriptorPreview.ByReference::class)
public class MapVariableDescriptorPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapVariableDescriptorPreview.WithDefault,
    ILearningModelVariableDescriptorPreview.WithDefault, IWinRTObject {
  private val __539337242_Interface: IMapVariableDescriptorPreview.WithDefault by lazy {
    as_539337242()
  }


  private val __614308553_Interface: ILearningModelVariableDescriptorPreview.WithDefault by lazy {
    as_614308553()
  }


  public override val __539337242_Ptr: JNAPointer? by lazy {
    __539337242_Interface.__539337242_Ptr
  }


  public override val __614308553_Ptr: JNAPointer? by lazy {
    __614308553_Interface.__614308553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__539337242_Interface, __614308553_Interface)

  private fun as_539337242(): IMapVariableDescriptorPreview.WithDefault {
    if(pointer == NULL) {
      return(IMapVariableDescriptorPreview.ABI.makeIMapVariableDescriptorPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapVariableDescriptorPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapVariableDescriptorPreview.ABI.makeIMapVariableDescriptorPreview(ref.value))
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
      IByReference<MapVariableDescriptorPreview> {
    public override fun getValue() = MapVariableDescriptorPreview(pointer.getPointer(0))

    public fun setValue(value: MapVariableDescriptorPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapVariableDescriptorPreview, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapVariableDescriptorPreview {
      val address = segment.toRawLongValue()
      return MapVariableDescriptorPreview(Pointer(address))
    }

    public override fun toNative(obj: MapVariableDescriptorPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
