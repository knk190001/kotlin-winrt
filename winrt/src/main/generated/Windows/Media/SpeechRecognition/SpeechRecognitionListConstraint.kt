package Windows.Media.SpeechRecognition

import Windows.Foundation.Collections.IIterable
import Windows.Media.SpeechRecognition.ISpeechRecognitionListConstraintFactory.ABI.IID
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

@ABIMarker(SpeechRecognitionListConstraint.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint;{09c487e9-e4ad-4526-81f2-4946fb481d98})")
@WinRTByReference(brClass = SpeechRecognitionListConstraint.ByReference::class)
public class SpeechRecognitionListConstraint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionListConstraint.WithDefault,
    ISpeechRecognitionConstraint.WithDefault, IWinRTObject {
  private val __1632854137_Interface: ISpeechRecognitionListConstraint.WithDefault by lazy {
    as_1632854137()
  }


  private val __411817545_Interface: ISpeechRecognitionConstraint.WithDefault by lazy {
    as_411817545()
  }


  public override val __1632854137_Ptr: JNAPointer? by lazy {
    __1632854137_Interface.__1632854137_Ptr
  }


  public override val __411817545_Ptr: JNAPointer? by lazy {
    __411817545_Interface.__411817545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1632854137_Interface, __411817545_Interface)

  public constructor(commands: IIterable<String?>) : this(ABI.activate(commands))

  public constructor(commands: IIterable<String?>, tag: String) : this(ABI.activate(commands, tag))

  private fun as_1632854137(): ISpeechRecognitionListConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionListConstraint.ABI.makeISpeechRecognitionListConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionListConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionListConstraint.ABI.makeISpeechRecognitionListConstraint(ref.value))
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
      IByReference<SpeechRecognitionListConstraint> {
    public override fun getValue() = SpeechRecognitionListConstraint(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionListConstraint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionListConstraint, MemoryAddress> {
    public val ISpeechRecognitionListConstraintFactory_Instance:
        ISpeechRecognitionListConstraintFactory by lazy {
      createISpeechRecognitionListConstraintFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpeechRecognitionListConstraintFactory():
        ISpeechRecognitionListConstraintFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognitionListConstraint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpeechRecognitionListConstraintFactory.ABI.makeISpeechRecognitionListConstraintFactory(factoryActivatorPtr.value))
    }

    public fun activate(commands: IIterable<String?>): JNAPointer? =
        ISpeechRecognitionListConstraintFactory_Instance.Create(commands)?.pointer

    public fun activate(commands: IIterable<String?>, tag: String): JNAPointer? =
        ISpeechRecognitionListConstraintFactory_Instance.CreateWithTag(commands, tag)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionListConstraint {
      val address = segment.toRawLongValue()
      return SpeechRecognitionListConstraint(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionListConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
