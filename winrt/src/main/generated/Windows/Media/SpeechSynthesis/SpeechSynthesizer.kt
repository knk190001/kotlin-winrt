package Windows.Media.SpeechSynthesis

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

@ABIMarker(SpeechSynthesizer.ABI::class)
@Signature("rc(Windows.Media.SpeechSynthesis.SpeechSynthesizer;{ce9f7c76-97f4-4ced-ad68-d51c458e45c6})")
@WinRTByReference(brClass = SpeechSynthesizer.ByReference::class)
public class SpeechSynthesizer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpeechSynthesizer.WithDefault, IClosable.WithDefault,
    ISpeechSynthesizer2.WithDefault, IWinRTObject {
  private val __1524385274_Interface: ISpeechSynthesizer.WithDefault by lazy {
    as_1524385274()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __11303288_Interface: ISpeechSynthesizer2.WithDefault by lazy {
    as_11303288()
  }


  public override val __1524385274_Ptr: JNAPointer? by lazy {
    __1524385274_Interface.__1524385274_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __11303288_Ptr: JNAPointer? by lazy {
    __11303288_Interface.__11303288_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1524385274_Interface, __1260617006_Interface, __11303288_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1524385274(): ISpeechSynthesizer.WithDefault {
    if(pointer == NULL) {
      return(ISpeechSynthesizer.ABI.makeISpeechSynthesizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechSynthesizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechSynthesizer.ABI.makeISpeechSynthesizer(ref.value))
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

  private fun as_11303288(): ISpeechSynthesizer2.WithDefault {
    if(pointer == NULL) {
      return(ISpeechSynthesizer2.ABI.makeISpeechSynthesizer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpeechSynthesizer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpeechSynthesizer2.ABI.makeISpeechSynthesizer2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpeechSynthesizer> {
    public override fun getValue() = SpeechSynthesizer(pointer.getPointer(0))

    public fun setValue(value: SpeechSynthesizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpeechSynthesizer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IInstalledVoicesStatic2_Instance: IInstalledVoicesStatic2 by lazy {
      createIInstalledVoicesStatic2()
    }


    public val IInstalledVoicesStatic_Instance: IInstalledVoicesStatic by lazy {
      createIInstalledVoicesStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechSynthesis.SpeechSynthesizer".toHandle(),
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

    public fun createIInstalledVoicesStatic2(): IInstalledVoicesStatic2 {
      val refiid = Guid.REFIID(IInstalledVoicesStatic2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechSynthesis.SpeechSynthesizer".toHandle(),refiid,interfacePtr)
      val result = IInstalledVoicesStatic2.ABI.makeIInstalledVoicesStatic2(interfacePtr.value)
      return result
    }

    public fun createIInstalledVoicesStatic(): IInstalledVoicesStatic {
      val refiid = Guid.REFIID(IInstalledVoicesStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.SpeechSynthesis.SpeechSynthesizer".toHandle(),refiid,interfacePtr)
      val result = IInstalledVoicesStatic.ABI.makeIInstalledVoicesStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpeechSynthesizer {
      val address = segment.toRawLongValue()
      return SpeechSynthesizer(Pointer(address))
    }

    public override fun toNative(obj: SpeechSynthesizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TrySetDefaultVoiceAsync(voice: VoiceInformation) =
        ABI.IInstalledVoicesStatic2_Instance.TrySetDefaultVoiceAsync(voice)

    public fun get_AllVoices() = ABI.IInstalledVoicesStatic_Instance.get_AllVoices()

    public fun get_DefaultVoice() = ABI.IInstalledVoicesStatic_Instance.get_DefaultVoice()
  }
}
