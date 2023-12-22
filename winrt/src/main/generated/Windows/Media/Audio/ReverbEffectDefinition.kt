package Windows.Media.Audio

import Windows.Media.Audio.IReverbEffectDefinitionFactory.ABI.IID
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

@ABIMarker(ReverbEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Audio.ReverbEffectDefinition;{4606aa89-f563-4d0a-8f6e-f0cddff35d84})")
@WinRTByReference(brClass = ReverbEffectDefinition.ByReference::class)
public class ReverbEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IReverbEffectDefinition.WithDefault, IAudioEffectDefinition.WithDefault,
    IWinRTObject {
  private val __510138430_Interface: IReverbEffectDefinition.WithDefault by lazy {
    as_510138430()
  }


  private val __1562923618_Interface: IAudioEffectDefinition.WithDefault by lazy {
    as_1562923618()
  }


  public override val __510138430_Ptr: JNAPointer? by lazy {
    __510138430_Interface.__510138430_Ptr
  }


  public override val __1562923618_Ptr: JNAPointer? by lazy {
    __1562923618_Interface.__1562923618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__510138430_Interface, __1562923618_Interface)

  public constructor(audioGraph: AudioGraph) : this(ABI.activate(audioGraph))

  private fun as_510138430(): IReverbEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IReverbEffectDefinition.ABI.makeIReverbEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReverbEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReverbEffectDefinition.ABI.makeIReverbEffectDefinition(ref.value))
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
      IByReference<ReverbEffectDefinition> {
    public override fun getValue() = ReverbEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: ReverbEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ReverbEffectDefinition, MemoryAddress> {
    public val IReverbEffectDefinitionFactory_Instance: IReverbEffectDefinitionFactory by lazy {
      createIReverbEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIReverbEffectDefinitionFactory(): IReverbEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.ReverbEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IReverbEffectDefinitionFactory.ABI.makeIReverbEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(audioGraph: AudioGraph): JNAPointer? =
        IReverbEffectDefinitionFactory_Instance.Create(audioGraph)?.pointer

    public override fun fromNative(segment: MemoryAddress): ReverbEffectDefinition {
      val address = segment.toRawLongValue()
      return ReverbEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: ReverbEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
