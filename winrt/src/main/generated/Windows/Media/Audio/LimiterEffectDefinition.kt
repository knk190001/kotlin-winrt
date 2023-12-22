package Windows.Media.Audio

import Windows.Media.Audio.ILimiterEffectDefinitionFactory.ABI.IID
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

@ABIMarker(LimiterEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Audio.LimiterEffectDefinition;{6b755d19-2603-47ba-bdeb-39055e3486dc})")
@WinRTByReference(brClass = LimiterEffectDefinition.ByReference::class)
public class LimiterEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILimiterEffectDefinition.WithDefault, IAudioEffectDefinition.WithDefault,
    IWinRTObject {
  private val __416587780_Interface: ILimiterEffectDefinition.WithDefault by lazy {
    as_416587780()
  }


  private val __1562923618_Interface: IAudioEffectDefinition.WithDefault by lazy {
    as_1562923618()
  }


  public override val __416587780_Ptr: JNAPointer? by lazy {
    __416587780_Interface.__416587780_Ptr
  }


  public override val __1562923618_Ptr: JNAPointer? by lazy {
    __1562923618_Interface.__1562923618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__416587780_Interface, __1562923618_Interface)

  public constructor(audioGraph: AudioGraph) : this(ABI.activate(audioGraph))

  private fun as_416587780(): ILimiterEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(ILimiterEffectDefinition.ABI.makeILimiterEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILimiterEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILimiterEffectDefinition.ABI.makeILimiterEffectDefinition(ref.value))
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
      IByReference<LimiterEffectDefinition> {
    public override fun getValue() = LimiterEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: LimiterEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LimiterEffectDefinition, MemoryAddress> {
    public val ILimiterEffectDefinitionFactory_Instance: ILimiterEffectDefinitionFactory by lazy {
      createILimiterEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILimiterEffectDefinitionFactory(): ILimiterEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.LimiterEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILimiterEffectDefinitionFactory.ABI.makeILimiterEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(audioGraph: AudioGraph): JNAPointer? =
        ILimiterEffectDefinitionFactory_Instance.Create(audioGraph)?.pointer

    public override fun fromNative(segment: MemoryAddress): LimiterEffectDefinition {
      val address = segment.toRawLongValue()
      return LimiterEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: LimiterEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
