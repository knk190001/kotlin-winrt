package Windows.AI.MachineLearning.Preview

import Windows.AI.MachineLearning.Preview.ILearningModelBindingPreviewFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(LearningModelBindingPreview.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.Preview.LearningModelBindingPreview;{93c901e8-6c78-4b4f-aec1-a6bb9e691624})")
@WinRTByReference(brClass = LearningModelBindingPreview.ByReference::class)
public class LearningModelBindingPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelBindingPreview.WithDefault, IMapView<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?>, IWinRTObject {
  private val __891028169_Interface: ILearningModelBindingPreview.WithDefault by lazy {
    as_891028169()
  }


  private val __1676682589_Interface: IMapView<String?, IUnknown?> by lazy {
    as_1676682589()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  public override val __1676682589_Type: KType = typeOf<IMapView<String?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IUnknown?>?>>()

  public override val __891028169_Ptr: JNAPointer? by lazy {
    __891028169_Interface.__891028169_Ptr
  }


  public override val __1676682589_Ptr: JNAPointer? by lazy {
    __1676682589_Interface.__1676682589_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__891028169_Interface, __1676682589_Interface, __1449643190_Interface)

  public constructor(model: LearningModelPreview) : this(ABI.activate(model))

  private fun as_891028169(): ILearningModelBindingPreview.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelBindingPreview.ABI.makeILearningModelBindingPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelBindingPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelBindingPreview.ABI.makeILearningModelBindingPreview(ref.value))
  }

  private fun as_1676682589(): IMapView<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IMapView.ABI.makeIMapView<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapView<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapView.ABI.makeIMapView<String?, IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, IUnknown?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, IUnknown?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelBindingPreview> {
    public override fun getValue() = LearningModelBindingPreview(pointer.getPointer(0))

    public fun setValue(value: LearningModelBindingPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelBindingPreview, MemoryAddress> {
    public val ILearningModelBindingPreviewFactory_Instance: ILearningModelBindingPreviewFactory by
        lazy {
      createILearningModelBindingPreviewFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelBindingPreviewFactory(): ILearningModelBindingPreviewFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.Preview.LearningModelBindingPreview".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILearningModelBindingPreviewFactory.ABI.makeILearningModelBindingPreviewFactory(factoryActivatorPtr.value))
    }

    public fun activate(model: LearningModelPreview): JNAPointer? =
        ILearningModelBindingPreviewFactory_Instance.CreateFromModel(model)?.pointer

    public override fun fromNative(segment: MemoryAddress): LearningModelBindingPreview {
      val address = segment.toRawLongValue()
      return LearningModelBindingPreview(Pointer(address))
    }

    public override fun toNative(obj: LearningModelBindingPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
