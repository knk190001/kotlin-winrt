package Windows.AI.MachineLearning

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(LearningModelSessionOptions.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModelSessionOptions;{b8f63fa1-134d-5133-8cff-3a5c3c263beb})")
@WinRTByReference(brClass = LearningModelSessionOptions.ByReference::class)
public class LearningModelSessionOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelSessionOptions.WithDefault,
    ILearningModelSessionOptions2.WithDefault, ILearningModelSessionOptions3.WithDefault,
    IWinRTObject {
  private val __1509877172_Interface: ILearningModelSessionOptions.WithDefault by lazy {
    as_1509877172()
  }


  private val __438447874_Interface: ILearningModelSessionOptions2.WithDefault by lazy {
    as_438447874()
  }


  private val __438447873_Interface: ILearningModelSessionOptions3.WithDefault by lazy {
    as_438447873()
  }


  public override val __1509877172_Ptr: JNAPointer? by lazy {
    __1509877172_Interface.__1509877172_Ptr
  }


  public override val __438447874_Ptr: JNAPointer? by lazy {
    __438447874_Interface.__438447874_Ptr
  }


  public override val __438447873_Ptr: JNAPointer? by lazy {
    __438447873_Interface.__438447873_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1509877172_Interface, __438447874_Interface, __438447873_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1509877172(): ILearningModelSessionOptions.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelSessionOptions.ABI.makeILearningModelSessionOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelSessionOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelSessionOptions.ABI.makeILearningModelSessionOptions(ref.value))
  }

  private fun as_438447874(): ILearningModelSessionOptions2.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelSessionOptions2.ABI.makeILearningModelSessionOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelSessionOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelSessionOptions2.ABI.makeILearningModelSessionOptions2(ref.value))
  }

  private fun as_438447873(): ILearningModelSessionOptions3.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelSessionOptions3.ABI.makeILearningModelSessionOptions3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelSessionOptions3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelSessionOptions3.ABI.makeILearningModelSessionOptions3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelSessionOptions> {
    public override fun getValue() = LearningModelSessionOptions(pointer.getPointer(0))

    public fun setValue(value: LearningModelSessionOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelSessionOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelSessionOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): LearningModelSessionOptions {
      val address = segment.toRawLongValue()
      return LearningModelSessionOptions(Pointer(address))
    }

    public override fun toNative(obj: LearningModelSessionOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
