package Windows.AI.MachineLearning

import Windows.AI.MachineLearning.ILearningModelBindingFactory.ABI.IID
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

@ABIMarker(LearningModelBinding.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModelBinding;{ea312f20-168f-4f8c-94fe-2e7ac31b4aa8})")
@WinRTByReference(brClass = LearningModelBinding.ByReference::class)
public class LearningModelBinding(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelBinding.WithDefault, IMapView<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?>, IWinRTObject {
  private val __124417401_Interface: ILearningModelBinding.WithDefault by lazy {
    as_124417401()
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

  public override val __124417401_Ptr: JNAPointer? by lazy {
    __124417401_Interface.__124417401_Ptr
  }


  public override val __1676682589_Ptr: JNAPointer? by lazy {
    __1676682589_Interface.__1676682589_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__124417401_Interface, __1676682589_Interface, __1449643190_Interface)

  public constructor(session: LearningModelSession) : this(ABI.activate(session))

  private fun as_124417401(): ILearningModelBinding.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelBinding.ABI.makeILearningModelBinding(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelBinding>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelBinding.ABI.makeILearningModelBinding(ref.value))
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
      IByReference<LearningModelBinding> {
    public override fun getValue() = LearningModelBinding(pointer.getPointer(0))

    public fun setValue(value: LearningModelBinding): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelBinding, MemoryAddress> {
    public val ILearningModelBindingFactory_Instance: ILearningModelBindingFactory by lazy {
      createILearningModelBindingFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelBindingFactory(): ILearningModelBindingFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelBinding".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILearningModelBindingFactory.ABI.makeILearningModelBindingFactory(factoryActivatorPtr.value))
    }

    public fun activate(session: LearningModelSession): JNAPointer? =
        ILearningModelBindingFactory_Instance.CreateFromSession(session)?.pointer

    public override fun fromNative(segment: MemoryAddress): LearningModelBinding {
      val address = segment.toRawLongValue()
      return LearningModelBinding(Pointer(address))
    }

    public override fun toNative(obj: LearningModelBinding): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
