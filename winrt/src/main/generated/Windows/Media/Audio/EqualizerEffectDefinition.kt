package Windows.Media.Audio

import Windows.Media.Audio.IEqualizerEffectDefinitionFactory.ABI.IID
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

@ABIMarker(EqualizerEffectDefinition.ABI::class)
@Signature("rc(Windows.Media.Audio.EqualizerEffectDefinition;{023f6f1f-83fe-449a-a822-c696442d16b0})")
@WinRTByReference(brClass = EqualizerEffectDefinition.ByReference::class)
public class EqualizerEffectDefinition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEqualizerEffectDefinition.WithDefault, IAudioEffectDefinition.WithDefault,
    IWinRTObject {
  private val __626505518_Interface: IEqualizerEffectDefinition.WithDefault by lazy {
    as_626505518()
  }


  private val __1562923618_Interface: IAudioEffectDefinition.WithDefault by lazy {
    as_1562923618()
  }


  public override val __626505518_Ptr: JNAPointer? by lazy {
    __626505518_Interface.__626505518_Ptr
  }


  public override val __1562923618_Ptr: JNAPointer? by lazy {
    __1562923618_Interface.__1562923618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626505518_Interface, __1562923618_Interface)

  public constructor(audioGraph: AudioGraph) : this(ABI.activate(audioGraph))

  private fun as_626505518(): IEqualizerEffectDefinition.WithDefault {
    if(pointer == NULL) {
      return(IEqualizerEffectDefinition.ABI.makeIEqualizerEffectDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEqualizerEffectDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEqualizerEffectDefinition.ABI.makeIEqualizerEffectDefinition(ref.value))
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
      IByReference<EqualizerEffectDefinition> {
    public override fun getValue() = EqualizerEffectDefinition(pointer.getPointer(0))

    public fun setValue(value: EqualizerEffectDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EqualizerEffectDefinition, MemoryAddress> {
    public val IEqualizerEffectDefinitionFactory_Instance: IEqualizerEffectDefinitionFactory by
        lazy {
      createIEqualizerEffectDefinitionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEqualizerEffectDefinitionFactory(): IEqualizerEffectDefinitionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.EqualizerEffectDefinition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEqualizerEffectDefinitionFactory.ABI.makeIEqualizerEffectDefinitionFactory(factoryActivatorPtr.value))
    }

    public fun activate(audioGraph: AudioGraph): JNAPointer? =
        IEqualizerEffectDefinitionFactory_Instance.Create(audioGraph)?.pointer

    public override fun fromNative(segment: MemoryAddress): EqualizerEffectDefinition {
      val address = segment.toRawLongValue()
      return EqualizerEffectDefinition(Pointer(address))
    }

    public override fun toNative(obj: EqualizerEffectDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
