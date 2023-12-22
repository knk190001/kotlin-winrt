package Windows.Media.Audio

import Windows.Media.Audio.IEchoEffectDefinitionFactory.ABI.IID
import Windows.Media.Effects.IAudioEffectDefinition
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

@ABIMarker(EchoEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Audio.EchoEffectDefinition;{0e4d3faa-36b8-4c91-b9da-11f44a8a6610})")
@WinRTByReference(brClass = EchoEffectDefinition.ByReference::class)
public class EchoEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEchoEffectDefinition.WithDefault, IAudioEffectDefinition.WithDefault,
    IWinRTObject {
  private val __1578953583_Interface: IEchoEffectDefinition.WithDefault by lazy {
    as_1578953583()
  }


  private val __1562923618_Interface: IAudioEffectDefinition.WithDefault by lazy {
    as_1562923618()
  }


  public override val __1578953583_Ptr: JNAPointer? by lazy {
    __1578953583_Interface.__1578953583_Ptr
  }


  public override val __1562923618_Ptr: JNAPointer? by lazy {
    __1562923618_Interface.__1562923618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1578953583_Interface, __1562923618_Interface)

  public constructor(audioGraph: AudioGraph) : this(ABI.activate(audioGraph))

  private fun as_1578953583(): IEchoEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IEchoEffectDefinition.ABI.makeIEchoEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEchoEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEchoEffectDefinition.ABI.makeIEchoEffectDefinition(ref.value))
  }

  private fun as_1562923618(): IAudioEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IAudioEffectDefinition.ABI.makeIAudioEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioEffectDefinition.ABI.makeIAudioEffectDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EchoEffectDefinition> {
    public override fun getValue() = EchoEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: EchoEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EchoEffectDefinition, MemoryAddress> {
    public val IEchoEffectDefinitionFactory_Instance: IEchoEffectDefinitionFactory by lazy {
      createIEchoEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEchoEffectDefinitionFactory(): IEchoEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.EchoEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEchoEffectDefinitionFactory.ABI.makeIEchoEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(audioGraph: AudioGraph): JNAPointer? =
        IEchoEffectDefinitionFactory_Instance.Create(audioGraph)?.pointer

    public override fun fromNative(segment: MemoryAddress): EchoEffectDefinition {
      val address = segment.toRawLongValue()
      return EchoEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: EchoEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
