package Windows.Media.Effects

import Windows.Foundation.Collections.IPropertySet
import Windows.Media.Effects.IAudioEffectDefinitionFactory.ABI.IID
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

@ABIMarker(AudioEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Effects.AudioEffectDefinition;{e4d7f974-7d80-4f73-9089-e31c9db9c294})")
@WinRTByReference(brClass = AudioEffectDefinition.ByReference::class)
public class AudioEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioEffectDefinition.WithDefault, IWinRTObject {
  private val __1562923618_Interface: IAudioEffectDefinition.WithDefault by lazy {
    as_1562923618()
  }


  public override val __1562923618_Ptr: JNAPointer? by lazy {
    __1562923618_Interface.__1562923618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1562923618_Interface)

  public constructor(activatableClassId: String) : this(ABI.activate(activatableClassId))

  public constructor(activatableClassId: String, props: IPropertySet) :
      this(ABI.activate(activatableClassId, props))

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
      IByReference<AudioEffectDefinition> {
    public override fun getValue() = AudioEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: AudioEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioEffectDefinition, MemoryAddress> {
    public val IAudioEffectDefinitionFactory_Instance: IAudioEffectDefinitionFactory by lazy {
      createIAudioEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioEffectDefinitionFactory(): IAudioEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Effects.AudioEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioEffectDefinitionFactory.ABI.makeIAudioEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(activatableClassId: String): JNAPointer? =
        IAudioEffectDefinitionFactory_Instance.Create(activatableClassId)?.pointer

    public fun activate(activatableClassId: String, props: IPropertySet): JNAPointer? =
        IAudioEffectDefinitionFactory_Instance.CreateWithProperties(activatableClassId,
        props)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioEffectDefinition {
      val address = segment.toRawLongValue()
      return AudioEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: AudioEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
