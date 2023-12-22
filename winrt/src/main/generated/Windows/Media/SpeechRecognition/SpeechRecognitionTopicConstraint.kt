package Windows.Media.SpeechRecognition

import Windows.Media.SpeechRecognition.ISpeechRecognitionTopicConstraintFactory.ABI.IID
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

@ABIMarker(SpeechRecognitionTopicConstraint.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint;{bf6fdf19-825d-4e69-a681-36e48cf1c93e})")
@WinRTByReference(brClass = SpeechRecognitionTopicConstraint.ByReference::class)
public class SpeechRecognitionTopicConstraint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionTopicConstraint.WithDefault,
    ISpeechRecognitionConstraint.WithDefault, IWinRTObject {
  private val __755954560_Interface: ISpeechRecognitionTopicConstraint.WithDefault by lazy {
    as_755954560()
  }


  private val __411817545_Interface: ISpeechRecognitionConstraint.WithDefault by lazy {
    as_411817545()
  }


  public override val __755954560_Ptr: JNAPointer? by lazy {
    __755954560_Interface.__755954560_Ptr
  }


  public override val __411817545_Ptr: JNAPointer? by lazy {
    __411817545_Interface.__411817545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__755954560_Interface, __411817545_Interface)

  public constructor(scenario: SpeechRecognitionScenario, topicHint: String) :
      this(ABI.activate(scenario, topicHint))

  public constructor(
    scenario: SpeechRecognitionScenario,
    topicHint: String,
    tag: String
  ) : this(ABI.activate(scenario, topicHint, tag))

  private fun as_755954560(): ISpeechRecognitionTopicConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionTopicConstraint.ABI.makeISpeechRecognitionTopicConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionTopicConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionTopicConstraint.ABI.makeISpeechRecognitionTopicConstraint(ref.value))
  }

  private fun as_411817545(): ISpeechRecognitionConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionConstraint.ABI.makeISpeechRecognitionConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionConstraint.ABI.makeISpeechRecognitionConstraint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognitionTopicConstraint> {
    public override fun getValue() = SpeechRecognitionTopicConstraint(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionTopicConstraint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionTopicConstraint, MemoryAddress> {
    public val ISpeechRecognitionTopicConstraintFactory_Instance:
        ISpeechRecognitionTopicConstraintFactory by lazy {
      createISpeechRecognitionTopicConstraintFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpeechRecognitionTopicConstraintFactory():
        ISpeechRecognitionTopicConstraintFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognitionTopicConstraint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpeechRecognitionTopicConstraintFactory.ABI.makeISpeechRecognitionTopicConstraintFactory(factoryActivatorPtr.value))
    }

    public fun activate(scenario: SpeechRecognitionScenario, topicHint: String): JNAPointer? =
        ISpeechRecognitionTopicConstraintFactory_Instance.Create(scenario, topicHint)?.pointer

    public fun activate(
      scenario: SpeechRecognitionScenario,
      topicHint: String,
      tag: String
    ): JNAPointer? = ISpeechRecognitionTopicConstraintFactory_Instance.CreateWithTag(scenario,
        topicHint, tag)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionTopicConstraint {
      val address = segment.toRawLongValue()
      return SpeechRecognitionTopicConstraint(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionTopicConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
