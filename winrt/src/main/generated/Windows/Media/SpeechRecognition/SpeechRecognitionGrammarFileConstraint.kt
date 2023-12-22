package Windows.Media.SpeechRecognition

import Windows.Media.SpeechRecognition.ISpeechRecognitionGrammarFileConstraintFactory.ABI.IID
import Windows.Storage.StorageFile
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

@ABIMarker(SpeechRecognitionGrammarFileConstraint.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint;{b5031a8f-85ca-4fa4-b11a-474fc41b3835})")
@WinRTByReference(brClass = SpeechRecognitionGrammarFileConstraint.ByReference::class)
public class SpeechRecognitionGrammarFileConstraint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognitionGrammarFileConstraint.WithDefault,
    ISpeechRecognitionConstraint.WithDefault, IWinRTObject {
  private val __1798538260_Interface: ISpeechRecognitionGrammarFileConstraint.WithDefault by lazy {
    as_1798538260()
  }


  private val __411817545_Interface: ISpeechRecognitionConstraint.WithDefault by lazy {
    as_411817545()
  }


  public override val __1798538260_Ptr: JNAPointer? by lazy {
    __1798538260_Interface.__1798538260_Ptr
  }


  public override val __411817545_Ptr: JNAPointer? by lazy {
    __411817545_Interface.__411817545_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1798538260_Interface, __411817545_Interface)

  public constructor(`file`: StorageFile) : this(ABI.activate(file))

  public constructor(`file`: StorageFile, tag: String) : this(ABI.activate(file, tag))

  private fun as_1798538260(): ISpeechRecognitionGrammarFileConstraint.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognitionGrammarFileConstraint.ABI.makeISpeechRecognitionGrammarFileConstraint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognitionGrammarFileConstraint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognitionGrammarFileConstraint.ABI.makeISpeechRecognitionGrammarFileConstraint(ref.value))
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
      IByReference<SpeechRecognitionGrammarFileConstraint> {
    public override fun getValue() = SpeechRecognitionGrammarFileConstraint(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognitionGrammarFileConstraint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognitionGrammarFileConstraint, MemoryAddress> {
    public val ISpeechRecognitionGrammarFileConstraintFactory_Instance:
        ISpeechRecognitionGrammarFileConstraintFactory by lazy {
      createISpeechRecognitionGrammarFileConstraintFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpeechRecognitionGrammarFileConstraintFactory():
        ISpeechRecognitionGrammarFileConstraintFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognitionGrammarFileConstraint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpeechRecognitionGrammarFileConstraintFactory.ABI.makeISpeechRecognitionGrammarFileConstraintFactory(factoryActivatorPtr.value))
    }

    public fun activate(`file`: StorageFile): JNAPointer? =
        ISpeechRecognitionGrammarFileConstraintFactory_Instance.Create(file)?.pointer

    public fun activate(`file`: StorageFile, tag: String): JNAPointer? =
        ISpeechRecognitionGrammarFileConstraintFactory_Instance.CreateWithTag(file, tag)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpeechRecognitionGrammarFileConstraint {
      val address = segment.toRawLongValue()
      return SpeechRecognitionGrammarFileConstraint(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognitionGrammarFileConstraint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
