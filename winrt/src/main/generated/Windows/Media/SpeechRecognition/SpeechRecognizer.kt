package Windows.Media.SpeechRecognition

import Windows.Foundation.IClosable
import Windows.Globalization.Language
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(SpeechRecognizer.ABI::class)
@Signature("rc(Windows.Media.SpeechRecognition.SpeechRecognizer;{0bc3c9cb-c26a-40f2-aeb5-8096b2e48073})")
@WinRTByReference(brClass = SpeechRecognizer.ByReference::class)
public class SpeechRecognizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechRecognizer.WithDefault, IClosable.WithDefault,
    ISpeechRecognizer2.WithDefault, IWinRTObject {
  private val __546721937_Interface: ISpeechRecognizer.WithDefault by lazy {
    as_546721937()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __231489187_Interface: ISpeechRecognizer2.WithDefault by lazy {
    as_231489187()
  }


  public override val __546721937_Ptr: JNAPointer? by lazy {
    __546721937_Interface.__546721937_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __231489187_Ptr: JNAPointer? by lazy {
    __231489187_Interface.__231489187_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__546721937_Interface, __1260617006_Interface, __231489187_Interface)

  public constructor() : this(ABI.activate())

  public constructor(language: Language) : this(ABI.activate(language))

  private fun as_546721937(): ISpeechRecognizer.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognizer.ABI.makeISpeechRecognizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognizer.ABI.makeISpeechRecognizer(ref.value))
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

  private fun as_231489187(): ISpeechRecognizer2.WithDefault {
    if(pointer == NULL) {
      return(ISpeechRecognizer2.ABI.makeISpeechRecognizer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechRecognizer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechRecognizer2.ABI.makeISpeechRecognizer2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechRecognizer> {
    public override fun getValue() = SpeechRecognizer(pointer.getPointer(0))

    public fun setValue(value: SpeechRecognizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechRecognizer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISpeechRecognizerStatics_Instance: ISpeechRecognizerStatics by lazy {
      createISpeechRecognizerStatics()
    }


    public val ISpeechRecognizerStatics2_Instance: ISpeechRecognizerStatics2 by lazy {
      createISpeechRecognizerStatics2()
    }


    public val ISpeechRecognizerFactory_Instance: ISpeechRecognizerFactory by lazy {
      createISpeechRecognizerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognizer".toHandle(),
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

    public fun createISpeechRecognizerStatics(): ISpeechRecognizerStatics {
      val refiid = Guid.REFIID(ISpeechRecognizerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognizer".toHandle(),refiid,interfacePtr)
      val result = ISpeechRecognizerStatics.ABI.makeISpeechRecognizerStatics(interfacePtr.value)
      return result
    }

    public fun createISpeechRecognizerStatics2(): ISpeechRecognizerStatics2 {
      val refiid = Guid.REFIID(ISpeechRecognizerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognizer".toHandle(),refiid,interfacePtr)
      val result = ISpeechRecognizerStatics2.ABI.makeISpeechRecognizerStatics2(interfacePtr.value)
      return result
    }

    public fun createISpeechRecognizerFactory(): ISpeechRecognizerFactory {
      val refiid = Guid.REFIID(ISpeechRecognizerFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechRecognition.SpeechRecognizer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpeechRecognizerFactory.ABI.makeISpeechRecognizerFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: Language): JNAPointer? =
        ISpeechRecognizerFactory_Instance.Create(language)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpeechRecognizer {
      val address = segment.toRawLongValue()
      return SpeechRecognizer(Pointer(address))
    }

    public override fun toNative(obj: SpeechRecognizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SystemSpeechLanguage() =
        ABI.ISpeechRecognizerStatics_Instance.get_SystemSpeechLanguage()

    public fun get_SupportedTopicLanguages() =
        ABI.ISpeechRecognizerStatics_Instance.get_SupportedTopicLanguages()

    public fun get_SupportedGrammarLanguages() =
        ABI.ISpeechRecognizerStatics_Instance.get_SupportedGrammarLanguages()

    public fun TrySetSystemSpeechLanguageAsync(speechLanguage: Language) =
        ABI.ISpeechRecognizerStatics2_Instance.TrySetSystemSpeechLanguageAsync(speechLanguage)
  }
}
