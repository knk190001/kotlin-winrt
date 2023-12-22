package Windows.AI.MachineLearning

import Windows.AI.MachineLearning.ILearningModelSessionFactory2.ABI.IID
import Windows.Foundation.IClosable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LearningModelSession.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModelSession;{8e58f8f6-b787-4c11-90f0-7129aeca74a9})")
@WinRTByReference(brClass = LearningModelSession.ByReference::class)
public class LearningModelSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2077341302_Interface: ILearningModelSession.WithDefault by lazy {
    as_2077341302()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2077341302_Ptr: JNAPointer? by lazy {
    __2077341302_Interface.__2077341302_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2077341302_Interface, __1260617006_Interface)

  public constructor(
    model: LearningModel,
    deviceToRunOn: LearningModelDevice,
    learningModelSessionOptions: LearningModelSessionOptions
  ) : this(ABI.activate(model, deviceToRunOn, learningModelSessionOptions))

  public constructor(model: LearningModel) : this(ABI.activate(model))

  public constructor(model: LearningModel, deviceToRunOn: LearningModelDevice) :
      this(ABI.activate(model, deviceToRunOn))

  private fun as_2077341302(): ILearningModelSession.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelSession.ABI.makeILearningModelSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelSession.ABI.makeILearningModelSession(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelSession> {
    public override fun getValue() = LearningModelSession(pointer.getPointer(0))

    public fun setValue(value: LearningModelSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelSession, MemoryAddress> {
    public val ILearningModelSessionFactory2_Instance: ILearningModelSessionFactory2 by lazy {
      createILearningModelSessionFactory2()
    }


    public val ILearningModelSessionFactory_Instance: ILearningModelSessionFactory by lazy {
      createILearningModelSessionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelSessionFactory2(): ILearningModelSessionFactory2 {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILearningModelSessionFactory2.ABI.makeILearningModelSessionFactory2(factoryActivatorPtr.value))
    }

    public fun createILearningModelSessionFactory(): ILearningModelSessionFactory {
      val refiid = Guid.REFIID(ILearningModelSessionFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILearningModelSessionFactory.ABI.makeILearningModelSessionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      model: LearningModel,
      deviceToRunOn: LearningModelDevice,
      learningModelSessionOptions: LearningModelSessionOptions
    ): JNAPointer? =
        ILearningModelSessionFactory2_Instance.CreateFromModelOnDeviceWithSessionOptions(model,
        deviceToRunOn, learningModelSessionOptions)?.pointer

    public fun activate(model: LearningModel): JNAPointer? =
        ILearningModelSessionFactory_Instance.CreateFromModel(model)?.pointer

    public fun activate(model: LearningModel, deviceToRunOn: LearningModelDevice): JNAPointer? =
        ILearningModelSessionFactory_Instance.CreateFromModelOnDevice(model, deviceToRunOn)?.pointer

    public override fun fromNative(segment: MemoryAddress): LearningModelSession {
      val address = segment.toRawLongValue()
      return LearningModelSession(Pointer(address))
    }

    public override fun toNative(obj: LearningModelSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
